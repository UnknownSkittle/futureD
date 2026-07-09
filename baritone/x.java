/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  hg
 *  hg$a
 *  hh
 *  hj
 *  hj$a
 *  ho
 *  rr
 */
package baritone;

import baritone.ag;
import baritone.aj;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.Settings;
import baritone.api.Settings$Setting;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.exception.CommandNotEnoughArgumentsException;
import baritone.api.command.exception.CommandNotFoundException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.command.manager.ICommandManager;
import baritone.api.event.events.ChatEvent;
import baritone.api.event.events.TabCompleteEvent;
import baritone.api.event.events.type.Cancellable;
import baritone.api.event.listener.AbstractGameEventListener;
import baritone.api.utils.Helper;
import baritone.api.utils.SettingsUtil;
import baritone.cd;
import baritone.gf;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class x
implements AbstractGameEventListener,
Helper {
    private static final Settings a = BaritoneAPI.getSettings();
    private final ICommandManager a;

    public x(IBaritone iBaritone) {
        this.a = iBaritone.getCommandManager();
        iBaritone.getGameEventHandler().registerEventListener(this);
    }

    @Override
    public final void onSendChatMessage(ChatEvent object) {
        String string = ((ChatEvent)object).getMessage();
        String string2 = (String)x.a.prefix.value;
        boolean bl2 = string.startsWith(IBaritoneChatControl.FORCE_COMMAND_PREFIX);
        if (((Boolean)x.a.prefixControl.value).booleanValue() && string.startsWith(string2) || bl2) {
            ((Cancellable)object).cancel();
            object = string.substring(bl2 ? IBaritoneChatControl.FORCE_COMMAND_PREFIX.length() : string2.length());
            if (!this.a((String)object) && !((String)object).trim().isEmpty()) {
                new CommandNotFoundException((String)cd.a((String)object).a()).handle(null, null);
            }
            return;
        }
        if ((((Boolean)x.a.chatControl.value).booleanValue() || ((Boolean)x.a.chatControlAnyway.value).booleanValue()) && this.a(string)) {
            ((Cancellable)object).cancel();
        }
    }

    private void a(String string, String string2) {
        if (((Boolean)x.a.echoCommands.value).booleanValue()) {
            string2 = string + string2;
            string = (Boolean)x.a.censorRanCommands.value != false ? string + " ..." : string2;
            string = new ho(String.format("> %s", string));
            string.b().a(a.p).a(new hj(hj.a.a, (hh)new ho("Click to rerun command"))).a(new hg(hg.a.c, IBaritoneChatControl.FORCE_COMMAND_PREFIX + string2));
            this.logDirect(new hh[]{string});
        }
    }

    private boolean a(String string) {
        while (true) {
            if (string.trim().equalsIgnoreCase("damn")) {
                this.logDirect("daniel");
                return false;
            }
            if (string.trim().equalsIgnoreCase("orderpizza")) {
                try {
                    ((gf)x.mc.m).openLink(new URI("https://www.dominos.com/en/pages/order/"));
                } catch (NullPointerException | URISyntaxException exception) {}
                return false;
            }
            if (!string.isEmpty()) break;
            string = "help";
        }
        rr<String, List<ICommandArgument>> rr2 = cd.a(string);
        String string2 = (String)rr2.a();
        string = string.substring(((String)rr2.a()).length());
        ag ag2 = new ag(this.a, (List)rr2.b());
        if (!ag2.hasAny()) {
            Settings$Setting<?> settings$Setting = x.a.byLowerName.get(string2.toLowerCase(Locale.US));
            if (settings$Setting != null) {
                this.a(string2, string);
                if (settings$Setting.getValueClass() == Boolean.class) {
                    this.a.execute(String.format("set toggle %s", settings$Setting.getName()));
                } else {
                    this.a.execute(String.format("set %s", settings$Setting.getName()));
                }
                return true;
            }
        } else if (ag2.hasExactlyOne()) {
            for (Settings$Setting<?> settings$Setting : x.a.allSettings) {
                if (settings$Setting.getName().equals("logger") || !settings$Setting.getName().equalsIgnoreCase((String)rr2.a())) continue;
                this.a(string2, string);
                try {
                    this.a.execute(String.format("set %s %s", settings$Setting.getName(), ag2.getString()));
                } catch (CommandNotEnoughArgumentsException commandNotEnoughArgumentsException) {}
                return true;
            }
        }
        if (this.a.getCommand((String)rr2.a()) != null) {
            this.a(string2, string);
        }
        return this.a.execute(rr2);
    }

    @Override
    public final void onPreTabComplete(TabCompleteEvent tabCompleteEvent) {
        if (!((Boolean)x.a.prefixControl.value).booleanValue()) {
            return;
        }
        Object object = tabCompleteEvent.prefix;
        String string = (String)x.a.prefix.value;
        if (!((String)object).startsWith(string)) {
            return;
        }
        object = ((String)object).substring(string.length());
        List<ICommandArgument> list = aj.a((String)object, true);
        object = this.a((String)object);
        if (list.size() == 1) {
            object = object.map(string2 -> string + string2);
        }
        tabCompleteEvent.completions = (String[])object.toArray(String[]::new);
    }

    private Stream<String> a(String object) {
        try {
            Object object2 = aj.a((String)object, true);
            object2 = new ag(this.a, (List<ICommandArgument>)object2);
            if (((ag)object2).hasAtMost(2)) {
                if (((ag)object2).hasExactly(1)) {
                    return new TabCompleteHelper().addCommands(this.a).addSettings().filterPrefix(((ag)object2).getString()).stream();
                }
                Settings$Setting<?> settings$Setting = x.a.byLowerName.get(((ag)object2).getString().toLowerCase(Locale.US));
                if (settings$Setting != null) {
                    if (settings$Setting.getValueClass() == Boolean.class) {
                        object = new TabCompleteHelper();
                        if (((Boolean)settings$Setting.value).booleanValue()) {
                            ((TabCompleteHelper)object).append("true", "false");
                        } else {
                            ((TabCompleteHelper)object).append("false", "true");
                        }
                        return ((TabCompleteHelper)object).filterPrefix(((ag)object2).getString()).stream();
                    }
                    return Stream.of(SettingsUtil.settingValueToString(settings$Setting));
                }
            }
            return this.a.tabComplete((String)object);
        } catch (CommandNotEnoughArgumentsException commandNotEnoughArgumentsException) {
            return Stream.empty();
        }
    }
}

