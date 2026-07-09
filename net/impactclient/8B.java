/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ja
 *  kf
 */
package net.impactclient;

import java.lang.constant.Constable;
import java.util.Random;
import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import me.zero.clarinet.hook.mixin.accessor.AccessorSPacketEntityVelocity;
import me.zero.clarinet.hook.mixin.accessor.AccessorSPacketExplosion;
import net.impactclient.0rB$1f;
import net.impactclient.0rL;
import net.impactclient.0rM;
import net.impactclient.0ri;
import net.impactclient.1H;
import net.impactclient.1J;
import net.impactclient.1_;
import net.impactclient.1l;
import net.impactclient.23;
import net.impactclient.2r;
import net.impactclient.36;
import net.impactclient.4n;
import net.impactclient.73;
import net.impactclient.7c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 8B
extends 73
implements 36 {
    private 0ri 6;
    @EventHandler
    private final Listener<1l> 1;
    private static final String[] d;
    private static final String[] e;
    private 0ri 0a;
    private 0rL 4;
    public 0ri 0;
    public static final boolean \u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f;
    @EventHandler
    private final Listener<7c> 9;
    private 0rM 8;
    private 0ri 0b;
    private 0rM 7;
    private 0rL 3;
    private 0rM 5;

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)-968392707 ^ (long)-968392734)];
            if (var7) break block23;
            var3_2 = (int)((long)-585240311 ^ (long)-585240311);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\uda1b\uf374\u30f3\ucdfd\uda7b\uf368\u305c\ucd0c\uda57\uf3f5\u3046\ucd93\uda53\uf3e1\u306f\ucdcf\udae0\uf38e\u3048\ucd58\uda10\uf3b3\u30e0\ucd5d\uda8d\uf3eb\u307b\ucd76\uda52\uf310\u3025\ucdef\udaac\uf3b8\u30f8\ucd49\uda96\uf3ea\u3098\ucd3f\udaec\uf321\u3001\ucd6e\uda86\uf3f4\u3037\ucd4c\udaa2\uf327\u3072\ucd3a\uda37\uf344\u3018\ucd85\udace\uf38a\u3004\ucde6\uda66\uf3ae\u30cb\ucd41\udaef\uf339\u3013\ucdee\uda74\uf386\u30c3\ucdb2\uda30\uf34f\u30d6\ucd56\uda0c\uf3ea\u3080\ucd8d\udae4\uf37d\u302c\ucde3\uda9d\uf374\u3066\ucd58\uda79\uf354\u3004\ucd8a\uda84\uf315\u30a7\ucdbc\udad4\uf382\u304a\ucdb9\uda6b\uf3aa\u3090\ucdce\uda22\uf3cb\u3071\ucd6c\udaa8\uf32d\u302a\ucd19\uda78\uf3ef\u3027\ucd56\uda0f\uf35b\u3058\ucd7c\udaa9\uf32e\u3036\ucdf5\uda27\uf37e\u30b1\ucd5f\uda29\uf357\u3043\ucd37\uda97\uf3fe\u30df\ucd37\udaee\uf36a\u30f1\ucd0a\uda68\uf37e\u307c\ucde5\uda69\uf3da\u302e\ucd00\udab8\uf3e4\u30ee\ucdf3\uda6c\uf3ad\u3006\ucd42\uda38\uf3bc\u30cc\ucded\uda20\uf3fc\u30e2\ucd00\udaf2\uf36e\u30fb\ucd4e\udaac\uf39f\u30c5\ucde1\uda50\uf355\u3087\ucd47\udae7\uf3c8\u30a2\ucd8a\uda61\uf34b\u3037\ucd0a\uda44\uf371\u30fb\ucd95\uda0e\uf336\u308b\ucd5e\udaba\uf364\u3055\ucdce\uda42\uf3ff\u30e5\ucd80\uda13\uf33c\u303b\ucd50\udaa8\uf3cc\u308e\ucd10\udaed\uf3a4\u3030\ucd22\uda3a\uf306\u302e\ucd72\uda08\uf35c\u309e\ucd8d\uda7a\uf30c\u304f\ucd76\udaa0\uf3ba\u301e\ucd75\uda50\uf3ea\u307d\ucd6d\udaaf\uf35c\u3077\ucd73\uda85\uf300\u3068\ucd34\uda26\uf307\u3005\ucd9e\uda46\uf39a\u30ab\ucdc1\uda2b\uf394\u3023\ucd6e\uda27\uf35a\u300a\ucd0f\udaf6\uf315\u3079\ucd35\uda35\uf3c5\u3093\ucd6e\uda76\uf3a8\u3087\ucdb9\uda32\uf389\u306a\ucdb8\uda71\uf3b1\u30be\ucd8b\uda56\uf355\u30c8\ucd9e\udac8\uf3b1\u307a\ucd2a\udac8\uf3db\u3088\ucd87\udac1\uf392\u30fc\ucda2\uda1f\uf3c4\u30eb\ucd45\udadc\uf32c\u30a8\ucd77\udae2\uf330\u3061\ucdfd\udaf1\uf305\u309d\ucdd6\udaa3\uf3fe\u30ea\ucde0\uda9d\uf3e8\u30d2\ucd83\uda76\uf339\u3042\ucdae\udaad\uf312\u304d\ucd23\uda2d\uf38c\u3016\ucd81\udacd\uf319\u307b\ucdb6\uda3b\uf30e\u3057\ucd4e\uda9d\uf3bd\u301d\ucd9d\uda32\uf3f2\u3073\ucd76\uda4c\uf310\u3030\ucdd0\uda4e\uf3bf\u30cd\ucd50\uda1a\uf34a\u3055\ucdfb\udac9\uf35c\u3082\ucdab\uda78\uf3b4\u30f2\ucd0a\uda21\uf348\u30a1\ucdd3\udaea\uf3dd\u30e8\ucdfe\udaef\uf386\u309e\ucd3d\uda18\uf387\u30bf\ucd62\udab4\uf372\u3012\ucd65\udaa3\uf370\u3024\ucd6d\uda26\uf39d\u30b7\ucd08\uda87\uf385\u30ba\ucd24\udac8\uf3f6\u309e\ucd93\uda40\uf378\u3046\ucdce\uda97\uf36b\u301b\ucd26\udaf7\uf3cc\u3034\ucd2f\udaec\uf353\u3049\ucd24\udaaf\uf352\u3026\ucdb6\uda58\uf315\u307a\ucd32\uda72\uf3d4\u30d4\ucdef\udab5\uf3e6\u302e\ucde2\uda36\uf3bd\u307b\ucd1b\uda79\uf36f\u3006\ucd53\udade\uf34a\u3026\ucd8e\uda3f\uf3a2\u3064\ucd16\uda72\uf332\u30ca\ucdec\udad9\uf34e\u3051\ucde4\uda56\uf314\u3056\ucd93\udaf1\uf373\u30d6\ucd39\uda78\uf38a\u30a1\ucdfa\uda3b\uf376\u30f2\ucd6b\uda78\uf31a\u3083\ucde8\uda7f\uf334\u307a\ucd23\uda75\uf3b1\u30ff\ucd52\uda70\uf30e\u3009\ucd96\udafb\uf31d\u3009\ucdb0\uda98\uf37f\u3097\ucd61\udaf4\uf3dc\u30af\ucd38\uda16\uf3e0\u30dc\ucdfc\uda64\uf305\u30aa\ucdb5\uda3b\uf317\u307e\ucd2a\uda5e\uf31b\u309b\ucd78\uda9c\uf373\u30f9\ucd30\uda20\uf3ed\u3044\ucd8b\uda4f\uf349\u301d\ucd26\uda47\uf346\u3037\ucd8f\udad8\uf350\u3024\ucd82\uda71\uf3a0\u30fe\ucd6e\uda03\uf3be\u3055\ucdbb\uda44\uf342\u30b1\ucd72\uda7b\uf3ff\u3017\ucd7a\uda75\uf306\u302f\ucd07\uda61\uf3c2\u302b\ucdce\uda44\uf391\u3051\ucd31\uda6a\uf3d3\u30d2\ucdd8\udab4\uf3de\u3096\ucd4e\udacd\uf3e6\u30f5\ucdaf\udaf0\uf3e7\u30c0\ucdf3\udab7\uf3fa\u306e\ucd1b\uda8b\uf3eb\u30ad\ucdfd\udac1\uf3f9\u3004\ucddd\uda8a\uf38f\u30b4\ucdb0\uda03\uf3eb\u3000\ucd13\uda8d\uf300\u308d\ucde2\udabb\uf368\u3092\ucd4c\udac7\uf3e8\u3052\ucde8\uda03\uf351\u3071\ucdab\udad5\uf354\u3026\ucdfb\uda1f\uf312\u3062\ucd85\udac8\uf392\u3007\ucdcf\udaa8\uf3e2\u3067\ucdba\uda7b\uf387\u3023\ucde0\udafe\uf3e8\u3002\ucd51\uda24\uf38a\u30bb\ucdf1\uda4d\uf37b\u3027\ucda7\udafd\uf3ed\u30ad\ucdc4\uda2b\uf3db\u3021\ucddb\uda19\uf3a7", -162726583);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)-1501991870 ^ (long)-1501991863);
            if (var7) break block23;
            var0_6 = (int)((long)538624765 ^ (long)-538624766);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)423751695 ^ (long)423751777);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)-18470184 ^ (long)18470183);
                    if (8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\u525b\u7b18\ub832\u45d5\u52e9\u7b97\ub804\u45ce\u52ed\u7baa\ub877\u4509\u5295\u7b6d\ub878\u4515\u5290\u7bea\ub829\u45b5\u524c\u7b4a\ub8d6\u450e\u522c\u7bcc\ub83a\u4517\u52bb\u7b3a\ub812\u4545\u5283\u7bcb\ub8d1\u45d4\u520a\u7b93\ub812\u45f7", -1327139426);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)253717872 ^ (long)253717871);
                            var0_6 = (int)((long)-211000688 ^ (long)211000687);
                            while (true) {
                                v0 = (int)((long)-1602693191 ^ (long)-1602693135);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)-682582644 ^ (long)-682582644);
                                if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break block20;
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
                                if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) ** continue;
                                throw null;
                            }
                            8B.d = var5_1;
                            8B.e = new String[(int)((long)1365525912 ^ (long)1365525895)];
                            if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-882660429 ^ (long)-882660429);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)-32921715 ^ (long)-32921716)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-1040992615 ^ (long)-1040992610)) {
                                case 0: {
                                    v15 = (int)((long)-1525758408 ^ (long)-1525758436);
                                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)665475237 ^ (long)665475313);
                                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)-1753578885 ^ (long)-1753578977);
                                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)-700306609 ^ (long)-700306625);
                                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)-74599303 ^ (long)-74599418);
                                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)1388510207 ^ (long)1388510142);
                                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)-1392889606 ^ (long)-1392889652);
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var6_7;
                            v8 = v11;
                            if (v11 != 0) break block21;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        } while (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f);
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
lbl118:
                    // 1 sources

                    ** continue;
                }
            }
        }
    }

    public 8B() {
        boolean bl2 = \u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f;
        super(8B.b((int)((long)-1815518913 ^ (long)-1815512351), (int)((long)343836588 ^ (long)-343851199)), 8B.b((int)((long)-1736852420 ^ (long)-1736857608), (int)((long)900672089 ^ (long)-900663467)));
        Constable constable = (int)((long)-1804440319 ^ (long)-1804440319);
        1_ _ = ((1H)((1H)((1H)this.2().2(8B.b((int)((long)1929450928 ^ (long)1929449075), (int)((long)723973396 ^ (long)-723952013)))).1(8B.b((int)((long)-954913750 ^ (long)-954910745), (int)((long)374097630 ^ (long)374100251)))).0(8B.b((int)((long)-1786231929 ^ (long)-1786226617), (int)((long)-1840330527 ^ (long)-1840341874)))).1((int)((long)-1794268330 ^ (long)-1794268330)).0((int)((long)579620916 ^ (long)579620944));
        ((1_)((1H)((1H)((1H)this.2().2(8B.b((int)((long)1929450928 ^ (long)1929449075), (int)((long)723973396 ^ (long)-723952013)))).1(8B.b((int)((long)-954913750 ^ (long)-954910745), (int)((long)374097630 ^ (long)374100251)))).0(8B.b((int)((long)-1786231929 ^ (long)-1786226617), (int)((long)-1840330527 ^ (long)-1840341874)))).1((int)((long)-1794268330 ^ (long)-1794268330)).0((int)((long)579620916 ^ (long)579620944))).2 = constable;
        this.8 = (0rM)_.0();
        constable = Float.valueOf(1.0f);
        _ = ((1H)((1H)((1H)this.0().2(8B.b((int)((long)345726966 ^ (long)345719849), (int)((long)346812286 ^ (long)346806297)))).1(8B.b((int)((long)-961896692 ^ (long)-961903419), (int)((long)-1264949972 ^ (long)-1264959093)))).0(8B.b((int)((long)718564265 ^ (long)718565477), (int)((long)1461932211 ^ (long)-1461917539)))).1(Float.valueOf(1.0f)).0(Float.valueOf(5.0f));
        ((1_)((1H)((1H)((1H)this.0().2(8B.b((int)((long)345726966 ^ (long)345719849), (int)((long)346812286 ^ (long)346806297)))).1(8B.b((int)((long)-961896692 ^ (long)-961903419), (int)((long)-1264949972 ^ (long)-1264959093)))).0(8B.b((int)((long)718564265 ^ (long)718565477), (int)((long)1461932211 ^ (long)-1461917539)))).1(Float.valueOf(1.0f)).0(Float.valueOf(5.0f))).2 = constable;
        this.4 = (0rL)_.0();
        constable = Boolean.FALSE;
        _ = (2r)((2r)((2r)this.5().2(8B.b((int)((long)-1000279445 ^ (long)-1000281683), (int)((long)-591859672 ^ (long)591868058)))).1(8B.b((int)((long)-1692813467 ^ (long)-1692816194), (int)((long)-645218570 ^ (long)645203032)))).0(8B.b((int)((long)969142566 ^ (long)969140969), (int)((long)-1213432367 ^ (long)-1213461444)));
        ((2r)((2r)((2r)this.5().2(8B.b((int)((long)-1000279445 ^ (long)-1000281683), (int)((long)-591859672 ^ (long)591868058)))).1(8B.b((int)((long)-1692813467 ^ (long)-1692816194), (int)((long)-645218570 ^ (long)645203032)))).0(8B.b((int)((long)969142566 ^ (long)969140969), (int)((long)-1213432367 ^ (long)-1213461444)))).2 = constable;
        this.0a = (0ri)((2r)_).0();
        constable = (int)((long)-1644088725 ^ (long)-1644088725);
        _ = ((1H)((1H)((1H)this.2().2(8B.b((int)((long)1151473162 ^ (long)1151471069), (int)((long)-154477218 ^ (long)154487166)))).1(8B.b((int)((long)1115288526 ^ (long)1115285533), (int)((long)-259234192 ^ (long)259258087)))).0(8B.b((int)((long)-1024950903 ^ (long)-1024956862), (int)((long)-180122694 ^ (long)-180119317)))).1((int)((long)1438590363 ^ (long)1438590363)).0((int)((long)-118857823 ^ (long)-118857787));
        ((1_)((1H)((1H)((1H)this.2().2(8B.b((int)((long)1151473162 ^ (long)1151471069), (int)((long)-154477218 ^ (long)154487166)))).1(8B.b((int)((long)1115288526 ^ (long)1115285533), (int)((long)-259234192 ^ (long)259258087)))).0(8B.b((int)((long)-1024950903 ^ (long)-1024956862), (int)((long)-180122694 ^ (long)-180119317)))).1((int)((long)1438590363 ^ (long)1438590363)).0((int)((long)-118857823 ^ (long)-118857787))).2 = constable;
        this.5 = (0rM)_.0();
        constable = Float.valueOf(1.0f);
        _ = ((1H)((1H)((1H)this.0().2(8B.b((int)((long)-1583853296 ^ (long)-1583854907), (int)((long)891259778 ^ (long)891272672)))).1(8B.b((int)((long)-423681736 ^ (long)-423675164), (int)((long)-557189998 ^ (long)-557217637)))).0(8B.b((int)((long)-1772329054 ^ (long)-1772323718), (int)((long)-195559130 ^ (long)-195543165)))).1(Float.valueOf(1.0f)).0(Float.valueOf(5.0f));
        ((1_)((1H)((1H)((1H)this.0().2(8B.b((int)((long)-1583853296 ^ (long)-1583854907), (int)((long)891259778 ^ (long)891272672)))).1(8B.b((int)((long)-423681736 ^ (long)-423675164), (int)((long)-557189998 ^ (long)-557217637)))).0(8B.b((int)((long)-1772329054 ^ (long)-1772323718), (int)((long)-195559130 ^ (long)-195543165)))).1(Float.valueOf(1.0f)).0(Float.valueOf(5.0f))).2 = constable;
        this.3 = (0rL)((1H)_).0();
        constable = Boolean.FALSE;
        _ = (2r)((2r)((2r)this.5().2(8B.b((int)((long)-1921576599 ^ (long)-1921578322), (int)((long)-1498605964 ^ (long)-1498600017)))).1(8B.b((int)((long)-1260839498 ^ (long)-1260845468), (int)((long)-1338802661 ^ (long)-1338831132)))).0(8B.b((int)((long)1903294619 ^ (long)1903289167), (int)((long)1117678512 ^ (long)1117651538)));
        ((2r)((2r)((2r)this.5().2(8B.b((int)((long)-1921576599 ^ (long)-1921578322), (int)((long)-1498605964 ^ (long)-1498600017)))).1(8B.b((int)((long)-1260839498 ^ (long)-1260845468), (int)((long)-1338802661 ^ (long)-1338831132)))).0(8B.b((int)((long)1903294619 ^ (long)1903289167), (int)((long)1117678512 ^ (long)1117651538)))).2 = constable;
        this.0b = (0ri)((2r)_).0();
        constable = Boolean.FALSE;
        _ = (2r)((2r)((2r)this.5().2(8B.b((int)((long)1221216970 ^ (long)1221218587), (int)((long)-216897762 ^ (long)216895274)))).1(8B.b((int)((long)166307613 ^ (long)166313171), (int)((long)-566811016 ^ (long)566801700)))).0(8B.b((int)((long)1379385067 ^ (long)1379378481), (int)((long)-1769893518 ^ (long)-1769894600)));
        ((2r)((2r)((2r)this.5().2(8B.b((int)((long)1221216970 ^ (long)1221218587), (int)((long)-216897762 ^ (long)216895274)))).1(8B.b((int)((long)166307613 ^ (long)166313171), (int)((long)-566811016 ^ (long)566801700)))).0(8B.b((int)((long)1379385067 ^ (long)1379378481), (int)((long)-1769893518 ^ (long)-1769894600)))).2 = constable;
        this.6 = (0ri)((2r)_).0();
        constable = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(8B.b((int)((long)-889288451 ^ (long)-889285852), (int)((long)-257363239 ^ (long)-257387292)))).1(8B.b((int)((long)-2053084836 ^ (long)-2053082476), (int)((long)-539201023 ^ (long)539222330)))).0(8B.b((int)((long)1141739985 ^ (long)1141738011), (int)((long)395008705 ^ (long)-395006786)));
        ((2r)((2r)((2r)this.5().2(8B.b((int)((long)-889288451 ^ (long)-889285852), (int)((long)-257363239 ^ (long)-257387292)))).1(8B.b((int)((long)-2053084836 ^ (long)-2053082476), (int)((long)-539201023 ^ (long)539222330)))).0(8B.b((int)((long)1141739985 ^ (long)1141738011), (int)((long)395008705 ^ (long)-395006786)))).2 = constable;
        this.0 = (0ri)((2r)_).0();
        constable = (int)((long)-805792147 ^ (long)-805792247);
        _ = ((1H)((1H)((1H)this.2().2(8B.b((int)((long)-1367867145 ^ (long)-1367860427), (int)((long)-610449923 ^ (long)-610444281)))).1(8B.b((int)((long)1811679899 ^ (long)1811681606), (int)((long)-1649050780 ^ (long)1649059814)))).0(8B.b((int)((long)-879363668 ^ (long)-879369619), (int)((long)2144798015 ^ (long)2144809357)))).1((int)((long)1321419919 ^ (long)1321419919)).0((int)((long)-1390242018 ^ (long)-1390241926));
        ((1_)((1H)((1H)((1H)this.2().2(8B.b((int)((long)-1367867145 ^ (long)-1367860427), (int)((long)-610449923 ^ (long)-610444281)))).1(8B.b((int)((long)1811679899 ^ (long)1811681606), (int)((long)-1649050780 ^ (long)1649059814)))).0(8B.b((int)((long)-879363668 ^ (long)-879369619), (int)((long)2144798015 ^ (long)2144809357)))).1((int)((long)1321419919 ^ (long)1321419919)).0((int)((long)-1390242018 ^ (long)-1390241926))).2 = constable;
        this.7 = (0rM)((1H)_).0();
        this.9 = new Listener<7c>(c2 -> {
            block3: {
                block2: {
                    boolean bl2 = \u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f;
                    if (bl2 || bl2) break block2;
                    23.0(this, 8B.b((int)((long)-1605440992 ^ (long)-1605439003), (int)((long)211256315 ^ (long)-211265827)), this.8.2 + 8B.b((int)((long)1349753689 ^ (long)1349746825), (int)((long)1277266829 ^ (long)1277265530)) + this.5.2 + 0rB$1f.XNZw("\ue6f4", 1373946343));
                    if (!bl2) break block3;
                }
                return;
            }
        }, new Predicate[(int)((long)1156143633 ^ (long)1156143633)]);
        Predicate[] predicateArray = new Predicate[(int)((long)-1187017257 ^ (long)-1187017258)];
        Class[] classArray = new Class[(int)((long)-1103778557 ^ (long)-1103778559)];
        classArray[(int)((long)1123924503 ^ (long)1123924503)] = kf.class;
        classArray[(int)((long)-558001239 ^ (long)-558001240)] = ja.class;
        predicateArray[(int)((long)1192047954 ^ (long)1192047954)] = new 4n(classArray);
        this.1 = new Listener<1l>(object -> {
            int n2;
            int n3;
            boolean bl2 = \u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f;
            if (bl2 || bl2) return;
            if (((1l)object).0 != EventState.PRE) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            if (new Random().nextInt((int)((long)1452592056 ^ (long)1452592092)) >= this.7.2) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) {
                return;
            }
            float f2 = (float)this.8.2 / 100.0f * this.4.2;
            if (this.0a.0) {
                n3 = (int)((long)174831961 ^ (long)-174831962);
                if (\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) {
                    throw null;
                }
            } else {
                n3 = (int)((long)-1171139419 ^ (long)-1171139420);
            }
            float f3 = f2 * (float)n3;
            float f4 = (float)this.5.2 / 100.0f * this.3.2;
            if (this.0b.0) {
                n2 = (int)((long)-239275883 ^ (long)239275882);
                if (\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) {
                    throw null;
                }
            } else {
                n2 = (int)((long)1963394860 ^ (long)1963394861);
            }
            float f5 = f4 * (float)n2;
            if (((1J)object).0 instanceof kf) {
                object = (AccessorSPacketEntityVelocity)((1J)object).0;
                if (object.getEntityID() != 8B.2.h.S()) return;
                object.setMotionX((int)8B.0(8B.2.h.s * 8000.0, object.getMotionX(), f3));
                object.setMotionY((int)8B.0(8B.2.h.t * 8000.0, object.getMotionY(), f5));
                object.setMotionZ((int)8B.0(8B.2.h.u * 8000.0, object.getMotionZ(), f3));
                return;
            }
            if (!(((1J)object).0 instanceof ja) || this.6.0) return;
            object = (AccessorSPacketExplosion)((1J)object).0;
            object.setMotionX(object.getMotionX() * f3);
            Object object2 = object;
            object2.setMotionY(object2.getMotionY() * f5);
            Object object3 = object;
            object3.setMotionZ(object3.getMotionZ() * f3);
        }, predicateArray);
    }

    private static double 0(double d2, double d3, double d4) {
        boolean bl2 = \u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f;
        if (bl2 || bl2) {
            return 0.0;
        }
        return d2 + (d3 - d2) * d4;
    }

    /*
     * Unable to fully structure code
     */
    private static String b(int var0, int var1_1) {
        block265: {
            var9_2 = 8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-1684710690 ^ (long)-1684717289)) & (int)((long)1388378025 ^ (long)1388316758);
            if (var9_2) ** GOTO lbl-1000
            if (8B.e[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 8B.d[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)208309899 ^ (long)208309899)] & (int)((long)433551546 ^ (long)433551429)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-49270937 ^ (long)-49270930);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-50997394 ^ (long)-50997315);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-944536895 ^ (long)-944537003);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-1620222257 ^ (long)-1620222352);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)1557949093 ^ (long)1557948961);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-1705613872 ^ (long)-1705613954);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)360307838 ^ (long)360307938);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)1081577820 ^ (long)1081577728);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)1405510804 ^ (long)1405510771);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)1842142880 ^ (long)1842142730);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)1478318736 ^ (long)1478318673);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1305571075 ^ (long)-1305571228);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-909606301 ^ (long)-909606249);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-2068363071 ^ (long)-2068363062);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)355182739 ^ (long)355182807);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1434928499 ^ (long)1434928476);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)2068800044 ^ (long)2068800106);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)3659123 ^ (long)3659095);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-1754663047 ^ (long)-1754662918);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-1115319335 ^ (long)-1115319398);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-1349506243 ^ (long)-1349506131);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-963050344 ^ (long)-963050375);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)467623099 ^ (long)467623005);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-243924821 ^ (long)-243924845);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-1850017694 ^ (long)-1850017677);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-695304882 ^ (long)-695304757);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-457409586 ^ (long)-457409568);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-310324533 ^ (long)-310324715);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-1188357384 ^ (long)-1188357560);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1366011932 ^ (long)-1366012077);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-1958765620 ^ (long)-1958765606);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)1446198254 ^ (long)1446198079);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)1255693054 ^ (long)1255692951);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)11830597 ^ (long)11830528);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-148180242 ^ (long)-148180422);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)119965141 ^ (long)119965084);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)737636859 ^ (long)737636643);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)1729453031 ^ (long)1729453010);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)483033544 ^ (long)483033557);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-1226019277 ^ (long)-1226019239);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)26100919 ^ (long)26100949);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-1595886401 ^ (long)-1595886387);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-533736255 ^ (long)-533736263);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)1484553055 ^ (long)1484553113);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)242003234 ^ (long)242003240);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)449244838 ^ (long)449244826);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)467348595 ^ (long)467348498);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)1517654064 ^ (long)1517654236);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)736677309 ^ (long)736677306);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-2095357059 ^ (long)-2095356955);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-439887467 ^ (long)-439887585);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-1325342276 ^ (long)-1325342323);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)471080897 ^ (long)471080778);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)705678716 ^ (long)705678729);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-590910958 ^ (long)-590910888);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-1343378382 ^ (long)-1343378400);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1651636682 ^ (long)-1651636546);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)695709474 ^ (long)695709602);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)280447980 ^ (long)280447770);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-888485378 ^ (long)-888485453);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-1020995631 ^ (long)-1020995741);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-1705353263 ^ (long)-1705353434);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)474985478 ^ (long)474985601);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1306633223 ^ (long)-1306633273);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-1612885050 ^ (long)-1612885128);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)761722931 ^ (long)761722971);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-607759508 ^ (long)-607759601);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)667724706 ^ (long)667724559);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)1299871208 ^ (long)1299870979);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)1462165690 ^ (long)1462165646);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)29779298 ^ (long)29779214);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)321066494 ^ (long)321066481);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1166386026 ^ (long)-1166386055);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)469610492 ^ (long)469610270);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)2006368661 ^ (long)2006368659);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)1297407817 ^ (long)1297407745);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)1984294879 ^ (long)1984294763);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-1586487527 ^ (long)-1586487367);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1960973189 ^ (long)1960973076);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-1707246259 ^ (long)-1707246291);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-382520920 ^ (long)-382521027);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)1006012724 ^ (long)1006012744);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)2080342848 ^ (long)2080342836);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-1543827675 ^ (long)-1543827478);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)992782385 ^ (long)992782466);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)-1777966036 ^ (long)-1777965893);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)1745940457 ^ (long)1745940365);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-777914979 ^ (long)-777915074);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)463277664 ^ (long)463277615);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1523148513 ^ (long)1523148458);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)2144434246 ^ (long)2144434358);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-468065312 ^ (long)-468065421);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-382417120 ^ (long)-382416905);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)1950645522 ^ (long)1950645754);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)842799495 ^ (long)842799398);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)2137990599 ^ (long)2137990488);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)1577452272 ^ (long)1577452207);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-1895387194 ^ (long)-1895387388);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)1906982857 ^ (long)1906982709);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-1006256745 ^ (long)-1006256788);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)173994655 ^ (long)173994610);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-158050516 ^ (long)-158050366);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-2115569246 ^ (long)-2115569253);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)1083790483 ^ (long)1083790344);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)1206278603 ^ (long)1206278622);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)1881613338 ^ (long)1881613524);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-619155875 ^ (long)-619155958);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1689165195 ^ (long)-1689165124);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-697269330 ^ (long)-697269430);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-664582696 ^ (long)-664582879);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)1117930417 ^ (long)1117930444);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)1222579127 ^ (long)1222579060);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-796960890 ^ (long)-796960813);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-2037359737 ^ (long)-2037359710);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-1288399756 ^ (long)-1288399793);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)1108944686 ^ (long)1108944824);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)1813223170 ^ (long)1813223216);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)1632701194 ^ (long)1632701390);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)0x33033F3 ^ (long)53490556);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-1304089878 ^ (long)-1304089941);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)1940385365 ^ (long)1940385339);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-1360654744 ^ (long)-1360654675);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)1751067335 ^ (long)1751067157);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)353444057 ^ (long)353444070);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-1413170858 ^ (long)-1413170788);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)466472304 ^ (long)466472418);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)1303457317 ^ (long)1303457447);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-1000524610 ^ (long)-1000524593);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)572355895 ^ (long)572355989);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-1393983178 ^ (long)-1393982978);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)1963337555 ^ (long)1963337526);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)950643149 ^ (long)950643182);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)861009654 ^ (long)861009551);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-2018532007 ^ (long)-2018531932);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)1124684553 ^ (long)1124684658);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)1353888547 ^ (long)1353888651);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-1962918794 ^ (long)-1962918765);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-400332387 ^ (long)-400332352);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)314199751 ^ (long)314199676);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)298643147 ^ (long)298643083);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)1977324650 ^ (long)1977324764);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-1728222440 ^ (long)-1728222399);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-1744711994 ^ (long)-1744712032);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)734432961 ^ (long)734432863);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-1436473285 ^ (long)-1436473210);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-1370616217 ^ (long)-1370616143);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)2107920655 ^ (long)2107920724);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)64332668 ^ (long)64332745);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)1976845800 ^ (long)1976845763);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)170601544 ^ (long)170601560);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-878917168 ^ (long)-878917193);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-664529083 ^ (long)-664529062);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)1546373173 ^ (long)1546373322);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)255868834 ^ (long)255868683);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-808990702 ^ (long)-808990486);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-658211873 ^ (long)-658212042);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-1751087088 ^ (long)-1751087010);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)1314573793 ^ (long)1314573772);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-1973987436 ^ (long)-1973987443);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-1407009252 ^ (long)-1407009264);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)626431317 ^ (long)626431297);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)1922540839 ^ (long)1922540826);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1675422289 ^ (long)1675422213);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-60909895 ^ (long)-60909984);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)528814288 ^ (long)528814286);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-612769290 ^ (long)-612769478);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)279542911 ^ (long)279542995);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)323041844 ^ (long)323041796);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)1822728983 ^ (long)1822729069);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-846643122 ^ (long)-846643036);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-687232063 ^ (long)-687232009);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-712074057 ^ (long)-712074061);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-519450798 ^ (long)-519450808);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)146207406 ^ (long)146207255);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-1045251076 ^ (long)-1045251260);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1551779268 ^ (long)1551779274);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)1038323629 ^ (long)1038323581);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-2072078318 ^ (long)-2072078288);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-1134855168 ^ (long)-1134855144);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)1504356586 ^ (long)1504356460);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)1157935499 ^ (long)1157935441);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)797639512 ^ (long)797639671);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-1731912585 ^ (long)-1731912571);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)1416589038 ^ (long)1416588911);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-397115261 ^ (long)-397115207);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-1161519709 ^ (long)-1161519773);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-676844863 ^ (long)-676844810);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)43043937 ^ (long)43043945);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-269869394 ^ (long)-269869438);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)1284018884 ^ (long)1284018705);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)370500042 ^ (long)370500039);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-105320609 ^ (long)-105320699);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)1155940241 ^ (long)1155940289);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-1180169355 ^ (long)-1180169362);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-1183026268 ^ (long)-1183026402);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)177568851 ^ (long)177568930);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-1130505615 ^ (long)-1130505724);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-1101080300 ^ (long)-1101080220);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-1623893291 ^ (long)-1623893466);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-959217323 ^ (long)-959217352);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)547484788 ^ (long)547484920);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1540184926 ^ (long)-1540184838);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)1882441368 ^ (long)1882441406);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)2125859514 ^ (long)2125859574);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-2092250305 ^ (long)-2092250306);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)676128290 ^ (long)676128341);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-444625911 ^ (long)-444625908);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)449077255 ^ (long)449077280);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1977183404 ^ (long)1977183344);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)57135603 ^ (long)57135578);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)1633064670 ^ (long)1633064568);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-148488715 ^ (long)-148488918);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)2016300389 ^ (long)2016300482);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-1817235833 ^ (long)-1817235755);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)1693564492 ^ (long)1693564625);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1297447257 ^ (long)1297447354);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)1517749249 ^ (long)1517749473);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1231405624 ^ (long)1231405593);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)28464175 ^ (long)28464360);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1097728157 ^ (long)-1097728099);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-670804487 ^ (long)-670804620);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)-1967631267 ^ (long)-1967631329);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-831622204 ^ (long)-831622251);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)109947956 ^ (long)109948040);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)1491203158 ^ (long)1491203314);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-1515595062 ^ (long)-1515595153);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)117759696 ^ (long)117759585);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)674409011 ^ (long)674409056);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-26781668 ^ (long)-26781668);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)1992825828 ^ (long)1992825641);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-574871367 ^ (long)-574871454);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)1408632386 ^ (long)1408632418);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-1756120955 ^ (long)-1756121000);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1380122748 ^ (long)1380122658);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-661357477 ^ (long)-661357407);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-1482868883 ^ (long)-1482868962);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-1178380678 ^ (long)-1178380557);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-949809452 ^ (long)-949809473);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-486314896 ^ (long)-486314941);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)1477369179 ^ (long)1477369160);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-513816347 ^ (long)-513816327);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)306857904 ^ (long)306857906);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)303232733 ^ (long)303232595);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-934460177 ^ (long)-934460219);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-9740760 ^ (long)-9740573);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-2097798526 ^ (long)-2097798615);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)1050268066 ^ (long)1050268109);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-343686846 ^ (long)-343686696);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)1258022484 ^ (long)1258022443);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-1700963787 ^ (long)-1700963765);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)2060470168 ^ (long)2060470254);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)563351113 ^ (long)563351071);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)-951976064 ^ (long)-951976024);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1558646588 ^ (long)1558646651);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-1185507286 ^ (long)-1185507287);
                    if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)1238270094 ^ (long)1238270105);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-2122123627 ^ (long)-2122123670)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)536284144 ^ (long)536343567)) >>> (int)((long)-1058151119 ^ (long)-1058151111)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-304661526 ^ (long)-304661526);
            if (!8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)1675301784 ^ (long)1675301786);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)282013892 ^ (long)282013895) | var5_6 << (int)((long)-1155206786 ^ (long)-1155206789)) ^ var3_4[var7_8]) & (int)((long)83817549 ^ (long)83817650);
                    if (8B.\u200b\u200f\u2009\u200c\u200f\u2007\u2000\u2002\u200f) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-2128223608 ^ (long)-2128223605) | var6_7 << (int)((long)1463872539 ^ (long)1463872542)) ^ var3_4[var7_8]) & (int)((long)-268492564 ^ (long)-268492781);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            8B.e[var2_3] = new String(var3_4).intern();
        }
        return 8B.e[var2_3];
    }
}

