/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.tools.obfuscation.service;

import java.util.Collection;
import java.util.Set;
import org.spongepowered.tools.obfuscation.service.ObfuscationTypeDescriptor;

public interface IObfuscationService {
    public Set<String> getSupportedOptions();

    public Collection<ObfuscationTypeDescriptor> getObfuscationTypes();
}

