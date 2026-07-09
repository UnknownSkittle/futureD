/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.c;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.apache.a.e.c.e;
import org.apache.a.e.c.f;
import org.apache.a.e.c.j;
import org.apache.a.e.d.a;
import org.apache.a.e.d.b;
import org.apache.commons.c.c;

public final class d
implements HostnameVerifier {
    private final org.apache.commons.c.a a = c.b(this.getClass());
    private final org.apache.a.e.d.e b;

    public d(org.apache.a.e.d.e e2) {
        this.b = e2;
    }

    public d() {
        this(null);
    }

    @Override
    public final boolean verify(String object, SSLSession object2) {
        try {
            block16: {
                Object object3;
                f f2;
                Object object4 = object2 = (X509Certificate)object2.getPeerCertificates()[0];
                object2 = object;
                object = this;
                Object object5 = object2;
                if (org.apache.a.e.d.b.a((String)object5)) {
                    f2 = f.a;
                } else {
                    object3 = object5;
                    if (((String)object3).startsWith("[") && ((String)object3).endsWith("]")) {
                        object3 = ((String)object5).substring(1, ((String)object5).length() - 1);
                    }
                    f2 = org.apache.a.e.d.b.b(object3) ? f.b : f.c;
                }
                object5 = f2;
                object3 = d.a((X509Certificate)object4);
                if (object3 != null && !object3.isEmpty()) {
                    switch (e.a[((Enum)object5).ordinal()]) {
                        case 1: {
                            object5 = object2;
                            for (int i2 = 0; i2 < object3.size(); ++i2) {
                                object2 = (j)object3.get(i2);
                                if (((j)object2).a() != 7 || !((String)object5).equals(((j)object2).b())) {
                                    continue;
                                }
                                break block16;
                            }
                            throw new SSLPeerUnverifiedException("Certificate for <" + (String)object5 + "> doesn't match any of the subject alternative names: " + object3);
                        }
                        case 2: {
                            d.a(object2, object3);
                            break;
                        }
                        default: {
                            d.a(object2, object3, ((d)object).b);
                            break;
                        }
                    }
                } else {
                    if ((object4 = d.a(((X509Certificate)object4).getSubjectX500Principal().getName("RFC2253"))) == null) {
                        throw new SSLException("Certificate subject for <" + object2 + "> doesn't contain a common name and does not have alternative names");
                    }
                    object = ((d)object).b;
                    object3 = object4;
                    object5 = object2;
                    if (!d.a((String)(object2 = ((String)object5).toLowerCase(Locale.ROOT)), (String)(object4 = ((String)object3).toLowerCase(Locale.ROOT)), (org.apache.a.e.d.e)object)) {
                        throw new SSLPeerUnverifiedException("Certificate for <" + (String)object5 + "> doesn't match common name of the certificate subject: " + (String)object3);
                    }
                }
            }
            return true;
        } catch (SSLException sSLException) {
            if (this.a.a()) {
                this.a.a(sSLException.getMessage(), sSLException);
            }
            return false;
        }
    }

    private static void a(String string, List<j> list) {
        String string2 = d.b(string);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Object object = list.get(i2);
            if (((j)object).a() != 7 || !string2.equals(object = d.b(((j)object).b()))) continue;
            return;
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + string + "> doesn't match any of the subject alternative names: " + list);
    }

    private static void a(String string, List<j> list, org.apache.a.e.d.e e2) {
        String string2 = string.toLowerCase(Locale.ROOT);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Object object = list.get(i2);
            if (((j)object).a() != 2 || !d.a(string2, (String)(object = ((j)object).b().toLowerCase(Locale.ROOT)), e2)) continue;
            return;
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + string + "> doesn't match any of the subject alternative names: " + list);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(String string, String string2, org.apache.a.e.d.e object) {
        int n2;
        String string3;
        if (object != null && string.contains(".")) {
            string3 = ((org.apache.a.e.d.e)object).a(string2, org.apache.a.e.d.a.b);
            object = string;
            if (string3 == null) return false;
            if (!((String)object).endsWith(string3)) return false;
            if (((String)object).length() != string3.length()) {
                Object object2 = object;
                if (((String)object2).charAt(((String)object2).length() - string3.length() - 1) != '.') return false;
            }
            boolean bl2 = true;
            if (!bl2) {
                return false;
            }
        }
        if ((n2 = string2.indexOf(42)) == -1) return string.equalsIgnoreCase(string2);
        string3 = string2.substring(0, n2);
        string2 = string2.substring(n2 + 1);
        if (!string3.isEmpty() && !string.startsWith(string3)) {
            return false;
        }
        if (!string2.isEmpty() && !string.endsWith(string2)) {
            return false;
        }
        if (!string.substring(string3.length(), string.length() - string2.length()).contains(".")) return true;
        return false;
    }

    static String a(String string) {
        if (string == null) {
            return null;
        }
        try {
            List<Rdn> list = new LdapName(string).getRdns();
            for (int i2 = list.size() - 1; i2 >= 0; --i2) {
                Object object = list.get(i2).toAttributes().get("cn");
                if (object == null) continue;
                try {
                    object = object.get();
                    if (object == null) continue;
                    return object.toString();
                } catch (NoSuchElementException noSuchElementException) {
                    continue;
                } catch (NamingException namingException) {}
            }
            return null;
        } catch (InvalidNameException invalidNameException) {
            throw new SSLException(string + " is not a valid X500 distinguished name");
        }
    }

    static List<j> a(X509Certificate iterator) {
        try {
            iterator = ((X509Certificate)((Object)iterator)).getSubjectAlternativeNames();
            if (iterator == null) {
                return Collections.emptyList();
            }
            ArrayList<j> arrayList = new ArrayList<j>();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object object = (List)iterator.next();
                Integer n2 = object.size() >= 2 ? (Integer)object.get(0) : null;
                if (n2 == null) continue;
                object = (String)object.get(1);
                arrayList.add(new j((String)object, n2));
            }
            return arrayList;
        } catch (CertificateParsingException certificateParsingException) {
            return Collections.emptyList();
        }
    }

    static String b(String string) {
        if (string == null) {
            return string;
        }
        try {
            return InetAddress.getByName(string).getHostAddress();
        } catch (UnknownHostException unknownHostException) {
            return string;
        }
    }
}

