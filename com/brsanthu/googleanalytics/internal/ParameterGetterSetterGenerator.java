/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.internal;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;

public class ParameterGetterSetterGenerator {
    public static void main(String[] objectArray) {
        for (GoogleAnalyticsParameter googleAnalyticsParameter : (GoogleAnalyticsParameter[])GoogleAnalyticsParameter.class.getEnumConstants()) {
            String string = googleAnalyticsParameter.toString();
            String string2 = "String";
            if (googleAnalyticsParameter.getType().equalsIgnoreCase("integer")) {
                string2 = "Integer";
            } else if (googleAnalyticsParameter.getType().equalsIgnoreCase("boolean")) {
                string2 = "Boolean";
            } else if (googleAnalyticsParameter.getType().equalsIgnoreCase("currency")) {
                string2 = "Double";
            }
            System.out.println("public T " + null + "(" + string2 + " value) {");
            System.out.println("    set" + string2 + "(" + string + ", value);");
            System.out.println("       return (T) this;");
            System.out.println("}");
            System.out.println("public " + string2 + " " + null + "() {");
            System.out.println("    return get" + string2 + "(" + string + ");");
            System.out.println("}");
        }
    }
}

