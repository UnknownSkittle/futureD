/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.ARMOptions
 *  org.tukaani.xz.ARMThumbOptions
 *  org.tukaani.xz.FilterOptions
 *  org.tukaani.xz.IA64Options
 *  org.tukaani.xz.PowerPCOptions
 *  org.tukaani.xz.SPARCOptions
 *  org.tukaani.xz.X86Options
 */
package org.apache.commons.compress.archivers.sevenz;

import java.util.HashMap;
import org.apache.commons.compress.archivers.sevenz.a;
import org.apache.commons.compress.archivers.sevenz.j;
import org.apache.commons.compress.archivers.sevenz.m;
import org.apache.commons.compress.archivers.sevenz.n;
import org.apache.commons.compress.archivers.sevenz.o;
import org.apache.commons.compress.archivers.sevenz.p;
import org.apache.commons.compress.archivers.sevenz.q;
import org.apache.commons.compress.archivers.sevenz.s;
import org.apache.commons.compress.archivers.sevenz.u;
import org.apache.commons.compress.archivers.sevenz.v;
import org.apache.commons.compress.archivers.sevenz.z;
import org.tukaani.xz.ARMOptions;
import org.tukaani.xz.ARMThumbOptions;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.IA64Options;
import org.tukaani.xz.PowerPCOptions;
import org.tukaani.xz.SPARCOptions;
import org.tukaani.xz.X86Options;

final class l
extends HashMap<z, j> {
    l() {
        this.put(z.a, new o());
        this.put(z.b, new v());
        this.put(z.c, new u());
        this.put(z.d, new q());
        this.put(z.e, new p());
        this.put(z.f, new n());
        this.put(z.g, new a());
        this.put(z.h, new m((FilterOptions)new X86Options()));
        this.put(z.i, new m((FilterOptions)new PowerPCOptions()));
        this.put(z.j, new m((FilterOptions)new IA64Options()));
        this.put(z.k, new m((FilterOptions)new ARMOptions()));
        this.put(z.l, new m((FilterOptions)new ARMThumbOptions()));
        this.put(z.m, new m((FilterOptions)new SPARCOptions()));
        this.put(z.n, new s());
    }
}

