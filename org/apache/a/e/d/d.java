/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.d;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.apache.a.e.d.a;
import org.apache.a.e.d.c;

public final class d {
    public static List<c> a(Reader reader) {
        String string;
        ArrayList<c> arrayList = new ArrayList<c>(2);
        reader = new BufferedReader(reader);
        new StringBuilder(256);
        a a2 = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        while ((string = ((BufferedReader)reader).readLine()) != null) {
            boolean bl2;
            if (string.isEmpty()) continue;
            if (string.startsWith("//")) {
                if (a2 == null) {
                    if (string.contains("===BEGIN ICANN DOMAINS===")) {
                        a2 = a.b;
                        continue;
                    }
                    if (!string.contains("===BEGIN PRIVATE DOMAINS===")) continue;
                    a2 = a.c;
                    continue;
                }
                if (!string.contains("===END ICANN DOMAINS===") && !string.contains("===END PRIVATE DOMAINS===")) continue;
                if (arrayList2 != null) {
                    arrayList.add(new c(a2, arrayList2, arrayList3));
                }
                a2 = null;
                arrayList2 = null;
                arrayList3 = null;
                continue;
            }
            if (a2 == null) continue;
            if (string.startsWith(".")) {
                string = string.substring(1);
            }
            if (bl2 = string.startsWith("!")) {
                string = string.substring(1);
            }
            if (bl2) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<String>();
                }
                arrayList3.add(string);
                continue;
            }
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<String>();
            }
            arrayList2.add(string);
        }
        return arrayList;
    }
}

