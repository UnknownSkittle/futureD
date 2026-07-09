/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.zero.alpine.event;

public interface ICancellable {
    public void cancel();

    public boolean isCancelled();
}

