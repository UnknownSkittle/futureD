/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.defaultprovider;

import com.beust.jcommander.IDefaultProvider;
import com.beust.jcommander.ParameterException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class PropertyFileDefaultProvider
implements IDefaultProvider {
    public static final String DEFAULT_FILE_NAME = "jcommander.properties";
    private Properties properties;

    public PropertyFileDefaultProvider() {
        this.init(DEFAULT_FILE_NAME);
    }

    public PropertyFileDefaultProvider(String string) {
        this.init(string);
    }

    private void init(String string) {
        try {
            this.properties = new Properties();
            URL uRL = ClassLoader.getSystemResource(string);
            if (uRL != null) {
                this.properties.load(uRL.openStream());
                return;
            }
            throw new ParameterException("Could not find property file: " + string + " on the class path");
        } catch (IOException iOException) {
            throw new ParameterException("Could not open property file: ".concat(String.valueOf(string)));
        }
    }

    @Override
    public String getDefaultValueFor(String string) {
        int n2;
        for (n2 = 0; n2 < string.length() && !Character.isLetterOrDigit(string.charAt(n2)); ++n2) {
        }
        string = string.substring(n2);
        return this.properties.getProperty(string);
    }
}

