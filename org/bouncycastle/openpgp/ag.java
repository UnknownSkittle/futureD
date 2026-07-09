/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.b.ad;
import org.bouncycastle.b.ae;
import org.bouncycastle.b.af;
import org.bouncycastle.b.ar;
import org.bouncycastle.b.c;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k;
import org.bouncycastle.b.r;
import org.bouncycastle.openpgp.aa;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.ak;
import org.bouncycastle.openpgp.ao;
import org.bouncycastle.openpgp.b.d;
import org.bouncycastle.openpgp.b.e;
import org.bouncycastle.openpgp.b.g;
import org.bouncycastle.openpgp.b.o;
import org.bouncycastle.openpgp.m;

public final class ag {
    private af b;
    ab a;

    public ag(af af2, ab ab2) {
        this.b = af2;
        this.a = ab2;
    }

    ag(aa aa2, ab ab2, o o2, e e2) {
        this(aa2, ab2, o2, false, e2);
    }

    private ag(aa aa2, ab ab2, o o2, boolean bl2, e e2) {
        this.a = ab2;
        this.b = ag.a(bl2, aa2, ab2, e2, o2);
    }

    private static af a(boolean bl2, aa object, ab ab2, e object2, o o2) {
        if ((object = (f)((Object)((aa)object).c())) == null) {
            if (bl2) {
                return new af(ab2.a, 0, new byte[0]);
            }
            return new org.bouncycastle.b.ag(ab2.a, 0, new byte[0]);
        }
        try {
            Object object3 = new ByteArrayOutputStream();
            org.bouncycastle.b.g g2 = new org.bouncycastle.b.g((OutputStream)object3);
            Object object4 = object;
            object = g2;
            ((f)object4).a((org.bouncycastle.b.g)object);
            object = ((ByteArrayOutputStream)object3).toByteArray();
            int n2 = object2 != null ? ((e)object2).a() : 0;
            if (n2 != 0) {
                int n3;
                Object object5 = object;
                g2.write(ag.a(o2, (byte[])object5, ((Object)object5).length));
                Object object6 = object = (Object)((ByteArrayOutputStream)object3).toByteArray();
                object = ((e)object2).a((byte[])object6, ((Object)object6).length);
                object3 = ((e)object2).c();
                object2 = ((e)object2).b();
                if (o2 != null) {
                    if (o2.a() != 2) {
                        throw new m("only SHA1 supported for key checksum calculations.");
                    }
                    n3 = 254;
                } else {
                    n3 = 255;
                }
                if (bl2) {
                    return new af(ab2.a, n2, n3, (ae)object2, (byte[])object3, (byte[])object);
                }
                return new org.bouncycastle.b.ag(ab2.a, n2, n3, (ae)object2, (byte[])object3, (byte[])object);
            }
            Object object7 = object;
            g2.write(ag.a(null, (byte[])object7, ((Object)object7).length));
            if (bl2) {
                return new af(ab2.a, n2, ((ByteArrayOutputStream)object3).toByteArray());
            }
            return new org.bouncycastle.b.ag(ab2.a, n2, ((ByteArrayOutputStream)object3).toByteArray());
        } catch (m m2) {
            throw m2;
        } catch (Exception exception) {
            throw new m("Exception encrypting key", exception);
        }
    }

    public ag(int n2, org.bouncycastle.openpgp.o o2, String string, o o3, g g2, e e2) {
        this(o2.b(), ag.a(n2, o2, string, g2), o3, true, e2);
    }

