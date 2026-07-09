/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.impact;

import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.github.Github;
import io.github.ImpactDevelopment.installer.impact.ImpactVersionReleased;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImpactVersions {
    private static final List<ImpactVersionReleased> VERSIONS = Stream.of(Github.getReleases("ImpactDevelopment/ImpactReleases")).filter(githubRelease -> !githubRelease.draft && (!githubRelease.prerelease || Installer.args.prereleases)).map(ImpactVersionReleased::new).filter(impactVersionReleased -> impactVersionReleased.possiblySigned() || Installer.args.noGPG).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

    public static List<ImpactVersionReleased> getAllVersions() {
        return VERSIONS;
    }
}

