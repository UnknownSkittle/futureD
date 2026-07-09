/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.utils;

import com.brsanthu.googleanalytics.GoogleAnalytics;
import com.brsanthu.googleanalytics.GoogleAnalyticsBuilder;
import com.brsanthu.googleanalytics.GoogleAnalyticsConfig;
import com.brsanthu.googleanalytics.discovery.AwtRequestParameterDiscoverer;
import com.brsanthu.googleanalytics.request.DefaultRequest;
import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftDirectorySetting;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.apache.commons.b.b;

public class Tracky {
    private static final String FILENAME_IN_JAR = "impact_cid.txt";
    private static final String FILENAME_IN_INSTALL = "cid.txt";
    private static final String TRACKY_ID = "UA-143397381-1";
    private static final String CID;
    public static GoogleAnalytics ANALYTICS;

    private static Path mcDir() {
        String string = Installer.args.mcPath;
        if (string != null && !string.isEmpty()) {
            return Paths.get(string, new String[0]);
        }
        return new InstallationConfig().getSettingValue(MinecraftDirectorySetting.INSTANCE);
    }

    public static void awtEnabled() {
        ANALYTICS = Tracky.analytics(true);
    }

    private static GoogleAnalytics analytics(boolean bl2) {
        if (Installer.args.noAnalytics) {
            return null;
        }
        if (CID == null) {
            throw new IllegalArgumentException();
        }
        GoogleAnalyticsBuilder googleAnalyticsBuilder = GoogleAnalytics.builder().withDefaultRequest((DefaultRequest)new DefaultRequest().clientId(CID)).withTrackingId(TRACKY_ID);
        if (bl2) {
            googleAnalyticsBuilder = googleAnalyticsBuilder.withConfig(new GoogleAnalyticsConfig().setRequestParameterDiscoverer(new AwtRequestParameterDiscoverer()));
        }
        return googleAnalyticsBuilder.build();
    }

    public static void event(String string, String string2, String string3) {
        if (Installer.args.noAnalytics) {
            System.out.println("NOT sending event due to analytics being disabled!");
            return;
        }
        System.out.println("Sending event category=" + string + " action=" + string2 + " label=" + string3 + " cid=" + CID);
        try {
            ANALYTICS.event().eventCategory(string).eventAction(string2).eventLabel(string3).sendAsync().get(100L, TimeUnit.MILLISECONDS);
            return;
        } catch (Throwable throwable) {
            return;
        }
    }

    public static void persist(Path path) {
        try {
            if (!Files.exists(path, new LinkOption[0])) {
                System.out.println("Not persisting to nonexistent directory");
                return;
            }
            path = path.resolve("Impact");
            Files.createDirectories(path, new FileAttribute[0]);
            path = path.resolve(FILENAME_IN_INSTALL);
            if (Installer.args.noAnalytics) {
                Files.write(path, new byte[0], new OpenOption[0]);
                return;
            }
            Files.write(path, CID.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE_NEW);
            return;
        } catch (Throwable throwable) {
            return;
        }
    }

    static {
        if (Installer.args.noAnalytics) {
            CID = null;
        } else {
            String string = "";
            try {
                string = b.a(Tracky.class.getResourceAsStream("/impact_cid.txt"), StandardCharsets.UTF_8);
            } catch (Throwable throwable) {}
            if (string.trim().isEmpty()) {
                try {
                    string = new String(Files.readAllBytes(Tracky.mcDir().resolve("Impact").resolve(FILENAME_IN_INSTALL)));
                    if (string.isEmpty()) {
                        Installer.args.noAnalytics = true;
                        string = null;
                    }
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                    string = UUID.randomUUID().toString();
                }
            }
            CID = string;
        }
        ANALYTICS = Tracky.analytics(false);
    }
}

