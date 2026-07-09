/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  rr
 */
package baritone;

import baritone.a;
import baritone.ag;
import baritone.aj;
import baritone.ak;
import baritone.al;
import baritone.am;
import baritone.an;
import baritone.ao;
import baritone.ap;
import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.ICommand;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.exception.CommandUnhandledException;
import baritone.api.command.exception.ICommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.command.manager.ICommandManager;
import baritone.api.command.registry.Registry;
import baritone.aq;
import baritone.ar;
import baritone.ax;
import baritone.ay;
import baritone.az;
import baritone.ba;
import baritone.bb;
import baritone.be;
import baritone.bf;
import baritone.bg;
import baritone.bh;
import baritone.bi;
import baritone.bj;
import baritone.bk;
import baritone.bl;
import baritone.bm;
import baritone.bn;
import baritone.bo;
import baritone.bp;
import baritone.bq;
import baritone.br;
import baritone.bs;
import baritone.bw;
import baritone.bx;
import baritone.by;
import baritone.ca;
import baritone.cb;
import baritone.ce;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cd
implements ICommandManager {
    private final Registry<ICommand> a;
    private final a a = new Registry();

    public cd(a object) {
        this.a = object;
        Objects.requireNonNull(object);
        ArrayList<Command> arrayList = new ArrayList<Command>(Arrays.asList(new bi((IBaritone)object), new bw((IBaritone)object), new aq((IBaritone)object, Arrays.asList("modified", "mod", "baritone", "modifiedsettings"), "List modified settings", "set modified"), new aq((IBaritone)object, "reset", "Reset all settings or just one", "set reset"), new bg((IBaritone)object), new bh((IBaritone)object), new bl((IBaritone)object), new bm((IBaritone)object), new ca((IBaritone)object), new bp((IBaritone)object), new am((IBaritone)object), new br((IBaritone)object), new ap((IBaritone)object), new ak((IBaritone)object), new be((IBaritone)object), new bf((IBaritone)object), new bj((IBaritone)object), new by((IBaritone)object), new bo((IBaritone)object), new az((IBaritone)object), new an((IBaritone)object), new bb((IBaritone)object), new ay((IBaritone)object), new bn((IBaritone)object), new bq((IBaritone)object), new ax((IBaritone)object), new al((IBaritone)object), new ba((IBaritone)object), new bk((IBaritone)object), new ao((IBaritone)object), new bx((IBaritone)object), new cb((IBaritone)object), new aq((IBaritone)object, "sethome", "Sets your home waypoint", "waypoints save home"), new aq((IBaritone)object, "home", "Set goal to your home waypoint", "waypoints goal home"), new bs((IBaritone)object)));
        object = new ar((IBaritone)object);
        arrayList.add(((ar)object).a);
        arrayList.add(((ar)object).b);
        arrayList.add(((ar)object).c);
        arrayList.add(((ar)object).d);
        Collections.unmodifiableList(arrayList).forEach(this.a::register);
    }

    @Override
    public final IBaritone getBaritone() {
        return this.a;
    }

    @Override
    public final Registry<ICommand> getRegistry() {
        return this.a;
    }

    @Override
    public final ICommand getCommand(String string) {
        for (ICommand iCommand : this.a.entries) {
            if (!iCommand.getNames().contains(string.toLowerCase(Locale.US))) continue;
            return iCommand;
        }
        return null;
    }

    @Override
    public final boolean execute(String string) {
        return this.execute(cd.a(string, false));
    }

    @Override
    public final boolean execute(rr<String, List<ICommandArgument>> object) {
        if ((object = this.a((rr<String, List<ICommandArgument>>)object)) != null) {
            Object object2 = object;
            try {
                object2.a.execute(object2.a, object2.a);
            } catch (Throwable throwable) {
                Throwable throwable2 = throwable;
                (throwable instanceof ICommandException ? (ICommandException)((Object)throwable2) : new CommandUnhandledException(throwable2)).handle(object2.a, object2.a.getArgs());
            }
        }
        return object != null;
    }

    @Override
    public final Stream<String> tabComplete(rr<String, List<ICommandArgument>> object) {
        if ((object = this.a((rr<String, List<ICommandArgument>>)object)) == null) {
            return Stream.empty();
        }
        return ((ce)object).a();
    }

    @Override
    public final Stream<String> tabComplete(String rr2) {
        rr2 = cd.a((String)rr2, true);
        String string = (String)rr2.a();
        if (((List)rr2.b()).isEmpty()) {
            return new TabCompleteHelper().addCommands(this.a.a).filterPrefix(string).stream();
        }
        return this.tabComplete(rr2);
    }

    private ce a(rr<String, List<ICommandArgument>> object) {
        String string = (String)object.a();
        object = new ag(this, (List)object.b());
        ICommand iCommand = this.getCommand(string);
        if (iCommand == null) {
            return null;
        }
        return new ce(iCommand, string, (ag)object, 0);
    }

    private static rr<String, List<ICommandArgument>> a(String object, boolean bl2) {
        String string = ((String)object).split("\\s", 2)[0];
        object = aj.a(((String)object).substring(string.length()), bl2);
        return new rr((Object)string, object);
    }

    public static rr<String, List<ICommandArgument>> a(String string) {
        return cd.a(string, false);
    }
}

