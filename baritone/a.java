/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  blk
 */
package baritone;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.Settings;
import baritone.api.event.listener.IEventBus;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.c;
import baritone.cd;
import baritone.cf;
import baritone.d;
import baritone.dy;
import baritone.ea;
import baritone.ek;
import baritone.en;
import baritone.ev;
import baritone.ez;
import baritone.f;
import baritone.fa;
import baritone.fc;
import baritone.fh;
import baritone.fj;
import baritone.fn;
import baritone.fp;
import baritone.fr;
import baritone.fv;
import baritone.j;
import baritone.v;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class a
implements IBaritone {
    private static ThreadPoolExecutor a = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
    private static File a = new File(bib.z().w, "baritone");
    public cf a;
    public j a;
    public d a;
    private f a;
    public c a;
    public fr a;
    private ez a;
    private fc a;
    private fa a;
    private ek a;
    public ea a;
    private en a;
    private dy a;
    private ev a;
    public fv a;
    private fh a;
    public cd a;
    private IPlayerContext a;
    public v a;
    public fn a = new cd(this);

    a() {
        if (fj.a) {
            this.a.registerEventListener(fj.a);
        }
    }

    @Override
    public final IPlayerContext getPlayerContext() {
        return this.a;
    }

    @Override
    public final IEventBus getGameEventHandler() {
        return this.a;
    }

    @Override
    public final void openClick() {
        new Thread(() -> {
            try {
                Thread.sleep(100L);
                Helper.mc.a(() -> Helper.mc.a((blk)new fp()));
                return;
            } catch (Exception exception) {
                return;
            }
        }).start();
    }

    public static Settings a() {
        return BaritoneAPI.getSettings();
    }

    public static File a() {
        return a;
    }

    public static Executor a() {
        return a;
    }

    static {
        if (!Files.exists(a.toPath(), new LinkOption[0])) {
            try {
                Files.createDirectories(a.toPath(), new FileAttribute[0]);
            } catch (IOException iOException) {}
        }
    }
}

