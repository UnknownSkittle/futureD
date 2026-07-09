/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.1A;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 5u {
    private float[] 0;
    public static final boolean \u2001\u2004\u200e\u2008;

    /*
     * Enabled aggressive block sorting
     */
    public 5u(float f2, float f3) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2004\u200e\u2008;
                if (bl2 || bl2) break block2;
                float[] fArray = new float[(int)((long)-479976520 ^ (long)-479976518)];
                fArray[(int)((long)118775194 ^ (long)118775194)] = f2;
                fArray[(int)((long)133351115 ^ (long)133351114)] = f3;
                this.0 = fArray;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean 0(float f2, float f3, float f4) {
        block12: {
            boolean bl2 = \u2001\u2004\u200e\u2008;
            if (!bl2) {
                float[] fArray = new float[(int)((long)1682169432 ^ (long)1682169434)];
                fArray[(int)((long)-1887546264 ^ (long)-1887546264)] = f2;
                fArray[(int)((long)1425772463 ^ (long)1425772462)] = f3;
                float[] fArray2 = fArray;
                String[] stringArray = 7b.0();
                if (!bl2 && !bl2) {
                    int n2 = (int)((long)-465884868 ^ (long)-465884868);
                    if (bl2) return true;
                    while (!bl2) {
                        float f5;
                        if (n2 < (int)((long)-1330645946 ^ (long)-1330645948)) {
                            if (bl2 || bl2) break;
                            float f6 = fArray2[n2] - this.0[n2];
                            if (bl2 || bl2) break;
                            float f7 = f4 * (Math.abs(f6) + 1.0f) * 2.0f;
                            if (bl2 || bl2) break;
                            float f8 = f6 - 0.0f;
                            f5 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                            if (stringArray != null) {
                                if (f5 > 0) {
                                    if (bl2 || bl2) break;
                                    this.0[n2] = Math.min(fArray2[n2], this.0[n2] + f7);
                                    if (bl2) break;
                                    if (stringArray == null) {
                                        if (bl2) break;
                                    }
                                } else {
                                    if (bl2) break;
                                    if (f6 < 0.0f) {
                                        if (bl2 || bl2) break;
                                        this.0[n2] = Math.max(fArray2[n2], this.0[n2] - f7);
                                        if (bl2) break;
                                    }
                                }
                                if (bl2) break;
                                ++n2;
                                if (bl2) break;
                                if (stringArray != null) continue;
                                if (bl2) break;
                            }
                        } else {
                            if (bl2) break;
                            float f9 = this.0[(int)((long)-1955026878 ^ (long)-1955026878)] - f2;
                            f5 = f9 == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1);
                        }
                        if (f5 == false) {
                            if (bl2) break;
                            if (this.0[(int)((long)-1435593179 ^ (long)-1435593180)] == f3) {
                                if (bl2) break;
                                return (int)((long)-1772505820 ^ (long)-1772505819) != 0;
                            }
                        }
                        if (!bl2) break block12;
                    }
                }
            }
            return true;
        }
        return (int)((long)695499874 ^ (long)695499874) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(float f2) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2004\u200e\u2008;
                if (bl2 || bl2) break block2;
                1A.0(0.5f, this.0[(int)((long)-69299 ^ (long)-69299)] + 0.5f, f2 - 0.5f, this.0[(int)((long)-406145262 ^ (long)-406145261)] - 0.5f, (int)((long)1858150484 ^ (long)-828145008));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 5u() {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2004\u200e\u2008;
                if (bl2 || bl2) break block2;
                float[] fArray = new float[(int)((long)1499792537 ^ (long)1499792539)];
                fArray[(int)((long)-482810757 ^ (long)-482810757)] = 0.0f;
                fArray[(int)((long)36722562 ^ (long)36722563)] = 0.0f;
                this.0 = fArray;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

