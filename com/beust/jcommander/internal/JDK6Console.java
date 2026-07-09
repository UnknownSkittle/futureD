/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.internal;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.internal.Console;
import java.io.PrintWriter;
import java.lang.reflect.Method;

public class JDK6Console
implements Console {
    private Object console;
    private PrintWriter writer;

    public JDK6Console(Object object) {
        this.console = object;
        Method method = object.getClass().getDeclaredMethod("writer", new Class[0]);
        this.writer = (PrintWriter)method.invoke(object, new Object[0]);
    }

    @Override
    public void print(String string) {
        this.writer.print(string);
    }

    @Override
    public void println(String string) {
        this.writer.println(string);
    }

    @Override
    public char[] readPassword(boolean bl2) {
        try {
            this.writer.flush();
            if (bl2) {
                return ((String)this.console.getClass().getDeclaredMethod("readLine", new Class[0]).invoke(this.console, new Object[0])).toCharArray();
            }
            return (char[])this.console.getClass().getDeclaredMethod("readPassword", new Class[0]).invoke(this.console, new Object[0]);
        } catch (Exception exception) {
            throw new ParameterException(exception);
        }
    }
}

