/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.impact;

import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonLibrary;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonVersion;
import io.github.ImpactDevelopment.installer.impact.ImpactVersion;
import io.github.ImpactDevelopment.installer.libraries.ILibrary;
import io.github.ImpactDevelopment.installer.libraries.LibraryCustomURL;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import org.apache.commons.b.b;

public class ImpactVersionDisk
extends ImpactVersion {
    private final Path pathToFile;

    public ImpactVersionDisk(Path path) {
        super(ImpactVersionDisk.validateAndStrip(path));
        this.pathToFile = path;
        if (!path.getFileName().toString().equals(this.jsonFileName())) {
            throw new IllegalArgumentException(path.getFileName().toString() + " " + this.jsonFileName());
        }
    }

    private static String validateAndStrip(Path object) {
        if (!((String)(object = object.getFileName().toString())).startsWith("Impact-") || !((String)object).endsWith(".json") || ((String)object).split("-").length < 3) {
            throw new IllegalArgumentException("Malformed json name ".concat(String.valueOf(object)));
        }
        return ((String)object).split("Impact-")[1].split("\\.json")[0];
    }

    @Override
    public ImpactJsonVersion fetchContents() {
        if (this.fetchedContents == null) {
            if (!Installer.args.noGPG) {
                throw new IllegalArgumentException("Unable to verify GPG on local file!");
            }
            try {
                this.fetchedContents = Installer.gson.a(b.a(this.pathToFile.toFile().toURI(), StandardCharsets.UTF_8), ImpactJsonVersion.class);
            } catch (IOException iOException) {
                throw new RuntimeException("Unable to load file", iOException);
            }
        }
        this.sanityCheck();
        return this.fetchedContents;
    }

    @Override
    public ILibrary resolveSelf(ImpactJsonLibrary impactJsonLibrary) {
        this.sanityCheck(impactJsonLibrary);
        return new LibraryCustomURL(impactJsonLibrary, this.pathToFile.toUri().toString().replace(".json", ".jar"));
    }
}

