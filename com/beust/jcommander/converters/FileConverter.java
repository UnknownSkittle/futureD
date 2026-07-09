/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.IStringConverter;
import java.io.File;

public class FileConverter
implements IStringConverter<File> {
    @Override
    public File convert(String string) {
        return new File(string);
    }
}

