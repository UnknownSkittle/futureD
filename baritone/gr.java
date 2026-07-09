/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FilenameUtils
 */
package baritone;

import baritone.api.schematic.format.ISchematicFormat;
import baritone.gs;
import baritone.gt;
import java.io.File;
import org.apache.commons.io.FilenameUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class gr
extends Enum<gr>
implements ISchematicFormat {
    private static /* enum */ gr a = new gs();
    private static /* enum */ gr b = new gt();
    private final String a;
    private static final /* synthetic */ gr[] a;

    public static gr[] values() {
        return (gr[])a.clone();
    }

    public static gr valueOf(String string) {
        return Enum.valueOf(gr.class, string);
    }

    private gr(String string2) {
        this.a = string2;
    }

    @Override
    public boolean isFileType(File file) {
        return this.a.equalsIgnoreCase(FilenameUtils.getExtension((String)file.getAbsolutePath()));
    }

    /* synthetic */ gr(String string, int n2, String string2, byte by2) {
        this(string2);
    }

    static {
        a = new gr[]{a, b};
    }
}

