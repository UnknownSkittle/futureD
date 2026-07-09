/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.cache;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public enum IWaypoint$Tag {
    HOME("home", "base"),
    DEATH("death"),
    BED("bed", "spawn"),
    USER("user");

    private static final List<IWaypoint$Tag> TAG_LIST;
    public final String[] names;

    private IWaypoint$Tag(String ... stringArray) {
        this.names = stringArray;
    }

    public final String getName() {
        return this.names[0];
    }

    public static IWaypoint$Tag getByName(String string) {
        for (IWaypoint$Tag iWaypoint$Tag : IWaypoint$Tag.values()) {
            String[] stringArray = iWaypoint$Tag.names;
            int n2 = iWaypoint$Tag.names.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!stringArray[i2].equalsIgnoreCase(string)) continue;
                return iWaypoint$Tag;
            }
        }
        return null;
    }

    public static String[] getAllNames() {
        HashSet<String> hashSet = new HashSet<String>();
        for (IWaypoint$Tag iWaypoint$Tag : IWaypoint$Tag.values()) {
            hashSet.addAll(Arrays.asList(iWaypoint$Tag.names));
        }
        return hashSet.toArray(new String[0]);
    }

    static {
        TAG_LIST = Collections.unmodifiableList(Arrays.asList(IWaypoint$Tag.values()));
    }
}

