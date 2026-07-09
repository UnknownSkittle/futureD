/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.github;

import com.a.a.a.b;
import io.github.ImpactDevelopment.installer.github.ReleaseAsset;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class GithubRelease {
    @b(a="tag_name")
    public String tagName;
    public boolean draft;
    public boolean prerelease;
    public ReleaseAsset[] assets;

    public Optional<ReleaseAsset> byName(String string) {
        return this.byName(string::equals);
    }

    public Optional<ReleaseAsset> byName(Predicate<String> predicate) {
        return Stream.of(this.assets).filter(releaseAsset -> predicate.test(releaseAsset.name)).findFirst();
    }
}

