/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aou
 *  aow
 *  aox
 *  avx
 *  et
 *  fa
 *  hp
 *  ht
 *  iq
 *  ir
 *  lg
 *  ma
 */
package baritone;

import baritone.a;
import baritone.api.cache.IWaypoint$Tag;
import baritone.api.cache.Waypoint;
import baritone.api.event.events.BlockInteractEvent;
import baritone.api.event.events.BlockInteractEvent$Type;
import baritone.api.event.events.PacketEvent;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.TickEvent;
import baritone.api.event.events.TickEvent$Type;
import baritone.api.event.events.type.EventState;
import baritone.api.utils.BetterBlockPos;
import baritone.b;
import baritone.fn;
import baritone.h;
import baritone.i;
import baritone.r;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class f
extends b {
    private final List<i> a;
    private Integer a = new ArrayList<i>();

    public f(a a2) {
        super(a2);
    }

    @Override
    public final synchronized void onTick(TickEvent tickEvent) {
        if (!((Boolean)baritone.a.a().containerMemory.value).booleanValue()) {
            return;
        }
        if (tickEvent.getType() == TickEvent$Type.OUT) {
            this.a = null;
            this.a.clear();
        }
    }

    @Override
    public final synchronized void onPlayerUpdate(PlayerUpdateEvent object) {
        if (((PlayerUpdateEvent)object).getState() == EventState.PRE) {
            object = this;
            if (((Boolean)baritone.a.a().containerMemory.value).booleanValue()) {
                int n2 = ((f)object).a.player().by.d;
                if (((f)object).a != null) {
                    if (n2 == ((f)object).a) {
                        h.a(super.a(), ((f)object).a.player().by.a().subList(0, 27));
                    } else {
                        super.a().a();
                        ((f)object).a = null;
                    }
                }
                if (super.a() != null) {
                    super.a().a(n2).ifPresent(s2 -> {
                        List<i> list = this.a;
                        s2.a.clear();
                        s2.a.addAll(list.player().by.a().subList(0, s2.a));
                    });
                }
            }
        }
    }

    @Override
    public final synchronized void onSendPacket(PacketEvent object) {
        if (!((Boolean)baritone.a.a().containerMemory.value).booleanValue()) {
            return;
        }
        ht<?> ht2 = object.getPacket();
        if (object.getState() == EventState.PRE) {
            if (ht2 instanceof ma) {
                object = (ma)object.cast();
                object = this.a.world().r(object.a());
                if (object instanceof avx) {
                    et et2;
                    avx avx2 = (avx)object;
                    int n2 = avx2.w_();
                    Object object2 = ((a)((Object)this.a)).a;
                    Object object3 = object = BetterBlockPos.from(object.w());
                    aow aow2 = ((fn)object2).a((et)object3).u();
                    if (aow2 == aox.cg || aow2 == aox.ae) {
                        for (int i2 = 0; i2 < 4; ++i2) {
                            et et3 = object3.a(fa.b((int)i2));
                            if (((fn)object2).a(et3).u() != aow2) continue;
                            et2 = et3;
                            break;
                        }
                    } else {
                        et2 = null;
                    }
                    object2 = BetterBlockPos.from(et2);
                    System.out.println(object + " " + object2);
                    if (object2 != null) {
                        n2 <<= 1;
                        if (object2.p() < object.p() || object2.r() < object.r()) {
                            object = object2;
                        }
                    }
                    this.a.add(new i(System.nanoTime() / 1000000L, n2, avx2.l(), (et)object, 0));
                }
            }
            if (ht2 instanceof lg) {
                this.a().a();
            }
        }
    }

    @Override
    public final synchronized void onReceivePacket(PacketEvent packetEvent) {
        if (!((Boolean)baritone.a.a().containerMemory.value).booleanValue()) {
            return;
        }
        ht<?> ht2 = packetEvent.getPacket();
        if (packetEvent.getState() == EventState.PRE) {
            if (ht2 instanceof ir) {
                packetEvent = (ir)packetEvent.cast();
                this.a.removeIf(i2 -> System.nanoTime() / 1000000L - i2.a > 1000L);
                System.out.println("Received packet " + packetEvent.b() + " " + packetEvent.e() + " " + packetEvent.d() + " " + packetEvent.a());
                System.out.println(packetEvent.c());
                if (packetEvent.c() instanceof hp && ((hp)packetEvent.c()).i().equals("container.enderchest")) {
                    this.a = packetEvent.a();
                    return;
                }
                this.a.stream().filter(arg_0 -> f.a((ir)packetEvent, arg_0)).findFirst().ifPresent(arg_0 -> this.a((ir)packetEvent, arg_0));
            }
            if (ht2 instanceof iq) {
                this.a().a();
            }
        }
    }

    @Override
    public final void onBlockInteract(BlockInteractEvent blockInteractEvent) {
        if (blockInteractEvent.getType() == BlockInteractEvent$Type.USE && fn.a(this.a, blockInteractEvent.getPos()) instanceof aou) {
            ((a)((Object)this.a)).a.a.getWaypoints().addWaypoint(new Waypoint("bed", IWaypoint$Tag.BED, BetterBlockPos.from(blockInteractEvent.getPos())));
        }
    }

    @Override
    public final void onPlayerDeath() {
        ((a)((Object)this.a)).a.a.getWaypoints().addWaypoint(new Waypoint("death", IWaypoint$Tag.DEATH, this.a.playerFeet()));
    }

    private r a() {
        if (((a)((Object)this.a)).a.a == null) {
            return null;
        }
        return (r)((a)((Object)this.a)).a.a.getContainerMemory();
    }

    private h a() {
        return h.a(((a)((Object)this.a)).a.a.a.getParent(), this.a.player().bm());
    }

    private /* synthetic */ void a(ir ir2, i i2) {
        this.a.remove(i2);
        this.a().a(i2.a, ir2.a(), ir2.d());
    }

    private static /* synthetic */ boolean a(ir ir2, i i2) {
        return i2.a.equals(ir2.b()) && i2.a == ir2.d();
    }
}

