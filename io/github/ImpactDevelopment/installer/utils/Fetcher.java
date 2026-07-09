/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.utils;

import io.github.ImpactDevelopment.installer.utils.Fetcher$1;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.commons.b.b;

public class Fetcher {
    public static String fetch(String string) {
        return new String(Fetcher.fetchBytes(string), StandardCharsets.UTF_8);
    }

    /*
     * Loose catch block
     */
    public static byte[] fetchBytes(String string) {
        System.out.println("DOWNLOADING ".concat(String.valueOf(string)));
        try {
            return b.a(new URI(string));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            SSLSocketFactory sSLSocketFactory = HttpsURLConnection.getDefaultSSLSocketFactory();
            HostnameVerifier hostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            String string2 = System.getProperty("java.net.preferIPv4Stack");
            System.out.println("Trying some hacks to get this to load!");
            System.setProperty("java.net.preferIPv4Stack", "true");
            byte[] byArray = b.a(new URI(string));
            System.out.println("Undoing hacks!");
            System.setProperty("java.net.preferIPv4Stack", string2);
            try {
                HttpsURLConnection.setDefaultSSLSocketFactory(sSLSocketFactory);
                HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
            } catch (Throwable throwable2) {
                System.out.println("Unable to restore https! This could actually be a problem!");
            }
            return byArray;
            {
                catch (Throwable throwable3) {
                    throwable3.printStackTrace();
                    Fetcher.disableHTTPSPart1();
                    byte[] byArray2 = b.a(new URI(string));
                    System.out.println("Undoing hacks!");
                    System.setProperty("java.net.preferIPv4Stack", string2);
                    try {
                        HttpsURLConnection.setDefaultSSLSocketFactory(sSLSocketFactory);
                        HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
                    } catch (Throwable throwable4) {
                        System.out.println("Unable to restore https! This could actually be a problem!");
                    }
                    return byArray2;
                    {
                        catch (Throwable throwable5) {
                            throwable5.printStackTrace();
                            Fetcher.disableHTTPSPart2();
                            byte[] byArray3 = b.a(new URI(string));
                            System.out.println("Undoing hacks!");
                            System.setProperty("java.net.preferIPv4Stack", string2);
                            try {
                                HttpsURLConnection.setDefaultSSLSocketFactory(sSLSocketFactory);
                                HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
                            } catch (Throwable throwable6) {
                                System.out.println("Unable to restore https! This could actually be a problem!");
                            }
                            return byArray3;
                            {
                                catch (Throwable throwable7) {
                                    try {
                                        try {
                                            Throwable throwable8 = throwable7;
                                            throwable7.printStackTrace();
                                            throw new RuntimeException("Unable to fetch ".concat(String.valueOf(string)), throwable8);
                                        } catch (KeyManagementException | NoSuchAlgorithmException generalSecurityException) {
                                            throw new RuntimeException(generalSecurityException);
                                        }
                                    } catch (Throwable throwable9) {
                                        System.out.println("Undoing hacks!");
                                        System.setProperty("java.net.preferIPv4Stack", string2);
                                        try {
                                            HttpsURLConnection.setDefaultSSLSocketFactory(sSLSocketFactory);
                                            HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
                                        } catch (Throwable throwable10) {
                                            System.out.println("Unable to restore https! This could actually be a problem!");
                                        }
                                        throw throwable9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void disableHTTPSPart1() {
        TrustManager[] trustManagerArray = new TrustManager[]{new Fetcher$1()};
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        sSLContext.init(null, trustManagerArray, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
    }

    public static void disableHTTPSPart2() {
        HttpsURLConnection.setDefaultHostnameVerifier((string, sSLSession) -> true);
    }
}

