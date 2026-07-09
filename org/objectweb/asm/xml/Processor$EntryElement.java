/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.xml;

import java.io.IOException;
import java.io.OutputStream;

interface Processor$EntryElement {
    public OutputStream openEntry(String var1) throws IOException;

    public void closeEntry() throws IOException;
}

