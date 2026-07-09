/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 4W<T> {
    private final List<Predicate<T>> 0;
    private final Comparator<T> 1;
    public static final boolean \u2002\u2005\u2005\u2007\u2007\u2001;

    /*
     * Enabled aggressive block sorting
     */
    private static List<T> 0(List<T> list, List<Predicate<T>> list2, Comparator<T> comparator) {
        block5: {
            block2: {
                boolean bl2;
                block4: {
                    block3: {
                        bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
                        if (bl2 || bl2) break block2;
                        list = new ArrayList(list);
                        if (bl2 || bl2) break block2;
                        if (list2 == null) break block3;
                        if (bl2 || bl2) break block2;
                        list2.forEach(predicate -> {
                            block3: {
                                block2: {
                                    boolean bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
                                    if (bl2 || bl2) break block2;
                                    list.removeIf(object -> {
                                        boolean bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
                                        if (bl2 || bl2) return true;
                                        if (!predicate.test(object)) {
                                            if (bl2) return true;
                                            return (int)((long)-358228190 ^ (long)-358228189) != 0;
                                        }
                                        if (!bl2) return (int)((long)-1745937275 ^ (long)-1745937275) != 0;
                                        return true;
                                    });
                                    if (!bl2) break block3;
                                }
                                return;
                            }
                        });
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    if (comparator == null) break block4;
                    if (bl2 || bl2) break block2;
                    list.sort(comparator);
                    if (bl2) break block2;
                }
                if (!bl2) break block5;
            }
            return null;
        }
        return list;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int 2(List<T> list) {
        boolean bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
        if (bl2 || bl2) return -265393900;
        T t2 = this.1(list);
        if (t2 == null) {
            if (bl2) return -265393900;
            return (int)((long)1770972844 ^ (long)-1770972845);
        }
        if (!bl2) return list.indexOf(t2);
        return -265393900;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean 0(List list, int n2, int n3, Object object) {
        boolean bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
        if (bl2 || bl2) return true;
        if (list.indexOf(object) >= n2) {
            if (bl2) return true;
            if (list.indexOf(object) < n3) {
                if (bl2) return true;
                return (int)((long)1768229450 ^ (long)1768229451) != 0;
            }
        }
        if (!bl2) return (int)((long)-563878287 ^ (long)-563878287) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private T 1(List<T> list) {
        boolean bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
        if (bl2 || bl2) return null;
        ArrayList<Predicate<T>> arrayList = new ArrayList<Predicate<T>>(this.0);
        arrayList.add(arg_0 -> 4W.0(list, (int)((long)1910805811 ^ (long)1910805811), (int)((long)117195168 ^ (long)117195177), arg_0));
        if (bl2 || bl2) return null;
        if ((list = 4W.0(list, arrayList, this.1)).size() == 0) {
            if (bl2) return null;
            return null;
        }
        if (!bl2) return list.get((int)((long)172347845 ^ (long)172347845));
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private 4W(Predicate<T>[] predicateArray, Comparator<T> comparator) {
        List<Object> list;
        boolean bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
        if (bl2 || bl2) {
            return;
        }
        if (predicateArray == null) {
            list = new ArrayList();
            if (\u2002\u2005\u2005\u2007\u2007\u2001) {
                throw null;
            }
        } else {
            list = Arrays.asList(predicateArray);
        }
        this.0 = list;
        this.1 = comparator;
    }

    public final List<T> 0(List<T> list) {
        boolean bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
        if (bl2 || bl2) {
            return null;
        }
        return 4W.0(list, this.0, this.1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final T 3(List<T> list) {
        boolean bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
        if (bl2 || bl2) return null;
        if ((list = this.0(list)).size() == 0) {
            if (bl2) return null;
            return null;
        }
        if (!bl2) return list.get((int)((long)1772454889 ^ (long)1772454889));
        return null;
    }

    /* synthetic */ 4W(Predicate[] predicateArray, Comparator comparator, byte by2) {
        boolean bl2 = \u2002\u2005\u2005\u2007\u2007\u2001;
        this(predicateArray, comparator);
    }
}

