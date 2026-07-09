/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.f;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.a.b;
import org.apache.a.b.c.e;
import org.apache.a.b.c.j;
import org.apache.a.h.f.a;
import org.apache.a.h.f.c;
import org.apache.a.h.f.g;
import org.apache.a.h.f.h;
import org.apache.a.h.f.k;
import org.apache.a.i;
import org.apache.a.l;
import org.apache.a.m;
import org.apache.a.n;
import org.apache.a.q;
import org.apache.a.r;
import org.apache.a.s;

public final class d
implements a {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());
    private final org.apache.a.m.g b;
    private final org.apache.a.e.h c;
    private final b d;
    private final org.apache.a.e.b e;
    private final r f;
    private final org.apache.a.b.b g;
    private final org.apache.a.b.b h;
    private final org.apache.a.h.a.i i;
    private final org.apache.a.b.k j;
    private final org.apache.a.e.a.c k;

    public d(org.apache.a.m.g g2, org.apache.a.e.h h2, b b2, org.apache.a.e.b b3, r r2, org.apache.a.b.b b4, org.apache.a.b.b b5, org.apache.a.b.k k2) {
        ai.a(g2, "HTTP request executor");
        ai.a(h2, "Client connection manager");
        ai.a(b2, "Connection reuse strategy");
        ai.a(b3, "Connection keep alive strategy");
        ai.a(r2, "Proxy HTTP processor");
        ai.a(b4, "Target authentication strategy");
        ai.a(b5, "Proxy authentication strategy");
        ai.a(k2, "User token handler");
        this.i = new org.apache.a.h.a.i(0);
        this.k = new org.apache.a.e.a.a();
        this.b = g2;
        this.c = h2;
        this.d = b2;
        this.e = b3;
        this.f = r2;
        this.g = b4;
        this.h = b5;
        this.j = k2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final org.apache.a.b.c.b a(org.apache.a.e.a.b var1_1, j var2_2, org.apache.a.b.e.a var3_3, e var4_4) {
        ai.a(var1_1, "HTTP route");
        ai.a(var2_2, "HTTP request");
        ai.a(var3_3, "HTTP context");
        var5_5 = var3_3.g();
        if (var5_5 == null) {
            var5_5 = new org.apache.a.a.e();
            var3_3.a("http.auth.target-scope", var5_5);
        }
        if ((var6_6 = var3_3.h()) == null) {
            var6_6 = new org.apache.a.a.e();
            var3_3.a("http.auth.proxy-scope", var6_6);
        }
        if (var2_2 instanceof l) {
            org.apache.a.h.f.h.a((l)var2_2);
        }
        var7_7 = var3_3.a("http.user-token");
        var8_8 = this.c.a(var1_1, var7_7);
        if (var4_4 != null) {
            if (var4_4.h()) {
                var8_8.a();
                throw new g("Request aborted");
            }
            var4_4.a((org.apache.a.c.a)var8_8);
        }
        var9_9 = var3_3.i();
        try {
            var10_10 = var9_9.m();
            var8_8 = var8_8.a(var10_10 > 0 ? (long)var10_10 : 0L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException var10_11) {
            Thread.currentThread().interrupt();
            throw new g("Request aborted", var10_11);
        } catch (ExecutionException v0) {
            var10_12 = v0;
            var11_14 = v0.getCause();
            if (var11_14 == null) {
                var11_14 = var10_12;
            }
            throw new g("Request execution failed", var11_14);
        }
        var3_3.a("http.connection", var8_8);
        if (var9_9.d() && var8_8.c()) {
            this.a.a("Stale connection check");
            if (var8_8.d()) {
                this.a.a("Stale connection detected");
                var8_8.close();
            }
        }
        var10_13 = new org.apache.a.h.f.b(this.a, this.c, (i)var8_8);
        try {
            if (var4_4 != null) {
                var4_4.a(var10_13);
            }
            var12_22 = 1;
            while (true) {
                if (var12_22 > 1 && !org.apache.a.h.f.h.a(var2_2)) {
                    throw new org.apache.a.b.h("Cannot retry request with a non-repeatable request entity.");
                }
                if (var4_4 != null && var4_4.h()) {
                    throw new g("Request aborted");
                }
                if (!var8_8.c()) {
                    this.a.a("Opening connection ".concat(String.valueOf(var1_1)));
                    try {
                        var17_33 = var3_3;
                        var16_30 = var2_2;
                        var15_27 = var1_1;
                        var14_26 = var8_8;
                        var13_25 = var6_6;
                        var11_15 = this;
                        var18_35 = var17_33.i().n();
                        var19_36 = new org.apache.a.e.a.h((org.apache.a.e.a.b)var15_27);
                        do {
                            var21_38 = var19_36.i();
                            var20_37 = var11_15.k.a((org.apache.a.e.a.e)var15_27, (org.apache.a.e.a.e)var21_38);
                            switch (var20_37) {
                                case 1: {
                                    var11_15.c.a((i)var14_26, (org.apache.a.e.a.b)var15_27, var18_35 > 0 ? var18_35 : 0, (org.apache.a.m.d)var17_33);
                                    var19_36.a(var15_27.h());
                                    break;
                                }
                                case 2: {
                                    var11_15.c.a((i)var14_26, (org.apache.a.e.a.b)var15_27, var18_35 > 0 ? var18_35 : 0, (org.apache.a.m.d)var17_33);
                                    var21_38 = var15_27.e();
                                    var19_36.a((n)var21_38);
                                    break;
                                }
                                case 3: {
                                    var26_43 = var17_33;
                                    var25_42 = var16_30;
                                    var24_41 = var15_27;
                                    var23_40 = var14_26;
                                    var22_39 = var13_25;
                                    var21_38 = var11_15;
                                    var27_44 = var26_43.i();
                                    var28_45 = var27_44.n();
                                    var29_46 = var24_41.a();
                                    var30_47 = var24_41.e();
                                    var31_48 = null;
                                    var29_46 = var29_46.e();
                                    var25_42 = new org.apache.a.j.h("CONNECT", (String)var29_46, var25_42.c());
                                    var33_50 = var26_43;
                                    var32_49 = var21_38.f;
                                    var29_46 = var25_42;
                                    ai.a(var25_42, "HTTP request");
                                    ai.a(var32_49, "HTTP processor");
                                    ai.a(var33_50, "HTTP context");
                                    var33_50.a("http.request", var29_46);
                                    var32_49.a((q)var29_46, (org.apache.a.m.d)var33_50);
                                    while (var31_48 == null) {
                                        if (!var23_40.c()) {
                                            var21_38.c.a((i)var23_40, var24_41, var28_45 > 0 ? var28_45 : 0, (org.apache.a.m.d)var26_43);
                                        }
                                        var25_42.d("Proxy-Authorization");
                                        var21_38.i.a((q)var25_42, var22_39, (org.apache.a.m.d)var26_43);
                                        var31_48 = var21_38.b.a((q)var25_42, (i)var23_40, (org.apache.a.m.d)var26_43);
                                        if (var31_48.a().b() < 200) {
                                            throw new m("Unexpected response to CONNECT request: " + var31_48.a());
                                        }
                                        if (!var27_44.j() || !var21_38.i.a(var30_47, var31_48, var21_38.h, var22_39, (org.apache.a.m.d)var26_43) || !var21_38.i.b(var30_47, var31_48, var21_38.h, var22_39, (org.apache.a.m.d)var26_43)) continue;
                                        if (var21_38.d.a(var31_48, (org.apache.a.m.d)var26_43)) {
                                            var21_38.a.a("Connection kept alive");
                                            ai.a(var31_48.b());
                                        } else {
                                            var23_40.close();
                                        }
                                        var31_48 = null;
                                    }
                                    if (var31_48.a().b() > 299) {
                                        var29_46 = var31_48.b();
                                        if (var29_46 != null) {
                                            var31_48.a(new org.apache.a.g.c((org.apache.a.k)var29_46));
                                        }
                                        var23_40.close();
                                        throw new k("CONNECT refused by proxy: " + var31_48.a(), var31_48);
                                    }
                                    var11_15.a.a("Tunnel to target created.");
                                    var19_36.c();
                                    break;
                                }
                                case 4: {
                                    var21_38.d();
                                    throw new m("Proxy chains are not supported.");
                                }
                                case 5: {
                                    var11_15.c.a((i)var14_26, (org.apache.a.e.a.b)var15_27, (org.apache.a.m.d)var17_33);
                                    var19_36.b(var15_27.h());
                                    break;
                                }
                                case -1: {
                                    throw new m("Unable to establish route: planned = " + var15_27 + "; current = " + var21_38);
                                }
                                case 0: {
                                    var11_15.c.a((i)var14_26, (org.apache.a.e.a.b)var15_27);
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("Unknown step indicator " + var20_37 + " from RouteDirector.");
                                }
                            }
                        } while (var20_37 > 0);
                    } catch (k var11_16) {
                        if (this.a.a()) {
                            this.a.a(var11_16.getMessage());
                        }
                        var11_15 = var11_16.a();
                        break;
                    }
                }
                if ((var11_17 = var9_9.o()) >= 0) {
                    var8_8.b(var11_17);
                }
                if (var4_4 != null && var4_4.h()) {
                    throw new g("Request aborted");
                }
                if (this.a.a()) {
                    this.a.a("Executing request " + var2_2.g());
                }
                if (!var2_2.a("Authorization")) {
                    if (this.a.a()) {
                        this.a.a("Target auth state: " + (Object)var5_5.b());
                    }
                    this.i.a(var2_2, var5_5, var3_3);
                }
                if (!var2_2.a("Proxy-Authorization") && !var1_1.f()) {
                    if (this.a.a()) {
                        this.a.a("Proxy auth state: " + (Object)var6_6.b());
                    }
                    this.i.a(var2_2, var6_6, var3_3);
                }
                if (this.d.a((s)(var11_15 = this.b.a(var2_2, (i)var8_8, var3_3)), var3_3)) {
                    var15_28 = this.e.a((s)var11_15);
                    if (this.a.a()) {
                        var13_25 = var15_28 > 0L ? "for " + var15_28 + " " + (Object)TimeUnit.MILLISECONDS : "indefinitely";
                        this.a.a("Connection can be kept alive ".concat(String.valueOf(var13_25)));
                    }
                    var10_13.a(var15_28, TimeUnit.MILLISECONDS);
                    var10_13.c();
                } else {
                    var10_13.d();
                }
                var18_34 = var3_3;
                var17_33 = var11_15;
                var16_30 = var1_1;
                var15_27 = var6_6;
                var14_26 = var5_5;
                var13_25 = this;
                if (!var18_34.i().j()) ** GOTO lbl-1000
                var19_36 = var18_34.k();
                if (var19_36 == null) {
                    var19_36 = var16_30.a();
                }
                if (var19_36.b() < 0) {
                    var19_36 = new n(var19_36.a(), var16_30.a().b(), var19_36.c());
                }
                var20_37 = (int)var13_25.i.a((n)var19_36, (s)var17_33, var13_25.g, (org.apache.a.a.e)var14_26, var18_34);
                var21_38 = var16_30.e();
                if (var21_38 == null) {
                    var21_38 = var16_30.a();
                }
                var16_31 = var13_25.i.a((n)var21_38, (s)var17_33, var13_25.h, (org.apache.a.a.e)var15_27, var18_34);
                if (var20_37 != 0) {
                    v1 = var13_25.i.b((n)var19_36, (s)var17_33, var13_25.g, (org.apache.a.a.e)var14_26, var18_34);
                } else if (var16_31) {
                    v1 = var13_25.i.b((n)var21_38, (s)var17_33, var13_25.h, (org.apache.a.a.e)var15_27, var18_34);
                } else lbl-1000:
                // 2 sources

                {
                    v1 = false;
                }
                if (!v1) break;
                var15_27 = var11_15.b();
                if (var10_13.b()) {
                    ai.a((org.apache.a.k)var15_27);
                } else {
                    var8_8.close();
                    if (var6_6.b() == org.apache.a.a.a.e && var6_6.c() != null && var6_6.c().c()) {
                        this.a.a("Resetting proxy auth state");
                        var6_6.a();
                    }
                    if (var5_5.b() == org.apache.a.a.a.e && var5_5.c() != null && var5_5.c().c()) {
                        this.a.a("Resetting target auth state");
                        var5_5.a();
                    }
                }
                var16_30 = var2_2.j();
                if (!var16_30.a("Authorization")) {
                    var2_2.d("Authorization");
                }
                if (!var16_30.a("Proxy-Authorization")) {
                    var2_2.d("Proxy-Authorization");
                }
                ++var12_22;
            }
            if (var7_7 == null) {
                var7_7 = this.j.a(var3_3);
                var3_3.a("http.user-token", var7_7);
            }
            if (var7_7 != null) {
                var10_13.a(var7_7);
            }
            if ((var12_23 = var11_15.b()) == null || !var12_23.isStreaming()) {
                var10_13.e();
                return new c((s)var11_15, null);
            }
            return new c((s)var11_15, var10_13);
        } catch (org.apache.a.h.c.d var11_18) {
            var12_24 = new InterruptedIOException("Connection has been shut down");
            var12_24.initCause(var11_18);
            throw var12_24;
        } catch (m var11_19) {
            var10_13.f();
            throw var11_19;
        } catch (IOException var11_20) {
            var10_13.f();
            throw var11_20;
        } catch (RuntimeException var11_21) {
            var10_13.f();
            throw var11_21;
        }
    }
}

