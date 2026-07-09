/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import net.impactclient.2V;
import net.impactclient.3K;
import net.impactclient.7Y;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 7e<T extends 7Y>
implements 3K<T> {
    private final float 0;
    private final 2V<T> 2;
    private int 3;
    public static final boolean \u2008;
    protected final List<T> 1;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(int n2, int n3) {
        block3: {
            block2: {
                boolean bl2 = \u2008;
                if (bl2 || bl2) break block2;
                this.1.clear();
                if (bl2 || bl2) break block2;
                n2 *= n3;
                if (bl2 || bl2) break block2;
                this.3 = (int)((float)n2 / 3000.0f);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3) {
        block8: {
            boolean bl2 = \u2008;
            if (!bl2 && !bl2) {
                List list = this.1.stream().filter(7Y::0).collect(Collectors.toList());
                if (!bl2 && !bl2) {
                    this.1.clear();
                    if (!bl2 && !bl2) {
                        this.1.addAll(list);
                        if (!bl2 && !bl2) {
                            this.2.0(this.1, n2, n3);
                            if (!bl2) {
                                7e e2 = this;
                                String[] stringArray = 7b.0();
                                if (!bl2) {
                                    while (!bl2) {
                                        if (e2.1.size() < e2.3) {
                                            if (bl2 || bl2) break;
                                            e2.3();
                                            if (bl2) break;
                                            if (stringArray != null) continue;
                                            if (bl2) break;
                                        }
                                        if (!bl2) break block8;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @Override
    public final 2V<T> 4() {
        boolean bl2 = \u2008;
        if (bl2 || bl2) {
            return null;
        }
        return this.2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 7e(2V<T> v2) {
        block3: {
            block2: {
                boolean bl2 = \u2008;
                if (bl2 || bl2) break block2;
                this.1 = new ArrayList<T>();
                if (bl2 || bl2) break block2;
                this.2 = v2;
                if (bl2 || bl2) break block2;
                this.0 = 1.0f;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

