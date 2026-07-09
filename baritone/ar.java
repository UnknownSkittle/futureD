/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.as;
import baritone.at;
import baritone.au;
import baritone.av;
import baritone.aw;

public final class ar {
    public Command a;
    public Command b;
    public Command c;
    public Command d;

    public ar(IBaritone iBaritone) {
        boolean[] blArray = new boolean[]{false};
        iBaritone.getPathingControlManager().registerProcess(new as(this, blArray));
        this.a = new at(this, iBaritone, new String[]{"pause"}, blArray);
        this.b = new au(this, iBaritone, new String[]{"resume"}, blArray);
        this.c = new av(this, iBaritone, new String[]{"paused"}, blArray);
        this.d = new aw(this, iBaritone, new String[]{"cancel", "stop"}, blArray);
    }
}

