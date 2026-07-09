/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.target.targets;

import com.a.a.aa;
import com.a.a.v;
import com.a.a.y;
import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftDirectorySetting;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Date;
import java.util.Map;
import java.util.Optional;
import org.apache.a.b.d.a;
import org.apache.commons.b.b;

public class VanillaProfiles {
    private static final String ICON;
    private final Path launcherProfiles;
    private final y json;

    public VanillaProfiles(InstallationConfig installationConfig) {
        this.launcherProfiles = installationConfig.getSettingValue(MinecraftDirectorySetting.INSTANCE).resolve("launcher_profiles.json");
        this.json = this.loadFileToJson();
    }

    public void addOrMutate(String string, String string2) {
        y y2 = this.getProfilesList();
        Optional<String> optional = this.findProfileIdFromName(string);
        if (!optional.isPresent()) {
            y y3 = y2;
            y2 = new y();
            y3.a(string, y2);
            y2.a("name", string);
        } else {
            y2 = y2.b(optional.get()).g();
        }
        y2.a("lastUsed", Installer.dateFormat.format(new Date()));
        y2.a("lastVersionId", string2);
        y2.a("icon", ICON);
        y2.a("type", "custom");
    }

    private Optional<String> findProfileIdFromName(String string) {
        for (Map.Entry<String, v> entry : this.getProfilesList().h()) {
            Object object;
            if (!(entry.getValue() instanceof y) || !((y)(object = entry.getValue().g())).a("name") || !(((y)object).b("name") instanceof aa) || !string.equals(object = ((y)object).b("name").b())) continue;
            return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }

    private y getProfilesList() {
        if (!this.json.a("profiles")) {
            this.json.a("profiles", new y());
        }
        if (!(this.json.b("profiles") instanceof y)) {
            throw new RuntimeException(String.format("\"profiles\" is not an object in \"%s\"", this.launcherProfiles.toAbsolutePath().toString()));
        }
        return this.json.b("profiles").g();
    }

    private y loadFileToJson() {
        Object object = Files.readAllBytes(this.launcherProfiles);
        object = new String((byte[])object, StandardCharsets.UTF_8);
        new a();
        return a.a(new StringReader((String)object)).g();
    }

    public void saveToDisk() {
        System.out.println("Saving modified profiles to " + this.launcherProfiles);
        byte[] byArray = Installer.gson.a(this.json).getBytes(StandardCharsets.UTF_8);
        Files.write(this.launcherProfiles, byArray, new OpenOption[0]);
    }

    public static void checkDirectory(Path path) {
        if (Files.exists(path.resolve("launcher_profiles.json"), new LinkOption[0])) {
            return;
        }
        if (Files.exists(path.getParent().resolve("launcher_profiles.json"), new LinkOption[0])) {
            throw new RuntimeException("Invalid Minecraft path. Did you mean " + path.getParent() + "?");
        }
        throw new RuntimeException("Vanilla Minecraft not detected at " + path + ", have you opened the Minecraft launcher before?");
    }

    static {
        try {
            ICON = "data:image/png;base64," + Base64.getEncoder().encodeToString(b.a(ClassLoader.getSystemResourceAsStream("icons/128.png")));
            return;
        } catch (IOException iOException) {
            throw new RuntimeException("getting icon", iOException);
        }
    }
}

