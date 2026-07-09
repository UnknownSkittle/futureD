/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aip
 */
package baritone;

import baritone.r;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class h {
    private static final Map<Path, h> a = new HashMap<Path, h>();
    private final Path a;
    private List<aip> a;

    private h(Path path) {
        this.a = path;
        System.out.println("Echest storing in ".concat(String.valueOf(path)));
        try {
            this.a = r.a(Files.readAllBytes(path));
            return;
        } catch (IOException iOException) {
            iOException.printStackTrace();
            System.out.println("CANNOT read echest =( =(");
            this.a = null;
            return;
        }
    }

    public final synchronized void a() {
        System.out.println("Saving");
        if (this.a != null) {
            try {
                this.a.getParent().toFile().mkdir();
                Files.write(this.a, r.a(this.a), new OpenOption[0]);
                return;
            } catch (IOException iOException) {
                iOException.printStackTrace();
                System.out.println("CANNOT save echest =( =(");
            }
        }
    }

    private static synchronized h b(Path path, UUID uUID) {
        return a.computeIfAbsent(path.resolve("echests").resolve(uUID.toString()), h::new);
    }

    static /* synthetic */ List a(h h2, List list) {
        h2.a = list;
        return h2.a;
    }

    static /* synthetic */ h a(Path path, UUID uUID) {
        return h.b(path, uUID);
    }
}

