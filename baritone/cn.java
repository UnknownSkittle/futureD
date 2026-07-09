/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.input.Input;
import baritone.co;
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cn {
    public MovementStatus a;
    public co a;
    final Map<Input, Boolean> a = new HashMap();

    public final cn a(co co2) {
        this.a = co2;
        return this;
    }

    public final cn a(Input input, boolean bl2) {
        this.a.put(input, bl2);
        return this;
    }
}

