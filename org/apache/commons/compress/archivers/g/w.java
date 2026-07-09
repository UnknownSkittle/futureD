/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.g.ai;
import org.apache.commons.compress.archivers.g.aw;
import org.apache.commons.compress.archivers.g.x;

public final class w
extends ZipException {
    private final x a;
    private final transient ai b;

    public w(x x2, ai ai2) {
        super("unsupported feature " + x2 + " used in entry " + ai2.getName());
        this.a = x2;
        this.b = ai2;
    }

    public w(aw aw2, ai ai2) {
        super("unsupported feature method '" + aw2.name() + "' used in entry " + ai2.getName());
        this.a = x.b;
        this.b = ai2;
    }

    public w(x x2) {
        super("unsupported feature " + x2 + " used in archive.");
        this.a = x2;
        this.b = null;
    }
}

