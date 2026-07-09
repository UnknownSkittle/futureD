/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.utils.BetterBlockPos;
import baritone.cj;
import baritone.ck;
import baritone.cq;
import baritone.cr;
import baritone.cs;
import baritone.ct;
import baritone.cu;
import baritone.cv;
import baritone.cw;
import baritone.cx;
import baritone.cy;
import baritone.cz;
import baritone.da;
import baritone.db;
import baritone.dc;
import baritone.dd;
import baritone.de;
import baritone.df;
import baritone.dg;
import baritone.dh;
import baritone.di;
import baritone.dj;
import baritone.dk;
import baritone.dl;
import baritone.gj;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class cp
extends Enum<cp> {
    private static /* enum */ cp a = new cq();
    private static /* enum */ cp b = new db();
    private static /* enum */ cp c = new df();
    private static /* enum */ cp d = new dg();
    private static /* enum */ cp e = new dh();
    private static /* enum */ cp f = new di();
    private static /* enum */ cp g = new dj();
    private static /* enum */ cp h = new dk();
    private static /* enum */ cp i = new dl();
    private static /* enum */ cp j = new cr();
    private static /* enum */ cp k = new cs();
    private static /* enum */ cp l = new ct();
    private static /* enum */ cp m = new cu();
    private static /* enum */ cp n = new cv();
    private static /* enum */ cp o = new cw();
    private static /* enum */ cp p = new cx();
    private static /* enum */ cp q = new cy();
    private static /* enum */ cp r = new cz();
    private static /* enum */ cp s = new da();
    private static /* enum */ cp t = new dc();
    private static /* enum */ cp u = new dd();
    private static /* enum */ cp v = new de();
    public final boolean a;
    public final boolean b;
    public final int a;
    public final int b;
    public final int c;
    private static final /* synthetic */ cp[] a;

    public static cp[] values() {
        return (cp[])a.clone();
    }

    public static cp valueOf(String string) {
        return Enum.valueOf(cp.class, string);
    }

    private cp(int n3, int n4, int n5, boolean bl2, boolean bl3) {
        this.a = n3;
        this.b = n4;
        this.c = n5;
        this.a = bl2;
        this.b = bl3;
    }

    private cp(int n3, int n4, int n5) {
        this(n3, n4, n5, false, false);
    }

    public abstract ck a(cj var1, BetterBlockPos var2);

    public void a(cj cj2, int n2, int n3, int n4, gj gj2) {
        if (this.a || this.b) {
            throw new UnsupportedOperationException();
        }
        gj2.a = n2 + this.a;
        gj2.b = n3 + this.b;
        gj2.c = n4 + this.c;
        gj2.a = this.a(cj2, n2, n3, n4);
    }

    public double a(cj cj2, int n2, int n3, int n4) {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ cp(String string, int n2, int n3, int n4, int n5, byte by2) {
        this(n3, n4, n5);
    }

    /* synthetic */ cp(String string, int n2, int n3, int n4, int n5, boolean bl2) {
        this(n3, n4, n5, bl2, true);
    }

    static {
        a = new cp[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v};
    }
}

