/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.ai;
import baritone.api.command.argument.ICommandArgument;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class aj {
    private static final Pattern a = Pattern.compile("\\S+");

    public static List<ICommandArgument> a(String string, boolean bl2) {
        ArrayList<ICommandArgument> arrayList = new ArrayList<ICommandArgument>();
        Matcher matcher = a.matcher(string);
        int n2 = -1;
        while (matcher.find()) {
            arrayList.add(new ai(arrayList.size(), matcher.group(), string.substring(matcher.start())));
            n2 = matcher.end();
        }
        if (bl2 && n2 < string.length()) {
            arrayList.add(new ai(arrayList.size(), "", ""));
        }
        return arrayList;
    }

    public static ai a() {
        return new ai(-1, "<unknown>", "");
    }
}

