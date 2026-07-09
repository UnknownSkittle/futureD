/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.cache.IWorldProvider;
import baritone.api.utils.Helper;
import baritone.ga;
import baritone.ge;
import baritone.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.SystemUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class v
implements IWorldProvider,
Helper {
    private static final Map<Path, u> a = new HashMap<Path, u>();
    public u a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(int n2) {
        Object object;
        Object object2;
        Object object3 = mc.F();
        if (mc.E()) {
            if (((File)(object3 = ((ga)((ge)object3.a(n2).r()).getChunkLoader()).getChunkSaveLocation())).toPath().relativize(v.mc.w.toPath()).getNameCount() != 2) {
                object3 = ((File)object3).getParentFile();
            }
            object2 = object3 = new File((File)object3, "baritone");
        } else {
            object2 = v.mc.C().b;
            if (SystemUtils.IS_OS_WINDOWS) {
                object2 = ((String)object2).replace(":", "_");
            }
            object3 = new File(baritone.a.a(), (String)object2);
            object2 = baritone.a.a();
        }
        try {
            object2 = new FileOutputStream(new File((File)object2, "readme.txt"));
            object = null;
            try {
                ((FileOutputStream)object2).write("https://github.com/cabaletta/baritone\n".getBytes());
            } catch (Throwable throwable) {
                try {
                    Throwable throwable2 = throwable;
                    object = throwable;
                    throw throwable2;
                } catch (Throwable throwable3) {
                    if (object != null) {
                        try {
                            ((FileOutputStream)object2).close();
                        } catch (Throwable throwable4) {
                            ((Throwable)object).addSuppressed(throwable4);
                        }
                    } else {
                        ((FileOutputStream)object2).close();
                    }
                    throw throwable3;
                }
            }
            ((FileOutputStream)object2).close();
        } catch (IOException iOException) {}
        object2 = new File((File)object3, "DIM".concat(String.valueOf(n2))).toPath();
        if (!Files.exists((Path)object2, new LinkOption[0])) {
            try {
                Files.createDirectories((Path)object2, new FileAttribute[0]);
            } catch (IOException iOException) {}
        }
        System.out.println("Baritone world data dir: ".concat(String.valueOf(object2)));
        object = a;
        synchronized (object) {
            this.a = a.computeIfAbsent((Path)object2, path -> new u((Path)path, n2));
            return;
        }
    }
}

