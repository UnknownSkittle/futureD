/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.github;

import com.a.a.a.b;
import io.github.ImpactDevelopment.installer.utils.Fetcher;

public class ReleaseAsset {
    public String name;
    public int size;
    @b(a="browser_download_url")
    public String browserDownloadUrl;
    private String fetchedData;

    public synchronized String fetch() {
        if (this.fetchedData == null) {
            this.fetchedData = Fetcher.fetch(this.browserDownloadUrl);
        }
        return this.fetchedData;
    }
}

