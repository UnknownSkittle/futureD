/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.launch;

import io.github.impactdevelopment.simpletweaker.SimpleTweaker;
import java.util.List;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;

public class BaritoneTweaker
extends SimpleTweaker {
    @Override
    public void injectIntoClassLoader(LaunchClassLoader object) {
        super.injectIntoClassLoader((LaunchClassLoader)object);
        MixinBootstrap.init();
        object = (List)Launch.blackboard.get("TweakClasses");
        String string2 = "notch";
        if (object.stream().anyMatch(string -> string.contains("net.minecraftforge.fml.common.launcher"))) {
            string2 = "searge";
        }
        MixinEnvironment.getDefaultEnvironment().setSide(MixinEnvironment.Side.CLIENT);
        MixinEnvironment.getDefaultEnvironment().setObfuscationContext(string2);
        Mixins.addConfiguration("mixins.baritone.json");
    }
}

