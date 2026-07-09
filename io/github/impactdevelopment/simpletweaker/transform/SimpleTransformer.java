/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.impactdevelopment.simpletweaker.transform;

import io.github.impactdevelopment.simpletweaker.SimpleTweaker;
import io.github.impactdevelopment.simpletweaker.transform.ITransformer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public class SimpleTransformer
implements IClassTransformer {
    private static SimpleTransformer instance;
    private final List<ITransformer> transformers = new ArrayList<ITransformer>();

    public SimpleTransformer() {
        instance = this;
    }

    @Override
    public final byte[] transform(String name, String transformedName, byte[] basicClass) {
        if (basicClass == null) {
            return null;
        }
        List<ITransformer> transformers = this.getTransformers(transformedName);
        if (!transformers.isEmpty()) {
            try {
                ClassNode cn2 = new ClassNode();
                ClassReader cr2 = new ClassReader(basicClass);
                cr2.accept(cn2, 0);
                transformers.forEach(transformer -> transformer.transform(cn2));
                ClassWriter cw2 = new ClassWriter(cr2, 3);
                cn2.accept(cw2);
                return cw2.toByteArray();
            } catch (Exception e2) {
                SimpleTweaker.LOGGER.error("An exception occurred while transforming class", (Throwable)e2);
            }
        }
        return basicClass;
    }

    public final void registerAll(String ... transformers) {
        Arrays.stream(transformers).map(this::createTransformer).filter(Objects::nonNull).forEach(this.transformers::add);
    }

    public final void registerAll(ITransformer ... transformers) {
        this.transformers.addAll(Arrays.asList(transformers));
    }

    private List<ITransformer> getTransformers(String name) {
        return this.transformers.stream().filter(transformer -> transformer.isTarget(name)).collect(Collectors.toList());
    }

    private ITransformer createTransformer(String clazz) {
        try {
            return (ITransformer)Class.forName(clazz).newInstance();
        } catch (Exception e2) {
            SimpleTweaker.LOGGER.error("Unable to instantiate Transformer", (Throwable)e2);
            return null;
        }
    }

    public static SimpleTransformer getInstance() {
        return instance;
    }
}