    private static ab a(int n2, org.bouncycastle.openpgp.o object, String object2, g list) {
        try {
            list = new ak((g)((Object)list));
        } catch (Exception exception) {
            throw new m("creating signature generator: ".concat(String.valueOf(exception)), exception);
        }
        ((ak)((Object)list)).a(n2, ((org.bouncycastle.openpgp.o)object).b());
        ((ak)((Object)list)).a(null);
        ((ak)((Object)list)).a();
        try {
            Object object3 = ((ak)((Object)list)).a((String)object2, ((org.bouncycastle.openpgp.o)object).a());
            ab ab2 = ((org.bouncycastle.openpgp.o)object).a();
            String string = object2;
            object2 = object3;
            object = string;
            object = new ar((String)object);
            object3 = ab2;
            object3 = new ab((ab)object3);
            list = null;
            for (int i2 = 0; i2 != ((ab)object3).d.size(); ++i2) {
                if (!object.equals(((ab)object3).d.get(i2))) continue;
                list = (List)((ab)object3).f.get(i2);
            }
            if (list != null) {
                list.add(object2);
            } else {
                list = new ArrayList<Object>();
                list.add(object2);
                ((ab)object3).d.add(object);
                ((ab)object3).e.add(null);
                ((ab)object3).f.add(list);
            }
            return object3;
        } catch (Exception exception) {
            throw new m("exception doing certification: ".concat(String.valueOf(exception)), exception);
        }
    }

    public final boolean a() {
        int n2 = this.a.a.b();
        return n2 == 1 || n2 == 3 || n2 == 17 || n2 == 19 || n2 == 20;
    }

    public final ab b() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private byte[] b(d d2) {
        byte[] byArray = this.b.f();
        if (this.b.a() == 0) return byArray;
        try {
            int n2;
            int n3;
            byte[] byArray2;
            if (this.b.e().a() == 4) {
                byte[] byArray3 = d2.a(this.b.a(), this.b.d());
                byArray2 = d2.a(this.b.a(), byArray3, this.b.c(), byArray, 0, byArray.length);
                boolean bl2 = this.b.b() == 254;
                byte[] byArray4 = ag.a(bl2 ? d2.a() : null, byArray2, bl2 ? byArray2.length - 20 : byArray2.length - 2);
                int n4 = 0;
                while (n4 != byArray4.length) {
                    if (byArray4[n4] != byArray2[byArray2.length - byArray4.length + n4]) {
                        throw new m("checksum mismatch at " + n4 + " of " + byArray4.length);
                    }
                    ++n4;
                }
                return byArray2;
            }
            byte[] byArray5 = d2.a(this.b.a(), this.b.d());
            byArray2 = new byte[byArray.length];
            byte[] byArray6 = new byte[this.b.c().length];
            System.arraycopy(this.b.c(), 0, byArray6, 0, byArray6.length);
            int n5 = 0;
            for (n3 = 0; n3 != 4; ++n3) {
                n2 = ((byArray[n5] << 8 | byArray[n5 + 1] & 0xFF) + 7) / 8;
                byArray2[n5] = byArray[n5];
                byArray2[n5 + 1] = byArray[n5 + 1];
                byte[] byArray7 = d2.a(this.b.a(), byArray5, byArray6, byArray, n5 + 2, n2);
                System.arraycopy(byArray7, 0, byArray2, n5 + 2, byArray7.length);
                n5 += n2 + 2;
                if (n3 == 3) continue;
                System.arraycopy(byArray, n5 - byArray6.length, byArray6, 0, byArray6.length);
            }
            byArray2[n5] = byArray[n5];
            byArray2[n5 + 1] = byArray[n5 + 1];
            n3 = byArray[n5] << 8 & 0xFF00 | byArray[n5 + 1] & 0xFF;
            n2 = 0;
            for (int i2 = 0; i2 < byArray2.length - 2; ++i2) {
                n2 += byArray2[i2] & 0xFF;
            }
            if ((n2 &= 0xFFFF) == n3) return byArray2;
            throw new m("checksum mismatch: passphrase wrong, expected " + Integer.toHexString(n3) + " found " + Integer.toHexString(n2));
        } catch (m m2) {
            throw m2;
        } catch (Exception exception) {
            throw new m("Exception decrypting key", exception);
        }
    }

