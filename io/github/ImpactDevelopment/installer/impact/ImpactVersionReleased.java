/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.impact;

import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.github.GithubRelease;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonLibrary;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonVersion;
import io.github.ImpactDevelopment.installer.impact.ImpactVersion;
import io.github.ImpactDevelopment.installer.libraries.ILibrary;
import io.github.ImpactDevelopment.installer.libraries.LibraryCustomURL;
import io.github.ImpactDevelopment.installer.utils.GPG;

public class ImpactVersionReleased
extends ImpactVersion {
    private final GithubRelease release;

    public ImpactVersionReleased(GithubRelease githubRelease) {
        super(githubRelease.tagName);
        this.release = githubRelease;
    }

    @Override
    public ImpactJsonVersion fetchContents() {
        if (this.fetchedContents == null) {
            if (Installer.args.noGPG) {
                System.out.println("SKIPPING SIGNATURE VERIFICATION DUE TO COMMAND LINE OPTION I HOPE YOU KNOW WHAT YOURE DOING");
            } else {
                System.out.println("Verifying GPG signatures on Impact release " + this.release.tagName);
                if (!GPG.verifyRelease(this.release, this.jsonFileName(), this.jsonFileName() + ".asc", set -> set.size() >= 2)) {
                    throw new RuntimeException("Invalid signature on Impact release " + this.release.tagName);
                }
            }
            this.fetchedContents = Installer.gson.a(this.release.byName(this.jsonFileName()).get().fetch(), ImpactJsonVersion.class);
        }
        this.sanityCheck();
        return this.fetchedContents;
    }

    @Override
    public ILibrary resolveSelf(ImpactJsonLibrary impactJsonLibrary) {
        this.sanityCheck(impactJsonLibrary);
        return new LibraryCustomURL(impactJsonLibrary, this.release.byName((String)new StringBuilder((String)"Impact-").append((String)this.release.tagName).append((String)".jar").toString()).get().browserDownloadUrl);
    }

    public boolean possiblySigned() {
        return this.release.byName(this.jsonFileName() + ".asc").isPresent();
    }
}

