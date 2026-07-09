/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.Level
 */
package net.impactclient;

import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.impact.ImpactVersionReleased;
import io.github.ImpactDevelopment.installer.impact.ImpactVersions;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.Setting;
import io.github.ImpactDevelopment.installer.setting.settings.ImpactVersionSetting;
import io.github.ImpactDevelopment.installer.setting.settings.InstallationModeSetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftDirectorySetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftVersionSetting;
import io.github.ImpactDevelopment.installer.setting.settings.OptiFineSetting;
import io.github.ImpactDevelopment.installer.target.InstallationModeOptions;
import io.github.ImpactDevelopment.installer.target.targets.Vanilla;
import io.github.ImpactDevelopment.installer.utils.GPG;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import net.impactclient.0T;
import net.impactclient.0aQ;
import net.impactclient.0ay;
import net.impactclient.0o;
import net.impactclient.0rB$1f;
import net.impactclient.1C;
import net.impactclient.2M;
import net.impactclient.4B;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Level;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 5B
implements 0T {
    public final 0aQ 0;
    private static final String[] b;
    private static final String[] a;
    public static final boolean \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)1816970893 ^ (long)1816970923)];
            if (var7) break block23;
            var3_2 = (int)((long)-979517855 ^ (long)-979517855);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\u7502\u5d8b\u9e33\u6342\u75c4\u5dfc\u9e18\u6322\u7567\u5d68\u9ee4\u631b\u7510\u5de4\u9e28\u6355\u7514\u5d48\u9e93\u63d8\u7558\u5db6\u9e6d\u6369\u751d\u5d74\u9eb6\u635e\u750e\u5d61\u9e26\u6333\u75dc\u5dee\u9e9c\u63b8\u75b4\u5dc2\u9e09\u63a0\u75db\u5de9\u9ee5\u6390\u7537\u5dbc\u9e91\u63bb\u75d2\u5dba\u9e03\u6396\u754e\u5d50\u9e1d\u634a\u75e8\u5dc8\u9ecb\u6379\u75f3\u5de2\u9e3c\u63c5\u754b\u5d59\u9e2a\u6371\u7573\u5d38\u9eb7\u63e8\u756f\u5d7f\u9e43\u6372\u7552\u5d70\u9ef4\u6345\u75fc\u5deb\u9eff\u63bd\u758b\u5df6\u9eec\u6315\u75d2\u5d0b\u9ebd\u6300\u7515\u5d32\u9e2a\u63f5\u7585\u5d0a\u9e34\u634d\u75c9\u5d25\u9ecc\u634c\u75dc\u5dee\u9e04\u63aa\u75a7\u5d80\u9e6b\u63e8\u7597\u5de0\u9e6c\u639e\u7594\u5d02\u9e19\u63ba\u75cc\u5d45\u9e07\u63f4\u7592\u5d59\u9e95\u63e8\u7593\u5db8\u9e28\u63de\u753d\u5d9a\u9ee2\u63d4\u759e\u5dfd\u9e29\u63b4\u7576\u5da6\u9ee9\u6334\u759e\u5d1e\u9e62\u6326\u75f1\u5dff\u9e2d\u630d\u75ca\u5d01\u9e32\u634e\u752c\u5d44\u9eb2\u6399\u7531\u5dac\u9e3a\u63ef\u7593\u5dad\u9e4a\u63d3\u7520\u5de9\u9ef1\u63a9\u7548\u5d84\u9e3c\u63a5\u75bf\u5d57\u9ebe\u63a2\u75d7\u5d03\u9ed1\u63f7\u7592\u5d1d\u9e2a\u634b\u750a\u5d78\u9e28\u6345\u75e7\u5d52\u9e2e\u63c4\u757f\u5d11\u9e44\u6365\u7594\u5dd4\u9e78\u63a9\u7595\u5db6\u9e29\u6397\u7594\u5da3\u9ee5\u6370\u7550\u5d31\u9ed2\u6357\u75f9\u5d14\u9e22\u6321\u759e\u5d89\u9ec2\u63e3\u7505\u5d78\u9e11\u6330\u75b8\u5dce\u9e06\u6384\u7560\u5d4f\u9efd\u6388\u7532\u5d32\u9e3c\u63f7\u75fa\u5d6d\u9e0b\u6321\u75da\u5d6d\u9eaa\u637f\u75dc\u5d43\u9e14\u63e8\u75c9\u5de5\u9e47\u63b7\u75bb\u5dc1\u9e5b\u6338\u75f9\u5d26\u9ea7\u63a8\u7572\u5da2\u9e26\u63f7\u75ba\u5d6e\u9e75\u6320\u75ba\u5d27\u9ebd\u631f\u7598\u5df7\u9e7a\u63c1\u754f\u5d76\u9ecf\u631b\u755c\u5d0c\u9e87\u63bc\u754b\u5d35\u9e15\u63de\u759e\u5d01\u9e48\u6346\u7560\u5d03\u9e27\u63a9\u75ee\u5df6\u9e25\u63cd\u75a9\u5d69\u9e09\u63a0\u7587\u5d91\u9e98\u63e9\u750d\u5d8b\u9e03\u63ed\u751c\u5de2\u9ed3\u63d7\u7518\u5d38\u9e08\u6393\u7504\u5d25\u9e85\u6327\u7527\u5d74\u9e7f\u63b0\u7512\u5dae\u9e54\u63c1\u7537\u5d6e\u9e33\u6341\u7525\u5dcd\u9eeb\u63f0\u75dd\u5d8f\u9e0e\u63ab\u75bf\u5d7b\u9e73\u633e\u75a0\u5d8a\u9e77\u632c\u759c\u5d0f\u9ee1\u633a\u751f\u5de7\u9eff\u638e\u75c8\u5d57\u9e85\u63eb\u7537\u5d68\u9e32\u6318\u7557\u5de8\u9edb\u633e\u753c\u5d50\u9e0f\u63b5\u756c\u5dcc\u9e95\u6389\u750b\u5dd6\u9ea0\u630a\u754d\u5da4\u9e34\u6326\u7587\u5d2b\u9ed5\u63d5\u753d\u5dab\u9eda\u63ff\u75e0\u5d80\u9ee4\u632f\u7592\u5d8d\u9ed6\u631e\u75d7\u5ded\u9e23\u63dc\u7553\u5d53\u9ebe\u6357\u7580\u5db8\u9ec8\u639e\u75eb\u5daf\u9eb2\u63b9\u75b6\u5d27\u9ebb\u6313\u7504\u5d6e\u9e56\u63df\u75a1\u5dbc\u9e17\u63d9\u75e8\u5d31\u9e7f\u63ed\u75a6\u5d0a\u9ee3\u63e7\u7502\u5d95\u9eca\u6306\u75e3\u5dd1\u9eed\u6332\u7501\u5d23\u9e54\u6308\u7536\u5deb\u9e12\u6337\u75b0\u5d3d\u9e70\u6381\u75c1\u5de4\u9e72\u63e3\u751e\u5dfb\u9eeb\u639d\u7527\u5d2d\u9e28\u6358\u7511\u5d6f\u9ec8\u63af\u7581\u5d00\u9e8d\u639f\u75c2\u5df6\u9e4d\u63d7\u75df\u5de1\u9e4d\u6397\u75c8\u5d3b\u9e34\u63b4\u757b\u5d5a\u9e6f\u63c4\u759a\u5ded\u9eb5\u636f\u75e3\u5d11\u9e6f\u6356\u75bf\u5d20\u9ee2\u6359\u7562\u5d87\u9e21\u63f5\u7543\u5d0d\u9e27\u635f\u7567\u5d13\u9e23\u635b\u755a\u5de0\u9ef2\u633f\u7508\u5d20\u9e1e\u639a\u759d\u5df6\u9eeb\u63e5\u7568\u5d7e\u9e6b\u63df\u7517\u5db9\u9e63\u639a\u75b4\u5d45\u9e23\u631d\u75c4\u5daf\u9e63", -1405201586);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)1024564498 ^ (long)1024564503);
            if (var7) break block23;
            var0_6 = (int)((long)1505541846 ^ (long)-1505541847);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)-126375315 ^ (long)-126375352);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)483236523 ^ (long)-483236524);
                    if (5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\uee6c\uc6cf\u05f0\uf8df\uee56\uc688\u05b0\uf888\uee02\uc6f8\u05dc\uf839", -788477744);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)-1379035454 ^ (long)-1379035452);
                            var0_6 = (int)((long)860261086 ^ (long)-860261087);
                            while (true) {
                                v0 = (int)((long)640288632 ^ (long)640288525);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)-964058719 ^ (long)-964058719);
                                if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break block20;
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
                                if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) ** continue;
                                throw null;
                            }
                            5B.a = var5_1;
                            5B.b = new String[(int)((long)1176238006 ^ (long)1176237968)];
                            if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-759959507 ^ (long)-759959507);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)230785851 ^ (long)230785850)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-502951277 ^ (long)-502951276)) {
                                case 0: {
                                    v15 = (int)((long)-189805383 ^ (long)-189805338);
                                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)-777988992 ^ (long)-777988872);
                                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)317924737 ^ (long)317924797);
                                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)-469567138 ^ (long)-469567129);
                                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)-921395432 ^ (long)-921395433);
                                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)551913858 ^ (long)551913971);
                                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)997254820 ^ (long)997254888);
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
                        } while (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static 0aQ 0(boolean bl2) {
        0aQ aQ;
        boolean bl3;
        block17: {
            int n2;
            bl3 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
            if (bl3 || bl3) return null;
            0ay.0a.log(Level.INFO, 5B.a((int)((long)-687256144 ^ (long)-687252930), (int)((long)-292490488 ^ (long)-292504089)));
            if (bl3) return null;
            String string = 0o.4.toString();
            String string2 = 5B.a((int)((long)-923714749 ^ (long)-923718438), (int)((long)-733397430 ^ (long)-733382006));
            if (bl3 || bl3) return null;
            System.out.println(5B.a((int)((long)-87777775 ^ (long)-87783036), (int)((long)-1728824096 ^ (long)1728827028)).concat(String.valueOf(bl2)));
            if (bl3 || bl3) return null;
            if (bl2) {
                if (bl3 || bl3) return null;
                Installer.args.prereleases = (int)((long)581882665 ^ (long)581882664);
                if (bl3) return null;
            }
            if (bl3) return null;
            Installer.args.noGPG = (int)((long)-51182155 ^ (long)-51182155);
            if (bl3 || bl3) return null;
            Installer.args.noGUI = (int)((long)-822416471 ^ (long)-822416472);
            if (bl3 || bl3) return null;
            Optional<ImpactVersionReleased> optional = ImpactVersions.getAllVersions().stream().filter(impactVersionReleased -> {
                boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
                if (bl2 || bl2) {
                    return true;
                }
                return impactVersionReleased.mcVersion.equals(string);
            }).filter(impactVersionReleased -> {
                boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
                if (bl2 || bl2) return true;
                if (impactVersionReleased.impactVersion.compareTo(string2) > 0) {
                    if (bl2) return true;
                    return (int)((long)1584385092 ^ (long)1584385093) != 0;
                }
                if (!bl2) return (int)((long)565024152 ^ (long)565024152) != 0;
                return true;
            }).max(Comparator.comparing(impactVersionReleased -> {
                boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
                if (bl2 || bl2) {
                    return null;
                }
                return impactVersionReleased.impactVersion;
            }));
            if (!optional.isPresent()) {
                if (bl3 || bl3) return null;
                optional = ImpactVersions.getAllVersions().stream().max(Comparator.comparing(impactVersionReleased -> {
                    boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
                    if (bl2 || bl2) {
                        return null;
                    }
                    return 5B.0(impactVersionReleased.impactVersion) + 5B.a((int)((long)1848700780 ^ (long)1848703230), (int)((long)637227023 ^ (long)637238672)) + impactVersionReleased.mcVersion + 5B.a((int)((long)-915936226 ^ (long)-915932284), (int)((long)1942918361 ^ (long)-1942934770)) + impactVersionReleased.impactVersion;
                })).filter(impactVersionReleased -> {
                    boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
                    if (bl2 || bl2) return true;
                    if (5B.0(impactVersionReleased.impactVersion).compareTo(5B.0(string2)) > 0) {
                        if (bl2) return true;
                        return (int)((long)-960130775 ^ (long)-960130776) != 0;
                    }
                    if (!bl2) return (int)((long)2089975817 ^ (long)2089975817) != 0;
                    return true;
                });
                if (bl3) return null;
            }
            if (bl3) return null;
            aQ = new 0aQ();
            if (bl3 || bl3) return null;
            if (!optional.isPresent()) {
                if (bl3 || bl3) return null;
                return aQ;
            }
            if (bl3) return null;
            aQ.3 = (int)((long)-1967066682 ^ (long)-1967066681);
            if (bl3 || bl3) return null;
            aQ.5 = optional.get();
            if (bl3 || bl3) return null;
            aQ.5.fetchContents();
            if (bl3 || bl3) return null;
            if (5B.0(string2).equals(5B.0(aQ.5.impactVersion)) && string.equals(aQ.5.mcVersion)) {
                n2 = (int)((long)-765593048 ^ (long)-765593047);
                if (\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) {
                    throw null;
                }
            } else {
                aQ.0 = (int)((long)81709520 ^ (long)81709520);
                n2 = aQ.0 ? 1 : 0;
            }
            if (aQ.0) {
                try {
                    aQ.4 = 5B.2(aQ.5);
                    aQ.1 = (int)((long)1557055406 ^ (long)1557055407);
                    if (!\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break block17;
                    throw null;
                } catch (Throwable throwable) {
                    if (bl3 || bl3) return null;
                    System.out.println(5B.a((int)((long)-1418150657 ^ (long)-1418155153), (int)((long)803419166 ^ (long)803423356)));
                    if (bl3 || bl3) return null;
                    throwable.printStackTrace();
                    if (bl3) return null;
                }
            }
        }
        if (bl3) return null;
        aQ.2 = ImpactVersions.getAllVersions().stream().filter(impactVersionReleased -> {
            boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
            if (bl2 || bl2) {
                return true;
            }
            return 5B.0(impactVersionReleased.impactVersion).equals(5B.0(aQ.5.impactVersion));
        }).map(impactVersionReleased -> {
            boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
            if (bl2 || bl2) {
                return null;
            }
            return impactVersionReleased.mcVersion;
        }).distinct().sorted().collect(Collectors.toList());
        if (bl3 || bl3) return null;
        if (aQ.1) {
            if (bl3) return null;
            if (!aQ.0) {
                if (bl3 || bl3) return null;
                throw new IllegalStateException();
            }
        }
        if (!bl3) return aQ;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 5B(boolean bl2) {
        block3: {
            block2: {
                boolean bl3 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
                if (bl3 || bl3) break block2;
                this.0 = 5B.0(bl2);
                if (!bl3 && !bl3) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)1386026548 ^ (long)1386021280)) & (int)((long)1478761718 ^ (long)1478812425);
            if (var9_2) ** GOTO lbl-1000
            if (5B.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 5B.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)802455749 ^ (long)802455749)] & (int)((long)-827427189 ^ (long)-827427212)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-1857685366 ^ (long)-1857685388);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-169009251 ^ (long)-169009406);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-1059894210 ^ (long)-1059894217);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-1801846844 ^ (long)-1801847007);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)331139004 ^ (long)331138969);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)1866469154 ^ (long)1866469201);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)1203985623 ^ (long)1203985489);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-2086487877 ^ (long)-2086487908);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)1634857057 ^ (long)1634857058);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-864803719 ^ (long)-864803837);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)1825452576 ^ (long)1825452673);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)1828113732 ^ (long)1828113808);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-1417820667 ^ (long)-1417820472);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-688187390 ^ (long)-688187312);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-2016376793 ^ (long)-2016376694);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-1673879883 ^ (long)-1673879976);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)549867329 ^ (long)549867519);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-1297162824 ^ (long)-1297162783);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-1880891161 ^ (long)-1880891245);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)1381698354 ^ (long)1381698416);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)386406708 ^ (long)386406721);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)899283058 ^ (long)899283144);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-1683065163 ^ (long)-1683065136);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-978648142 ^ (long)-978648173);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)496156026 ^ (long)496156136);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-1385085179 ^ (long)-1385085011);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)1012279373 ^ (long)1012279370);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-1381818021 ^ (long)-1381818000);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-388233285 ^ (long)-388233392);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1481243075 ^ (long)-1481243028);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-218140556 ^ (long)-218140458);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)1620652341 ^ (long)1620652380);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)1592368047 ^ (long)1592368001);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)687573767 ^ (long)687573897);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-137584615 ^ (long)-137584599);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)534179713 ^ (long)534179624);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)1852030012 ^ (long)1852030197);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-490567681 ^ (long)-490567865);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-627491330 ^ (long)-627491483);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)1407037840 ^ (long)1407037948);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)456141245 ^ (long)456141234);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-676237753 ^ (long)-676237602);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-702198667 ^ (long)-702198689);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)226902134 ^ (long)226902051);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-34817311 ^ (long)-34817520);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)737527927 ^ (long)737527947);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)1708601560 ^ (long)1708601543);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-477833828 ^ (long)-477833784);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-1365835730 ^ (long)-1365835665);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-1201510768 ^ (long)-1201510708);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)862586426 ^ (long)862586554);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)1000981702 ^ (long)1000981739);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)1222725154 ^ (long)1222725286);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)337856481 ^ (long)337856333);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-1193023628 ^ (long)-1193023644);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)1196785284 ^ (long)1196785376);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-994789428 ^ (long)-994789489);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-1073491562 ^ (long)-1073491686);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)1457522916 ^ (long)1457522732);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-787682121 ^ (long)-787682201);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)198537463 ^ (long)198537425);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)569417872 ^ (long)569417781);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-1845888366 ^ (long)-1845888386);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)1797484809 ^ (long)1797484859);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)1263881023 ^ (long)1263881096);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-788789145 ^ (long)-788789192);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-733995738 ^ (long)-733995625);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-626038107 ^ (long)-626038056);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)1948152222 ^ (long)1948152310);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-1598830582 ^ (long)-1598830389);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-163163007 ^ (long)-163163093);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1813591366 ^ (long)-1813591523);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1099288915 ^ (long)-1099288856);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-1887629127 ^ (long)-1887629097);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)1970731558 ^ (long)1970731555);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)1142547060 ^ (long)1142547090);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)186402556 ^ (long)186402481);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)1611830596 ^ (long)1611830618);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1081578797 ^ (long)1081579006);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)1066735824 ^ (long)1066735687);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)1359446138 ^ (long)1359446200);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-2036893085 ^ (long)-2036893167);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-775342034 ^ (long)-775341831);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-481053099 ^ (long)-481052948);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-1877158975 ^ (long)-1877159164);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)915198826 ^ (long)915198787);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-1724829050 ^ (long)-1724829020);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-1668619910 ^ (long)-1668619874);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)1938065829 ^ (long)1938065706);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-1358558099 ^ (long)-1358558028);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-1238394878 ^ (long)-1238394662);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)194497916 ^ (long)194498028);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-2122226697 ^ (long)-2122226838);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-141859771 ^ (long)-141859790);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-1102569245 ^ (long)-1102569282);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-1528202361 ^ (long)-1528202365);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-613961576 ^ (long)-613961627);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-1821684258 ^ (long)-1821684254);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)1020351890 ^ (long)1020351880);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)44111082 ^ (long)44111102);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-1762312932 ^ (long)-1762312785);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-1886894453 ^ (long)-1886894515);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)281818028 ^ (long)281817987);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-178039726 ^ (long)-178039763);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)1225656070 ^ (long)1225656114);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)1798859722 ^ (long)1798859541);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-400394090 ^ (long)-400394184);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)538808198 ^ (long)538808319);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)433927835 ^ (long)433927854);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)456266984 ^ (long)456266934);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-1147688148 ^ (long)-1147688084);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-1192614754 ^ (long)-1192614699);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1209130353 ^ (long)1209130375);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)88221305 ^ (long)88221206);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)56927780 ^ (long)56927791);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-645384441 ^ (long)-645384218);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-1002269585 ^ (long)-1002269506);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-1938746997 ^ (long)-1938746886);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)-1068864615 ^ (long)-1068864700);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-2012869879 ^ (long)-2012869775);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)1243269340 ^ (long)1243269341);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-440683636 ^ (long)-440683574);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)2056368314 ^ (long)2056368349);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-42674586 ^ (long)-42674648);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-1764823118 ^ (long)-1764823086);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)2125285599 ^ (long)2125285420);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-21236806 ^ (long)-21236857);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-1337980160 ^ (long)-1337979921);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)1319935401 ^ (long)1319935326);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)1469525315 ^ (long)1469525444);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)1621201260 ^ (long)1621201318);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)544824077 ^ (long)544824151);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)2053853142 ^ (long)2053853086);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-1341404650 ^ (long)-1341404657);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)2018243550 ^ (long)2018243389);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)-768908572 ^ (long)-768908637);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-57290106 ^ (long)-57290163);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-2052596875 ^ (long)-2052596753);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)1551591700 ^ (long)1551591816);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-1849148356 ^ (long)-1849148246);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-45808580 ^ (long)-45808635);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)666265139 ^ (long)666265165);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)127275088 ^ (long)127275186);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)1921613413 ^ (long)1921613514);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-1950369232 ^ (long)-1950369150);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-1092309432 ^ (long)-1092309497);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)1652086020 ^ (long)1652086028);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)343660258 ^ (long)343660156);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)727605005 ^ (long)727605239);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)1525415760 ^ (long)1525415810);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)68683846 ^ (long)68683914);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-1075186612 ^ (long)-1075186436);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)264598882 ^ (long)264598868);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)47484511 ^ (long)47484589);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)1341654141 ^ (long)1341654245);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-1562550134 ^ (long)-1562550231);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)1593099364 ^ (long)1593099296);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-305149627 ^ (long)-305149482);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-407801631 ^ (long)-407801721);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-1299227293 ^ (long)-1299227301);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-755158082 ^ (long)-755158229);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)75878984 ^ (long)75879101);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-227264025 ^ (long)-227264217);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)927945664 ^ (long)927945500);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-1279721566 ^ (long)-1279721538);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-1108865258 ^ (long)-1108865026);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-219551147 ^ (long)-219551093);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)1889959299 ^ (long)1889959316);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-1055903951 ^ (long)-1055903949);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)665974928 ^ (long)665974979);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)599888766 ^ (long)599888891);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-2138398625 ^ (long)-2138398659);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1766030417 ^ (long)1766030474);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)599784194 ^ (long)599784306);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-2019171364 ^ (long)-2019171465);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1613244695 ^ (long)1613244687);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)1127068862 ^ (long)1127068818);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-1185697587 ^ (long)-1185697550);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-148126924 ^ (long)-148126729);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-105440722 ^ (long)-105440576);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)730459836 ^ (long)730459720);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)1654226660 ^ (long)1654226654);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)226177104 ^ (long)226177184);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)769225470 ^ (long)769225222);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)730733683 ^ (long)730733655);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)1689018858 ^ (long)1689018753);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)2069975664 ^ (long)2069975732);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1895764137 ^ (long)-1895764050);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)1927515205 ^ (long)1927515283);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-754789039 ^ (long)-754789081);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-1759085757 ^ (long)-1759085655);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-75566070 ^ (long)-75566046);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-558268917 ^ (long)-558268875);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)972733348 ^ (long)972733385);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)27472442 ^ (long)27472431);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-588992760 ^ (long)-588992638);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-1428590811 ^ (long)-1428590754);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-627690511 ^ (long)-627690665);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)1121471622 ^ (long)1121471546);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-538583512 ^ (long)-538583452);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1931834243 ^ (long)-1931834234);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)224875535 ^ (long)224875522);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)2015294858 ^ (long)2015294837);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)1385657391 ^ (long)1385657460);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)1014452790 ^ (long)1014452886);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)725184601 ^ (long)725184521);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)1678126572 ^ (long)1678126436);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-1537464563 ^ (long)-1537464394);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-835630513 ^ (long)-835630468);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-319222832 ^ (long)-319222949);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)168528963 ^ (long)168528995);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-1958571680 ^ (long)-1958571601);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-172861409 ^ (long)-172861298);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-1175471228 ^ (long)-1175471354);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-409169445 ^ (long)-409169462);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1056020523 ^ (long)1056020517);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-27116442 ^ (long)-27116463);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)-269992301 ^ (long)-269992410);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)1331313115 ^ (long)1331313101);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)1509752116 ^ (long)1509752275);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-338359310 ^ (long)-338359473);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1245594018 ^ (long)1245593985);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)725432192 ^ (long)725432192);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)896215120 ^ (long)896215107);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)127886759 ^ (long)127886643);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)890009801 ^ (long)890009842);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)835132854 ^ (long)835132860);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)1787551838 ^ (long)1787551934);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-1947094951 ^ (long)-1947094900);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)2059380215 ^ (long)2059380033);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-1696376149 ^ (long)-1696376095);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)1407731100 ^ (long)1407731026);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)2108020685 ^ (long)2108020503);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1532517648 ^ (long)1532517702);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)1735711426 ^ (long)1735711381);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-390188933 ^ (long)-390188951);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-830280607 ^ (long)-830280582);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-800022388 ^ (long)-800022288);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)1980085261 ^ (long)1980085351);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-961914059 ^ (long)-961913870);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)355878431 ^ (long)355878550);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)249198056 ^ (long)249198000);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)85803586 ^ (long)85803615);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)450472630 ^ (long)450472624);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-1412322589 ^ (long)-1412322718);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-1893654026 ^ (long)-1893654121);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1557579924 ^ (long)-1557579793);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)1995144921 ^ (long)1995144788);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-64650698 ^ (long)-64650606);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)1879243059 ^ (long)1879243143);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-983069787 ^ (long)-983069804);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)32527551 ^ (long)32527360);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)932232988 ^ (long)932233087);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-781483783 ^ (long)-781483856);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)1389145361 ^ (long)1389145592);
                    if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)1303210655 ^ (long)1303210643);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1330148743 ^ (long)1330148728)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)1909437684 ^ (long)1909410571)) >>> (int)((long)-1327951536 ^ (long)-1327951528)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)699466435 ^ (long)699466435);
            if (!5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-1644637665 ^ (long)-1644637667);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)85243592 ^ (long)85243595) | var5_6 << (int)((long)1944611207 ^ (long)1944611202)) ^ var3_4[var7_8]) & (int)((long)1156396945 ^ (long)1156396910);
                    if (5B.\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)311274533 ^ (long)311274534) | var6_7 << (int)((long)-1731298294 ^ (long)-1731298289)) ^ var3_4[var7_8]) & (int)((long)-2110268636 ^ (long)-2110268453);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            5B.b[var2_3] = new String(var3_4).intern();
        }
        return 5B.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String 2() {
        String string;
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
                if (bl2 || bl2) return null;
                string = GPG.class.getResource(5B.a((int)((long)787682082 ^ (long)787678375), (int)((long)1568607867 ^ (long)-1568606754))).getFile();
                if (!string.startsWith(5B.a((int)((long)-1812801098 ^ (long)-1812804044), (int)((long)-257455454 ^ (long)-257441268)))) break block7;
                if (bl2) return null;
                if (string.endsWith(5B.a((int)((long)1390213843 ^ (long)1390210384), (int)((long)-482501124 ^ (long)-482486559)))) break block8;
                if (bl2) return null;
            }
            if (bl2) return null;
            throw new IllegalStateException(5B.a((int)((long)-854877721 ^ (long)-854880672), (int)((long)821067686 ^ (long)-821058185)).concat(String.valueOf(string)));
        }
        try {
            if (bl2) return null;
            return Paths.get(new URL(string.substring((int)((long)575913885 ^ (long)575913885), string.length() - (int)((long)-1020355676 ^ (long)-1020355666))).toURI()).toFile().getAbsolutePath();
        } catch (Exception exception) {
            if (bl2 || bl2) return null;
            throw new RuntimeException(exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String 0(String string) {
        boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
        if (bl2 || bl2) return null;
        if ((string = string.split(0rB$1f.XNZw("\u48ce", -234918342))[(int)((long)899471323 ^ (long)899471323)]).indexOf((int)((long)1977473731 ^ (long)1977473773)) == string.lastIndexOf((int)((long)1711192918 ^ (long)1711192952))) {
            if (bl2 || bl2) return null;
            return string;
        }
        if (!bl2) return string.substring((int)((long)1074389025 ^ (long)1074389025), string.lastIndexOf((int)((long)2089575152 ^ (long)2089575134)));
        return null;
    }

    private static String 3() {
        String string;
        boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
        if (bl2 || bl2) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder().append(System.getProperties().getProperty(5B.a((int)((long)-1834575506 ^ (long)-1834578194), (int)((long)-757368406 ^ (long)757389968)))).append(File.separator).append(5B.a((int)((long)356634739 ^ (long)356632570), (int)((long)-1758359407 ^ (long)-1758358917))).append(File.separator).append(5B.a((int)((long)415121147 ^ (long)415115622), (int)((long)968904735 ^ (long)-968896892)));
        if (4B.0() == 4B.a) {
            string = 5B.a((int)((long)493535693 ^ (long)493540945), (int)((long)-1298406678 ^ (long)-1298410939));
            if (\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) {
                throw null;
            }
        } else {
            string = 0rB$1f.XNZw("", 167451761);
        }
        return stringBuilder.append(string).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static InstallationConfig 2(ImpactVersionReleased object) {
        Object object2;
        InstallationConfig installationConfig;
        boolean bl2;
        block19: {
            bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
            if (bl2 || bl2) return null;
            if (2M.1().0()) {
                if (bl2 || bl2) return null;
                throw new IllegalStateException(5B.a((int)((long)234108596 ^ (long)234103045), (int)((long)-1616752923 ^ (long)-1616768967)));
            }
            if (bl2) return null;
            installationConfig = new InstallationConfig();
            object2 = installationConfig.getSettingValue(MinecraftDirectorySetting.INSTANCE);
            if (!object2.toFile().getAbsoluteFile().equals(5B.2.w.getAbsoluteFile())) {
                if (bl2 || bl2) return null;
                throw new IllegalArgumentException(5B.a((int)((long)-2135159133 ^ (long)-2135156419), (int)((long)1377696323 ^ (long)-1377678641)) + object2.toFile().getAbsoluteFile() + 0rB$1f.XNZw("\ue9fa", 350867203) + 5B.2.w.getAbsoluteFile());
            }
            if (bl2) return null;
            if (!5B.2().contains(new File(5B.2.w, 5B.a((int)((long)1501101273 ^ (long)1501096776), (int)((long)-1312053774 ^ (long)-1312061040))).toString())) {
                if (bl2 || bl2) return null;
                throw new IllegalArgumentException(5B.2() + 0rB$1f.XNZw("\u7147", -520333378) + new File(5B.2.w, 5B.a((int)((long)-1983534014 ^ (long)-1983530028), (int)((long)702543298 ^ (long)702518323))));
            }
            try {
                if (bl2) return null;
                if (IOUtils.toString((URI)5B.2.w.toPath().resolve(5B.a((int)((long)604095290 ^ (long)604099762), (int)((long)1139243098 ^ (long)-1139231673))).resolve(2.c()).resolve(2.c() + 5B.a((int)((long)991357172 ^ (long)991362939), (int)((long)1362583055 ^ (long)-1362569485))).toUri(), (Charset)StandardCharsets.UTF_8).contains(5B.a((int)((long)-1348515316 ^ (long)-1348510277), (int)((long)-1445615624 ^ (long)-1445611710)))) {
                    if (bl2 || bl2) return null;
                    throw new IllegalStateException(5B.a((int)((long)248060556 ^ (long)248057145), (int)((long)-351987669 ^ (long)-351974151)));
                }
                if (bl2) return null;
                if (!\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) break block19;
                throw null;
            } catch (IOException iOException) {
                if (bl2 || bl2) return null;
                throw new RuntimeException(iOException);
            }
        }
        if (bl2) return null;
        5B.0(installationConfig, InstallationModeSetting.INSTANCE, InstallationModeOptions.VANILLA);
        if (bl2 || bl2) return null;
        5B.0(installationConfig, MinecraftVersionSetting.INSTANCE, ((ImpactVersionReleased)object).mcVersion);
        if (bl2 || bl2) return null;
        5B.0(installationConfig, ImpactVersionSetting.INSTANCE, object);
        if (bl2 || bl2) return null;
        object2 = 0o.4 + 5B.a((int)((long)-165638547 ^ (long)-165635623), (int)((long)166462876 ^ (long)-166492721));
        if (bl2 || bl2) return null;
        object = 2.c();
        if (!((String)object).equals(object2)) {
            if (bl2 || bl2) return null;
            if (!((String)object).startsWith((String)object2)) {
                if (bl2 || bl2) return null;
                throw new IllegalArgumentException(5B.a((int)((long)-1483645237 ^ (long)-1483650742), (int)((long)-2130060606 ^ (long)-2130058907)) + (String)object + 0rB$1f.XNZw("\u662b", 2103263442) + (String)object2);
            }
            if (bl2) return null;
            if (!((String)(object2 = ((String)object).substring(((String)object2).length()))).startsWith(5B.a((int)((long)1006333542 ^ (long)1006336482), (int)((long)-1454197804 ^ (long)1454190414)))) {
                if (bl2 || bl2) return null;
                throw new IllegalArgumentException((String)object);
            }
            if (bl2) return null;
            object = 0o.4 + 0rB$1f.XNZw("\ue60c", -586039158) + ((String)object2).substring((int)((long)-728415133 ^ (long)-728415127));
            if (bl2 || bl2) return null;
            5B.0(installationConfig, OptiFineSetting.INSTANCE, object);
            if (bl2) return null;
        }
        if (bl2) return null;
        new Vanilla(installationConfig).sanityCheck((boolean)((long)-1528063042 ^ (long)-1528063041));
        if (!bl2 && !bl2) return installationConfig;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void 1() {
        boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
        if (bl2) return;
        try {
            String string;
            if (bl2) return;
            Object object = 5B.2();
            if (bl2 || bl2) return;
            String string2 = 5B.3();
            if (bl2 || bl2) return;
            String[] stringArray = new String[(int)((long)1188848020 ^ (long)1188848028)];
            stringArray[(int)((long)-69781618 ^ (long)-69781618)] = string2;
            stringArray[(int)((long)-519949297 ^ (long)-519949298)] = 5B.a((int)((long)1103868605 ^ (long)1103865125), (int)((long)943749833 ^ (long)943748230));
            stringArray[(int)((long)646583409 ^ (long)646583411)] = object;
            stringArray[(int)((long)-1267160085 ^ (long)-1267160088)] = 5B.a((int)((long)-849005085 ^ (long)-849010075), (int)((long)1474707320 ^ (long)-1474697333));
            stringArray[(int)((long)806043658 ^ (long)806043662)] = 5B.a((int)((long)-1554616447 ^ (long)-1554614223), (int)((long)1185509245 ^ (long)1185497732));
            int n2 = (int)((long)1847389645 ^ (long)1847389640);
            if (2M.1().0()) {
                string = 5B.a((int)((long)1355907585 ^ (long)1355912597), (int)((long)1963312578 ^ (long)1963319474));
                if (\u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b) {
                    throw null;
                }
            } else {
                string = 5B.a((int)((long)-1296438543 ^ (long)-1296433849), (int)((long)-118828263 ^ (long)-118838840));
            }
            stringArray[n2] = string;
            stringArray[(int)((long)306798347 ^ (long)306798349)] = 5B.a((int)((long)-708304688 ^ (long)-708298933), (int)((long)672456810 ^ (long)-672437455));
            stringArray[(int)((long)1033291734 ^ (long)1033291729)] = this.0.5.getCombinedVersion();
            object = new ArrayList<String>(Arrays.asList(stringArray));
            if (Installer.args.prereleases) {
                object.add(5B.a((int)((long)154604348 ^ (long)154600619), (int)((long)-852038171 ^ (long)-852054808)));
            }
            System.out.println(5B.a((int)((long)-863858486 ^ (long)-863860921), (int)((long)-1640583965 ^ (long)-1640589369)).concat(String.valueOf(object)));
            object = new ProcessBuilder((List<String>)object).start();
            Thread.sleep(0xB6DBFB4E7A2D9F71L ^ 0xB6DBFB4E7A2D96B5L);
            if (!((Process)object).isAlive()) {
                System.out.println(IOUtils.toString((InputStream)((Process)object).getInputStream(), (Charset)StandardCharsets.UTF_8));
                System.err.println(IOUtils.toString((InputStream)((Process)object).getErrorStream(), (Charset)StandardCharsets.UTF_8));
                throw new IllegalStateException(5B.a((int)((long)35460556 ^ (long)35455552), (int)((long)-621736011 ^ (long)-621714677)));
            }
            2.n();
            return;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            if (bl2 || bl2) return;
            System.out.println(5B.a((int)((long)20781069 ^ (long)20778887), (int)((long)-178853343 ^ (long)178873996)));
            if (bl2 || bl2) return;
            Desktop desktop = 1C.2();
            if (desktop != null) {
                if (bl2) return;
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    if (bl2) return;
                    try {
                        if (bl2) return;
                        desktop.browse(URI.create(5B.a((int)((long)671857645 ^ (long)671853694), (int)((long)-1610197908 ^ (long)-1610199621))));
                        if (bl2 || bl2) return;
                        2.n();
                        if (bl2 || bl2) return;
                        return;
                    } catch (Exception exception) {
                        exception.printStackTrace();
                        if (bl2) return;
                    }
                }
            }
            if (bl2) return;
            1C.0(5B.a((int)((long)1064739945 ^ (long)1064743906), (int)((long)-980776453 ^ (long)-980775258)), (boolean)((long)1779235102 ^ (long)1779235103));
            if (bl2 || bl2) return;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static <T> void 0(InstallationConfig installationConfig, Setting<T> setting, T t2) {
        boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
        if (bl2 || bl2) return;
        if (!installationConfig.setSettingValue(setting, t2)) {
            if (bl2 || bl2) return;
            throw new IllegalArgumentException(installationConfig + 0rB$1f.XNZw("\uc17b", 1311238018) + setting + 0rB$1f.XNZw("\u3f3b", 1771051458) + t2);
        }
        if (!bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void 0() {
        boolean bl2 = \u2000\u200f\u2004\u200b\u2007\u2004\u2009\u200b;
        if (bl2) return;
        try {
            if (bl2) return;
            new Vanilla(this.0.4).install((boolean)((long)-1294222294 ^ (long)-1294222293));
            if (bl2 || bl2) return;
            return;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            if (bl2 || bl2) return;
            System.out.println(5B.a((int)((long)1903288768 ^ (long)1903294047), (int)((long)-1132268878 ^ (long)-1132275330)));
            if (bl2 || bl2) return;
            return;
        }
    }
}

