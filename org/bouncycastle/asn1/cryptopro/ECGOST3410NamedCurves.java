/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.cryptopro.a;
import org.bouncycastle.asn1.n;
import org.bouncycastle.crypto.i.g;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.i;

public class ECGOST3410NamedCurves {
    private static Hashtable a = new Hashtable();
    private static Hashtable b = new Hashtable();
    private static Hashtable c = new Hashtable();

    public static g a(n n2) {
        return (g)b.get(n2);
    }

    public static Enumeration a() {
        return c.elements();
    }

    public static g a(String object) {
        if ((object = (n)a.get(object)) != null) {
            return (g)b.get(object);
        }
        return null;
    }

    public static String b(n n2) {
        return (String)c.get(n2);
    }

    public static void main(String[] stringArray) {
        System.err.println(new BigInteger(1, f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97")));
    }

    static {
        Object object = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        BigInteger bigInteger = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        Object object2 = object = new i((BigInteger)object, new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"), bigInteger, org.bouncycastle.math.ec.c.b);
        object = new g((d)object2, ((d)object2).a(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612"), false), bigInteger);
        b.put(org.bouncycastle.asn1.cryptopro.a.b, object);
        object = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        bigInteger = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        Object object3 = object = new i((BigInteger)object, new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"), bigInteger, org.bouncycastle.math.ec.c.b);
        object = new g((d)object3, ((d)object3).a(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612"), false), bigInteger);
        b.put(org.bouncycastle.asn1.cryptopro.a.e, object);
        object = new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823193");
        bigInteger = new BigInteger("57896044618658097711785492504343953927102133160255826820068844496087732066703");
        Object object4 = object = new i((BigInteger)object, new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823190"), new BigInteger("28091019353058090096996979000309560759124368558014865957655842872397301267595"), bigInteger, org.bouncycastle.math.ec.c.b);
        object = new g((d)object4, ((d)object4).a(new BigInteger("1"), new BigInteger("28792665814854611296992347458380284135028636778229113005756334730996303888124"), false), bigInteger);
        b.put(org.bouncycastle.asn1.cryptopro.a.c, object);
        object = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        bigInteger = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        Object object5 = object = new i((BigInteger)object, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), bigInteger, org.bouncycastle.math.ec.c.b);
        object = new g((d)object5, ((d)object5).a(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247"), false), bigInteger);
        b.put(org.bouncycastle.asn1.cryptopro.a.f, object);
        object = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        bigInteger = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        Object object6 = object = new i((BigInteger)object, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), bigInteger, org.bouncycastle.math.ec.c.b);
        object = new g((d)object6, ((d)object6).a(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247"), false), bigInteger);
        b.put(org.bouncycastle.asn1.cryptopro.a.d, object);
        object = new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97", 16);
        bigInteger = new BigInteger("400000000000000000000000000000000FD8CDDFC87B6635C115AF556C360C67", 16);
        Object object7 = object = new i((BigInteger)object, new BigInteger("C2173F1513981673AF4892C23035A27CE25E2013BF95AA33B22C656F277E7335", 16), new BigInteger("295F9BAE7428ED9CCC20E7C359A9D41A22FCCD9108E17BF7BA9337A6F8AE9513", 16), bigInteger, org.bouncycastle.math.ec.c.b);
        object = new g((d)object7, ((d)object7).a(new BigInteger("91E38443A5E82C0D880923425712B2BB658B9196932E02C78B2582FE742DAA28", 16), new BigInteger("32879423AB1A0375895786C4BB46E9565FDE0B5344766740AF268ADB32322E5C", 16), false), bigInteger);
        b.put(org.bouncycastle.asn1.g.a.c, object);
        object = new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7", 16);
        bigInteger = new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF27E69532F48D89116FF22B8D4E0560609B4B38ABFAD2B85DCACDB1411F10B275", 16);
        Object object8 = object = new i((BigInteger)object, new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC4", 16), new BigInteger("E8C2505DEDFC86DDC1BD0B2B6667F1DA34B82574761CB0E879BD081CFD0B6265EE3CB090F30D27614CB4574010DA90DD862EF9D4EBEE4761503190785A71C760", 16), bigInteger, org.bouncycastle.math.ec.c.b);
        object = new g((d)object8, ((d)object8).a(new BigInteger("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000003"), new BigInteger("7503CFE87A836AE3A61B8816E25450E6CE5E1C93ACF1ABC1778064FDCBEFA921DF1626BE4FD036E93D75E6A50E3A41E98028FE5FC235F5B889A589CB5215F2A4", 16), false), bigInteger);
        b.put(org.bouncycastle.asn1.g.a.e, object);
        object = new BigInteger("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006F", 16);
        bigInteger = new BigInteger("800000000000000000000000000000000000000000000000000000000000000149A1EC142565A545ACFDB77BD9D40CFA8B996712101BEA0EC6346C54374F25BD", 16);
        Object object9 = object = new i((BigInteger)object, new BigInteger("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006C", 16), new BigInteger("687D1B459DC841457E3E06CF6F5E2517B97C7D614AF138BCBF85DC806C4B289F3E965D2DB1416D217F8B276FAD1AB69C50F78BEE1FA3106EFB8CCBC7C5140116", 16), bigInteger, org.bouncycastle.math.ec.c.b);
        object = new g((d)object9, ((d)object9).a(new BigInteger("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002"), new BigInteger("1A8F7EDA389B094C2C071E3647A8940F3C123B697578C213BE6DD9E6C8EC7335DCB228FD1EDF4A39152CBCAAF8C0398828041055F94CEEEC7E21340780FE41BD", 16), false), bigInteger);
        b.put(org.bouncycastle.asn1.g.a.f, object);
        object = new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7", 16);
        bigInteger = new BigInteger("3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC98CDBA46506AB004C33A9FF5147502CC8EDA9E7A769A12694623CEF47F023ED", 16);
        Object object10 = object = new i((BigInteger)object, new BigInteger("DC9203E514A721875485A529D2C722FB187BC8980EB866644DE41C68E143064546E861C0E2C9EDD92ADE71F46FCF50FF2AD97F951FDA9F2A2EB6546F39689BD3", 16), new BigInteger("B4C4EE28CEBC6C2C8AC12952CF37F16AC7EFB6A9F69F4B57FFDA2E4F0DE5ADE038CBC2FFF719D2C18DE0284B8BFEF3B52B8CC7A5F5BF0A3C8D2319A5312557E1", 16), bigInteger, org.bouncycastle.math.ec.c.b);
        object = new g((d)object10, ((d)object10).a(new BigInteger("E2E31EDFC23DE7BDEBE241CE593EF5DE2295B7A9CBAEF021D385F7074CEA043AA27272A7AE602BF2A7B9033DB9ED3610C6FB85487EAE97AAC5BC7928C1950148", 16), new BigInteger("F5CE40D95B5EB899ABBCCFF5911CB8577939804D6527378B8C108C3D2090FF9BE18E2D33E3021ED2EF32D85822423B6304F726AA854BAE07D0396E9A9ADDC40F", 16), false), bigInteger);
        b.put(org.bouncycastle.asn1.g.a.g, object);
        a.put("GostR3410-2001-CryptoPro-A", org.bouncycastle.asn1.cryptopro.a.b);
        a.put("GostR3410-2001-CryptoPro-B", org.bouncycastle.asn1.cryptopro.a.c);
        a.put("GostR3410-2001-CryptoPro-C", org.bouncycastle.asn1.cryptopro.a.d);
        a.put("GostR3410-2001-CryptoPro-XchA", org.bouncycastle.asn1.cryptopro.a.e);
        a.put("GostR3410-2001-CryptoPro-XchB", org.bouncycastle.asn1.cryptopro.a.f);
        a.put("Tc26-Gost-3410-12-256-paramSetA", org.bouncycastle.asn1.g.a.c);
        a.put("Tc26-Gost-3410-12-512-paramSetA", org.bouncycastle.asn1.g.a.e);
        a.put("Tc26-Gost-3410-12-512-paramSetB", org.bouncycastle.asn1.g.a.f);
        a.put("Tc26-Gost-3410-12-512-paramSetC", org.bouncycastle.asn1.g.a.g);
        c.put(org.bouncycastle.asn1.cryptopro.a.b, "GostR3410-2001-CryptoPro-A");
        c.put(org.bouncycastle.asn1.cryptopro.a.c, "GostR3410-2001-CryptoPro-B");
        c.put(org.bouncycastle.asn1.cryptopro.a.d, "GostR3410-2001-CryptoPro-C");
        c.put(org.bouncycastle.asn1.cryptopro.a.e, "GostR3410-2001-CryptoPro-XchA");
        c.put(org.bouncycastle.asn1.cryptopro.a.f, "GostR3410-2001-CryptoPro-XchB");
        c.put(org.bouncycastle.asn1.g.a.c, "Tc26-Gost-3410-12-256-paramSetA");
        c.put(org.bouncycastle.asn1.g.a.e, "Tc26-Gost-3410-12-512-paramSetA");
        c.put(org.bouncycastle.asn1.g.a.f, "Tc26-Gost-3410-12-512-paramSetB");
        c.put(org.bouncycastle.asn1.g.a.g, "Tc26-Gost-3410-12-512-paramSetC");
    }
}

