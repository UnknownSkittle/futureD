/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  aip
 */
package net.impactclient;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.Settings$Setting;
import baritone.api.event.events.PathEvent;
import baritone.api.event.listener.AbstractGameEventListener;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import net.impactclient.0r3;
import net.impactclient.0rB$1f;
import net.impactclient.0rR;
import net.impactclient.0rb;
import net.impactclient.0ri;
import net.impactclient.1C;
import net.impactclient.1_;
import net.impactclient.23;
import net.impactclient.2r;
import net.impactclient.36;
import net.impactclient.3W;
import net.impactclient.3i;
import net.impactclient.73;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 8Y
extends 73
implements AbstractGameEventListener,
36 {
    private static final String[] e;
    public 0ri 0;
    private static final String[] d;
    public static final boolean \u2004\u2001\u2006\u200d;

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 8Y.\u2004\u2001\u2006\u200d;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)-564619491 ^ (long)-564619488)];
            if (var7) break block23;
            var3_2 = (int)((long)-1014385241 ^ (long)-1014385241);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\u1a36\u337f\uf063\u0d73\u1aba\u3355\uf0c3\u0d91\u1aff\u3328\uf0ee\u0dba\u1a98\u337a\uf0be\u0d6a\u1a48\u330a\uf0bd\u0d65\u1aac\u33c1\uf0ae\u0d97\u1a6e\u33cf\uf0b3\u0de3\u1a0d\u3316\uf07d\u0d05\u1a46\u333e\uf04e\u0d2f\u1a45\u3367\uf054\u0dc5\u1a9e\u3321\uf0bb\u0d19\u1ae8\u3301\uf007\u0d25\u1aa3\u333a\uf0c8\u0d7a\u1adb\u336a\uf0ee\u0d37\u1af5\u33e4\uf0aa\u0dc2\u1a35\u337e\uf07f\u0de0\u1a77\u3333\uf00a\u0dc4\u1adc\u339f\uf0e0\u0d56\u1a8c\u3327\uf02b\u0d4f\u1ae7\u33ec\uf02a\u0d2b\u1a5c\u337d\uf03c\u0d16\u1a76\u33ce\uf03d\u0d55\u1a54\u33de\uf0e1\u0d2c\u1a97\u330d\uf025\u0def\u1aeb\u3314\uf0cb\u0d7a\u1a37\u33fd\uf077\u0d0c\u1a31\u3324\uf0d7\u0d2f\u1ab3\u33d6\uf0e6\u0da3\u1a7d\u331f\uf0bf\u0de4\u1a3e\u3395\uf038\u0d7c\u1a43\u33cd\uf0b4\u0da1\u1a4f\u33c8\uf0d2\u0dbc\u1a1f\u337f\uf01b\u0d55\u1a2e\u3332\uf0ae\u0d59\u1a25\u3373\uf060\u0d1e\u1a79\u33b5\uf03f\u0d19\u1a2f\u33a7\uf069\u0d09\u1a76\u3300\uf0a3\u0d42\u1a37\u3396\uf006\u0d53\u1a62\u333a\uf094\u0d1e\u1a92\u33aa\uf08a\u0d9f\u1a68\u338f\uf052\u0d24\u1aed\u33f2\uf06b\u0df1\u1aa5\u33ba\uf038\u0daa\u1a5d\u3375\uf0e5\u0dca\u1ab2\u3366\uf016\u0db1\u1a2d\u3313\uf018\u0dba\u1a94\u339a\uf05f\u0d42\u1a23\u33cc\uf0ba\u0d30\u1a12\u33b7\uf0f3\u0d39\u1a65\u33ad\uf022\u0ddb\u1a4b\u3319\uf08e\u0d5d\u1a3f\u331b\uf05b\u0d71\u1ae9\u3396\uf0a4\u0d45\u1a2c\u33d1\uf0fb\u0d6a\u1a6f\u33e1\uf0b2\u0db5\u1ad9\u3306\uf04e\u0d0c\u1a79\u337d\uf014\u0d4f\u1a93\u33e5\uf047\u0d25\u1ad4\u335c\uf0fc\u0dc6\u1ac9\u33bf\uf0a2\u0d22\u1abf\u337c\uf0a2\u0db1\u1a55\u3378\uf0bc\u0d6b\u1a70\u3398\uf01c\u0d4a\u1a25\u33cd\uf046\u0d40\u1aae\u33c6\uf019\u0db4\u1a5f\u3314\uf008\u0d43\u1a76\u332a\uf07e\u0d14\u1abc\u339e\uf0ae\u0d73\u1a99\u33e1\uf0b5\u0d77\u1a4a\u3364\uf0fb\u0dc8\u1abd\u3369\uf065\u0d2b\u1ad3\u3390\uf076\u0de3\u1aea\u3308\uf0b4\u0df5\u1a23\u33ce\uf08f\u0de9\u1ada\u33dd\uf01e\u0dc7\u1a56\u3324\uf0f8\u0d92\u1acb\u3358\uf0bc\u0d9e\u1a85\u3355\uf0f0\u0db6\u1ad9\u3347\uf0e6\u0dfd\u1a44\u33e0\uf079\u0d53\u1a22\u3376\uf07d\u0d6e\u1ae3\u3342\uf0fa\u0d03\u1aa3\u33ea\uf0c6\u0d19\u1a1b\u3342\uf092\u0d67\u1a65\u334a\uf0a5\u0db5\u1a03\u3351\uf01d\u0d2d\u1a00\u332d\uf038\u0d4f\u1ac1\u33e6\uf003\u0de3\u1a14\u338c\uf06a\u0d78\u1a4a\u332d\uf00c\u0d45\u1a44\u33a3\uf0e0\u0d08\u1ac3\u33a4\uf0f9\u0d34\u1a06\u33dd\uf096\u0de5\u1ae6\u330d\uf061\u0d79\u1abb\u33b1\uf0d8\u0d06\u1ae0\u3343\uf028\u0d45\u1a9f\u3324\uf02f\u0dbd\u1a3b\u330e\uf0ab\u0d9e\u1a67\u33ce\uf0e0\u0d26\u1a29\u33bf\uf047\u0d2b\u1a73\u33a8\uf047\u0d09\u1adf\u33cc\uf096\u0df2\u1a62\u3374\uf0bd\u0db6\u1a6b\u339d\uf0a6\u0dc3\u1a6e\u3325\uf05f\u0d90\u1a0c\u331e\uf0d3\u0d5a\u1ac2\u33be\uf031\u0d27\u1a96\u33b9\uf04e\u0d84\u1aeb\u332f\uf0e3\u0d94\u1ac6\u3370\uf02c\u0d22\u1ad2\u33d0\uf041\u0d60\u1a86\u33f2\uf005\u0d01\u1afc\u33f6\uf043\u0df0\u1ab8\u3353\uf01e\u0dcf\u1a73\u331f\uf04b\u0da7\u1a64\u3368\uf0a9\u0d59\u1a18\u3331\uf0bd\u0db6\u1afe\u331d\uf0a7\u0d22\u1aef\u33b1\uf073\u0de4\u1a72\u33a4\uf0c4\u0d4e\u1ae2\u336e\uf098\u0d10\u1adc\u33f8\uf0f9\u0dbb\u1a7f\u3347\uf034\u0dce\u1add\u3391\uf0db\u0d84\u1a30\u33f7\uf07f\u0d29\u1a09\u33b6\uf0f6\u0d89\u1ad6\u333b\uf0df\u0d46\u1a6c\u3353\uf050\u0d07\u1ae6\u3384\uf055\u0d8b\u1af6\u33e5\uf041\u0d06\u1a58\u3362\uf0f9\u0ddc\u1a93\u333a\uf079\u0d88\u1aad\u3320\uf0a9\u0dea\u1a4e\u33df\uf093\u0d43\u1afd\u33c2\uf069\u0dfb\u1aec\u3318\uf038\u0dca\u1a60\u33db\uf0ed\u0db2\u1a96\u33bd\uf03c\u0d0f\u1aa9\u33c7\uf0bd\u0db4\u1a56\u33f2\uf07e\u0dfd\u1a33\u3377\uf0f1\u0dfd\u1adb\u332f\uf023\u0d0a\u1a20\u3377\uf055\u0d41\u1a2f\u33ca\uf0fa\u0d71\u1ac5\u3326\uf05d\u0dd5\u1a1a\u334c\uf045\u0d22\u1a31\u3341\uf0e9\u0dd7\u1abb\u338c\uf0c5\u0de7\u1ae0\u33a4\uf064\u0d88\u1ae9\u33e3\uf004\u0da5\u1a2b\u339b\uf08b\u0d54\u1a01\u3347\uf01e\u0d8a\u1a86\u33f4\uf044\u0d8c\u1a8a\u33e7\uf00b\u0d3b\u1a20\u3346\uf04f\u0d80\u1a69\u33cc\uf0bf\u0d25\u1a83\u334d\uf062\u0dba\u1a8d\u33c7\uf0a6\u0d12\u1a23\u33b5\uf060\u0ddf\u1a97\u337c\uf00f\u0d61\u1af7\u3385\uf039\u0d6e\u1ae9\u33bb\uf0b3\u0d68\u1a9c\u3301\uf03d\u0dac\u1aa1\u33f8\uf008\u0dd7\u1a4d\u3385\uf03c\u0dfd\u1ac5\u3328\uf0ec\u0d68\u1ad9\u332f\uf045\u0d41\u1a37\u33f2\uf0e8\u0d9e\u1a6f\u3363\uf031\u0d7e\u1acb\u333b\uf06f\u0d7a\u1a06\u339d\uf0d9\u0d45\u1af3\u3359\uf05f\u0d2e\u1acc\u3380\uf00b\u0d98\u1af9\u33da\uf0b6\u0d9d\u1a83\u3309\uf093\u0d41\u1ac2\u33d6\uf0bb\u0df7\u1a16\u3398\uf033\u0dba\u1a48\u3371\uf08f\u0d6c\u1acb\u3320\uf044\u0d34\u1a8a\u33f7\uf0d0\u0d7e\u1a24\u33e1\uf079\u0dc4\u1a65\u334e\uf036\u0dd1\u1ac6\u33d6\uf0f2\u0dd1\u1a3c\u3302\uf00c\u0d44\u1ab0\u3364\uf0b8\u0da6\u1ad1\u330b\uf062\u0d2f\u1a69\u331a\uf095\u0d44\u1a8a\u33aa\uf0f7\u0de0\u1aee\u33a7\uf095\u0d27\u1a50\u336d\uf055\u0d89\u1af0\u3378\uf04f\u0d30\u1aa3\u33e0\uf0f6\u0d25\u1ac2\u3346\uf08e\u0d82\u1ab1\u332a\uf051\u0d64\u1a0a\u3390\uf078\u0dbe\u1a4a\u33df\uf0fb\u0dec\u1a48\u33ad\uf067\u0d1e\u1a7d\u33cb\uf040\u0d69\u1ab0\u3362\uf013\u0d7b\u1a5b\u3304\uf033\u0d80\u1a2c\u3371\uf053\u0dc3\u1afc\u3329\uf09c\u0d36\u1a3f\u33b7\uf008\u0db3\u1afe\u3345\uf08d\u0d68\u1a90\u33c9\uf01b\u0d78\u1aa7\u33ce\uf06c\u0d9c\u1a4b\u3396\uf068\u0d0b\u1a9a\u33bc\uf0fe\u0d5f\u1a0f\u33b7\uf01c\u0d28\u1aa8\u3360\uf09e\u0d90\u1ade\u33f9\uf03c\u0d28\u1ae4\u33f9\uf092\u0d08\u1a68\u335f\uf0b9\u0da3\u1a60\u338f\uf0e3\u0d3e\u1a87\u33d1\uf0b9\u0d65\u1a68\u3354\uf072\u0d1d\u1a91\u3306\uf0b3\u0d57\u1a41\u3373\uf0b6\u0d6b\u1aa4\u33a1\uf041\u0d49\u1a29\u33c8\uf0b9\u0dbe\u1a63\u33d1\uf099\u0dfb\u1a89\u3322\uf0a3\u0df3\u1a64\u3315\uf0ca\u0d34\u1a0e\u33d5\uf0e8\u0d6d\u1a49\u3384\uf071\u0db9\u1a3a\u33a0\uf021\u0df2\u1a72\u33f5\uf0c7\u0d45\u1a02\u333c\uf075\u0dfe\u1a83\u3354\uf0f3\u0dc9\u1afe\u3319\uf05a\u0d43\u1a9b\u33cd\uf07e\u0d71\u1a18\u3324\uf05b\u0dda\u1ae0\u3399\uf074\u0d1c\u1a17\u33b7\uf03e\u0d2a\u1a8e\u3338\uf027\u0d9b\u1a1b\u3389\uf087\u0dcd\u1a9b\u3308\uf017\u0d33\u1a39\u330e\uf05c\u0d6e\u1a87\u33a4\uf062\u0dff\u1aea\u33d7\uf00c\u0d9a\u1ac5\u33d7\uf088\u0d7e\u1a09\u3333\uf032\u0de2\u1a6c\u3362\uf060\u0da7\u1ae0\u33fa\uf095\u0d44\u1aee\u331c\uf078\u0db4\u1a4c\u338a\uf0b0\u0dfd\u1a53\u33b7\uf0d8\u0de1\u1a2c\u330c\uf0eb\u0d2a\u1afa\u3349\uf06e\u0dfe\u1a37\u33ad\uf098\u0d56\u1a5c\u33f1\uf076\u0d62\u1aea\u33aa\uf038\u0d6c\u1a1f\u333b\uf0f2\u0df3\u1a15\u3303\uf090\u0d9b\u1ac6\u335b\uf053\u0d8b\u1af6\u337a\uf0af\u0d31\u1a1b\u3396\uf0db\u0dc7\u1a34\u33ad\uf07b\u0d3b\u1a5f\u33d5\uf041\u0d93\u1a3c\u33e5\uf0e1\u0d5a\u1a6a\u33e0\uf0c4\u0de7\u1a62\u3374\uf075\u0d6c\u1a0c\u33ca\uf044\u0d17\u1a99\u3306\uf04f\u0d8e\u1ab1\u3391\uf099\u0dd1\u1a26\u3352\uf06e\u0d75\u1af1\u3316\uf058\u0dfd\u1a14\u33d9\uf07f\u0dfc\u1ac6\u3389\uf045\u0d84\u1a61\u3353\uf09e\u0d21\u1a71\u3367\uf0f9\u0dfa\u1a8b\u3342\uf0fb\u0d20\u1ac0\u3394\uf070\u0df0\u1a75\u338c\uf013\u0d49\u1af5\u33b7\uf003\u0dcb\u1ad8\u335c\uf04f\u0dba\u1a08\u3360\uf024\u0d48\u1a89\u3395\uf014\u0de6\u1aaf\u33c6\uf04b\u0d48\u1a20\u33c2\uf07c\u0dd9\u1a94\u33ce\uf01c\u0d0b\u1a9f\u3359\uf079\u0df1\u1a55\u3399\uf06e\u0dee\u1a02\u3327\uf022\u0d40\u1a0d\u332b\uf057\u0d38\u1a46\u330b\uf0fc\u0d26\u1a13\u3346\uf041\u0d6a\u1ad4\u3365\uf06c\u0d4a\u1a91\u33a2\uf0b4\u0de0\u1a7e\u336a\uf0e0\u0d35\u1a3d\u3364\uf0ef\u0d21\u1aaa\u3349\uf06b\u0df7\u1a5d\u3390\uf0ea\u0d22\u1a54\u334a\uf093\u0d11\u1a42\u33d2\uf08c\u0dba\u1a29\u33d6\uf047\u0dac\u1a34\u3308\uf0c1\u0dd5\u1a65\u3349\uf0af\u0d3a\u1a5e\u3330\uf0dc\u0d9e\u1a8b\u33d6\uf05e\u0d9e\u1a67\u3366\uf0ff\u0dd7\u1a2f\u333d\uf082\u0d1d\u1aff\u33de\uf0d9\u0d08\u1a35\u339e\uf0e4\u0d30\u1a21\u3334\uf05d\u0de5\u1ae1\u33e1\uf0b9\u0d83\u1acd\u33f6\uf05f\u0d74\u1abd\u330c\uf070\u0d40\u1a91\u334e\uf07c\u0d2e\u1aca\u33d9\uf060\u0d99\u1a47\u33e0\uf093\u0d82\u1ad6\u339e\uf00d\u0d72\u1ab9\u3302\uf037\u0dfe\u1a48\u33a9\uf0a4\u0d20\u1a3c\u3347\uf07e\u0db2\u1a61\u3339\uf080\u0dbd\u1a8f\u33b1\uf089\u0d0a\u1a7a\u33c7\uf038\u0df4\u1a7b\u33a3\uf012\u0d30\u1aab\u332c\uf0a9\u0dfe\u1af8\u33a9\uf0fa\u0d4a\u1a6a\u33bc\uf06c\u0d99\u1ab1\u3331\uf050\u0d9a\u1a59\u3323\uf03a\u0d73\u1a6e\u33fc\uf095\u0d15\u1a73\u33ec\uf0c4\u0db4\u1a8c\u330f\uf0e3\u0dc2\u1aa7\u33b0\uf01e\u0dfd\u1a41\u3309\uf019\u0d5e\u1a85\u33b6\uf0ca\u0d9b\u1a34\u33f5\uf04a\u0dcb\u1a29\u339d\uf093\u0d01\u1aa2\u33fb\uf06f\u0de3\u1a07\u3397\uf003\u0db1\u1ac3\u331c\uf0bf\u0dba\u1a74\u33ee\uf0a5\u0d85\u1aa5\u334d\uf0d5\u0de3\u1a02\u3304\uf02f\u0d22\u1a9c\u331c\uf0fa\u0d94\u1a0c\u3303\uf033\u0d8f\u1a45\u3304\uf0f7\u0d05\u1a0f\u3387\uf021\u0d31\u1a08\u3300\uf027\u0d2c\u1a68\u3352\uf047\u0d3a\u1a57\u33fa\uf05f\u0da3\u1a52\u3380\uf08e\u0d62\u1a4d\u3347\uf044\u0d46\u1af0\u3313\uf0ec\u0d4c\u1a05\u334e\uf06d\u0df7\u1a6d\u3386\uf022\u0d3a\u1a31\u333c\uf02e\u0d4d\u1a50\u3393\uf05c\u0da5\u1a25\u3358\uf0e5\u0de0\u1aa9\u3350\uf09f\u0d35\u1acf\u3329\uf097\u0dc8\u1aa1\u3307\uf030\u0d40\u1a6e\u335f\uf07f\u0d7c\u1a30\u332a\uf087\u0dc0\u1ad4\u33c6\uf07f\u0d2c\u1a74\u337f\uf0ec\u0d53\u1ae9\u3383\uf032\u0d6d\u1a3a\u33f8\uf02e\u0dae\u1ad8\u3364\uf02e\u0d45\u1afb\u3319\uf05e\u0daa\u1a88\u3349\uf028\u0d88\u1a4a\u33a1\uf0ab\u0de7\u1a6a\u33da\uf06b\u0d77\u1aee\u33a8\uf038\u0de4\u1abb\u333c\uf024\u0dd7\u1ad2\u3385\uf02d\u0d5f\u1a6e\u33d6\uf05d\u0d07\u1ad7\u3326\uf09d\u0d43\u1a03\u338a\uf0a1\u0d94\u1a01\u33d3\uf049\u0d8a\u1ad8\u333d\uf0ef\u0d62\u1aea\u3314\uf051\u0dbd\u1a13\u33c6\uf071\u0d60\u1a6f\u338e\uf0db\u0d19\u1a75\u3351\uf0ef\u0db0\u1af4\u3332\uf0a3\u0d83\u1a41\u333d\uf040\u0d9b\u1a88\u3363\uf0a3\u0d1e\u1aed\u33d7\uf082\u0d64\u1a6d\u3309\uf03c\u0d0b\u1a53\u330e\uf07f\u0d71\u1af9\u337a\uf059\u0d7f\u1ab8\u3336\uf095\u0d3e\u1ae7\u3349\uf0e1\u0dad\u1a27\u3348\uf0c7\u0d4e\u1a94\u337c\uf0a7\u0d95\u1ac8\u334c\uf0af\u0d35\u1ae7\u33bd\uf0e6\u0d8a\u1a24\u3306\uf0e9\u0dc7\u1adf\u33e9\uf007\u0d1a\u1a7b\u33bd\uf06f\u0d64\u1a68\u3366\uf05b\u0d76\u1a1c\u33ae\uf0d3\u0d7b\u1af3\u33b2\uf08e\u0d3b\u1a52\u3373\uf044\u0d88\u1a71\u335d\uf00b\u0d44\u1aea\u33a8\uf0a8\u0d78\u1a79\u33bf\uf09d\u0def\u1ace\u330a\uf0d2\u0db4\u1a95\u336b\uf095\u0d7e\u1a38\u33b6\uf00b\u0d87\u1aaa\u337c\uf0bd\u0d6e\u1a3a\u331c\uf059\u0d6e\u1a03\u333d\uf0d8\u0d8d\u1a92\u339d\uf03b\u0d8e\u1a49\u33f7\uf0af\u0dbc\u1acf\u333a\uf0c4\u0d77\u1a9a\u339f\uf0d2\u0d65\u1a60\u335c\uf036\u0d34\u1abb\u339c\uf06a\u0dad\u1a14\u33e0\uf0b6\u0d05\u1a5a\u33e3\uf045\u0db8\u1ac0\u337e\uf08a\u0da4\u1afc\u33b4\uf0b2\u0de3\u1a5b\u33c9\uf0d6\u0de1\u1a4d\u33a2\uf006\u0d64\u1a3b\u330f\uf053\u0dcc\u1af0\u3315\uf0c2\u0d9b\u1a86\u33ca\uf00d\u0d04\u1a97\u33d7\uf00e\u0d58\u1a38\u33c3\uf00a\u0d9c\u1abd\u3366\uf00e\u0d7b\u1aec\u339b\uf049\u0d00\u1a42\u333d\uf0d5\u0d59\u1a75\u33f6\uf0d9\u0d68\u1ae5\u3340\uf08d\u0dcd\u1a54\u337a\uf012\u0d70\u1a80\u331c\uf080\u0dc2\u1a2e\u3370\uf0b4\u0ded\u1a2b\u338f\uf01c\u0dd9\u1ad0\u334f\uf0a4\u0d2c\u1a0b\u3317\uf056\u0d84\u1a2a\u3350\uf0f1\u0dc5\u1a8c\u331d\uf028\u0d8d\u1ace\u3387\uf03e\u0d14\u1a5c\u33e7\uf0c6\u0ded\u1a8f\u3368\uf000\u0d2d\u1ac1\u33d3\uf06b\u0dc3\u1a8c\u332d\uf04c\u0da9\u1aa3\u33c6\uf003\u0d17\u1a34\u333f\uf0e7\u0d03\u1a89\u33fa\uf0b5\u0d99\u1a35\u3317\uf039\u0d91\u1ab5\u33a2\uf05d\u0db8\u1a5b\u3327\uf0e1\u0ddf\u1a9a\u33d1\uf077\u0d12\u1a1a\u339c\uf0ec\u0d30\u1a81\u3368\uf0bb", 685849896);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)1347996316 ^ (long)1347996292);
            if (var7) break block23;
            var0_6 = (int)((long)665213749 ^ (long)-665213750);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)-569423371 ^ (long)-569423372);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)1506532585 ^ (long)-1506532586);
                    if (8Y.\u2004\u2001\u2006\u200d) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!8Y.\u2004\u2001\u2006\u200d) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\uf55e\udca8\u1f16\ue2ad\uf535\udc4b\u1f69\ue239\uf5b6\udcc4\u1f82\ue2d5\uf5aa\udc56\u1fe9\ue293\uf583\udcab\u1fce\ue25d\uf5ec\udc24\u1f00\ue2ae\uf5de\udc9a\u1f2f\ue228\uf51a\udcfc\u1f13\ue240\uf55d\udc05\u1ff2\ue205\uf5d7\udc15\u1f0f\ue258\uf5ca\udcc6\u1f47\ue2ae\uf5ec\udc69\u1f9d\ue2a9\uf52f\udca0\u1f3c\ue2c3\uf5ea\udcec\u1fcd\ue28e\uf5b2\udc8c\u1fab\ue22f\uf5da\udc7c\u1f4c\ue259\uf537", -447556939);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)-714485514 ^ (long)-714485542);
                            var0_6 = (int)((long)681980322 ^ (long)-681980323);
                            while (true) {
                                v0 = (int)((long)-35387472 ^ (long)-35387494);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)-9832724 ^ (long)-9832724);
                                if (!8Y.\u2004\u2001\u2006\u200d) break block20;
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
                                if (!8Y.\u2004\u2001\u2006\u200d) ** continue;
                                throw null;
                            }
                            8Y.d = var5_1;
                            8Y.e = new String[(int)((long)-2101009962 ^ (long)-2101009941)];
                            if (!8Y.\u2004\u2001\u2006\u200d) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)509946686 ^ (long)509946686);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)232760243 ^ (long)232760242)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)787806861 ^ (long)787806858)) {
                                case 0: {
                                    v15 = (int)((long)424603408 ^ (long)424603427);
                                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)-1889651630 ^ (long)-1889651690);
                                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)-704735493 ^ (long)-704735515);
                                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)2070573949 ^ (long)2070573897);
                                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)1630923999 ^ (long)1630924016);
                                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)-201522010 ^ (long)-201521981);
                                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)-483118879 ^ (long)-483118928);
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
                        } while (!8Y.\u2004\u2001\u2006\u200d);
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
     * Unable to fully structure code
     */
    private static String b(int var0, int var1_1) {
        block265: {
            var9_2 = 8Y.\u2004\u2001\u2006\u200d;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)1587347218 ^ (long)-1587331173)) & (int)((long)328160461 ^ (long)328182578);
            if (var9_2) ** GOTO lbl-1000
            if (8Y.e[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 8Y.d[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-371145040 ^ (long)-371145040)] & (int)((long)-1262411023 ^ (long)-1262411250)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)1980984657 ^ (long)1980984806);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-2136097806 ^ (long)-2136097818);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-325638264 ^ (long)-325638400);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)1428544247 ^ (long)1428544016);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-1426501849 ^ (long)-1426501716);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-128624588 ^ (long)-128624454);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)450323138 ^ (long)450323130);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-882456293 ^ (long)-882456239);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)1022893739 ^ (long)1022893804);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)1072815496 ^ (long)1072815470);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-1760104584 ^ (long)-1760104659);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)207050809 ^ (long)207050814);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-1428975680 ^ (long)-1428975620);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)1453567446 ^ (long)1453567360);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)1922755442 ^ (long)1922755359);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-1961377000 ^ (long)-1961376859);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)1051761305 ^ (long)1051761341);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)1824698432 ^ (long)1824698449);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-282485804 ^ (long)-282485962);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-543114164 ^ (long)-543113986);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)1429987467 ^ (long)1429987366);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)169037172 ^ (long)169037207);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-114261535 ^ (long)-114261619);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-748380033 ^ (long)-748380088);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-1905603752 ^ (long)-1905603628);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-425331232 ^ (long)-425331381);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)1449951909 ^ (long)1449951821);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)740821921 ^ (long)740822013);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)1996095389 ^ (long)1996095433);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)674057032 ^ (long)674056966);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-1381925769 ^ (long)-1381925753);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)-705708829 ^ (long)-705708932);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-1841359933 ^ (long)-1841360031);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-611445186 ^ (long)-611445049);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-527165415 ^ (long)-527165301);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-369612662 ^ (long)-369612634);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1448262025 ^ (long)-1448262066);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)82472581 ^ (long)82472476);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-629437495 ^ (long)-629437521);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-1136806798 ^ (long)-1136806862);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)1612298109 ^ (long)1612298111);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)129997021 ^ (long)129996819);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)743567326 ^ (long)743567126);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)2018680587 ^ (long)2018680578);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-1154029641 ^ (long)-1154029675);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)147888539 ^ (long)147888481);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-925710994 ^ (long)-925711088);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)1764650408 ^ (long)1764650381);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-2078475624 ^ (long)-2078475726);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)136545273 ^ (long)136545277);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-157272111 ^ (long)-157272121);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)95529538 ^ (long)95529479);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)518758468 ^ (long)518758509);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1621813490 ^ (long)1621813302);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-646494430 ^ (long)-646494460);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)366158095 ^ (long)366158266);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)1028940605 ^ (long)1028940628);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)2049615616 ^ (long)2049615712);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-79130328 ^ (long)-79130247);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)2094709760 ^ (long)2094709979);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-53763757 ^ (long)-53763603);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)272266918 ^ (long)272266918);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)1782886305 ^ (long)1782886148);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1632176550 ^ (long)-1632176607);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-1762186496 ^ (long)-1762186260);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)11809011 ^ (long)11808903);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)1276520785 ^ (long)1276520736);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-816996958 ^ (long)-816997060);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)1910848937 ^ (long)1910848813);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)1287873661 ^ (long)1287873649);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)2024465748 ^ (long)2024465709);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1888991409 ^ (long)-1888991312);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)295050872 ^ (long)295050923);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-1765973138 ^ (long)-1765973131);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-76843945 ^ (long)-76843931);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-1422588850 ^ (long)-1422588916);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-257535220 ^ (long)-257535117);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)954164987 ^ (long)954164792);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-733902797 ^ (long)-733902738);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)1532582587 ^ (long)1532582617);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-528085634 ^ (long)-528085567);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)3480203 ^ (long)3480300);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-1605256875 ^ (long)-1605256938);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)64605012 ^ (long)64605096);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-1130873083 ^ (long)-1130872969);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)572212677 ^ (long)572212560);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-1602158158 ^ (long)-1602158245);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-1847173315 ^ (long)-1847173121);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-1820512962 ^ (long)-1820512947);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)745519275 ^ (long)745519242);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-1844877778 ^ (long)-1844877755);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-1394661452 ^ (long)-1394661532);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-473966064 ^ (long)-473965989);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)88189940 ^ (long)88189867);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-1537832447 ^ (long)-1537832352);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-686206484 ^ (long)-686206702);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)404154430 ^ (long)404154506);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)745980830 ^ (long)745980761);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-653280997 ^ (long)-653280995);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)1043466392 ^ (long)1043466448);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)2000749697 ^ (long)2000749767);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-911995502 ^ (long)-911995409);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-1481957001 ^ (long)-1481956969);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)2095410568 ^ (long)2095410525);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-900021573 ^ (long)-900021555);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)835288910 ^ (long)835289055);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-229530760 ^ (long)-229530702);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1221767609 ^ (long)-1221767575);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-1070729756 ^ (long)-1070729863);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-1600366470 ^ (long)-1600366514);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-758608618 ^ (long)-758608403);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-1491726513 ^ (long)-1491726414);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-50539990 ^ (long)-50539888);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-839836098 ^ (long)-839835976);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-165497264 ^ (long)-165497176);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)365860768 ^ (long)365860689);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)329779710 ^ (long)329779498);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)1851754588 ^ (long)1851754511);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)247811869 ^ (long)247811994);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)347218076 ^ (long)347218041);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-1171719863 ^ (long)-1171719788);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-878827543 ^ (long)-878827645);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1244278263 ^ (long)-1244278221);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-69435093 ^ (long)-69435001);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)519318283 ^ (long)519318295);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)26581664 ^ (long)26581618);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)1414285468 ^ (long)1414285404);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)91109614 ^ (long)91109490);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-202742902 ^ (long)-202742911);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-12321295 ^ (long)-12321455);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-614682397 ^ (long)-614682586);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)406546796 ^ (long)406546811);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)1274406660 ^ (long)1274406791);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)1476567017 ^ (long)1476566835);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-844156046 ^ (long)-844156153);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)-53242001 ^ (long)-53241946);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)1794986680 ^ (long)1794986743);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1742279290 ^ (long)-1742279384);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)85848684 ^ (long)85848831);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)727188571 ^ (long)727188555);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-578757507 ^ (long)-578757422);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-944270771 ^ (long)-944270629);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)129688270 ^ (long)129688181);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)420285536 ^ (long)420285526);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-681560174 ^ (long)-681560120);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)276468514 ^ (long)276468664);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)981170068 ^ (long)981170061);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)1603943415 ^ (long)1603943238);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)503413614 ^ (long)503413669);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)675726556 ^ (long)675726430);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)701784543 ^ (long)701784478);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)514618281 ^ (long)514618250);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)1276041318 ^ (long)1276041386);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-1409486800 ^ (long)-1409486764);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-1635186966 ^ (long)-1635187108);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-1976406966 ^ (long)-1976406974);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-1543700559 ^ (long)-1543700666);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)1740619270 ^ (long)1740619401);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-579135836 ^ (long)-579135963);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-984637763 ^ (long)-984637806);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-1837181966 ^ (long)-1837181965);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-1805488103 ^ (long)-1805488027);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1185177943 ^ (long)1185178063);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-705093729 ^ (long)-705093808);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)444750912 ^ (long)444751076);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-498015853 ^ (long)-498015906);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-1703810694 ^ (long)-1703810715);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)2098422437 ^ (long)2098422359);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)1011447481 ^ (long)1011447433);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-1327612451 ^ (long)-1327612524);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)1590773154 ^ (long)1590773146);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-1752372836 ^ (long)-1752372980);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-300570866 ^ (long)-300570666);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-442959810 ^ (long)-442959837);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)694557589 ^ (long)694557584);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1313610035 ^ (long)1313610112);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)-431039096 ^ (long)-431039078);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)1824599360 ^ (long)1824599508);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1305697339 ^ (long)1305697326);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-1586485855 ^ (long)-1586485809);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)1844169238 ^ (long)1844169399);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-38648485 ^ (long)-38648573);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-632738558 ^ (long)-632738349);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1171418728 ^ (long)-1171418682);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-59126351 ^ (long)-59126276);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-810274469 ^ (long)-810274459);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-2141039052 ^ (long)-2141038878);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1648766618 ^ (long)-1648766529);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)1778043477 ^ (long)1778043509);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-1019822914 ^ (long)-1019822975);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1404298541 ^ (long)1404298628);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)1444284354 ^ (long)1444284378);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)943428984 ^ (long)943428906);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)618068671 ^ (long)618068668);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)739873707 ^ (long)739873601);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)1172331241 ^ (long)1172331014);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)2100411131 ^ (long)2100411124);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)212155051 ^ (long)212154892);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-355086743 ^ (long)-355086615);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)638894273 ^ (long)638894299);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1657426945 ^ (long)-1657427036);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)1136774693 ^ (long)1136774671);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-925648628 ^ (long)-925648638);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-1992951452 ^ (long)-1992951533);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)1734159228 ^ (long)1734159301);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)858983620 ^ (long)858983443);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)1538174699 ^ (long)1538174678);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-1509201402 ^ (long)-1509201243);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1514430275 ^ (long)-1514430384);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)1731275341 ^ (long)1731275319);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)1127753476 ^ (long)1127753535);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)1638329359 ^ (long)1638329346);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-1311678976 ^ (long)-1311678835);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-1616257077 ^ (long)-1616257137);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-1464698988 ^ (long)-1464699107);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1118218388 ^ (long)1118218325);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)180105878 ^ (long)180105766);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)833834763 ^ (long)833834773);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)1332519172 ^ (long)1332519327);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1463313674 ^ (long)-1463313902);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-554702016 ^ (long)-554701924);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)-1195908245 ^ (long)-1195908127);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-1491630124 ^ (long)-1491630084);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)-536140049 ^ (long)-536140059);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)495091840 ^ (long)495091828);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-621592805 ^ (long)-621592786);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)1700901916 ^ (long)1700902074);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)546608194 ^ (long)546608155);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)556279052 ^ (long)556279145);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)1875500204 ^ (long)1875500239);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)363516680 ^ (long)363516926);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)1998480139 ^ (long)1998480186);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-190191646 ^ (long)-190191812);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-632762300 ^ (long)-632762257);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-1442306569 ^ (long)-1442306812);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-1234663201 ^ (long)-1234663372);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-2040018124 ^ (long)-2040018076);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-499563169 ^ (long)-499563046);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-1074001428 ^ (long)-1074001541);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-316486204 ^ (long)-316486280);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-1673251501 ^ (long)-1673251458);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)1295567001 ^ (long)1295567094);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-1597858554 ^ (long)-1597858486);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)2060793635 ^ (long)2060793755);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-774331597 ^ (long)-774331616);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)1418438395 ^ (long)1418438344);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1740672327 ^ (long)-1740672425);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-52992398 ^ (long)-52992365);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-1505681715 ^ (long)-1505681902);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)1705906503 ^ (long)1705906610);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-838640665 ^ (long)-838640863);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1566017928 ^ (long)1566017967);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)-2121333463 ^ (long)-2121333375);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1664468223 ^ (long)1664468111);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-676035969 ^ (long)-676036073);
                    if (!8Y.\u2004\u2001\u2006\u200d) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-1003606319 ^ (long)-1003606394);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1058187608 ^ (long)1058187687)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-2104291999 ^ (long)-2104233314)) >>> (int)((long)-27777724 ^ (long)-27777716)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)5185401 ^ (long)5185401);
            if (!8Y.\u2004\u2001\u2006\u200d) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)1306420311 ^ (long)1306420309);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)-883200597 ^ (long)-883200600) | var5_6 << (int)((long)-974126107 ^ (long)-974126112)) ^ var3_4[var7_8]) & (int)((long)-1716644971 ^ (long)-1716645014);
                    if (8Y.\u2004\u2001\u2006\u200d) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-610737976 ^ (long)-610737973) | var6_7 << (int)((long)-1712908342 ^ (long)-1712908337)) ^ var3_4[var7_8]) & (int)((long)-992963116 ^ (long)-992963285);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            8Y.e[var2_3] = new String(var3_4).intern();
        }
        return 8Y.e[var2_3];
    }

    public static 0rR<Integer> 0(Settings$Setting<Integer> settings$Setting, String string, String string2, int n2, int n3) {
        boolean bl2 = \u2004\u2001\u2006\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return new 0rR<Integer>(settings$Setting, string, string2, n2, n3, Number::intValue);
    }

    public static 0rR<Float> 0(Settings$Setting<Float> settings$Setting, String string, String string2, float f2, float f3) {
        boolean bl2 = \u2004\u2001\u2006\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return new 0rR<Float>(settings$Setting, string, string2, Float.valueOf(f2), Float.valueOf(f3), Number::floatValue);
    }

    public static 0rR<Double> 0(Settings$Setting<Double> settings$Setting, String string, String string2, double d2, double d3) {
        boolean bl2 = \u2004\u2001\u2006\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return new 0rR<Double>(settings$Setting, string, string2, d2, d3, Number::doubleValue);
    }

    public static 0rb 1(Settings$Setting<Boolean> settings$Setting, String string, String string2) {
        boolean bl2 = \u2004\u2001\u2006\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return new 0rb(settings$Setting, string, string2);
    }

    public 8Y() {
        boolean bl2 = \u2004\u2001\u2006\u200d;
        super(8Y.b((int)((long)168388066 ^ (long)-168385210), (int)((long)488148025 ^ (long)488145666)), 8Y.b((int)((long)38610668 ^ (long)-38607280), (int)((long)-288780409 ^ (long)-288768006)));
        Boolean bl3 = Boolean.TRUE;
        Object object = (2r)((2r)((2r)this.5().2(8Y.b((int)((long)1402723512 ^ (long)-1402725334), (int)((long)-567001625 ^ (long)-566997975)))).1(8Y.b((int)((long)1036508338 ^ (long)-1036510150), (int)((long)1871973107 ^ (long)-1871971113)))).0(8Y.b((int)((long)-399835486 ^ (long)399851040), (int)((long)-125438131 ^ (long)-125448726)));
        ((2r)((2r)((2r)this.5().2(8Y.b((int)((long)1402723512 ^ (long)-1402725334), (int)((long)-567001625 ^ (long)-566997975)))).1(8Y.b((int)((long)1036508338 ^ (long)-1036510150), (int)((long)1871973107 ^ (long)-1871971113)))).0(8Y.b((int)((long)-399835486 ^ (long)399851040), (int)((long)-125438131 ^ (long)-125448726)))).2 = bl3;
        this.0 = (0ri)((1_)object).0();
        23.0(this, 8Y.b((int)((long)1264211172 ^ (long)-1264217023), (int)((long)1985414704 ^ (long)-1985422334)), Boolean.TRUE);
        object = BaritoneAPI.getSettings();
        3W[] wArray = new 3W[(int)((long)220993962 ^ (long)220993969)];
        wArray[(int)((long)-1925579224 ^ (long)-1925579224)] = 8Y.1(((Settings)object).allowBreak, 8Y.b((int)((long)-1046519754 ^ (long)1046519952), (int)((long)365592944 ^ (long)365619853)), 8Y.b((int)((long)1044468256 ^ (long)-1044475232), (int)((long)-1654866044 ^ (long)-1654880768)));
        wArray[(int)((long)-1339180027 ^ (long)-1339180028)] = 8Y.1(((Settings)object).allowPlace, 8Y.b((int)((long)-506464407 ^ (long)506476483), (int)((long)2064503123 ^ (long)-2064488538)), 8Y.b((int)((long)1740166173 ^ (long)-1740172137), (int)((long)-854990934 ^ (long)855010471)));
        wArray[(int)((long)833222710 ^ (long)833222708)] = 8Y.1(((Settings)object).allowSprint, 8Y.b((int)((long)-448119350 ^ (long)448134476), (int)((long)359089823 ^ (long)-359075410)), 8Y.b((int)((long)1569532527 ^ (long)-1569527074), (int)((long)1997636491 ^ (long)-1997660670)));
        wArray[(int)((long)-1896666838 ^ (long)-1896666839)] = 8Y.1(((Settings)object).allowParkour, 8Y.b((int)((long)2131084297 ^ (long)-2131098470), (int)((long)-39507079 ^ (long)-39490386)), 8Y.b((int)((long)-1010678929 ^ (long)1010664427), (int)((long)-1219919275 ^ (long)1219911375)));
        wArray[(int)((long)1020071041 ^ (long)1020071045)] = 8Y.1(((Settings)object).allowParkourPlace, 8Y.b((int)((long)-1212152170 ^ (long)1212139052), (int)((long)60929964 ^ (long)60932453)), 8Y.b((int)((long)-1290443691 ^ (long)1290446072), (int)((long)-703776731 ^ (long)703783485)));
        wArray[(int)((long)-1447905549 ^ (long)-1447905546)] = 8Y.1(((Settings)object).allowWaterBucketFall, 8Y.b((int)((long)-596953149 ^ (long)596965196), (int)((long)2086047451 ^ (long)-2086066270)), 8Y.b((int)((long)-798095811 ^ (long)798082703), (int)((long)-1052630055 ^ (long)1052634575)));
        wArray[(int)((long)2136766103 ^ (long)2136766097)] = 8Y.0(((Settings)object).maxFallHeightNoWater, 8Y.b((int)((long)2072284372 ^ (long)-2072294283), (int)((long)-722851372 ^ (long)722856747)), 8Y.b((int)((long)2113251154 ^ (long)-2113247290), (int)((long)-1430564902 ^ (long)1430555074)), (int)((long)2026781524 ^ (long)2026781527), (int)((long)846093438 ^ (long)846093441));
        wArray[(int)((long)-18090063 ^ (long)-18090058)] = 8Y.0(((Settings)object).maxFallHeightBucket, 8Y.b((int)((long)2070278245 ^ (long)-2070269751), (int)((long)-1131556889 ^ (long)-1131564867)), 8Y.b((int)((long)-432019554 ^ (long)432023344), (int)((long)-1625793530 ^ (long)1625812962)), (int)((long)1996008473 ^ (long)1996008476), (int)((long)-1940124181 ^ (long)-1940124396));
        wArray[(int)((long)-1840081409 ^ (long)-1840081417)] = 8Y.0(((Settings)object).primaryTimeoutMS, 8Y.b((int)((long)-573076679 ^ (long)573066147), (int)((long)233458560 ^ (long)233453899)), 8Y.b((int)((long)-1385645439 ^ (long)1385658905), (int)((long)-556552312 ^ (long)-556541891)), 0xC82FBAB87BD9DCACL ^ 0xC82FBAB87BD9DCC8L, 0xE5010FE66DF8AF42L ^ 0xE5010FE66DF88852L);
        wArray[(int)((long)423983423 ^ (long)423983414)] = 8Y.0(((Settings)object).planAheadPrimaryTimeoutMS, 8Y.b((int)((long)995678208 ^ (long)-995682137), (int)((long)-1524572826 ^ (long)1524596473)), 8Y.b((int)((long)-1402858347 ^ (long)1402852414), (int)((long)-2022510996 ^ (long)-2022510722)), 0x567D38E0A1822A17L ^ 0x567D38E0A1822A73L, 0x8E8CBBFA4081AEA3L ^ 0x8E8CBBFA408189B3L);
        wArray[(int)((long)1194508026 ^ (long)1194508016)] = 8Y.1(((Settings)object).renderCachedChunks, 8Y.b((int)((long)-1460876434 ^ (long)1460866011), (int)((long)-1284897209 ^ (long)1284892060)), 8Y.b((int)((long)911190596 ^ (long)-911185164), (int)((long)396760762 ^ (long)396769126)));
        wArray[(int)((long)224834322 ^ (long)224834329)] = 8Y.1(((Settings)object).chatDebug, 8Y.b((int)((long)-1216769177 ^ (long)1216762852), (int)((long)-1736806778 ^ (long)1736804179)), 8Y.b((int)((long)986079614 ^ (long)-986078752), (int)((long)-1579858113 ^ (long)1579853142)));
        wArray[(int)((long)1580714489 ^ (long)1580714485)] = 8Y.1(((Settings)object).freeLook, 8Y.b((int)((long)896700910 ^ (long)-896708269), (int)((long)-290685458 ^ (long)290712213)), 8Y.b((int)((long)-1040281928 ^ (long)1040272948), (int)((long)520265500 ^ (long)-520263063)));
        wArray[(int)((long)-593218332 ^ (long)-593218327)] = 8Y.1(((Settings)object).antiCheatCompatibility, 8Y.b((int)((long)672253195 ^ (long)-672266878), (int)((long)342891572 ^ (long)-342916909)), 8Y.b((int)((long)-970000081 ^ (long)970013076), (int)((long)-107832967 ^ (long)107811648)));
        wArray[(int)((long)-1145923166 ^ (long)-1145923156)] = 8Y.0(((Settings)object).followRadius, 8Y.b((int)((long)2069008378 ^ (long)-2069016744), (int)((long)-154094068 ^ (long)-154082352)), 8Y.b((int)((long)-156982404 ^ (long)156984300), (int)((long)-1593930494 ^ (long)-1593927539)), (int)((long)-1988843139 ^ (long)-1988843140), (int)((long)730485380 ^ (long)730485472));
        wArray[(int)((long)841573684 ^ (long)841573691)] = 8Y.0(((Settings)object).followOffsetDistance, 8Y.b((int)((long)1119891789 ^ (long)-1119882799), (int)((long)-993652002 ^ (long)993633804)), 8Y.b((int)((long)-1418395715 ^ (long)1418411827), (int)((long)-517347581 ^ (long)-517367536)), 0.0, 10.0);
        wArray[(int)((long)-345481590 ^ (long)-345481574)] = 8Y.0(((Settings)object).followOffsetDirection, 8Y.b((int)((long)757608772 ^ (long)-757599779), (int)((long)-1746603664 ^ (long)-1746604422)), 8Y.b((int)((long)-151096443 ^ (long)151106308), (int)((long)679746794 ^ (long)679754862)), 0.0f, 360.0f);
        wArray[(int)((long)475509093 ^ (long)475509108)] = 8Y.1(((Settings)object).renderGoalIgnoreDepth, 8Y.b((int)((long)309387676 ^ (long)-309386998), (int)((long)1325899010 ^ (long)-1325914160)), 8Y.b((int)((long)386299246 ^ (long)-386288141), (int)((long)-1856665219 ^ (long)1856646280)));
        wArray[(int)((long)-1154553233 ^ (long)-1154553219)] = 8Y.1(((Settings)object).renderPathIgnoreDepth, 8Y.b((int)((long)1648056008 ^ (long)-1648060815), (int)((long)71908844 ^ (long)71893945)), 8Y.b((int)((long)-51353360 ^ (long)51357779), (int)((long)2003736907 ^ (long)-2003736644)));
        wArray[(int)((long)186827959 ^ (long)186827940)] = 8Y.0(((Settings)object).colorCurrentPath, 8Y.b((int)((long)1392182020 ^ (long)-1392196735), (int)((long)1146183274 ^ (long)1146176089)), 8Y.b((int)((long)1822939608 ^ (long)-1822942856), (int)((long)1603763751 ^ (long)-1603740626)));
        wArray[(int)((long)2101262319 ^ (long)2101262331)] = 8Y.0(((Settings)object).colorNextPath, 8Y.b((int)((long)-2124401452 ^ (long)2124411987), (int)((long)-1573073499 ^ (long)-1573061625)), 8Y.b((int)((long)830814821 ^ (long)-830801187), (int)((long)-552081381 ^ (long)-552083356)));
        wArray[(int)((long)-710763385 ^ (long)-710763374)] = 8Y.0(((Settings)object).colorBlocksToBreak, 8Y.b((int)((long)655786946 ^ (long)-655801513), (int)((long)-667487503 ^ (long)-667487907)), 8Y.b((int)((long)1840253830 ^ (long)-1840264425), (int)((long)-816609292 ^ (long)-816588574)));
        wArray[(int)((long)-1079349797 ^ (long)-1079349811)] = 8Y.0(((Settings)object).colorBlocksToPlace, 8Y.b((int)((long)-1335295588 ^ (long)1335279883), (int)((long)-628875017 ^ (long)628874108)), 8Y.b((int)((long)-457435836 ^ (long)457430523), (int)((long)-280868874 ^ (long)280861538)));
        wArray[(int)((long)117837414 ^ (long)117837425)] = 8Y.0(((Settings)object).colorBlocksToWalkInto, 8Y.b((int)((long)-1816442164 ^ (long)1816431191), (int)((long)-185042264 ^ (long)185052598)), 8Y.b((int)((long)-1002140022 ^ (long)1002130945), (int)((long)-246253393 ^ (long)246266274)));
        wArray[(int)((long)1879170019 ^ (long)1879170043)] = 8Y.0(((Settings)object).colorBestPathSoFar, 8Y.b((int)((long)-256813 ^ (long)251002), (int)((long)-1694253530 ^ (long)1694251307)), 8Y.b((int)((long)254810080 ^ (long)-254814392), (int)((long)1184725083 ^ (long)-1184715104)));
        wArray[(int)((long)1713751712 ^ (long)1713751737)] = 8Y.0(((Settings)object).colorMostRecentConsidered, 8Y.b((int)((long)-1256454909 ^ (long)1256441264), (int)((long)639027498 ^ (long)-639020056)), 8Y.b((int)((long)-495747258 ^ (long)495763433), (int)((long)-1931759635 ^ (long)1931760785)));
        wArray[(int)((long)1540951102 ^ (long)1540951076)] = 8Y.0(((Settings)object).colorGoalBox, 8Y.b((int)((long)1917142648 ^ (long)-1917155642), (int)((long)-1394700248 ^ (long)-1394702956)), 8Y.b((int)((long)297627117 ^ (long)-297620110), (int)((long)1281944500 ^ (long)-1281949661)));
        Arrays.asList(wArray).forEach(this::0);
        BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().registerEventListener(this);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void onPathEvent(PathEvent pathEvent) {
        boolean bl2;
        block12: {
            int n2;
            int n3;
            block10: {
                int n4;
                block9: {
                    String[] stringArray;
                    block11: {
                        bl2 = \u2004\u2001\u2006\u200d;
                        if (bl2) return;
                        stringArray = 7b.0();
                        if (bl2) return;
                        if (bl2) return;
                        if (8Y.2.h == null) {
                            if (bl2) return;
                            if (bl2) return;
                            return;
                        }
                        if (bl2) return;
                        if (pathEvent == PathEvent.CALC_FINISHED_NOW_EXECUTING) break block11;
                        if (bl2) return;
                        if (pathEvent != PathEvent.CALC_FAILED) break block12;
                        if (bl2) return;
                    }
                    if (bl2) return;
                    pathEvent = 8Y.2.h.bv.a;
                    if (bl2) return;
                    if (bl2) return;
                    n4 = (int)((long)-2038418753 ^ (long)-2038418753);
                    if (bl2) return;
                    n3 = (int)((long)-1318377627 ^ (long)-1318377627);
                    if (bl2) return;
                    if (bl2) return;
                    int n5 = (int)((long)-732364663 ^ (long)-732364663);
                    if (bl2) return;
                    do {
                        if (bl2) return;
                        if (n5 >= pathEvent.size()) break block9;
                        if (bl2) return;
                        if (bl2) return;
                        n2 = ((List)BaritoneAPI.getSettings().acceptableThrowawayItems.value).contains(((aip)pathEvent.get(n5)).c()) ? 1 : 0;
                        if (stringArray == null) break block10;
                        if (n2 != 0) {
                            if (bl2) return;
                            if (bl2) return;
                            if (n5 < (int)((long)-973466466 ^ (long)-973466473)) {
                                if (bl2) return;
                                n4 = (int)((long)1496104733 ^ (long)1496104732);
                                if (bl2) return;
                            }
                            if (bl2) return;
                            if (n5 >= (int)((long)1860964986 ^ (long)1860964979)) {
                                if (bl2) return;
                                n3 = (int)((long)-1677850059 ^ (long)-1677850060);
                                if (bl2) return;
                            }
                        }
                        if (bl2) return;
                        ++n5;
                        if (bl2) return;
                    } while (stringArray != null);
                    if (bl2) return;
                }
                if (bl2) return;
                n2 = n4;
            }
            if (n2 == 0) {
                if (bl2) return;
                if (n3 != 0) {
                    if (bl2) return;
                    if (((Boolean)BaritoneAPI.getSettings().allowPlace.value).booleanValue()) {
                        if (bl2) return;
                        if (bl2) return;
                        a[] aArray = new a[(int)((long)-907183835 ^ (long)-907183836)];
                        aArray[(int)((long)1602264829 ^ (long)1602264829)] = a.m;
                        1C.0(new 3i().0((String)8Y.b((int)((int)((long)988197560 ^ (long)-988188107)), (int)((int)((long)-1987048572 ^ (long)-1987020024))), (a[])aArray).0);
                        if (bl2) return;
                    }
                }
            }
        }
        if (bl2) return;
    }

    public static 0r3 0(Settings$Setting<Color> settings$Setting, String string, String string2) {
        boolean bl2 = \u2004\u2001\u2006\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return new 0r3(settings$Setting, string, string2);
    }

    public static 0rR<Long> 0(Settings$Setting<Long> settings$Setting, String string, String string2, long l2, long l3) {
        boolean bl2 = \u2004\u2001\u2006\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return new 0rR<Long>(settings$Setting, string, string2, l2, l3, Number::longValue);
    }
}

