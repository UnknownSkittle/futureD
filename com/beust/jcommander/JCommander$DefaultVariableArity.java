/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IVariableArity;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.JCommander$1;

class JCommander$DefaultVariableArity
implements IVariableArity {
    final /* synthetic */ JCommander this$0;

    private JCommander$DefaultVariableArity(JCommander jCommander) {
        this.this$0 = jCommander;
    }

    @Override
    public int processVariableArity(String string, String[] stringArray) {
        int n2;
        for (n2 = 0; n2 < stringArray.length && !JCommander.access$1100(this.this$0, stringArray[n2]); ++n2) {
        }
        return n2;
    }

    /* synthetic */ JCommander$DefaultVariableArity(JCommander jCommander, JCommander$1 jCommander$1) {
        this(jCommander);
    }
}

