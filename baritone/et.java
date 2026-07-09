/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amn
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 */
package baritone;

import baritone.a;
import baritone.api.utils.MyChunkPos;
import baritone.en;
import baritone.eq;
import baritone.es;
import baritone.eu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class et
implements es {
    private final boolean a;
    private final LongOpenHashSet a;
    private final MyChunkPos[] a;
    private /* synthetic */ en a;

    private et(en myChunkPosArray, Path path, boolean bl2) {
        this.a = myChunkPosArray;
        this.a = bl2;
        Gson gson = new GsonBuilder().create();
        this.a = gson.fromJson((Reader)new InputStreamReader(Files.newInputStream(path, new OpenOption[0])), MyChunkPos[].class);
        myChunkPosArray.logDirect("Loaded " + this.a.length + " positions");
        this.a = new LongOpenHashSet();
        myChunkPosArray = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            MyChunkPos myChunkPos = myChunkPosArray[i2];
            this.a.add(amn.a((int)myChunkPos.x, (int)myChunkPos.z));
        }
    }

    @Override
    public final int a(int n2, int n3) {
        if (this.a.contains(amn.a((int)n2, (int)n3)) ^ this.a) {
            return eu.a;
        }
        return eu.c;
    }

    @Override
    public final int a() {
        if (!this.a) {
            return Integer.MAX_VALUE;
        }
        int n2 = 0;
        eq eq2 = new eq(this.a, 0);
        MyChunkPos[] myChunkPosArray = this.a;
        int n3 = this.a.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            MyChunkPos myChunkPos = myChunkPosArray[i2];
            if (eq2.a(myChunkPos.x, myChunkPos.z) == eu.a || ++n2 < (Integer)baritone.a.a().exploreChunkSetMinimumSize.value) continue;
            return n2;
        }
        return n2;
    }

    /* synthetic */ et(en en2, Path path, boolean bl2, byte by2) {
        this(en2, path, bl2);
    }
}

