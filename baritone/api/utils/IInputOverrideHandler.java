/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.utils;

import baritone.api.behavior.IBehavior;
import baritone.api.utils.input.Input;

public interface IInputOverrideHandler
extends IBehavior {
    public boolean isInputForcedDown(Input var1);

    public void setInputForceState(Input var1, boolean var2);

    public void clearAllKeys();
}

