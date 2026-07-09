/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.internal;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static <K> Set<K> newHashSet() {
        return new HashSet();
    }

    public static <K> Set<K> newLinkedHashSet() {
        return new LinkedHashSet();
    }
}

