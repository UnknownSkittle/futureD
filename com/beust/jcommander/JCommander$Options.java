/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IDefaultProvider;
import com.beust.jcommander.IStringConverterInstanceFactory;
import com.beust.jcommander.JCommander$1;
import com.beust.jcommander.JCommander$Options$1;
import com.beust.jcommander.ParameterDescription;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.CopyOnWriteArrayList;

class JCommander$Options {
    private ResourceBundle bundle;
    private IDefaultProvider defaultProvider;
    private Comparator<? super ParameterDescription> parameterDescriptionComparator = new JCommander$Options$1(this);
    private int columnSize = 79;
    private boolean acceptUnknownOptions = false;
    private boolean allowParameterOverwriting = false;
    private boolean expandAtSign = true;
    private int verbose = 0;
    private boolean caseSensitiveOptions = true;
    private boolean allowAbbreviatedOptions = false;
    private final List<IStringConverterInstanceFactory> converterInstanceFactories = new CopyOnWriteArrayList<IStringConverterInstanceFactory>();
    private Charset atFileCharset = Charset.defaultCharset();

    private JCommander$Options() {
    }

    /* synthetic */ JCommander$Options(JCommander$1 jCommander$1) {
        this();
    }

    static /* synthetic */ boolean access$102(JCommander$Options jCommander$Options, boolean bl2) {
        jCommander$Options.expandAtSign = bl2;
        return jCommander$Options.expandAtSign;
    }

    static /* synthetic */ ResourceBundle access$202(JCommander$Options jCommander$Options, ResourceBundle resourceBundle) {
        jCommander$Options.bundle = resourceBundle;
        return jCommander$Options.bundle;
    }

    static /* synthetic */ IDefaultProvider access$300(JCommander$Options jCommander$Options) {
        return jCommander$Options.defaultProvider;
    }

    static /* synthetic */ boolean access$100(JCommander$Options jCommander$Options) {
        return jCommander$Options.expandAtSign;
    }

    static /* synthetic */ boolean access$500(JCommander$Options jCommander$Options) {
        return jCommander$Options.caseSensitiveOptions;
    }

    static /* synthetic */ boolean access$600(JCommander$Options jCommander$Options) {
        return jCommander$Options.allowAbbreviatedOptions;
    }

    static /* synthetic */ boolean access$700(JCommander$Options jCommander$Options) {
        return jCommander$Options.acceptUnknownOptions;
    }

    static /* synthetic */ Charset access$800(JCommander$Options jCommander$Options) {
        return jCommander$Options.atFileCharset;
    }

    static /* synthetic */ ResourceBundle access$200(JCommander$Options jCommander$Options) {
        return jCommander$Options.bundle;
    }

    static /* synthetic */ Comparator access$1600(JCommander$Options jCommander$Options) {
        return jCommander$Options.parameterDescriptionComparator;
    }

    static /* synthetic */ Comparator access$1602(JCommander$Options jCommander$Options, Comparator comparator) {
        jCommander$Options.parameterDescriptionComparator = comparator;
        return jCommander$Options.parameterDescriptionComparator;
    }

    static /* synthetic */ int access$1702(JCommander$Options jCommander$Options, int n2) {
        jCommander$Options.columnSize = n2;
        return jCommander$Options.columnSize;
    }

    static /* synthetic */ int access$1700(JCommander$Options jCommander$Options) {
        return jCommander$Options.columnSize;
    }

    static /* synthetic */ int access$1800(JCommander$Options jCommander$Options) {
        return jCommander$Options.verbose;
    }

    static /* synthetic */ IDefaultProvider access$302(JCommander$Options jCommander$Options, IDefaultProvider iDefaultProvider) {
        jCommander$Options.defaultProvider = iDefaultProvider;
        return jCommander$Options.defaultProvider;
    }

    static /* synthetic */ List access$2000(JCommander$Options jCommander$Options) {
        return jCommander$Options.converterInstanceFactories;
    }

    static /* synthetic */ int access$1802(JCommander$Options jCommander$Options, int n2) {
        jCommander$Options.verbose = n2;
        return jCommander$Options.verbose;
    }

    static /* synthetic */ boolean access$502(JCommander$Options jCommander$Options, boolean bl2) {
        jCommander$Options.caseSensitiveOptions = bl2;
        return jCommander$Options.caseSensitiveOptions;
    }

    static /* synthetic */ boolean access$602(JCommander$Options jCommander$Options, boolean bl2) {
        jCommander$Options.allowAbbreviatedOptions = bl2;
        return jCommander$Options.allowAbbreviatedOptions;
    }

    static /* synthetic */ boolean access$702(JCommander$Options jCommander$Options, boolean bl2) {
        jCommander$Options.acceptUnknownOptions = bl2;
        return jCommander$Options.acceptUnknownOptions;
    }

    static /* synthetic */ boolean access$2102(JCommander$Options jCommander$Options, boolean bl2) {
        jCommander$Options.allowParameterOverwriting = bl2;
        return jCommander$Options.allowParameterOverwriting;
    }

    static /* synthetic */ boolean access$2100(JCommander$Options jCommander$Options) {
        return jCommander$Options.allowParameterOverwriting;
    }

    static /* synthetic */ Charset access$802(JCommander$Options jCommander$Options, Charset charset) {
        jCommander$Options.atFileCharset = charset;
        return jCommander$Options.atFileCharset;
    }
}

