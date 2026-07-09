/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  nf
 *  vg
 *  vi
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.process.IFollowProcess;
import baritone.bc;
import baritone.bd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class bb
extends Command {
    public bb(IBaritone iBaritone) {
        super(iBaritone, "follow");
    }

    @Override
    public final void execute(String object, IArgConsumer iArgConsumer) {
        Object object2;
        IFollowProcess iFollowProcess;
        iArgConsumer.requireMin(1);
        ArrayList<vg> arrayList = new ArrayList<vg>();
        ArrayList<Class> arrayList2 = new ArrayList<Class>();
        if (iArgConsumer.hasExactlyOne()) {
            iFollowProcess = this.baritone.getFollowProcess();
            object = iArgConsumer.getEnum(bc.class);
            object2 = ((bc)((Object)object)).a;
        } else {
            iArgConsumer.requireMin(2);
            object = null;
            bd bd2 = iArgConsumer.getEnum(bd.class);
            while (iArgConsumer.hasAny()) {
                Object t2 = iArgConsumer.getDatatypeFor(bd2.a);
                if (t2 instanceof Class) {
                    arrayList2.add((Class)t2);
                    continue;
                }
                arrayList.add((vg)t2);
            }
            iFollowProcess = this.baritone.getFollowProcess();
            object2 = arrayList2.isEmpty() ? arrayList::contains : vg2 -> arrayList2.stream().anyMatch(clazz -> clazz.isInstance(vg2));
        }
        iFollowProcess.follow((Predicate<vg>)object2);
        if (object != null) {
            this.logDirect(String.format("Following all %s", ((Enum)object).name().toLowerCase(Locale.US)));
            return;
        }
        this.logDirect("Following these types of entities:");
        if (arrayList2.isEmpty()) {
            arrayList.stream().map(vg::toString).forEach(this::logDirect);
            return;
        }
        arrayList2.stream().map(vi::a).map(Objects::requireNonNull).map(nf::toString).forEach(this::logDirect);
    }

    @Override
    public final Stream<String> tabComplete(String object, IArgConsumer iArgConsumer) {
        if (iArgConsumer.hasExactlyOne()) {
            return new TabCompleteHelper().append(bc.class).append(bd.class).filterPrefix(iArgConsumer.getString()).stream();
        }
        try {
            object = iArgConsumer.getEnum(bd.class).a;
        } catch (NullPointerException nullPointerException) {
            return Stream.empty();
        }
        while (iArgConsumer.has(2)) {
            if (iArgConsumer.peekDatatypeOrNull(object) == null) {
                return Stream.empty();
            }
            iArgConsumer.get();
        }
        return iArgConsumer.tabCompleteDatatype(object);
    }

    @Override
    public final String getShortDesc() {
        return "Follow entity things";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The follow command tells Baritone to follow certain kinds of entities.", "", "Usage:", "> follow entities - Follows all entities.", "> follow entity <entity1> <entity2> <...> - Follow certain entities (for example 'skeleton', 'horse' etc.)", "> follow players - Follow players", "> follow player <username1> <username2> <...> - Follow certain players");
    }
}

