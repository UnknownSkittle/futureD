/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.impact;

import io.github.ImpactDevelopment.installer.impact.ImpactJsonLibrary;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonVersion;
import io.github.ImpactDevelopment.installer.libraries.ILibrary;

public abstract class ImpactVersion {
    public final String impactVersion;
    public final String mcVersion;
    protected ImpactJsonVersion fetchedContents;

    public ImpactVersion(String string) {
        this.impactVersion = ImpactVersion.splitReleaseName(string)[0];
        this.mcVersion = ImpactVersion.splitReleaseName(string)[1];
    }

    public String getCombinedVersion() {
        return this.impactVersion + "-" + this.mcVersion;
    }

    private static String[] splitReleaseName(String string) {
        int n2 = string.lastIndexOf(45);
        return new String[]{string.substring(0, n2), string.substring(n2 + 1)};
    }

    public abstract ImpactJsonVersion fetchContents();

    public abstract ILibrary resolveSelf(ImpactJsonLibrary var1);

    protected void sanityCheck() {
        if (!this.fetchedContents.mcVersion.equals(this.mcVersion)) {
            throw new IllegalStateException(this.fetchedContents.mcVersion + " " + this.mcVersion);
        }
        if (!this.fetchedContents.version.equals(this.impactVersion)) {
            throw new IllegalStateException(this.fetchedContents.version + " " + this.impactVersion);
        }
        if (!this.fetchedContents.name.equals("Impact")) {
            throw new IllegalStateException(this.fetchedContents.name);
        }
    }

    protected void sanityCheck(ImpactJsonLibrary impactJsonLibrary) {
        if (!impactJsonLibrary.name.equals("com.github.ImpactDevelopment:Impact:" + this.getCombinedVersion())) {
            throw new IllegalStateException(impactJsonLibrary.name + " " + this.getCombinedVersion());
        }
    }

    protected String jsonFileName() {
        return "Impact-" + this.getCombinedVersion() + ".json";
    }
}

