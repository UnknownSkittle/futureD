/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.IStringConverter;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressConverter
implements IStringConverter<InetAddress> {
    @Override
    public InetAddress convert(String string) {
        try {
            return InetAddress.getByName(string);
        } catch (UnknownHostException unknownHostException) {
            throw new IllegalArgumentException(string, unknownHostException);
        }
    }
}

