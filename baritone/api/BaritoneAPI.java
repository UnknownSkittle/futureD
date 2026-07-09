/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api;

import baritone.api.IBaritoneProvider;
import baritone.api.Settings;
import baritone.api.utils.SettingsUtil;
import java.util.ServiceLoader;

public final class BaritoneAPI {
    private static final IBaritoneProvider provider;
    private static final Settings settings;

    public static IBaritoneProvider getProvider() {
        return provider;
    }

    public static Settings getSettings() {
        return settings;
    }

    static {
        settings = new Settings();
        SettingsUtil.readAndApply(settings);
        provider = ServiceLoader.load(IBaritoneProvider.class).iterator().next();
    }
}

