/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import org.a.b.q;
import org.a.c.c;
import org.a.c.d;
import org.a.d.a.e;
import org.a.d.a.f;

public class Markdown {
    private static final c MD_PARSER = new d().a();
    private static final e HTML_RENDERER = new f().a();

    public static String parse(String string) {
        return Markdown.parse(new StringReader(string));
    }

    public static String parse(InputStream inputStream) {
        return Markdown.parse(new InputStreamReader(inputStream));
    }

    public static String parse(Path path) {
        return Markdown.parse(Files.newBufferedReader(path, Charset.forName("UTF-8")));
    }

    public static String parse(Reader object) {
        q q2 = MD_PARSER.a((Reader)object);
        object = HTML_RENDERER;
        StringBuilder stringBuilder = new StringBuilder();
        ((e)object).a(q2, stringBuilder);
        return stringBuilder.toString();
    }
}

