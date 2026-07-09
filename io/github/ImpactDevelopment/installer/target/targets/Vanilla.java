/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.target.targets;

import com.a.a.s;
import com.a.a.y;
import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.impact.ImpactJsonVersion;
import io.github.ImpactDevelopment.installer.libraries.ILibrary;
import io.github.ImpactDevelopment.installer.libraries.MavenResolver;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.ImpactVersionSetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftDirectorySetting;
import io.github.ImpactDevelopment.installer.setting.settings.OptiFineSetting;
import io.github.ImpactDevelopment.installer.target.InstallationMode;
import io.github.ImpactDevelopment.installer.target.targets.VanillaProfiles;
import io.github.ImpactDevelopment.installer.utils.OperatingSystem;
import io.github.ImpactDevelopment.installer.utils.Tracky;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Optional;
import org.apache.commons.b.b;

public class Vanilla
implements InstallationMode {
    private final String id;
    private final ImpactJsonVersion version;
    private final InstallationConfig config;

    public Vanilla(InstallationConfig installationConfig) {
        this.version = installationConfig.getSettingValue(ImpactVersionSetting.INSTANCE).fetchContents();
        this.config = installationConfig;
        this.id = this.version.mcVersion + "-" + this.version.name + "_" + this.version.version + this.prettifiedOptifineVersion().orElse("");
    }

    public y generateVanillaJsonVersion() {
        y y2 = new y();
        y2.a("id", this.id);
        y2.a("type", "release");
        y2.a("inheritsFrom", this.version.mcVersion);
        y2.a("jar", this.version.mcVersion);
        y2.a("time", this.version.date);
        y2.a("releaseTime", this.version.date);
        y2.a("downloads", new y());
        y2.a("minimumLauncherVersion", 0);
        y2.a("mainClass", this.version.mainClass);
        this.populateArguments(y2);
        this.populateLibraries(y2, false);
        return y2;
    }

    public y generateMultiMCJsonVersion() {
        y y2 = new y();
        s s2 = new s();
        this.version.tweakers.forEach(s2::a);
        y2.a("fileID", "net.impactclient.Impact");
        y2.a("mainClass", this.version.mainClass);
        y2.a("mcVersion", this.version.mcVersion);
        y2.a("name", "Impact " + this.version.version);
        y2.a("order", 10);
        y2.a("version", this.id);
        y2.a("+tweakers", s2);
        this.populateLibraries(y2, true);
        return y2;
    }

    private void populateArguments(y y2) {
        if (this.version.mcVersion.compareTo("1.12.2") <= 0) {
            String string3 = "--username ${auth_player_name} --version ${version_name} --gameDir ${game_directory} --assetsDir ${assets_root} --assetIndex ${assets_index_name} --uuid ${auth_uuid} --accessToken ${auth_access_token} --userType ${user_type}";
            String string4 = this.version.tweakers.stream().reduce("", (string, string2) -> string + " --tweakClass " + string2);
            y2.a("minecraftArguments", string3 + string4);
            return;
        }
        s s2 = new s();
        this.version.tweakers.forEach(string -> {
            s2.a("--tweakClass");
            s2.a((String)string);
        });
        y y3 = new y();
        y3.a("game", s2);
        y2.a("arguments", y3);
    }

    private void populateLibraries(y y2, boolean bl2) {
        s s2 = new s();
        for (ILibrary iLibrary : this.version.resolveLibraries(this.config)) {
            this.populateLib(iLibrary, s2);
        }
        if (bl2) {
            y2.a("+libraries", s2);
        } else {
            y2.a("libraries", s2);
        }
        this.populateOptifine(s2);
    }

    private void populateOptifine(s s2) {
        this.optifineVersion().ifPresent(string -> {
            y y2 = new y();
            y2.a("name", "optifine:OptiFine:".concat(String.valueOf(string)));
            s2.a(y2);
        });
    }

    private Optional<String> optifineVersion() {
        return Optional.ofNullable(this.config.getSettingValue(OptiFineSetting.INSTANCE)).filter(string -> !string.equals("None")).filter(string -> !string.equals("Missing"));
    }

    private Optional<String> prettifiedOptifineVersion() {
        return this.optifineVersion().map(string -> {
            if (!string.startsWith(this.version.mcVersion + "_")) {
                throw new IllegalStateException(string + " " + this.version.mcVersion);
            }
            return "-OptiFine" + string.substring(this.version.mcVersion.length());
        });
    }

    private void populateLib(ILibrary iLibrary, s v2) {
        if (this.version.mcVersion.compareTo("1.14.4") >= 0 && this.optifineVersion().isPresent() && iLibrary.getName().equals("net.minecraft:launchwrapper:1.12")) {
            y y2 = new y();
            y2.a("name", "optifine:launchwrapper-of:2.1");
            ((s)v2).a(y2);
            return;
        }
        y y3 = new y();
        y3.a("name", iLibrary.getName());
        ((s)v2).a(y3);
        v2 = new y();
        y3.a("downloads", v2);
        y3 = new y();
        ((y)v2).a("artifact", y3);
        y3.a("path", MavenResolver.partsToPath(iLibrary.getName().split(":")));
        y3.a("sha1", iLibrary.getSHA1());
        y3.a("size", iLibrary.getSize());
        y3.a("url", iLibrary.getURL());
    }

    @Override
    public String apply() {
        this.install(false);
        return "Impact has been successfully installed";
    }

    public void sanityCheck(boolean bl2) {
        this.checkDirectory();
        this.checkVersionInstalled();
        if (!bl2 && Vanilla.isMinecraftLauncherOpen()) {
            throw new RuntimeException("Please close Minecraft and its launcher before continuing");
        }
    }

    public void install(boolean bl2) {
        System.out.println("Installing impact " + this.getId());
        System.out.println("Info:");
        this.version.printInfo();
        Tracky.persist(this.config.getSettingValue(MinecraftDirectorySetting.INSTANCE));
        this.sanityCheck(bl2);
        this.installVersionJson();
        this.installProfiles();
    }

    private void checkDirectory() {
        VanillaProfiles.checkDirectory(this.config.getSettingValue(MinecraftDirectorySetting.INSTANCE));
    }

    private void checkVersionInstalled() {
        Path path = this.config.getSettingValue(MinecraftDirectorySetting.INSTANCE).resolve("versions").resolve(this.version.mcVersion).resolve(this.version.mcVersion + ".jar");
        if (!Files.exists(path, new LinkOption[0])) {
            throw new RuntimeException("Please install and run Vanilla " + this.version.mcVersion + " once as normal before continuing.", new FileNotFoundException(path.toString()));
        }
    }

    private void installVersionJson() {
        System.out.println("Creating vanilla version");
        Path path = this.config.getSettingValue(MinecraftDirectorySetting.INSTANCE).resolve("versions").resolve(this.id);
        if (!Files.exists(path, new LinkOption[0])) {
            try {
                Files.createDirectories(path, new FileAttribute[0]);
            } catch (Exception exception) {
                throw new RuntimeException("Failed to create \"" + path.toAbsolutePath().toString() + "\"");
            }
        }
        System.out.println("Writing to " + path.resolve(this.id + ".json"));
        Files.write(path.resolve(this.id + ".json"), Installer.gson.a(this.generateVanillaJsonVersion()).getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
    }

    private void installProfiles() {
        System.out.println("Loading existing vanilla profiles");
        VanillaProfiles vanillaProfiles = new VanillaProfiles(this.config);
        System.out.println("Injecting impact version...");
        String string = this.version.version.split("-")[0];
        if (string.indexOf(46) != string.lastIndexOf(46)) {
            string = string.substring(0, string.lastIndexOf(46));
        }
        vanillaProfiles.addOrMutate(this.version.name + " " + string + " for " + this.version.mcVersion, this.getId());
        System.out.println("Saving vanilla profiles");
        vanillaProfiles.saveToDisk();
    }

    private static boolean isMinecraftLauncherOpen() {
        try {
            if (OperatingSystem.getOS() == OperatingSystem.WINDOWS) {
                return b.a(new ProcessBuilder("tasklist", "/fi", "WINDOWTITLE eq Minecraft Launcher").start().getInputStream(), StandardCharsets.UTF_8).contains("MinecraftLauncher.exe");
            }
            return b.a(new ProcessBuilder("ps", "-ef").start().getInputStream(), StandardCharsets.UTF_8).contains("Minecraft Launcher");
        } catch (Throwable throwable) {
            return false;
        }
    }

    public String getId() {
        return this.id;
    }
}

