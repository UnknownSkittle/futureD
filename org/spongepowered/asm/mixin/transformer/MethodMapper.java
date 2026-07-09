/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package org.spongepowered.asm.mixin.transformer;

import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.lib.tree.MethodNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.MixinInfo;
import org.spongepowered.asm.util.Counter;

public class MethodMapper {
    private static final Logger logger = LogManager.getLogger((String)"mixin");
    private static final List<String> classes = new ArrayList<String>();
    private static final Map<String, Counter> methods = new HashMap<String, Counter>();
    private final ClassInfo info;

    public MethodMapper(MixinEnvironment env, ClassInfo info) {
        this.info = info;
    }

    public ClassInfo getClassInfo() {
        return this.info;
    }

    public void remapHandlerMethod(MixinInfo mixin, MethodNode handler, ClassInfo.Method method) {
        if (!(handler instanceof MixinInfo.MixinMethodNode) || !((MixinInfo.MixinMethodNode)handler).isInjector()) {
            return;
        }
        if (method.isUnique()) {
            logger.warn("Redundant @Unique on injector method {} in {}. Injectors are implicitly unique", new Object[]{method, mixin});
        }
        if (method.isRenamed()) {
            handler.name = method.getName();
            return;
        }
        String handlerName = this.getHandlerName((MixinInfo.MixinMethodNode)handler);
        handler.name = method.renameTo(handlerName);
    }

    public String getHandlerName(MixinInfo.MixinMethodNode method) {
        String prefix = InjectionInfo.getInjectorPrefix(method.getInjectorAnnotation());
        String classUID = MethodMapper.getClassUID(method.getOwner().getClassRef());
        String methodUID = MethodMapper.getMethodUID(method.name, method.desc, !method.isSurrogate());
        return String.format("%s$%s$%s%s", prefix, method.name, classUID, methodUID);
    }

    private static String getClassUID(String classRef) {
        int index = classes.indexOf(classRef);
        if (index < 0) {
            index = classes.size();
            classes.add(classRef);
        }
        return MethodMapper.finagle(index);
    }

    private static String getMethodUID(String name, String desc, boolean increment) {
        String descriptor = String.format("%s%s", name, desc);
        Counter id2 = methods.get(descriptor);
        if (id2 == null) {
            id2 = new Counter();
            methods.put(descriptor, id2);
        } else if (increment) {
            ++id2.value;
        }
        return String.format("%03x", id2.value);
    }

    private static String finagle(int index) {
        String hex = Integer.toHexString(index);
        StringBuilder sb = new StringBuilder();
        for (int pos = 0; pos < hex.length(); ++pos) {
            char c2;
            c2 = (char)(c2 + ((c2 = hex.charAt(pos)) < ':' ? 49 : 10));
            sb.append(c2);
        }
        return Strings.padStart(sb.toString(), 3, 'z');
    }
}

