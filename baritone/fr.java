/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhc
 *  bhc$a
 *  bib
 *  buc
 *  ub
 *  ud
 */
package baritone;

import baritone.a;
import baritone.api.BaritoneAPI;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.TickEvent$Type;
import baritone.api.utils.IInputOverrideHandler;
import baritone.api.utils.input.Input;
import baritone.b;
import baritone.fl;
import baritone.fm;
import baritone.fy;
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fr
extends b
implements IInputOverrideHandler {
    private final Map<Input, Boolean> a;
    public final fl a;
    private final fm a = new HashMap<Input, Boolean>();

    public fr(a a2) {
        super(a2);
        this.a = new fl(a2.getPlayerContext());
        this.a = new fm(a2.getPlayerContext());
    }

    @Override
    public final boolean isInputForcedDown(Input input) {
        if (input == null) {
            return false;
        }
        return this.a.getOrDefault((Object)input, Boolean.FALSE);
    }

    @Override
    public final void setInputForceState(Input input, boolean bl2) {
        this.a.put(input, bl2);
    }

    @Override
    public final void clearAllKeys() {
        this.a.clear();
    }

    @Override
    public final void onTick(TickEvent object) {
        boolean bl2;
        block17: {
            int n2;
            if (((TickEvent)object).getType() == TickEvent$Type.OUT) {
                return;
            }
            if (this.isInputForcedDown(Input.CLICK_LEFT)) {
                this.setInputForceState(Input.CLICK_RIGHT, false);
            }
            int n3 = this.isInputForcedDown(Input.CLICK_LEFT);
            object = this.a;
            bhc bhc2 = ((fl)object).a.objectMouseOver();
            int n4 = n2 = bhc2 != null && bhc2.a == bhc.a.b ? 1 : 0;
            if (n3 != 0 && n2 != 0) {
                if (!((fl)object).a) {
                    ((fl)object).a.playerController().syncHeldItem();
                    ((fl)object).a.playerController().clickBlock(bhc2.a(), bhc2.b);
                    ((fl)object).a.player().a(ub.a);
                }
                if (((fl)object).a.playerController().onPlayerDamageBlock(bhc2.a(), bhc2.b)) {
                    ((fl)object).a.player().a(ub.a);
                }
                ((fl)object).a.playerController().setHittingBlock(false);
                ((fl)object).a = true;
            } else if (((fl)object).a) {
                ((fl)object).a();
                ((fl)object).a = false;
            }
            n3 = this.isInputForcedDown(Input.CLICK_RIGHT);
            object = this.a;
            if (((fm)object).a > 0) {
                --((fm)object).a;
            } else {
                bhc2 = ((fm)object).a.objectMouseOver();
                if (n3 != 0 && !((fm)object).a.player().L() && bhc2 != null && bhc2.a() != null && bhc2.a == bhc.a.b) {
                    ((fm)object).a = (Integer)baritone.a.a().rightClickSpeed.value;
                    for (ub ub2 : ub.values()) {
                        if (((fm)object).a.playerController().processRightClickBlock(((fm)object).a.player(), ((fm)object).a.world(), bhc2.a(), bhc2.b, bhc2.c, ub2) == ud.a) {
                            ((fm)object).a.player().a(ub2);
                            break;
                        }
                        if (!((fm)object).a.player().b(ub2).b() && ((fm)object).a.playerController().processRightClick(((fm)object).a.player(), ((fm)object).a.world(), ub2) == ud.a) break;
                    }
                }
            }
            object = this;
            Input[] inputArray = new Input[]{Input.MOVE_FORWARD, Input.MOVE_BACK, Input.MOVE_LEFT, Input.MOVE_RIGHT, Input.SNEAK};
            for (n2 = 0; n2 < 5; ++n2) {
                Input input = inputArray[n2];
                if (!((fr)object).isInputForcedDown(input)) continue;
                bl2 = true;
                break block17;
            }
            bl2 = ((a)((Object)((fr)object).a)).a.isPathing() || ((fr)object).a != BaritoneAPI.getProvider().getPrimaryBaritone();
        }
        if (bl2) {
            if (this.a.player().e.getClass() != fy.class) {
                this.a.player().e = new fy(this);
                return;
            }
        } else if (this.a.player().e.getClass() == fy.class) {
            this.a.player().e = new buc(bib.z().t);
        }
    }
}

