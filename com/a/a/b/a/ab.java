/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.b.a.ac;
import com.a.a.b.a.ad;
import com.a.a.b.a.ae;
import com.a.a.b.a.af;
import com.a.a.b.a.ag;
import com.a.a.b.a.ah;
import com.a.a.b.a.ai;
import com.a.a.b.a.aj;
import com.a.a.b.a.ak;
import com.a.a.b.a.al;
import com.a.a.b.a.am;
import com.a.a.b.a.an;
import com.a.a.b.a.ao;
import com.a.a.b.a.ap;
import com.a.a.b.a.aq;
import com.a.a.b.a.ar;
import com.a.a.b.a.as;
import com.a.a.b.a.at;
import com.a.a.b.a.au;
import com.a.a.b.a.aw;
import com.a.a.b.a.ax;
import com.a.a.b.a.ay;
import com.a.a.b.a.az;
import com.a.a.b.a.ba;
import com.a.a.b.a.bb;
import com.a.a.b.a.bc;
import com.a.a.b.a.bd;
import com.a.a.b.a.be;
import com.a.a.b.a.bh;
import com.a.a.b.a.bi;
import com.a.a.b.a.bj;
import com.a.a.b.a.bk;
import com.a.a.b.a.bl;
import com.a.a.b.a.bm;
import com.a.a.v;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class ab {
    private static com.a.a.ag<Class> D = new ac().nullSafe();
    public static final com.a.a.ai a = ab.a(Class.class, D);
    private static com.a.a.ag<BitSet> E = new an().nullSafe();
    public static final com.a.a.ai b = ab.a(BitSet.class, E);
    private static com.a.a.ag<Boolean> F = new az();
    public static final com.a.a.ag<Boolean> c = new bh();
    public static final com.a.a.ai d = ab.a(Boolean.TYPE, Boolean.class, F);
    private static com.a.a.ag<Number> G = new bi();
    public static final com.a.a.ai e = ab.a(Byte.TYPE, Byte.class, G);
    private static com.a.a.ag<Number> H = new bj();
    public static final com.a.a.ai f = ab.a(Short.TYPE, Short.class, H);
    private static com.a.a.ag<Number> I = new bk();
    public static final com.a.a.ai g = ab.a(Integer.TYPE, Integer.class, I);
    private static com.a.a.ag<AtomicInteger> J = new bl().nullSafe();
    public static final com.a.a.ai h = ab.a(AtomicInteger.class, J);
    private static com.a.a.ag<AtomicBoolean> K = new bm().nullSafe();
    public static final com.a.a.ai i = ab.a(AtomicBoolean.class, K);
    private static com.a.a.ag<AtomicIntegerArray> L = new ad().nullSafe();
    public static final com.a.a.ai j = ab.a(AtomicIntegerArray.class, L);
    public static final com.a.a.ag<Number> k = new ae();
    private static com.a.a.ag<Number> M;
    public static final com.a.a.ai l;
    private static com.a.a.ag<Character> N;
    public static final com.a.a.ai m;
    private static com.a.a.ag<String> O;
    public static final com.a.a.ag<BigDecimal> n;
    public static final com.a.a.ag<BigInteger> o;
    public static final com.a.a.ai p;
    private static com.a.a.ag<StringBuilder> P;
    public static final com.a.a.ai q;
    private static com.a.a.ag<StringBuffer> Q;
    public static final com.a.a.ai r;
    private static com.a.a.ag<URL> R;
    public static final com.a.a.ai s;
    private static com.a.a.ag<URI> S;
    public static final com.a.a.ai t;
    private static com.a.a.ag<InetAddress> T;
    public static final com.a.a.ai u;
    private static com.a.a.ag<UUID> U;
    public static final com.a.a.ai v;
    private static com.a.a.ag<Currency> V;
    public static final com.a.a.ai w;
    public static final com.a.a.ai x;
    private static com.a.a.ag<Calendar> W;
    public static final com.a.a.ai y;
    private static com.a.a.ag<Locale> X;
    public static final com.a.a.ai z;
    public static final com.a.a.ag<v> A;
    public static final com.a.a.ai B;
    public static final com.a.a.ai C;

    public static <TT> com.a.a.ai a(Class<TT> clazz, com.a.a.ag<TT> ag2) {
        return new bb(clazz, ag2);
    }

    public static <TT> com.a.a.ai a(Class<TT> clazz, Class<TT> clazz2, com.a.a.ag<? super TT> ag2) {
        return new bc(clazz, clazz2, ag2);
    }

    private static <T1> com.a.a.ai b(Class<T1> clazz, com.a.a.ag<T1> ag2) {
        return new be(clazz, ag2);
    }

    static {
        new af();
        new ag();
        M = new ah();
        l = ab.a(Number.class, M);
        N = new ai();
        m = ab.a(Character.TYPE, Character.class, N);
        O = new aj();
        n = new ak();
        o = new al();
        p = ab.a(String.class, O);
        P = new am();
        q = ab.a(StringBuilder.class, P);
        Q = new ao();
        r = ab.a(StringBuffer.class, Q);
        R = new ap();
        s = ab.a(URL.class, R);
        S = new aq();
        t = ab.a(URI.class, S);
        T = new ar();
        u = ab.b(InetAddress.class, T);
        U = new as();
        v = ab.a(UUID.class, U);
        V = new at().nullSafe();
        w = ab.a(Currency.class, V);
        x = new au();
        W = new aw();
        com.a.a.ag<Calendar> ag2 = W;
        Class<GregorianCalendar> clazz = GregorianCalendar.class;
        Class<Calendar> clazz2 = Calendar.class;
        y = new bd(clazz2, clazz, ag2);
        X = new ax();
        z = ab.a(Locale.class, X);
        A = new ay();
        B = ab.b(v.class, A);
        C = new ba();
    }
}

