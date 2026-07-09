/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static <K> List<K> newArrayList() {
        return new ArrayList();
    }

    public static <K> List<K> newArrayList(Collection<K> collection) {
        return new ArrayList<K>(collection);
    }

    public static <K> List<K> newArrayList(K ... KArray) {
        return new ArrayList<K>(Arrays.asList(KArray));
    }

    public static <K> List<K> newArrayList(int n2) {
        return new ArrayList(n2);
    }

    public static <K> LinkedList<K> newLinkedList() {
        return new LinkedList();
    }

    public static <K> LinkedList<K> newLinkedList(Collection<K> collection) {
        return new LinkedList<K>(collection);
    }
}

