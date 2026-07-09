/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.cache.ICachedWorld;
import baritone.api.cache.IContainerMemory;
import baritone.api.cache.IWaypointCollection;
import baritone.api.cache.IWorldData;
import baritone.n;
import baritone.r;
import baritone.t;
import java.io.IOException;
import java.nio.file.Path;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class u
implements IWorldData {
    public final n a;
    private final t a;
    private final r a;
    public final Path a;
    private int a;

    u(Path path, int n2) {
        this.a = path;
        this.a = new n(path.resolve("cache"), n2);
        this.a = new t(path.resolve("waypoints"));
        this.a = new r(path.resolve("containers"));
        this.a = n2;
    }

    public final void a() {
        baritone.a.a().execute(() -> {
            System.out.println("Started saving the world in a new thread");
            this.a.save();
        });
        baritone.a.a().execute(() -> {
            System.out.println("Started saving saved containers in a new thread");
            try {
                this.a.a();
                return;
            } catch (IOException iOException) {
                iOException.printStackTrace();
                System.out.println("Failed to save saved containers");
                return;
            }
        });
    }

    @Override
    public final ICachedWorld getCachedWorld() {
        return this.a;
    }

    @Override
    public final IWaypointCollection getWaypoints() {
        return this.a;
    }

    @Override
    public final IContainerMemory getContainerMemory() {
        return this.a;
    }
}

