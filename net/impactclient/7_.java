/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  acl
 *  aed
 *  ain
 *  aip
 *  amu
 *  amy
 *  aow
 *  aox
 *  apt
 *  avo
 *  bhb
 *  bhc
 *  bhc$a
 *  bhe
 *  bus
 *  fj
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  org.lwjgl.opengl.GL11
 *  rk
 *  ub
 *  vb
 *  vg
 */
package net.impactclient;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import me.zero.clarinet.hook.mixin.accessor.AccessorRenderManager;
import net.impactclient.01;
import net.impactclient.0ay;
import net.impactclient.0d;
import net.impactclient.0rB$1f;
import net.impactclient.0rL;
import net.impactclient.0rM;
import net.impactclient.0rh;
import net.impactclient.0ri;
import net.impactclient.10;
import net.impactclient.1A;
import net.impactclient.1C;
import net.impactclient.1H;
import net.impactclient.1T;
import net.impactclient.1_;
import net.impactclient.1s;
import net.impactclient.1t;
import net.impactclient.23;
import net.impactclient.2J;
import net.impactclient.2O;
import net.impactclient.2Z;
import net.impactclient.2r;
import net.impactclient.2w;
import net.impactclient.3Z;
import net.impactclient.4Z;
import net.impactclient.5T;
import net.impactclient.5Y;
import net.impactclient.6j;
import net.impactclient.73;
import net.impactclient.7O;
import net.impactclient.7b;
import net.impactclient.7r;
import net.impactclient.8F;
import org.lwjgl.opengl.GL11;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 7_
extends 73
implements 6j {
    private 0ri 0f;
    private 0ri 0l;
    private 0rh 0o;
    private 0ri 0;
    @EventHandler
    private final Listener<0d> 1;
    private 0rh 8;
    private static final String[] e;
    public static final boolean \u200e;
    private 0rh 0d;
    private 0ri 5;
    private 0ri 0j;
    private 0rh 0a;
    private 0ri 7;
    @EventHandler
    private final Listener<5Y> 3;
    private 0rL 0i;
    private static final String[] d;
    private 0ri 0e;
    private 0ri 0p;
    private 7r 0g;
    @EventHandler
    private final Listener<4Z> 0b;
    private 0ri 6;
    private final 10 0n;
    public static boolean 0h;
    private final Object2IntMap<7r> 0k;
    private final ImmutableMap<Integer, float[]> 0m;
    @EventHandler
    private final Listener<5T> 4;
    private 0ri 9;
    private 0rM 0c;

    /*
     * Enabled aggressive block sorting
     */
    private static boolean 0(7r r2) {
        boolean bl2 = \u200e;
        if (bl2 || bl2) return true;
        if (r2.0 != 7_.2.h) {
            if (bl2) return true;
            if (r2.3.d) {
                if (bl2) return true;
                if (r2.0.aC()) {
                    if (bl2) return true;
                    if (!r2.0.cz()) {
                        if (bl2) return true;
                        if (!r2.0.aX()) {
                            if (bl2) return true;
                            return (int)((long)-1918601676 ^ (long)-1918601675) != 0;
                        }
                    }
                }
            }
        }
        if (!bl2) return (int)((long)-741029952 ^ (long)-741029952) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void 0(7r r2, 7r r3) {
        boolean bl2;
        block23: {
            block22: {
                bl2 = \u200e;
                if (bl2 || bl2) return;
                this.0k.putIfAbsent((Object)r3, (Object)((int)((long)-2014794447 ^ (long)-2014794447)));
                if (bl2 || bl2) return;
                3Z z2 = this.0(r3.0);
                if (bl2 || bl2) return;
                z2 = new bhe(z2.2, z2.0, z2.1);
                if (bl2 || bl2) return;
                bhe bhe2 = new bhe(7_.2.h.p, 7_.2.h.q + (double)7_.2.h.by(), 7_.2.h.r);
                if (bl2 || bl2) return;
                if (7_.2.f.a(bhe2, (bhe)z2, (boolean)((long)-955097921 ^ (long)-955097921), (boolean)((long)1824648488 ^ (long)1824648489), (boolean)((long)202879355 ^ (long)202879355)) != null) {
                    if (bl2) return;
                    if (7_.2.f.a((bhe)z2, bhe2, (boolean)((long)2095676091 ^ (long)2095676091), (boolean)((long)299509448 ^ (long)299509449), (boolean)((long)1289545875 ^ (long)1289545875)) != null) {
                        if (bl2 || bl2) return;
                        this.0k.put((Object)r3, (int)((long)-1106589123 ^ (long)-1106589123));
                        if (bl2 || bl2) return;
                        return;
                    }
                }
                if (bl2) return;
                int n2 = (Integer)this.0k.get((Object)r3) + (int)((long)-167264760 ^ (long)-167264759);
                if (bl2 || bl2) return;
                this.0k.put((Object)r3, n2);
                if (bl2 || bl2) return;
                if (this.0c.2 > n2) {
                    if (bl2 || bl2) return;
                    return;
                }
                if (bl2) return;
                if (!7_.0(r3)) break block22;
                if (bl2) return;
                if (this.0g == null) break block23;
                if (bl2) return;
            }
            if (bl2) return;
            return;
        }
        if (bl2) return;
        if (r3.3 == r2.3) {
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        if (0ay.3().7.2(r3.0.h_())) {
            if (bl2) return;
            if (!this.5.0) {
                if (bl2 || bl2) return;
                return;
            }
        }
        if (bl2) return;
        0h = this.0p.0;
        if (bl2 || bl2) return;
        0h = (int)((long)1960095735 ^ (long)1960095735);
        if (bl2 || bl2) return;
        if (2Z.0((vg)r3.0) <= (double)(this.0i.2 / 2.0f)) {
            if (bl2 || bl2) return;
            this.0g = r3;
            if (bl2) return;
        }
        if (!bl2) return;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                var7 = 7_.\u200e;
                if (!var7) break block24;
                break block25;
            }
            var5_1 = new String[(int)((long)1224438396 ^ (long)1224438335)];
            if (var7) break block25;
            var3_2 = (int)((long)-1102861166 ^ (long)-1102861166);
            if (var7) break block25;
            var2_3 = 0rB$1f.XNZw("\uc4bd\uedf8\u2e60\ud3e2\uc4c3\ued62\u2e8f\ud3b2\uc4bc\ued2f\u2eba\ud376\uc48d\ued8a\u2ebf\ud37f\uc469\ued24\u2e09\ud393\uc475\uedc4\u2e53\ud350\uc4e5\ued3d\u2ed2\ud32f\uc437\ued78\u2e7f\ud350\uc410\ued45\u2e1e\ud35f\uc49e\uede7\u2ed8\ud37f\uc49d\ued12\u2e47\ud334\uc4c0\uedcb\u2e9c\ud382\uc4b3\ued27\u2e1a\ud301\uc483\ued2b\u2e3b\ud3ec\uc490\uedfe\u2e7c\ud3a1\uc41a\ued2d\u2eed\ud35f\uc4e7\uedab\u2e81\ud397\uc452\ued36\u2e98\ud38b\uc4d7\ued1e\u2e14\ud3ec\uc451\ued32\u2eca\ud31f\uc4b8\uedda\u2e03\ud3f0\uc426\ued01\u2e4b\ud3c3\uc4cb\ued80\u2e3e\ud37d\uc431\ued21\u2e8e\ud3e7\uc4c7\ued2c\u2e17\ud3ba\uc44d\ued79\u2eed\ud349\uc499\ued66\u2ea8\ud337\uc41f\ued47\u2ee3\ud34c\uc4f6\ued04\u2e03\ud39a\uc40e\ued65\u2eca\ud34b\uc448\uedbc\u2ec1\ud331\uc43e\ued68\u2e3b\ud3b0\uc45e\ued64\u2e66\ud305\uc442\ueda0\u2e77\ud30b\uc4d9\ued99\u2e72\ud347\uc453\ued8e\u2e9d\ud357\uc400\uedaa\u2e62\ud341\uc49e\uedab\u2e0d\ud31c\uc45b\ued68\u2e71\ud35e\uc419\ued40\u2efc\ud33e\uc44e\ued36\u2ecc\ud319\uc478\ued9f\u2e3f\ud365\uc414\uedb8\u2e12\ud3c9\uc4e5\ued1f\u2e7b\ud39e\uc481\uedcb\u2e2c\ud355\uc4dc\ued4f\u2e13\ud32f\uc4db\ued0d\u2eed\ud3cc\uc41d\ued66\u2eb1\ud354\uc473\uedc6\u2e6d\ud32f\uc47e\ued9d\u2ea0\ud35f\uc4fa\ued72\u2e38\ud331\uc4b7\ueda5\u2ee2\ud390\uc4f2\ued67\u2eb0\ud3c9\uc4b0\uedf7\u2ece\ud37b\uc4ee\ued2f\u2e36\ud34e\uc428\ued73\u2e08\ud333\uc49a\ued49\u2eea\ud3e2\uc469\ued3f\u2e2f\ud312\uc4b1\uedef\u2ebf\ud321\uc4a5\ued16\u2e2d\ud3bf\uc461\uedfb\u2e8c\ud311\uc4de\uede8\u2e58\ud3d2\uc494\ued5a\u2e4f\ud38f\uc44c\ued24\u2ef9\ud3be\uc4aa\ueded\u2e9a\ud35e\uc411\uede1\u2e68\ud3d9\uc4f9\ued05\u2ee9\ud34e\uc420\ued13\u2e5e\ud35b\uc464\ueda3\u2ed7\ud3ea\uc47f\ued1c\u2e7e\ud386\uc4b0\ued4b\u2eec\ud308\uc4aa\ued2e\u2ece\ud36e\uc485\ued0f\u2e18\ud3ac\uc417\ued2c\u2efc\ud324\uc405\ued88\u2e98\ud356\uc4bf\ued86\u2e5d\ud368\uc4ef\ued0b\u2e51\ud374\uc43c\ued5e\u2e3b\ud392\uc4df\ueda0\u2e26\ud39c\uc469\ued06\u2e98\ud310\uc46f\ued7c\u2e61\ud3ba\uc4c4\uedef\u2eae\ud372\uc42f\uedac\u2ebf\ud3ab\uc40d\uedb1\u2e44\ud330\uc4c8\uede7\u2ef0\ud3c4\uc4b2\uedf1\u2e44\ud3db\uc47e\ued66\u2e70\ud350\uc4e8\ued22\u2e05\ud362\uc41d\ued83\u2ed8\ud39b\uc446\ueded\u2ed3\ud399\uc43a\ued7e\u2ea0\ud3d3\uc49b\ued98\u2e3b\ud3a9\uc443\uedeb\u2e42\ud3d0\uc4ac\uedca\u2ec9\ud3c6\uc44b\uede5\u2edb\ud3b8\uc4a8\ued3d\u2ebc\ud342\uc4b4\ued7c\u2e6c\ud32f\uc42b\ued81\u2ead\ud30d\uc4be\ued06\u2ecb\ud39e\uc488\ued62\u2e5c\ud342\uc4dd\ued03\u2e28\ud3bd\uc4a3\ued98\u2e61\ud310\uc45c\uedd0\u2ee1\ud3fa\uc48f\uedcc\u2e8c\ud3e2\uc409\uedd3\u2e93\ud3de\uc47d\uedac\u2e8b\ud306\uc494\uedbe\u2e75\ud3cf\uc475\uedcb\u2e2d\ud307\uc434\ued22\u2efb\ud319\uc424\ued4b\u2e9e\ud321\uc449\ued3a\u2e02\ud34d\uc483\uedf4\u2eb3\ud383\uc4b7\ued63\u2e8c\ud3c1\uc4c5\ueda8\u2e2e\ud319\uc46e\uedbd\u2ea5\ud3d6\uc4bf\ued61\u2e7f\ud309\uc4c2\uedeb\u2e8d\ud3a3\uc492\ued52\u2e9b\ud370\uc457\uedb9\u2e17\ud348\uc475\uedc9\u2e34\ud364\uc421\ueda6\u2e78\ud331\uc42c\ued05\u2e7f\ud3eb\uc44d\uedd4\u2efd\ud3f4\uc4be\ued5b\u2ebd\ud353\uc4ac\ued54\u2e20\ud38d\uc4a0\ued69\u2e2e\ud359\uc43d\ued0d\u2ee8\ud3c1\uc48f\uedee\u2e7a\ud335\uc444\uedd6\u2e27\ud3a3\uc4ae\ueded\u2e5a\ud3af\uc4ff\ued2f\u2eeb\ud37a\uc4c2\uedf2\u2e75\ud3e4\uc49b\ued69\u2e0b\ud3de\uc413\ued9c\u2ecc\ud3ab\uc4cd\uedd0\u2e11\ud397\uc458\ueddf\u2ef8\ud34a\uc487\ued57\u2ee4\ud3ac\uc488\ued5b\u2e91\ud335\uc49a\ued15\u2e49\ud3fc\uc4a1\ued95\u2ecc\ud39e\uc49e\ued2d\u2ea9\ud308\uc424\uedd9\u2efe\ud376\uc45a\ued1f\u2ecd\ud365\uc4b9\ued76\u2ec5\ud3b6\uc4b3\uedf3\u2e1c\ud3bf\uc47b\uedea\u2e08\ud30e\uc4b3\ued47\u2e57\ud329\uc412\ued38\u2e25\ud354\uc4af\ued72\u2e4b\ud3bd\uc41b\uede8\u2ec3\ud32f\uc4ef\ued7f\u2ec2\ud3fb\uc47b\uedd6\u2e86\ud331\uc444\ued6f\u2e75\ud37d\uc463\ued16\u2e41\ud37c\uc4be\ued94\u2e74\ud323\uc4a9\ued23\u2e19\ud39e\uc4b9\uedcd\u2e04\ud3be\uc4ed\uedce\u2e0c\ud332\uc4fe\uedfe\u2e88\ud359\uc4e3\uede5\u2e69\ud342\uc45a\ued4d\u2ed0\ud351\uc484\uedf8\u2e60\ud354\uc42f\ued09\u2eee\ud3b2\uc4ac\ued8c\u2eda\ud3c7\uc422\ued38\u2e26\ud383\uc4d4\ued0c\u2ec6\ud32d\uc40d\uedf9\u2e20\ud3e1\uc465\ued5a\u2ef5\ud3f7\uc4a9\uedab\u2e17\ud330\uc411\ued19\u2ebb\ud3ab\uc44a\uedeb\u2e3f\ud3cc\uc43e\ued98\u2e03\ud393\uc4d8\uedda\u2e19\ud3c5\uc438\ued6b\u2ec8\ud30f\uc4ec\uedb6\u2ee0\ud3eb\uc429\uedc3\u2e98\ud342\uc4af\ued2d\u2e25\ud3cd\uc43f\ued35\u2ebb\ud360\uc4ce\uede0\u2e52\ud3e4\uc411\ued5f\u2ecb\ud30a\uc4b8\ued5d\u2e03\ud3af\uc471\ued2c\u2e06\ud321\uc4d3\ued78\u2ed0\ud374\uc4b2\ued38\u2e8d\ud3dc\uc4e1\uedc9\u2ee7\ud37d\uc459\uedc5\u2e63\ud3b9\uc41d\ued50\u2e39\ud3eb\uc489\ueda2\u2ef8\ud392\uc41a\ued7d\u2eff\ud373\uc4aa\ued32\u2e3e\ud328\uc448\ued2b\u2e58\ud3e8\uc497\ued30\u2e52\ud338\uc4ba\ued4e\u2eb6\ud3b7\uc492\ued4c\u2e7e\ud31d\uc466\ued75\u2ee3\ud364\uc468\ued2e\u2e0f\ud316\uc4bc\ued71\u2ee6\ud32e\uc4ad\ued8c\u2eef\ud302\uc4d6\uedad\u2ec5\ud3e8\uc4f7\uedde\u2e6e\ud327\uc480\ued2f\u2ea5\ud35f\uc47d\ued0f\u2eca\ud31b\uc4bf\uede9\u2e71\ud36d\uc4d6\ued8b\u2e95\ud311\uc463\uedd8\u2ece\ud347\uc4b0\ued35\u2ebe\ud367\uc4aa\ued2a\u2efc\ud351\uc4eb\ued2f\u2ec2\ud3a2\uc4b5\uedb0\u2ed3\ud3ec\uc497\ued69\u2e03\ud386\uc41c\uedbb\u2ec3\ud3f3\uc404\uedd0\u2e08\ud3ab\uc460\ued88\u2e97\ud33b\uc42a\ueddc\u2e6c\ud3ff\uc468\ued54\u2e5e\ud356\uc481\uedd2\u2ed8\ud3f7\uc432\ued24\u2e6f\ud345\uc439\ued35\u2e89\ud34a\uc4bd\ued37\u2e06\ud31a\uc4a4\ued78\u2e9b\ud3c7\uc4c4\uedcd\u2ee1\ud314\uc471\ued16\u2e62\ud357\uc429\uede8\u2ec5\ud31e\uc4b3\uedb3\u2e19\ud33a\uc4b8\uedde\u2e04\ud3bd\uc4bd\ueda4\u2e5d\ud315\uc434\uede1\u2e16\ud3fa\uc473\ueda3\u2ee1\ud393\uc437\ued02\u2eaa\ud359\uc48e\ued23\u2e9b\ud3eb\uc45a\ued15\u2e9b\ud3f2\uc4ac\ued8f\u2eed\ud3ba\uc428\ued94\u2efd\ud323\uc4ca\ueda3\u2ea2\ud359\uc4cb\ued6e\u2e82\ud3fb\uc481\ued8e\u2e66\ud36b\uc433\ued20\u2eed\ud355\uc4a1\ued5e\u2efb\ud3d8\uc4bc\ued3a\u2e62\ud355\uc43c\ued6d\u2e3c\ud3be\uc4bd\uedd0\u2eec\ud34d\uc4a4\ued39\u2e70\ud351\uc4e5\uedd9\u2e76\ud3f2\uc4bc\ued1a\u2e45\ud383\uc4ef\ued2b\u2e9d\ud3a8\uc4b3\ued1e\u2e12\ud36d\uc4bf\uedc4\u2ed0\ud368\uc464\ued39\u2e16\ud3ca\uc49b\ued02\u2eed\ud3b1\uc4d8\ued57\u2e9e\ud30f\uc409\uedc4\u2e65\ud30b\uc461\ued04\u2eaf\ud393\uc4c1\ued27\u2ed1\ud327\uc4ca\ued1d\u2e29\ud3e2\uc4ed\ued82\u2e16\ud37c\uc48e\ued76\u2eee\ud399\uc430\ued1a\u2e59\ud3fa\uc43b\uedc6\u2e90\ud304\uc402\ued58\u2ecf\ud362\uc428\ued69\u2e2c\ud3bc\uc485\ued49\u2e9a\ud380\uc4b5\ued53\u2ea9\ud300\uc466\ued27\u2e6b\ud3fc\uc40e\ued11\u2e98\ud3a3\uc496\ued87\u2e11\ud379\uc4c7\ued19\u2e19\ud308\uc473\ued3e\u2e48\ud30a\uc4e3\ued69\u2e51\ud3f0\uc476\ueda9\u2e33\ud34f\uc4fb\ued90\u2eb7\ud3d7\uc463\ued72\u2e6d\ud34f\uc41f\uede4\u2efe\ud317\uc41c\uedc8\u2ec8\ud3df\uc489\uedc9\u2eb2\ud347\uc4c7\ued2a\u2e85\ud318\uc4eb\ued6b\u2eed\ud3bb\uc497\uedd1\u2e53\ud34b\uc41f\ued72\u2e06", 1752556416);
            var4_4 = var2_3.length();
            if (var7) break block25;
            var1_5 = (int)((long)679409316 ^ (long)679409324);
            if (var7) break block25;
            var0_6 = (int)((long)-596402489 ^ (long)596402488);
            if (var7) break block25;
            block11: while (!var7) {
                block22: {
                    block21: {
                        v0 = (int)((long)1076390384 ^ (long)1076390366);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)1569654241 ^ (long)-1569654242);
                        if (7_.\u200e) {
                            throw null;
lbl24:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!7_.\u200e) continue block11;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\uf5fa\udc0f\u1ff4\ue2ce\uf5d3\udc8e\u1fbc\ue2ed\uf533\udc7e\u1f03\ue2ca\uf581\udc47\u1fbe\ue2ce\uf5d8", -460401999);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)1236552646 ^ (long)1236552650);
                                var0_6 = (int)((long)-1856319600 ^ (long)1856319599);
                                while (true) {
                                    v0 = (int)((long)954279638 ^ (long)954279585);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)1293565405 ^ (long)1293565405);
                                    if (!7_.\u200e) break block21;
                                    throw null;
                                }
                                break;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!7_.\u200e) ** continue;
                                    throw null;
                                }
                                7_.d = var5_1;
                                7_.e = new String[(int)((long)-521536017 ^ (long)-521536084)];
                                if (7_.\u200e) {
                                    throw null;
                                }
                                break block22;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)1272430543 ^ (long)1272430543);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)1460802622 ^ (long)1460802623)) ** GOTO lbl108
                    do {
                        block23: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)406372963 ^ (long)406372964)) {
                                    case 0: {
                                        v15 = (int)((long)810974714 ^ (long)810974690);
                                        if (!7_.\u200e) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)-1543714313 ^ (long)-1543714371);
                                        if (!7_.\u200e) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)-2005299645 ^ (long)-2005299688);
                                        if (!7_.\u200e) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)-1327876679 ^ (long)-1327876669);
                                        if (!7_.\u200e) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)578933696 ^ (long)578933681);
                                        if (!7_.\u200e) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)-469938436 ^ (long)-469938482);
                                        if (!7_.\u200e) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)1263597376 ^ (long)1263597385);
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var6_7;
                                v8 = v11;
                                if (v11 != 0) break block23;
                                v11 = v8;
                                v9 = v9;
                                v14 = v8;
                                v12 = v9;
                                v13 = v8;
                            } while (!7_.\u200e);
                            throw null;
                        }
                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var6_7);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl119:
                        // 1 sources

                        ** continue;
                    }
                }
                7_.0h = (int)((long)1440822742 ^ (long)1440822742);
                break;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String b(int var0, int var1_1) {
        block265: {
            var9_2 = 7_.\u200e;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)1488516300 ^ (long)-1488514898)) & (int)((long)988969132 ^ (long)988972883);
            if (var9_2) ** GOTO lbl-1000
            if (7_.e[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 7_.d[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)1725980927 ^ (long)1725980927)] & (int)((long)1917619167 ^ (long)1917618976)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)1542375687 ^ (long)1542375741);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-1757483248 ^ (long)-1757483169);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)121425810 ^ (long)121425901);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-552904216 ^ (long)-552904326);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-513406177 ^ (long)-513406077);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-2065303175 ^ (long)-2065303256);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-1504102004 ^ (long)-1504101904);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-761856581 ^ (long)-761856672);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)56923177 ^ (long)56923219);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)1475217899 ^ (long)1475217837);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)2093373898 ^ (long)2093373812);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1822000562 ^ (long)-1822000536);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-1917798348 ^ (long)-1917798194);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)891684774 ^ (long)891684802);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-1431455287 ^ (long)-1431455417);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1293876258 ^ (long)1293876375);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-18864491 ^ (long)-18864397);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-441770644 ^ (long)-441770527);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-626615313 ^ (long)-626615324);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-118602333 ^ (long)-118602303);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-142891116 ^ (long)-142891084);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)111484683 ^ (long)111484693);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)1837307966 ^ (long)1837308060);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-964761796 ^ (long)-964761806);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)266919289 ^ (long)266919289);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)142843946 ^ (long)142843932);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-2089430559 ^ (long)-2089430759);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)1072867601 ^ (long)1072867655);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-412368585 ^ (long)-412368552);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)1201504084 ^ (long)1201504161);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-1481036891 ^ (long)-1481036811);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)51307582 ^ (long)51307728);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)563529382 ^ (long)563529469);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-1065819985 ^ (long)-1065820058);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)819033811 ^ (long)819033741);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-660412630 ^ (long)-660412481);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-868789833 ^ (long)-868789774);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)308015451 ^ (long)308015499);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-2000276369 ^ (long)-2000276353);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-435384425 ^ (long)-435384388);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)267969334 ^ (long)267969315);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-2006593545 ^ (long)-2006593554);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-626438593 ^ (long)-626438596);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-741795334 ^ (long)-741795409);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-254114316 ^ (long)-254114431);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)1484827429 ^ (long)1484827589);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)1637115221 ^ (long)1637115341);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-1468964523 ^ (long)-1468964568);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)1487142442 ^ (long)1487142550);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-786060910 ^ (long)-786060970);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)104138813 ^ (long)104138915);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-1336897220 ^ (long)-1336897105);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)403147015 ^ (long)403147189);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1428557238 ^ (long)1428557244);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-1713449750 ^ (long)-1713449774);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-80275477 ^ (long)-80275587);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-909127380 ^ (long)-909127312);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)628932199 ^ (long)628932162);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)779973023 ^ (long)779972974);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)1631482191 ^ (long)1631482291);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-803933362 ^ (long)-803933254);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)938552159 ^ (long)938552315);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)1881967669 ^ (long)1881967749);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1639814261 ^ (long)-1639814199);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)1060866237 ^ (long)1060866223);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)19740545 ^ (long)19740493);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-1795771434 ^ (long)-1795771498);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-335352795 ^ (long)-335352672);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)2092604076 ^ (long)2092603924);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)1359846228 ^ (long)1359846227);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-1371475486 ^ (long)-1371475542);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1543226732 ^ (long)-1543226803);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)1584583892 ^ (long)1584583832);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)726450527 ^ (long)726450664);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)1798431198 ^ (long)1798431201);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-124128562 ^ (long)-124128659);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-140097429 ^ (long)-140097399);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-2130740357 ^ (long)-2130740457);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-385336310 ^ (long)-385336237);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-225035810 ^ (long)-225035892);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-512983872 ^ (long)-512984033);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-867205395 ^ (long)-867205566);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)258857397 ^ (long)258857292);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-2083785873 ^ (long)-2083785836);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-228017051 ^ (long)-228016913);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)-107991153 ^ (long)-107991287);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)304410399 ^ (long)304410501);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)347266705 ^ (long)347266621);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)610386911 ^ (long)610386939);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-1593950276 ^ (long)-1593950429);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-460722581 ^ (long)-460722522);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-909163983 ^ (long)-909164005);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1090022508 ^ (long)-1090022404);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-303811417 ^ (long)-303811556);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)1373682111 ^ (long)1373681985);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)1091944024 ^ (long)1091944167);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-2054454267 ^ (long)-2054454247);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)1798735094 ^ (long)1798734917);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)1986424646 ^ (long)0x76666F76);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-98191964 ^ (long)-98191915);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1622196183 ^ (long)1622196150);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)180814609 ^ (long)180814639);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)371483406 ^ (long)371483529);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-579365685 ^ (long)-579365759);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-1706228357 ^ (long)-1706228445);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)1316143366 ^ (long)1316143486);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)2023757501 ^ (long)2023757461);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1184726934 ^ (long)-1184726923);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)408845162 ^ (long)408845221);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-1130492200 ^ (long)-1130492359);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-646896254 ^ (long)-646896132);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)1574570788 ^ (long)1574570809);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1133235641 ^ (long)1133235582);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)451178139 ^ (long)451178033);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-401521197 ^ (long)-401521280);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)868769156 ^ (long)868769208);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)1945652459 ^ (long)1945652238);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-1929019847 ^ (long)-1929019830);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)-1243027654 ^ (long)-1243027631);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-309323259 ^ (long)-309323026);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-641209230 ^ (long)-641209215);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-451894616 ^ (long)-451894775);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)1943510007 ^ (long)1943509859);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)1925526367 ^ (long)1925526409);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-2035985095 ^ (long)-2035984967);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)1599586965 ^ (long)1599586902);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-1747018706 ^ (long)-1747018749);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)473933263 ^ (long)473933275);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)1490964303 ^ (long)1490964423);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-383742473 ^ (long)-383742596);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-1421750230 ^ (long)-1421750021);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)1976547383 ^ (long)1976547509);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1003144966 ^ (long)-1003144991);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-1774131678 ^ (long)-1774131582);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)486594397 ^ (long)486594481);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)449115942 ^ (long)449115913);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)1460375512 ^ (long)1460375301);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1745984151 ^ (long)-1745984012);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)1048348402 ^ (long)1048348165);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-1114363836 ^ (long)-1114363869);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-1457114643 ^ (long)-1457114825);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)1298861923 ^ (long)1298862013);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)653652252 ^ (long)653652436);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)822665297 ^ (long)822665400);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-327461329 ^ (long)-327461290);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-1495856857 ^ (long)-1495856828);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)1911690418 ^ (long)1911690328);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1437465789 ^ (long)-1437465684);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-504321756 ^ (long)-504321612);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-517719145 ^ (long)-517719167);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-634800640 ^ (long)-634800428);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-903706620 ^ (long)-903706461);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-675642837 ^ (long)-675642835);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)136600316 ^ (long)136600149);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)2015297407 ^ (long)2015297478);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)163952156 ^ (long)163952147);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-1574614627 ^ (long)-1574614618);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-533719161 ^ (long)-533719185);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)672947511 ^ (long)672947616);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)763307530 ^ (long)763307712);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-1311288995 ^ (long)-1311288980);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)1294003320 ^ (long)1294003215);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-189601585 ^ (long)-189601777);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)578086688 ^ (long)578086711);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)578470920 ^ (long)578471052);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-710063114 ^ (long)-710063105);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-354707140 ^ (long)-354707066);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-2058842203 ^ (long)-2058842296);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)403693770 ^ (long)403693768);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)865309899 ^ (long)865309834);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-2100411169 ^ (long)-2100411282);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-109276250 ^ (long)-109276164);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1792521528 ^ (long)1792521484);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-1761683019 ^ (long)-1761683098);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-550625148 ^ (long)-550625061);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1080106752 ^ (long)1080106858);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)201368071 ^ (long)201368277);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)1889447815 ^ (long)1889447914);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-1632209857 ^ (long)-1632209790);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-873664362 ^ (long)-873664358);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)1618050998 ^ (long)1618050999);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)863469434 ^ (long)863469452);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)1682185205 ^ (long)1682184965);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-2069434524 ^ (long)-2069434577);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)1365017865 ^ (long)1365017992);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)1598380382 ^ (long)1598380402);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)734143620 ^ (long)734143517);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1587386664 ^ (long)-1587386880);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)1909156393 ^ (long)1909156477);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-27567294 ^ (long)-27567248);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1809528254 ^ (long)1809528153);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-497462924 ^ (long)-497462793);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-901171297 ^ (long)-901171284);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-16565542 ^ (long)-16565747);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-1517990651 ^ (long)-1517990453);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)1370054561 ^ (long)1370054525);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)608176738 ^ (long)608176715);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)641219786 ^ (long)641219637);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)584889348 ^ (long)584889401);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-517299105 ^ (long)-517299080);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-122713065 ^ (long)-122712900);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-111418669 ^ (long)-111418785);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)162392051 ^ (long)162391937);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)1093781276 ^ (long)1093781351);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)334179187 ^ (long)334179170);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-519237861 ^ (long)-519237742);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-1638792667 ^ (long)-1638792514);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)460712442 ^ (long)460712375);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1281995801 ^ (long)1281995953);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-807337853 ^ (long)-807337871);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)1183158440 ^ (long)1183158302);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)14523638 ^ (long)14523522);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-754070219 ^ (long)-754070128);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)1166451933 ^ (long)1166451788);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-1414521198 ^ (long)-1414521102);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)933299829 ^ (long)933299857);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-1532826078 ^ (long)-1532826112);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)-1020755005 ^ (long)-1020754994);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-1545611249 ^ (long)-1545611143);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1811639730 ^ (long)-1811639799);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-1311325091 ^ (long)-1311325096);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)387905973 ^ (long)387906018);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-1307576023 ^ (long)-1307575862);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)1155873456 ^ (long)1155873413);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)872510343 ^ (long)872510305);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-550069111 ^ (long)-550069094);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)511943210 ^ (long)511943404);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-1187214033 ^ (long)-1187213966);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)1884171736 ^ (long)1884171545);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)247112652 ^ (long)247112687);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)351714037 ^ (long)351713880);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-1578895837 ^ (long)-1578895731);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)2015198758 ^ (long)2015198737);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-1939376971 ^ (long)-1939376900);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-317624639 ^ (long)-317624613);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-1852182522 ^ (long)-1852182410);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-361551825 ^ (long)-361551833);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1337177448 ^ (long)-1337177556);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)1963470883 ^ (long)1963471073);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)2113970731 ^ (long)2113970942);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)223113351 ^ (long)223113292);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)1292104084 ^ (long)1292104186);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-1444283323 ^ (long)-1444283208);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-1724912446 ^ (long)-1724912442);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)1287437455 ^ (long)1287437542);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)393454774 ^ (long)393454735);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1871189643 ^ (long)-1871189744);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-368063114 ^ (long)-368062983);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-1747068009 ^ (long)-1747067943);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)485904221 ^ (long)485904197);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)283489889 ^ (long)283489856);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-1181733241 ^ (long)-1181733310);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)-963699016 ^ (long)-963698948);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1997290887 ^ (long)1997290785);
                    if (!7_.\u200e) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)752071689 ^ (long)752071719);
                    if (!7_.\u200e) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)1627871883 ^ (long)1627871944);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1075891085 ^ (long)1075891058)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-1897815417 ^ (long)-1897833096)) >>> (int)((long)1546488988 ^ (long)1546488980)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-1558947349 ^ (long)-1558947349);
            if (!7_.\u200e) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)1732396212 ^ (long)1732396214);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)642505412 ^ (long)642505415) | var5_6 << (int)((long)254456861 ^ (long)254456856)) ^ var3_4[var7_8]) & (int)((long)-220155929 ^ (long)-220156136);
                    if (7_.\u200e) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)0xD55DBB ^ (long)13983160) | var6_7 << (int)((long)462840629 ^ (long)462840624)) ^ var3_4[var7_8]) & (int)((long)946212686 ^ (long)946212785);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            7_.e[var2_3] = new String(var3_4).intern();
        }
        return 7_.e[var2_3];
    }

    public 7_() {
        boolean bl2 = \u200e;
        super(7_.b((int)((long)304143128 ^ (long)-304136371), (int)((long)1077276845 ^ (long)1077277078)), 7_.b((int)((long)-20598746 ^ (long)20599916), (int)((long)885096135 ^ (long)885078554)));
        String[] stringArray = new String[(int)((long)1766692608 ^ (long)1766692610)];
        stringArray[(int)((long)-1521642828 ^ (long)-1521642828)] = 7_.b((int)((long)-1001187042 ^ (long)1001192796), (int)((long)679916349 ^ (long)-679915520));
        stringArray[(int)((long)-1407151433 ^ (long)-1407151434)] = 7_.b((int)((long)1140919681 ^ (long)-1140921876), (int)((long)1093752321 ^ (long)1093756376));
        Object object = stringArray;
        1_ _ = (2J)((2J)((2J)this.1().2(7_.b((int)((long)1996803968 ^ (long)-1996805164), (int)((long)-1760560153 ^ (long)1760564935)))).1(7_.b((int)((long)682208741 ^ (long)-682210923), (int)((long)-806787901 ^ (long)806807552)))).0(7_.b((int)((long)-1634906492 ^ (long)1634904831), (int)((long)-820919083 ^ (long)-820923328)));
        ((2J)((2J)((2J)this.1().2(7_.b((int)((long)1996803968 ^ (long)-1996805164), (int)((long)-1760560153 ^ (long)1760564935)))).1(7_.b((int)((long)682208741 ^ (long)-682210923), (int)((long)-806787901 ^ (long)806807552)))).0(7_.b((int)((long)-1634906492 ^ (long)1634904831), (int)((long)-820919083 ^ (long)-820923328)))).2 = object;
        this.8 = (0rh)_.0();
        String[] stringArray2 = new String[(int)((long)631012123 ^ (long)631012121)];
        stringArray2[(int)((long)-1284215954 ^ (long)-1284215954)] = 7_.b((int)((long)-646148069 ^ (long)646149214), (int)((long)-837200248 ^ (long)837213465));
        stringArray2[(int)((long)342199128 ^ (long)342199129)] = 7_.b((int)((long)617571983 ^ (long)-617577748), (int)((long)250444474 ^ (long)250443173));
        object = stringArray2;
        _ = (2J)((2J)((2J)this.1().2(7_.b((int)((long)-570522818 ^ (long)570517350), (int)((long)-1907663613 ^ (long)1907657006)))).1(7_.b((int)((long)1687690406 ^ (long)-1687684927), (int)((long)1857194662 ^ (long)1857209363)))).0(7_.b((int)((long)-724082093 ^ (long)724076079), (int)((long)-1765564887 ^ (long)-1765552512)));
        ((2J)((2J)((2J)this.1().2(7_.b((int)((long)-570522818 ^ (long)570517350), (int)((long)-1907663613 ^ (long)1907657006)))).1(7_.b((int)((long)1687690406 ^ (long)-1687684927), (int)((long)1857194662 ^ (long)1857209363)))).0(7_.b((int)((long)-724082093 ^ (long)724076079), (int)((long)-1765564887 ^ (long)-1765552512)))).2 = object;
        this.0d = (0rh)_.0();
        String[] stringArray3 = new String[(int)((long)-1681177199 ^ (long)-1681177198)];
        stringArray3[(int)((long)1983979885 ^ (long)1983979885)] = 7_.b((int)((long)-1088361422 ^ (long)1088358499), (int)((long)1011217154 ^ (long)1011214655));
        stringArray3[(int)((long)665532756 ^ (long)665532757)] = 7_.b((int)((long)1567431673 ^ (long)-1567424578), (int)((long)656574868 ^ (long)656592897));
        stringArray3[(int)((long)-1238120880 ^ (long)-1238120878)] = 7_.b((int)((long)-631651126 ^ (long)631644322), (int)((long)1430660632 ^ (long)1430680967));
        object = stringArray3;
        _ = (2J)((2J)((2J)this.1().2(7_.b((int)((long)373026497 ^ (long)-373028207), (int)((long)1198590166 ^ (long)1198616587)))).1(7_.b((int)((long)1730803598 ^ (long)-1730800670), (int)((long)-660177576 ^ (long)-660198759)))).0(7_.b((int)((long)-1750102412 ^ (long)1750100496), (int)((long)-1716764926 ^ (long)1716754378)));
        ((2J)((2J)((2J)this.1().2(7_.b((int)((long)373026497 ^ (long)-373028207), (int)((long)1198590166 ^ (long)1198616587)))).1(7_.b((int)((long)1730803598 ^ (long)-1730800670), (int)((long)-660177576 ^ (long)-660198759)))).0(7_.b((int)((long)-1750102412 ^ (long)1750100496), (int)((long)-1716764926 ^ (long)1716754378)))).2 = object;
        this.0a = (0rh)_.0();
        String[] stringArray4 = new String[(int)((long)-567206535 ^ (long)-567206533)];
        stringArray4[(int)((long)-254793887 ^ (long)-254793887)] = 7_.b((int)((long)807444237 ^ (long)-807437465), (int)((long)-1084902502 ^ (long)1084892743));
        stringArray4[(int)((long)-1108933959 ^ (long)-1108933960)] = 7_.b((int)((long)507230397 ^ (long)-507224854), (int)((long)-1431503893 ^ (long)1431534907));
        object = stringArray4;
        _ = (2J)((2J)((2J)this.1().2(7_.b((int)((long)860718928 ^ (long)-860724470), (int)((long)1086436507 ^ (long)-1086452897)))).1(7_.b((int)((long)-1176515956 ^ (long)1176514286), (int)((long)-1655099643 ^ (long)-1655101804)))).0(7_.b((int)((long)-1518136979 ^ (long)1518138670), (int)((long)1086216085 ^ (long)-1086205549)));
        ((2J)((2J)((2J)this.1().2(7_.b((int)((long)860718928 ^ (long)-860724470), (int)((long)1086436507 ^ (long)-1086452897)))).1(7_.b((int)((long)-1176515956 ^ (long)1176514286), (int)((long)-1655099643 ^ (long)-1655101804)))).0(7_.b((int)((long)-1518136979 ^ (long)1518138670), (int)((long)1086216085 ^ (long)-1086205549)))).2 = object;
        this.0o = (0rh)_.0();
        object = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(7_.b((int)((long)-1016497379 ^ (long)1016504162), (int)((long)561846848 ^ (long)-561866091)))).1(7_.b((int)((long)62711137 ^ (long)-62717676), (int)((long)696846135 ^ (long)696871270)))).0(7_.b((int)((long)1595970847 ^ (long)-1595969164), (int)((long)-620215177 ^ (long)-620206739)));
        ((2r)((2r)((2r)this.5().2(7_.b((int)((long)-1016497379 ^ (long)1016504162), (int)((long)561846848 ^ (long)-561866091)))).1(7_.b((int)((long)62711137 ^ (long)-62717676), (int)((long)696846135 ^ (long)696871270)))).0(7_.b((int)((long)1595970847 ^ (long)-1595969164), (int)((long)-620215177 ^ (long)-620206739)))).2 = object;
        this.0l = (0ri)((2r)_).0();
        object = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(7_.b((int)((long)-932328798 ^ (long)932327146), (int)((long)-1138163427 ^ (long)1138146413)))).1(7_.b((int)((long)-981322868 ^ (long)981325791), (int)((long)853324272 ^ (long)853325486)))).0(7_.b((int)((long)-980226759 ^ (long)980224321), (int)((long)-461096919 ^ (long)461110358)));
        ((2r)((2r)((2r)this.5().2(7_.b((int)((long)-932328798 ^ (long)932327146), (int)((long)-1138163427 ^ (long)1138146413)))).1(7_.b((int)((long)-981322868 ^ (long)981325791), (int)((long)853324272 ^ (long)853325486)))).0(7_.b((int)((long)-980226759 ^ (long)980224321), (int)((long)-461096919 ^ (long)461110358)))).2 = object;
        this.0 = (0ri)((2r)_).0();
        object = Boolean.FALSE;
        _ = (2r)((2r)((2r)this.5().2(7_.b((int)((long)2031339826 ^ (long)-2031342269), (int)((long)1962162873 ^ (long)1962154729)))).1(7_.b((int)((long)2115006306 ^ (long)-2115007732), (int)((long)153427173 ^ (long)153451488)))).0(7_.b((int)((long)1003886948 ^ (long)-1003881203), (int)((long)-69113700 ^ (long)69109373)));
        ((2r)((2r)((2r)this.5().2(7_.b((int)((long)2031339826 ^ (long)-2031342269), (int)((long)1962162873 ^ (long)1962154729)))).1(7_.b((int)((long)2115006306 ^ (long)-2115007732), (int)((long)153427173 ^ (long)153451488)))).0(7_.b((int)((long)1003886948 ^ (long)-1003881203), (int)((long)-69113700 ^ (long)69109373)))).2 = object;
        this.5 = (0ri)((2r)_).0();
        object = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(7_.b((int)((long)-1263742370 ^ (long)1263744531), (int)((long)-2140062563 ^ (long)2140061522)))).1(7_.b((int)((long)-527875634 ^ (long)527869319), (int)((long)-467283106 ^ (long)-467294930)))).0(7_.b((int)((long)-1466665198 ^ (long)1466667883), (int)((long)1068583121 ^ (long)-1068596483)));
        ((2r)((2r)((2r)this.5().2(7_.b((int)((long)-1263742370 ^ (long)1263744531), (int)((long)-2140062563 ^ (long)2140061522)))).1(7_.b((int)((long)-527875634 ^ (long)527869319), (int)((long)-467283106 ^ (long)-467294930)))).0(7_.b((int)((long)-1466665198 ^ (long)1466667883), (int)((long)1068583121 ^ (long)-1068596483)))).2 = object;
        this.0f = (0ri)((2r)_).0();
        object = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(7_.b((int)((long)33534111 ^ (long)-33532732), (int)((long)538577415 ^ (long)538578135)))).1(7_.b((int)((long)-1010599799 ^ (long)1010605250), (int)((long)-967590288 ^ (long)967577505)))).0(7_.b((int)((long)943568516 ^ (long)-943566122), (int)((long)-652450414 ^ (long)-652462307)));
        ((2r)((2r)((2r)this.5().2(7_.b((int)((long)33534111 ^ (long)-33532732), (int)((long)538577415 ^ (long)538578135)))).1(7_.b((int)((long)-1010599799 ^ (long)1010605250), (int)((long)-967590288 ^ (long)967577505)))).0(7_.b((int)((long)943568516 ^ (long)-943566122), (int)((long)-652450414 ^ (long)-652462307)))).2 = object;
        this.0j = (0ri)((2r)_).0();
        object = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(7_.b((int)((long)1558755618 ^ (long)-1558749827), (int)((long)300312464 ^ (long)300312077)))).1(7_.b((int)((long)-1497765148 ^ (long)1497763474), (int)((long)1449198011 ^ (long)-1449204360)))).0(7_.b((int)((long)-224738516 ^ (long)224733032), (int)((long)-816345668 ^ (long)-816318040)));
        ((2r)((2r)((2r)this.5().2(7_.b((int)((long)1558755618 ^ (long)-1558749827), (int)((long)300312464 ^ (long)300312077)))).1(7_.b((int)((long)-1497765148 ^ (long)1497763474), (int)((long)1449198011 ^ (long)-1449204360)))).0(7_.b((int)((long)-224738516 ^ (long)224733032), (int)((long)-816345668 ^ (long)-816318040)))).2 = object;
        this.7 = (0ri)((2r)_).0();
        this.9 = (0ri)((2r)((2r)((2r)this.5().2(7_.b((int)((long)-969851222 ^ (long)969857743), (int)((long)-1173416475 ^ (long)-1173403599)))).1(7_.b((int)((long)1552307408 ^ (long)-1552306042), (int)((long)-174106203 ^ (long)-174110887)))).0(7_.b((int)((long)97436136 ^ (long)-97442404), (int)((long)-539572330 ^ (long)-539572991)))).0();
        object = Float.valueOf(360.0f);
        _ = ((1H)((1H)((1H)this.0().2(7_.b((int)((long)947767428 ^ (long)-947770114), (int)((long)-1152347299 ^ (long)-1152328951)))).1(7_.b((int)((long)1012866679 ^ (long)-1012860394), (int)((long)-1238522403 ^ (long)-1238502397)))).0(7_.b((int)((long)1292752714 ^ (long)-1292750068), (int)((long)-873640813 ^ (long)-873642757)))).1(Float.valueOf(10.0f)).0(Float.valueOf(360.0f));
        ((1_)((1H)((1H)((1H)this.0().2(7_.b((int)((long)947767428 ^ (long)-947770114), (int)((long)-1152347299 ^ (long)-1152328951)))).1(7_.b((int)((long)1012866679 ^ (long)-1012860394), (int)((long)-1238522403 ^ (long)-1238502397)))).0(7_.b((int)((long)1292752714 ^ (long)-1292750068), (int)((long)-873640813 ^ (long)-873642757)))).1(Float.valueOf(10.0f)).0(Float.valueOf(360.0f))).2 = object;
        this.0i = (0rL)((1H)_).0();
        object = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(7_.b((int)((long)-417683174 ^ (long)417680757), (int)((long)-1532723030 ^ (long)-1532705917)))).1(7_.b((int)((long)665766824 ^ (long)-665767964), (int)((long)992360064 ^ (long)-992369602)))).0(7_.b((int)((long)1803384043 ^ (long)-1803382613), (int)((long)465029233 ^ (long)-465037807)));
        ((2r)((2r)((2r)this.5().2(7_.b((int)((long)-417683174 ^ (long)417680757), (int)((long)-1532723030 ^ (long)-1532705917)))).1(7_.b((int)((long)665766824 ^ (long)-665767964), (int)((long)992360064 ^ (long)-992369602)))).0(7_.b((int)((long)1803384043 ^ (long)-1803382613), (int)((long)465029233 ^ (long)-465037807)))).2 = object;
        this.6 = (0ri)((2r)_).0();
        object = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(7_.b((int)((long)-1210287765 ^ (long)1210293576), (int)((long)-1461921312 ^ (long)1461938783)))).1(7_.b((int)((long)524211552 ^ (long)-524209887), (int)((long)1158812734 ^ (long)-1158812772)))).0(7_.b((int)((long)-1425949475 ^ (long)1425954991), (int)((long)1374500817 ^ (long)-1374514840)));
        ((2r)((2r)((2r)this.5().2(7_.b((int)((long)-1210287765 ^ (long)1210293576), (int)((long)-1461921312 ^ (long)1461938783)))).1(7_.b((int)((long)524211552 ^ (long)-524209887), (int)((long)1158812734 ^ (long)-1158812772)))).0(7_.b((int)((long)-1425949475 ^ (long)1425954991), (int)((long)1374500817 ^ (long)-1374514840)))).2 = object;
        this.0p = (0ri)((2r)_).0();
        object = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(7_.b((int)((long)-1716472303 ^ (long)1716474479), (int)((long)-136601862 ^ (long)-136599713)))).1(7_.b((int)((long)-1908033098 ^ (long)1908039160), (int)((long)-1754806067 ^ (long)1754807858)))).0(7_.b((int)((long)-2082241543 ^ (long)2082236325), (int)((long)-1787606007 ^ (long)-1787609008)));
        ((2r)((2r)((2r)this.5().2(7_.b((int)((long)-1716472303 ^ (long)1716474479), (int)((long)-136601862 ^ (long)-136599713)))).1(7_.b((int)((long)-1908033098 ^ (long)1908039160), (int)((long)-1754806067 ^ (long)1754807858)))).0(7_.b((int)((long)-2082241543 ^ (long)2082236325), (int)((long)-1787606007 ^ (long)-1787609008)))).2 = object;
        this.0e = (0ri)((2r)_).0();
        this.0c = (0rM)((1H)((1H)((1H)this.2().2(7_.b((int)((long)-248382490 ^ (long)248389510), (int)((long)1806427796 ^ (long)1806411158)))).1(7_.b((int)((long)859235089 ^ (long)-859240585), (int)((long)915035278 ^ (long)915039831)))).0(7_.b((int)((long)1812677425 ^ (long)-1812682900), (int)((long)728397109 ^ (long)728388571)))).1((int)((long)-1858839 ^ (long)-1858839)).0((int)((long)2117120392 ^ (long)2117120416)).0();
        float[] fArray = new float[(int)((long)-266667804 ^ (long)-266667801)];
        fArray[(int)((long)867977181 ^ (long)867977181)] = 1.0f;
        fArray[(int)((long)1509687838 ^ (long)1509687839)] = 0.0f;
        fArray[(int)((long)1554435067 ^ (long)1554435065)] = 1.0f;
        float[] fArray2 = new float[(int)((long)-948571079 ^ (long)-948571078)];
        fArray2[(int)((long)1180310767 ^ (long)1180310767)] = 0.6f;
        fArray2[(int)((long)-2077658011 ^ (long)-2077658012)] = 0.6f;
        fArray2[(int)((long)-1911298159 ^ (long)-1911298157)] = 0.6f;
        float[] fArray3 = new float[(int)((long)-1625550360 ^ (long)-1625550357)];
        fArray3[(int)((long)1126439522 ^ (long)1126439522)] = 1.0f;
        fArray3[(int)((long)-1575644403 ^ (long)-1575644404)] = 0.4f;
        fArray3[(int)((long)-897982493 ^ (long)-897982495)] = 0.0f;
        float[] fArray4 = new float[(int)((long)2017366758 ^ (long)2017366757)];
        fArray4[(int)((long)-1887567337 ^ (long)-1887567337)] = 1.0f;
        fArray4[(int)((long)-1168286089 ^ (long)-1168286090)] = 1.0f;
        fArray4[(int)((long)1561499003 ^ (long)1561499001)] = 1.0f;
        float[] fArray5 = new float[(int)((long)-658423050 ^ (long)-658423051)];
        fArray5[(int)((long)-833956418 ^ (long)-833956418)] = 0.0f;
        fArray5[(int)((long)-1250266628 ^ (long)-1250266627)] = 0.3f;
        fArray5[(int)((long)1783646918 ^ (long)1783646916)] = 0.0f;
        this.0m = new ImmutableMap.Builder<Integer, float[]>().put((int)((long)1242401284 ^ (long)1242401567), fArray).put((int)((long)-1194570595 ^ (long)-1194570475), fArray2).put((int)((long)1855495937 ^ (long)1855495742), fArray3).put((int)((long)579842939 ^ (long)579842812), fArray4).put((int)((long)813634329 ^ (long)813634077), fArray5).build();
        this.0k = new Object2IntArrayMap();
        this.0n = new 10();
        this.0b = new Listener<4Z>(z2 -> {
            int n2;
            Comparator<7r> comparator;
            int n3;
            String string;
            boolean bl2 = \u200e;
            if (bl2) return;
            String[] stringArray = 7b.0();
            if (bl2 || bl2) return;
            if (z2.0 == EventState.POST) {
                if (bl2 || bl2) return;
                if (this.0g != null) {
                    if (bl2) return;
                    if (this.0.0) {
                        if (bl2 || bl2) return;
                        7_.2.c.a((aed)7_.2.h, (amu)7_.2.f, ub.a);
                        if (bl2) return;
                    }
                }
                if (bl2) return;
                return;
            }
            if (bl2) return;
            this.0n.1();
            if (bl2 || bl2) return;
            this.0k.keySet().removeIf(r2 -> {
                boolean bl2 = \u200e;
                if (bl2 || bl2) return true;
                if (!this.0n.0().contains(r2)) {
                    if (bl2) return true;
                    return (int)((long)894197157 ^ (long)894197156) != 0;
                }
                if (!bl2) return (int)((long)-1318609615 ^ (long)-1318609615) != 0;
                return true;
            });
            if (bl2 || bl2) return;
            this.0g = null;
            if (bl2 || bl2) {
                return;
            }
            String string2 = 7_.b((int)((long)1387239792 ^ (long)-1387234007), (int)((long)717558967 ^ (long)717563907));
            if (this.0l.0 && this.0n.1) {
                string = (String)this.8.1();
                if (\u200e) {
                    throw null;
                }
            } else {
                string = 0rB$1f.XNZw("", -522464746);
            }
            23.0(this, string2, string);
            if (!this.0n.1 || 0ay.3().5.0(8F.class).4()) {
                return;
            }
            Object object = this.0n.0;
            if (!((7r)object).3.d || !this.0l.0) {
                return;
            }
            if (((7r)object).1.1() && ((7r)object).1.0().h) {
                n3 = (int)((long)-1827213443 ^ (long)-1827213444);
                if (\u200e) {
                    throw null;
                }
            } else {
                n3 = (int)((long)-1346839499 ^ (long)-1346839499);
            }
            if (n3 == 0) {
                return;
            }
            Stream<7r> stream = this.0n.0().stream();
            String string3 = ((String)this.0o.1()).toLowerCase();
            int n4 = (int)((long)2118317436 ^ (long)-2118317437);
            switch (string3.hashCode()) {
                case 288459765: {
                    if (!string3.equals(7_.b((int)((long)1113915736 ^ (long)-1113922261), (int)((long)1095617513 ^ (long)1095630790)))) break;
                    n4 = (int)((long)-1923314070 ^ (long)-1923314070);
                    if (stringArray != null) break;
                }
                case 1397962786: {
                    if (!string3.equals(7_.b((int)((long)591412522 ^ (long)-591406732), (int)((long)-2018953746 ^ (long)-2018955634)))) break;
                    n4 = (int)((long)1911797496 ^ (long)1911797497);
                    break;
                }
            }
            switch (n4) {
                case 0: {
                    comparator = Comparator.comparingDouble(r2 -> {
                        boolean bl2 = \u200e;
                        if (bl2 || bl2) {
                            return 0.0;
                        }
                        return r2.0.g((vg)7_.2.h);
                    });
                    if (!\u200e) break;
                    throw null;
                }
                case 1: {
                    comparator = Comparator.comparingDouble(r2 -> {
                        boolean bl2 = \u200e;
                        if (bl2 || bl2) {
                            return 0.0;
                        }
                        return 2Z.0((vg)r2.0);
                    });
                    if (!\u200e) break;
                    throw null;
                }
                default: {
                    comparator = Comparator.comparingDouble(r2 -> {
                        boolean bl2 = \u200e;
                        if (bl2 || bl2) {
                            return 0.0;
                        }
                        return 0.0;
                    });
                }
            }
            stream.sorted(comparator).forEach(arg_0 -> this.0((7r)object, arg_0));
            if (((7r)object).1.0() == 7O.d) {
                int n5;
                7r r3 = object;
                if (r3.0.aU() && ((aip)r3.0.bv.b.get((int)((long)199319876 ^ (long)199319879))).c() == ain.a((aow)aox.aU) && !r3.0.a(vb.p)) {
                    n5 = (int)((long)-966351352 ^ (long)-966351351);
                    if (\u200e) {
                        throw null;
                    }
                } else {
                    n5 = (int)((long)-1124362388 ^ (long)-1124362388);
                }
                if (n5 == 0 && this.0f.0) {
                    this.0g = null;
                }
            }
            7r r4 = object;
            string3 = 7r.2.s;
            if (r4.0 == 7r.2.h && r4.3 == 1T.a && string3 != null && ((bhc)string3).a == bhc.a.b && 2w.0(string3.a()) instanceof apt) {
                n2 = (int)((long)-1855358227 ^ (long)-1855358228);
                if (\u200e) {
                    throw null;
                }
            } else {
                n2 = (int)((long)-1450422920 ^ (long)-1450422920);
            }
            if (n2 != 0) {
                this.0g = null;
                z2.1(7_.2.h.v).0(7_.2.h.w);
            }
            if (this.0g == null) return;
            0h = this.0p.0;
            7_ _ = this;
            object = 2Z.0(_.0(_.0g.0));
            0h = (int)((long)722958239 ^ (long)722958239);
            if (((String)this.0d.1()).equals(7_.b((int)((long)1310440254 ^ (long)-1310433508), (int)((long)722345533 ^ (long)722340941))) && !this.0.0 && !7_.2.t.ad.e()) {
                return;
            }
            z2.1(((1s)object).1).0(((1s)object).0);
            if (!((String)this.8.1()).equals(7_.b((int)((long)77278809 ^ (long)-77280732), (int)((long)-864435112 ^ (long)864434413)))) return;
            7_.2.h.v = ((1s)object).1;
            7_.2.h.w = ((1s)object).0;
        }, new Predicate[(int)((long)-646057664 ^ (long)-646057664)]);
        this.4 = new Listener<5T>(t2 -> {
            boolean bl2 = \u200e;
            if (bl2 || bl2) return;
            if (!this.9.0) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            int n2 = 7_.2.d / (int)((long)-1508179007 ^ (long)-1508179005);
            if (bl2 || bl2) return;
            int n3 = 7_.2.e / (int)((long)-1263944484 ^ (long)-1263944482);
            if (bl2 || bl2) return;
            float f2 = (float)(-Math.atan(1.0f / 1t.0().1.asReadOnlyBuffer().get((int)((long)-307511298 ^ (long)-307511307))));
            if (bl2 || bl2) return;
            float f3 = (float)Math.toRadians(this.0i.2 / 2.0f);
            f2 = rk.a((float)f3) / rk.b((float)f3) / (rk.a((float)f2) / rk.b((float)f2)) * (float)n2;
            if (bl2 || bl2) return;
            1t.0((int)((long)1838692439 ^ (long)-1838729129));
            if (bl2 || bl2) return;
            1A.0((boolean)((long)1013745687 ^ (long)1013745686));
            if (bl2 || bl2) return;
            bus.d((float)1.0f);
            if (bl2 || bl2) return;
            bus.r((int)((int)((long)-461234819 ^ (long)-461234817)));
            if (bl2 || bl2) return;
            int n4 = (int)((long)-65297166 ^ (long)-65297166);
            if (bl2) return;
            while (!bl2) {
                if (n4 < (int)((long)-113447546 ^ (long)-113447698)) {
                    if (bl2 || bl2) return;
                    float f4 = rk.a((float)((float)Math.toRadians(n4))) * f2 + (float)n2;
                    if (bl2 || bl2) return;
                    float f5 = rk.b((float)((float)Math.toRadians(n4))) * f2 + (float)n3;
                    if (bl2 || bl2) return;
                    GL11.glVertex2d((double)f4, (double)f5);
                    if (bl2 || bl2) return;
                    ++n4;
                    if (bl2) return;
                    if (!\u200e) continue;
                    throw null;
                }
                if (bl2) return;
                bus.J();
                if (bl2 || bl2) return;
                1A.0((boolean)((long)922985295 ^ (long)922985295));
                if (bl2 || bl2) return;
                1t.0((int)((long)1718858492 ^ (long)-1718858493));
                if (!bl2 && !bl2) return;
            }
        }, new Predicate[(int)((long)582842904 ^ (long)582842904)]);
        this.1 = new Listener<0d>(d2 -> {
            boolean bl2;
            block11: {
                block10: {
                    block9: {
                        block8: {
                            bl2 = \u200e;
                            if (bl2 || bl2) return;
                            if (!this.6.0) break block8;
                            if (bl2) return;
                            if (this.0n.1) break block9;
                            if (bl2) return;
                        }
                        if (bl2) return;
                        return;
                    }
                    if (bl2) return;
                    if (d2.3 == fj.y.c()) break block10;
                    if (bl2) return;
                    if (d2.3 != fj.D.c()) break block11;
                    if (bl2) return;
                }
                if (bl2) return;
                d2.cancel();
                if (bl2) return;
            }
            if (!bl2) return;
        }, new Predicate[(int)((long)2111164142 ^ (long)2111164142)]);
        this.3 = new Listener<5Y>(y2 -> {
            block4: {
                block2: {
                    boolean bl2;
                    block3: {
                        bl2 = \u200e;
                        if (bl2 || bl2) break block2;
                        this.0n.0().forEach(r2 -> {
                            boolean bl2 = \u200e;
                            if (bl2 || bl2) return;
                            if (!7_.0(r2)) {
                                if (bl2 || bl2) return;
                                return;
                            }
                            if (bl2) return;
                            int n2 = r2.3.c;
                            if (bl2 || bl2) return;
                            if (this.0j.0) {
                                if (bl2 || bl2) return;
                                2O.0((vg)r2.0, n2, (boolean)((long)-2129532754 ^ (long)-2129532753), y2.0());
                                if (bl2) return;
                            }
                            if (!bl2) return;
                        });
                        if (bl2 || bl2) break block2;
                        if (!this.7.0) break block3;
                        if (bl2 || bl2) break block2;
                        7_.2.f.e.forEach(vg2 -> {
                            block4: {
                                block2: {
                                    boolean bl2;
                                    block3: {
                                        bl2 = \u200e;
                                        if (bl2 || bl2) break block2;
                                        if (!(vg2 instanceof acl)) break block3;
                                        if (bl2 || bl2) break block2;
                                        vg2 = (acl)vg2;
                                        if (bl2 || bl2) break block2;
                                        float[] fArray = this.0m.get(ain.a((ain)vg2.k().c()));
                                        if (fArray == null) break block3;
                                        if (bl2 || bl2) break block2;
                                        2O.0((acl)vg2, 2w.0(fArray), 1.0f, y2.0());
                                        if (bl2) break block2;
                                    }
                                    if (!bl2) break block4;
                                }
                                return;
                            }
                        });
                        if (bl2 || bl2) break block2;
                        7_.2.f.g.forEach(avj2 -> {
                            block4: {
                                block2: {
                                    boolean bl2;
                                    block3: {
                                        bl2 = \u200e;
                                        if (bl2 || bl2) break block2;
                                        if (!(avj2 instanceof avo)) break block3;
                                        if (bl2 || bl2) break block2;
                                        bhb bhb2 = avj2.x().t().e((amy)7_.2.f, avj2.w());
                                        if (bl2 || bl2) break block2;
                                        Object object = (AccessorRenderManager)2.ac();
                                        if (bl2 || bl2) break block2;
                                        bhb2 = bhb2.d(-object.getRenderPosX(), -object.getRenderPosY(), -object.getRenderPosZ());
                                        if (bl2 || bl2) break block2;
                                        float[] fArray = this.0m.get((int)((long)1605881019 ^ (long)1605881248));
                                        object = fArray;
                                        int n2 = 2w.1(fArray[(int)((long)1786733156 ^ (long)1786733156)], (float)object[(int)((long)150854604 ^ (long)150854605)], (float)object[(int)((long)-597088128 ^ (long)-597088126)], 1.0f);
                                        if (bl2 || bl2) break block2;
                                        int n3 = 2w.1((float)object[(int)((long)-477810701 ^ (long)-477810701)], (float)object[(int)((long)1522996330 ^ (long)1522996331)], (float)object[(int)((long)799578896 ^ (long)799578898)], 0.2f);
                                        if (bl2 || bl2) break block2;
                                        2O.0(bhb2.a(avj2.w()), n3, n2, 1.0f);
                                        if (bl2) break block2;
                                    }
                                    if (!bl2) break block4;
                                }
                                return;
                            }
                        });
                        if (bl2) break block2;
                    }
                    if (!bl2) break block4;
                }
                return;
            }
        }, new Predicate[(int)((long)645676832 ^ (long)645676832)]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private 3Z 0(aed aed2) {
        boolean bl2 = \u200e;
        if (bl2 || bl2) return null;
        7r r2 = this.0n.0;
        if (bl2 || bl2) return null;
        double d2 = 7_.2.h.g((vg)aed2);
        if (bl2) return null;
        double d3 = 0.0;
        String[] stringArray = 7b.0();
        if (bl2 || bl2) return null;
        double d4 = 0.0;
        if (bl2) return null;
        if (bl2) return null;
        if (r2.1.1()) {
            if (bl2) return null;
            if (r2.1.0().h) {
                if (bl2 || bl2) return null;
                switch (01.0[r2.1.0().ordinal()]) {
                    case 1: {
                        if (bl2) return null;
                        d3 = 1.7 * Math.max(d2 / 12.0 + 2.0, 1.0);
                        if (bl2 || bl2) return null;
                        if (stringArray != null) break;
                        if (bl2) return null;
                    }
                    case 2: {
                        if (bl2) return null;
                        d3 = 1.5 * Math.max(d2 / 8.0 + 2.0, 1.0);
                        if (bl2 || bl2) return null;
                        if (stringArray != null) break;
                        if (bl2) return null;
                    }
                    case 3: {
                        if (bl2) return null;
                        d3 = 1.9 * Math.max(d2 / 15.0 + 2.0, 1.0);
                        if (bl2 || bl2) return null;
                        if (stringArray != null) break;
                        if (bl2) return null;
                    }
                    case 4: {
                        if (bl2) return null;
                        d3 = 1.5 * Math.max(d2 / 20.0 + 1.0, 1.0);
                        if (bl2 || bl2) return null;
                        if (stringArray != null) break;
                        if (bl2) return null;
                    }
                    case 5: {
                        if (bl2) return null;
                        d3 = 1.5 * Math.max(d2 / 15.0 + 2.0, 1.0);
                        if (bl2 || bl2) return null;
                        d4 = d2 / 40.0;
                        if (bl2) return null;
                        break;
                    }
                }
            }
        }
        if (bl2) return null;
        float f2 = 1.0f;
        if (bl2) return null;
        if (bl2) return null;
        String string = ((String)this.0a.1()).toLowerCase();
        if (bl2) return null;
        int n2 = (int)((long)1356683162 ^ (long)-1356683163);
        if (bl2) return null;
        switch (string.hashCode()) {
            case 3198432: {
                if (bl2) return null;
                if (!string.equals(7_.b((int)((long)2005544694 ^ (long)-2005546311), (int)((long)-1219897215 ^ (long)-1219918396)))) break;
                if (bl2) return null;
                n2 = (int)((long)191767611 ^ (long)191767611);
                if (bl2) return null;
                if (stringArray != null) break;
                if (bl2) return null;
            }
            case 94627585: {
                if (bl2) return null;
                if (!string.equals(7_.b((int)((long)1627210668 ^ (long)-1627215909), (int)((long)1674621701 ^ (long)1674638343)))) break;
                if (bl2) return null;
                n2 = (int)((long)1640354143 ^ (long)1640354142);
                if (bl2) return null;
                if (stringArray != null) break;
                if (bl2) return null;
            }
            case 3317797: {
                if (bl2) return null;
                if (!string.equals(7_.b((int)((long)1632424383 ^ (long)-1632422497), (int)((long)116555872 ^ (long)-116560264)))) break;
                if (bl2) return null;
                n2 = (int)((long)857819470 ^ (long)857819468);
                if (bl2) return null;
                break;
            }
        }
        if (bl2) return null;
        switch (n2) {
            case 0: {
                if (bl2) return null;
                f2 = 0.75f;
                if (bl2) return null;
                if (bl2) return null;
                if (stringArray != null) break;
                if (bl2) return null;
            }
            case 1: {
                if (bl2) return null;
                f2 = 0.55f;
                if (bl2) return null;
                if (bl2) return null;
                if (stringArray != null) break;
                if (bl2) return null;
            }
            case 2: {
                if (bl2) return null;
                f2 = 0.3f;
                if (bl2) return null;
                break;
            }
        }
        if (bl2) return null;
        if (this.0e.0) {
            if (bl2 || bl2) return null;
            float f3 = 1C.0((aed)7_.2.h);
            if (bl2 || bl2) return null;
            float f4 = 1C.0(aed2);
            if (bl2 || bl2) return null;
            if (f3 > 0.0f) {
                if (bl2) return null;
                if (f4 > 0.0f) {
                    if (bl2 || bl2) return null;
                    d3 += (double)rk.f((float)(f3 / f4));
                    if (bl2) return null;
                }
            }
        }
        if (bl2) return null;
        bhe bhe2 = new bhe(aed2.p, aed2.q + (double)(aed2.by() * f2), aed2.r);
        if (bl2 || bl2) return null;
        bhe bhe3 = new bhe(aed2.p + (aed2.p - aed2.m) * d3, aed2.q + (aed2.q - aed2.n) + (double)(aed2.by() * f2) + d4, aed2.r + (aed2.r - aed2.o) * d3);
        if (bl2 || bl2) return null;
        aed2 = 7_.2.f.a(bhe2, bhe3, (boolean)((long)-1586639662 ^ (long)-1586639662), (boolean)((long)1893861974 ^ (long)1893861975), (boolean)((long)421125917 ^ (long)421125917));
        if (aed2 == null) {
            if (bl2 || bl2) return null;
            return new 3Z(bhe3.b, bhe3.c, bhe3.d);
        }
        if (!bl2) return new 3Z(aed2.c.b, aed2.c.c, aed2.c.d);
        return null;
    }
}

