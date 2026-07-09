/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import java.util.regex.Pattern;
import org.a.a.a;
import org.a.b.j;
import org.a.c.a.b;
import org.a.c.a.f;

public final class o
extends b {
    private static final Pattern[][] a = new Pattern[][]{{null, null}, {Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, {Pattern.compile("^<!--"), Pattern.compile("-->")}, {Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, {Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, {Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, {Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|meta|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, {Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    private final j b = new j();
    private final Pattern c;
    private boolean d = false;
    private a e = new a();

    private o(Pattern pattern) {
        this.c = pattern;
    }

    @Override
    public final org.a.b.a b() {
        return this.b;
    }

    @Override
    public final org.a.c.a.a a(f f2) {
        if (this.d) {
            return null;
        }
        if (f2.g() && this.c == null) {
            return null;
        }
        return org.a.c.a.a.a(f2.c());
    }

    @Override
    public final void a(CharSequence charSequence) {
        this.e.a(charSequence);
        if (this.c != null && this.c.matcher(charSequence).find()) {
            this.d = true;
        }
    }

    @Override
    public final void c() {
        this.b.a(this.e.a());
        this.e = null;
    }

    static /* synthetic */ Pattern[][] d() {
        return a;
    }

    /* synthetic */ o(Pattern pattern, byte by2) {
        this(pattern);
    }
}

