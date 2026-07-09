/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.github;

import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.github.GithubRelease;
import io.github.ImpactDevelopment.installer.utils.Fetcher;
import java.util.HashMap;
import java.util.Map;

public class Github {
    private static Map<String, GithubRelease[]> CACHE = new HashMap<String, GithubRelease[]>();

    public static synchronized GithubRelease[] getReleases(String string) {
        return CACHE.computeIfAbsent(string, Github::fetchReleases);
    }

    private static GithubRelease[] fetchReleases(String string) {
        System.out.println("Fetching releases from ".concat(String.valueOf(string)));
        if (string.equals("ImpactDevelopment/ImpactReleases")) {
            try {
                return Github.getFromURL("http://impactclient.net/releases.json");
            } catch (Throwable throwable) {
                System.out.println("Unable to fetch from epic site http");
                throwable.printStackTrace();
                try {
                    return Github.getFromURL("https://impactclient.net/releases.json");
                } catch (Throwable throwable2) {
                    System.out.println("Unable to fetch from epic site https");
                    throwable2.printStackTrace();
                }
            }
        }
        return Github.getFromURL("https://api.github.com/repos/" + string + "/releases?per_page=100");
    }

    private static GithubRelease[] getFromURL(String githubReleaseArray) {
        if ((githubReleaseArray = Installer.gson.a(Fetcher.fetch((String)githubReleaseArray), GithubRelease[].class)).length == 0) {
            throw new RuntimeException("Empty response");
        }
        return githubReleaseArray;
    }
}

