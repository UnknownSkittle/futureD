/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.c;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.apache.a.e.c.d;
import org.apache.a.e.c.j;
import org.apache.a.e.c.k;
import org.apache.a.e.d.b;
import org.apache.commons.c.c;

@Deprecated
public abstract class a
implements k {
    private final org.apache.commons.c.a a = c.b(this.getClass());
    private static String[] b = new String[]{"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};

    @Override
    public final boolean verify(String object, SSLSession object2) {
        try {
            String[] stringArray;
            String[] stringArray2;
            Object object3;
            Object object4 = object2 = (X509Certificate)object2.getPeerCertificates()[0];
            object2 = object;
            object = this;
            Iterator iterator = d.a((X509Certificate)object4);
            ArrayList<String> arrayList = new ArrayList<String>();
            if (org.apache.a.e.d.b.a((String)object2) || org.apache.a.e.d.b.b((String)object2)) {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    object3 = (j)iterator.next();
                    if (((j)object3).a() != 7) continue;
                    arrayList.add(((j)object3).b());
                }
            } else {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    object3 = (j)iterator.next();
                    if (((j)object3).a() != 2) continue;
                    arrayList.add(((j)object3).b());
                }
            }
            if ((object3 = d.a(((X509Certificate)object4).getSubjectX500Principal().getName("RFC2253"))) != null) {
                String[] stringArray3 = new String[1];
                stringArray2 = stringArray3;
                stringArray3[0] = object3;
            } else {
                stringArray2 = null;
            }
            if (!arrayList.isEmpty()) {
                ArrayList<String> arrayList2 = arrayList;
                stringArray = arrayList2.toArray(new String[arrayList2.size()]);
            } else {
                stringArray = null;
            }
            object.a((String)object2, stringArray2, stringArray);
            return true;
        } catch (SSLException sSLException) {
            if (this.a.a()) {
                this.a.a(sSLException.getMessage(), sSLException);
            }
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] object2, String[] stringArray, boolean bl2) {
        void var3_7;
        String string2;
        List list;
        Object object = object2 != null && ((Object)object2).length > 0 ? object2[0] : null;
        list = list != null && ((void)list).length > 0 ? Arrays.asList(list) : null;
        String string3 = string2 = org.apache.a.e.d.b.b(string) ? d.b(string.toLowerCase(Locale.ROOT)) : string;
        if (list != null) {
            for (String string4 : list) {
                String string5 = org.apache.a.e.d.b.b(string4) ? d.b(string4) : string4;
                if (!org.apache.a.e.c.a.a(string2, string5, (boolean)var3_7)) continue;
                return;
            }
            throw new SSLException("Certificate for <" + string + "> doesn't match any of the subject alternative names: " + list);
        }
        if (object != null) {
            Object object3;
            Object object4 = object3 = org.apache.a.e.d.b.b((String)object) ? d.b((String)object) : object;
            if (org.apache.a.e.c.a.a(string2, (String)object3, (boolean)var3_7)) {
                return;
            }
            throw new SSLException("Certificate for <" + string + "> doesn't match common name of the certificate subject: " + (String)object);
        }
        throw new SSLException("Certificate subject for <" + string + "> doesn't contain a common name and does not have alternative names");
    }

    private static boolean a(String string, String string2, boolean bl2) {
        if (string == null) {
            return false;
        }
        string = string.toLowerCase(Locale.ROOT);
        Object object = (string2 = string2.toLowerCase(Locale.ROOT)).split("\\.");
        if (((String[])object).length >= 3 && object[0].endsWith("*") && (!bl2 || org.apache.a.e.c.a.a(object))) {
            boolean bl3;
            if ((object = object[0]).length() > 1) {
                String string3 = object.substring(0, object.length() - 1);
                object = string2.substring(object.length());
                String string4 = string.substring(string3.length());
                bl3 = string.startsWith(string3) && string4.endsWith((String)object);
            } else {
                bl3 = string.endsWith(string2.substring(1));
            }
            return bl3 && (!bl2 || org.apache.a.e.c.a.a(string) == org.apache.a.e.c.a.a(string2));
        }
        return string.equals(string2);
    }

    private static boolean a(String[] stringArray) {
        if (stringArray.length != 3 || stringArray[2].length() != 2) {
            return true;
        }
        return Arrays.binarySearch(b, stringArray[1]) < 0;
    }

    private static int a(String string) {
        int n2 = 0;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (string.charAt(i2) != '.') continue;
            ++n2;
        }
        return n2;
    }

    static {
        Arrays.sort(b);
    }
}

