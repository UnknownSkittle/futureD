/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ain
 *  aip
 *  aoo
 *  aos$b
 *  aou
 *  aou$a
 *  aow
 *  apb
 *  apd
 *  apk
 *  apy
 *  aqa
 *  aqa$a
 *  aqa$b
 *  aqb$a
 *  aqo
 *  aqq
 *  arb
 *  arf$a
 *  arr
 *  art$a
 *  arv$a
 *  ata$a
 *  atf
 *  atp
 *  att
 *  aud$a
 *  aud$b
 *  aue
 *  aug
 *  auo
 *  aur$a
 *  aus
 *  auu
 *  auv
 *  awt
 *  axj
 *  fa
 *  fa$a
 *  nf
 */
package baritone.api.utils;

import baritone.api.utils.accessor.IItemStack;
import com.google.common.collect.ImmutableSet;
import java.lang.constant.Constable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class BlockOptionalMeta {
    private final aow block;
    private final int meta;
    private final boolean noMeta;
    private final Set<awt> blockstates;
    private final ImmutableSet<Integer> stateHashes;
    private final ImmutableSet<Integer> stackHashes;
    private static final Pattern pattern = Pattern.compile("^(.+?)(?::(\\d+))?$");
    private static final Map<Object, Object> normalizations;

    public BlockOptionalMeta(@Nonnull aow aow2, @Nullable Integer n2) {
        this.block = aow2;
        this.noMeta = n2 == null;
        this.meta = this.noMeta ? 0 : n2;
        this.blockstates = BlockOptionalMeta.getStates(aow2, n2);
        this.stateHashes = BlockOptionalMeta.getStateHashes(this.blockstates);
        this.stackHashes = BlockOptionalMeta.getStackHashes(this.blockstates);
    }

    public BlockOptionalMeta(@Nonnull aow aow2) {
        this(aow2, null);
    }

    public BlockOptionalMeta(@Nonnull String object) {
        object = pattern.matcher((CharSequence)object);
        if (!((Matcher)object).find()) {
            throw new IllegalArgumentException("invalid block selector");
        }
        this.noMeta = (object = ((Matcher)object).toMatchResult()).group(2) == null;
        nf nf2 = new nf(object.group(1));
        if (!aow.h.d((Object)nf2)) {
            throw new IllegalArgumentException("Invalid block ID");
        }
        this.block = (aow)aow.h.c((Object)nf2);
        this.meta = this.noMeta ? 0 : Integer.parseInt(object.group(2));
        this.blockstates = BlockOptionalMeta.getStates(this.block, this.getMeta());
        this.stateHashes = BlockOptionalMeta.getStateHashes(this.blockstates);
        this.stackHashes = BlockOptionalMeta.getStackHashes(this.blockstates);
    }

    public static <C extends Comparable<C>, P extends axj<C>> P castToIProperty(Object object) {
        return (P)((axj)object);
    }

    public static <C extends Comparable<C>, P extends axj<C>> C castToIPropertyValue(P p2, Object object) {
        return (C)((Comparable)object);
    }

    public static awt normalize(awt awt2) {
        awt awt3 = awt2;
        for (axj axj2 : awt2.t().keySet()) {
            Class clazz = axj2.b();
            if (normalizations.containsKey(axj2)) {
                try {
                    awt3 = awt3.a(BlockOptionalMeta.castToIProperty(axj2), BlockOptionalMeta.castToIPropertyValue(axj2, normalizations.get(axj2)));
                } catch (IllegalArgumentException illegalArgumentException) {}
                continue;
            }
            if (normalizations.containsKey(awt2.c(axj2))) {
                try {
                    awt3 = awt3.a(BlockOptionalMeta.castToIProperty(axj2), BlockOptionalMeta.castToIPropertyValue(axj2, normalizations.get(awt2.c(axj2))));
                } catch (IllegalArgumentException illegalArgumentException) {}
                continue;
            }
            if (!normalizations.containsKey(clazz)) continue;
            try {
                awt3 = awt3.a(BlockOptionalMeta.castToIProperty(axj2), BlockOptionalMeta.castToIPropertyValue(axj2, normalizations.get(clazz)));
            } catch (IllegalArgumentException illegalArgumentException) {}
        }
        return awt3;
    }

    public static int stateMeta(awt awt2) {
        return awt2.u().e(BlockOptionalMeta.normalize(awt2));
    }

    private static Set<awt> getStates(@Nonnull aow aow2, @Nullable Integer n2) {
        return aow2.s().a().stream().filter(awt2 -> n2 == null || BlockOptionalMeta.stateMeta(awt2) == n2).collect(Collectors.toSet());
    }

    private static ImmutableSet<Integer> getStateHashes(Set<awt> set) {
        return ImmutableSet.copyOf(set.stream().map(Object::hashCode).toArray(Integer[]::new));
    }

    private static ImmutableSet<Integer> getStackHashes(Set<awt> set) {
        return ImmutableSet.copyOf(set.stream().map(awt2 -> new aip(awt2.u().a(awt2, new Random(), 0), awt2.u().d(awt2))).map(aip2 -> ((IItemStack)aip2).getBaritoneHash()).toArray(Integer[]::new));
    }

    public final aow getBlock() {
        return this.block;
    }

    public final Integer getMeta() {
        if (this.noMeta) {
            return null;
        }
        return this.meta;
    }

    public final boolean matches(@Nonnull aow aow2) {
        return aow2 == this.block;
    }

    public final boolean matches(@Nonnull awt awt2) {
        return awt2.u() == this.block && this.stateHashes.contains(awt2.hashCode());
    }

    public final boolean matches(aip aip2) {
        int n2 = ((IItemStack)aip2).getBaritoneHash();
        if (this.noMeta) {
            n2 -= aip2.i();
        }
        return this.stackHashes.contains(n2);
    }

    public final String toString() {
        return String.format("BlockOptionalMeta{block=%s,meta=%s}", this.block, this.getMeta());
    }

    public static awt blockStateFromStack(aip aip2) {
        return aow.a((ain)aip2.c()).a(aip2.j());
    }

    public final awt getAnyBlockState() {
        if (this.blockstates.size() > 0) {
            return this.blockstates.iterator().next();
        }
        return null;
    }

    static {
        HashMap<Object, Constable> hashMap = new HashMap<Object, Constable>();
        Consumer<Enum> consumer = enum_ -> hashMap.put(enum_.getClass(), (Constable)enum_);
        consumer.accept((Enum)fa.c);
        consumer.accept((Enum)fa.a.b);
        consumer.accept((Enum)arv.a.b);
        consumer.accept((Enum)aud.a.b);
        consumer.accept((Enum)aud.b.a);
        consumer.accept((Enum)art.a.a);
        consumer.accept((Enum)aqb.a.b);
        consumer.accept((Enum)arf.a.b);
        consumer.accept((Enum)aqa.a.b);
        consumer.accept((Enum)aqa.b.a);
        consumer.accept((Enum)aou.a.a);
        consumer.accept((Enum)aos.b.a);
        consumer.accept((Enum)aur.a.b);
        hashMap.put(aoo.b, Integer.valueOf(0));
        hashMap.put(aou.b, Boolean.FALSE);
        hashMap.put(apb.a[0], Boolean.FALSE);
        hashMap.put(apb.a[1], Boolean.FALSE);
        hashMap.put(apb.a[2], Boolean.FALSE);
        hashMap.put(apd.a, Boolean.FALSE);
        hashMap.put(apk.a, Boolean.FALSE);
        hashMap.put(apk.b, Boolean.FALSE);
        hashMap.put(apk.c, Boolean.FALSE);
        hashMap.put(apk.d, Boolean.FALSE);
        hashMap.put(apk.e, Boolean.FALSE);
        hashMap.put(apk.f, Boolean.FALSE);
        hashMap.put(apy.b, Boolean.FALSE);
        hashMap.put(aqa.b, Boolean.FALSE);
        hashMap.put(aqa.d, Boolean.FALSE);
        hashMap.put(aqo.a, Boolean.FALSE);
        hashMap.put(aqo.b, Boolean.FALSE);
        hashMap.put(aqo.d, Boolean.FALSE);
        hashMap.put(aqo.c, Boolean.FALSE);
        hashMap.put(aqq.a, Integer.valueOf(0));
        hashMap.put(aqq.b, Boolean.FALSE);
        hashMap.put(aqq.c, Boolean.FALSE);
        hashMap.put(aqq.d, Boolean.FALSE);
        hashMap.put(aqq.e, Boolean.FALSE);
        hashMap.put(aqq.f, Boolean.FALSE);
        hashMap.put(arb.a, Boolean.FALSE);
        hashMap.put(arr.b, Boolean.FALSE);
        hashMap.put(auo.b, Boolean.FALSE);
        hashMap.put(auo.c, Boolean.FALSE);
        hashMap.put(auo.e, Boolean.FALSE);
        hashMap.put(auo.d, Boolean.FALSE);
        hashMap.put(ata.a.d, (Constable)ata.a.c);
        hashMap.put(ata.a.e, (Constable)ata.a.c);
        hashMap.put(atf.a, Boolean.FALSE);
        hashMap.put(atf.b, Boolean.FALSE);
        hashMap.put(atf.c, Boolean.FALSE);
        hashMap.put(atf.d, Boolean.FALSE);
        hashMap.put(atp.c, Integer.valueOf(0));
        hashMap.put(att.b, Boolean.FALSE);
        hashMap.put(aue.b, Integer.valueOf(0));
        hashMap.put(aug.a, Integer.valueOf(0));
        hashMap.put(aus.d, Boolean.FALSE);
        hashMap.put(aus.e, Boolean.FALSE);
        hashMap.put(aus.g, Boolean.FALSE);
        hashMap.put(aus.f, Boolean.FALSE);
        hashMap.put(auu.b, Boolean.FALSE);
        hashMap.put(auu.c, Boolean.FALSE);
        hashMap.put(auu.d, Boolean.FALSE);
        hashMap.put(auu.e, Boolean.FALSE);
        hashMap.put(auu.a, Boolean.FALSE);
        hashMap.put(auv.a, Boolean.FALSE);
        hashMap.put(auv.b, Boolean.FALSE);
        hashMap.put(auv.c, Boolean.FALSE);
        hashMap.put(auv.e, Boolean.FALSE);
        hashMap.put(auv.d, Boolean.FALSE);
        normalizations = Collections.unmodifiableMap(hashMap);
    }
}

