/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aip
 *  et
 *  gy
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
package baritone;

import baritone.a;
import baritone.api.cache.IContainerMemory;
import baritone.api.cache.IRememberedInventory;
import baritone.s;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class r
implements IContainerMemory {
    private final Path a;
    private final Map<et, s> a = new HashMap();

    public r(Path path) {
        this.a = path;
        try {
            this.a(Files.readAllBytes(path));
            return;
        } catch (NoSuchFileException noSuchFileException) {
            this.a.clear();
            return;
        } catch (Exception exception) {
            exception.printStackTrace();
            this.a.clear();
            return;
        }
    }

    private void a(byte[] object) {
        gy gy2 = new gy(Unpooled.wrappedBuffer((byte[])object));
        object = gy2;
        int n2 = gy2.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = object.readInt();
            int n4 = object.readInt();
            int n5 = object.readInt();
            s s2 = new s(0);
            s.a(s2).addAll(r.a((gy)object));
            s s3 = s2;
            s.a(s3, s.a(s3).size());
            s.b(s2, -1);
            if (s.a(s2).isEmpty()) continue;
            this.a.put(new et(n3, n4, n5), s2);
        }
    }

    public final synchronized void a() {
        if (!((Boolean)baritone.a.a().containerMemory.value).booleanValue()) {
            return;
        }
        ByteBuf byteBuf = Unpooled.buffer((int)0, (int)Integer.MAX_VALUE);
        byteBuf = new gy(byteBuf);
        byteBuf.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            byteBuf = new gy(byteBuf.writeInt(((et)entry.getKey()).p()));
            byteBuf = new gy(byteBuf.writeInt(((et)entry.getKey()).q()));
            byteBuf = new gy(byteBuf.writeInt(((et)entry.getKey()).r()));
            byteBuf = r.a(((s)entry.getValue()).getContents(), (gy)byteBuf);
        }
        Files.write(this.a, byteBuf.array(), new OpenOption[0]);
    }

    public final synchronized void a(et object, int n2, int n3) {
        object = this.a.computeIfAbsent(object, et2 -> new s(0));
        s.b((s)object, n2);
        s.a((s)object, n3);
    }

    public final synchronized Optional<s> a(int n2) {
        return this.a.values().stream().filter(s2 -> s.a(s2) == n2).findFirst();
    }

    private synchronized s a(et et2) {
        return (s)this.a.get(et2);
    }

    @Override
    public final synchronized Map<et, IRememberedInventory> getRememberedInventories() {
        return new HashMap<et, IRememberedInventory>((Map<et, IRememberedInventory>)((Object)this.a));
    }

    public static List<aip> a(byte[] byArray) {
        return r.a(new gy(Unpooled.wrappedBuffer((byte[])byArray)));
    }

    private static List<aip> a(gy gy2) {
        int n2 = gy2.readInt();
        ArrayList<aip> arrayList = new ArrayList<aip>();
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(gy2.k());
        }
        return arrayList;
    }

    public static byte[] a(List<aip> list) {
        ByteBuf byteBuf = Unpooled.buffer((int)0, (int)Integer.MAX_VALUE);
        byteBuf = new gy(byteBuf);
        return r.a(list, (gy)byteBuf).array();
    }

    private static gy a(List<aip> object, gy gy2) {
        gy2 = new gy(gy2.writeInt(object.size()));
        object = object.iterator();
        while (object.hasNext()) {
            aip aip2 = (aip)object.next();
            gy2 = gy2.a(aip2);
        }
        return gy2;
    }

    @Override
    public final /* synthetic */ IRememberedInventory getInventoryByPos(et et2) {
        return this.a(et2);
    }
}

