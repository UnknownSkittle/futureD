/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IDefaultProvider;
import com.beust.jcommander.IStringConverterFactory;
import com.beust.jcommander.IStringConverterInstanceFactory;
import com.beust.jcommander.JCommander;
import java.nio.charset.Charset;
import java.util.ResourceBundle;

public class JCommander$Builder {
    private JCommander jCommander = new JCommander();
    private String[] args = null;

    public JCommander$Builder addObject(Object object) {
        this.jCommander.addObject(object);
        return this;
    }

    public JCommander$Builder resourceBundle(ResourceBundle resourceBundle) {
        this.jCommander.setDescriptionsBundle(resourceBundle);
        return this;
    }

    public JCommander$Builder args(String[] stringArray) {
        this.args = stringArray;
        return this;
    }

    public JCommander$Builder expandAtSign(Boolean bl2) {
        this.jCommander.setExpandAtSign(bl2);
        return this;
    }

    public JCommander$Builder programName(String string) {
        this.jCommander.setProgramName(string);
        return this;
    }

    public JCommander$Builder columnSize(int n2) {
        this.jCommander.setColumnSize(n2);
        return this;
    }

    public JCommander$Builder defaultProvider(IDefaultProvider iDefaultProvider) {
        this.jCommander.setDefaultProvider(iDefaultProvider);
        return this;
    }

    public JCommander$Builder addConverterFactory(IStringConverterFactory iStringConverterFactory) {
        this.jCommander.addConverterFactory(iStringConverterFactory);
        return this;
    }

    public JCommander$Builder verbose(int n2) {
        this.jCommander.setVerbose(n2);
        return this;
    }

    public JCommander$Builder allowAbbreviatedOptions(boolean bl2) {
        this.jCommander.setAllowAbbreviatedOptions(bl2);
        return this;
    }

    public JCommander$Builder acceptUnknownOptions(boolean bl2) {
        this.jCommander.setAcceptUnknownOptions(bl2);
        return this;
    }

    public JCommander$Builder allowParameterOverwriting(boolean bl2) {
        this.jCommander.setAllowParameterOverwriting(bl2);
        return this;
    }

    public JCommander$Builder atFileCharset(Charset charset) {
        this.jCommander.setAtFileCharset(charset);
        return this;
    }

    public JCommander$Builder addConverterInstanceFactory(IStringConverterInstanceFactory iStringConverterInstanceFactory) {
        this.jCommander.addConverterInstanceFactory(iStringConverterInstanceFactory);
        return this;
    }

    public JCommander$Builder addCommand(Object object) {
        this.jCommander.addCommand(object);
        return this;
    }

    public JCommander$Builder addCommand(String string, Object object, String ... stringArray) {
        this.jCommander.addCommand(string, object, stringArray);
        return this;
    }

    public JCommander build() {
        if (this.args != null) {
            this.jCommander.parse(this.args);
        }
        return this.jCommander;
    }
}

