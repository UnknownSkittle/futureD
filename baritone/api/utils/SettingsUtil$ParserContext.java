/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.utils;

import baritone.api.Settings$Setting;
import baritone.api.utils.SettingsUtil$1;

class SettingsUtil$ParserContext {
    private final Settings$Setting<?> setting;

    private SettingsUtil$ParserContext(Settings$Setting<?> settings$Setting) {
        this.setting = settings$Setting;
    }

    private Settings$Setting<?> getSetting() {
        return this.setting;
    }

    /* synthetic */ SettingsUtil$ParserContext(Settings$Setting settings$Setting, SettingsUtil$1 settingsUtil$1) {
        this(settings$Setting);
    }

    static /* synthetic */ Settings$Setting access$200(SettingsUtil$ParserContext settingsUtil$ParserContext) {
        return settingsUtil$ParserContext.getSetting();
    }
}