    public final aa a(d object) {
        Object object2 = this.b.f();
        if (object2 == null || ((byte[])object2).length <= 0) {
            return null;
        }
        object2 = this.b.e();
        try {
            object = this.b((d)object);
            object = new c(new ByteArrayInputStream((byte[])object));
            switch (object2.b()) {
                case 1: 
                case 2: 
                case 3: {
                    object = new ad((c)object);
                    return new aa(this.a.a(), (org.bouncycastle.b.aa)object2, (org.bouncycastle.b.e)object);
                }
                case 17: {
                    object = new k((c)object);
                    return new aa(this.a.a(), (org.bouncycastle.b.aa)object2, (org.bouncycastle.b.e)object);
                }
                case 16: 
                case 20: {
                    object = new r((c)object);
                    return new aa(this.a.a(), (org.bouncycastle.b.aa)object2, (org.bouncycastle.b.e)object);
                }
                case 18: 
                case 19: {
                    object = new org.bouncycastle.b.o((c)object);
                    return new aa(this.a.a(), (org.bouncycastle.b.aa)object2, (org.bouncycastle.b.e)object);
                }
            }
            throw new m("unknown public key algorithm encountered");
        } catch (m m2) {
            throw m2;
        } catch (Exception exception) {
            throw new m("Exception constructing key", exception);
        }
    }

    private static byte[] a(o o2, byte[] byArray, int n2) {
        if (o2 != null) {
            OutputStream outputStream = o2.b();
            try {
                outputStream.write(byArray, 0, n2);
                outputStream.close();
            } catch (Exception exception) {
                throw new m("checksum digest calculation failed: " + exception.getMessage(), exception);
            }
            return o2.c();
        }
        int n3 = 0;
        for (int i2 = 0; i2 != n2; ++i2) {
            n3 += byArray[i2] & 0xFF;
        }
        byte[] byArray2 = new byte[2];
        byte[] byArray3 = byArray2;
        byArray2[0] = (byte)(n3 >> 8);
        byArray3[1] = (byte)n3;
        return byArray3;
    }

    public final void a(OutputStream outputStream) {
        outputStream = outputStream instanceof org.bouncycastle.b.g ? (org.bouncycastle.b.g)outputStream : new org.bouncycastle.b.g(outputStream);
        Object object = this.b;
        Object object2 = outputStream;
        ((i)object).a((org.bouncycastle.b.g)object2);
        if (this.a.b != null) {
            object = this.a.b;
            object2 = outputStream;
            ((i)object).a((org.bouncycastle.b.g)object2);
        }
        if (this.a.g == null) {
            int n2;
            for (n2 = 0; n2 != this.a.c.size(); ++n2) {
                ((aj)this.a.c.get(n2)).a(outputStream);
            }
            for (n2 = 0; n2 != this.a.d.size(); ++n2) {
                if (this.a.d.get(n2) instanceof ar) {
                    object = object2 = (ar)this.a.d.get(n2);
                    object2 = outputStream;
                    ((i)object).a((org.bouncycastle.b.g)object2);
                } else {
                    object2 = (ao)this.a.d.get(n2);
                    object = new org.bouncycastle.b.ao(((ao)object2).a);
                    object2 = outputStream;
                    ((i)object).a((org.bouncycastle.b.g)object2);
                }
                if (this.a.e.get(n2) != null) {
                    object = (i)this.a.e.get(n2);
                    object2 = outputStream;
                    ((i)object).a((org.bouncycastle.b.g)object2);
                }
                object2 = (ArrayList)this.a.f.get(n2);
                for (int i2 = 0; i2 != object2.size(); ++i2) {
                    ((aj)object2.get(i2)).a(outputStream);
                }
            }
            return;
        }
        for (int i3 = 0; i3 != this.a.g.size(); ++i3) {
            ((aj)this.a.g.get(i3)).a(outputStream);
        }
    }
}

