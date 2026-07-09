/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.internal;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.internal.Console;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DefaultConsole
implements Console {
    @Override
    public void print(String string) {
        System.out.print(string);
    }

    @Override
    public void println(String string) {
        System.out.println(string);
    }

    @Override
    public char[] readPassword(boolean bl2) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            return new BufferedReader(inputStreamReader).readLine().toCharArray();
        } catch (IOException iOException) {
            throw new ParameterException(iOException);
        }
    }
}

