/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.target.targets;

import io.github.ImpactDevelopment.installer.impact.ImpactJsonVersion;
import io.github.ImpactDevelopment.installer.libraries.ILibrary;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.settings.ImpactVersionSetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftDirectorySetting;
import io.github.ImpactDevelopment.installer.target.InstallationMode;
import io.github.ImpactDevelopment.installer.utils.Fetcher;
import io.github.ImpactDevelopment.installer.utils.Tracky;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import javax.swing.JOptionPane;
import org.apache.commons.b.b;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.e;

public class Forge
implements InstallationMode {
    private final ImpactJsonVersion version;
    private final InstallationConfig config;

    public Forge(InstallationConfig installationConfig) {
        this.version = installationConfig.getSettingValue(ImpactVersionSetting.INSTANCE).fetchContents();
        this.config = installationConfig;
    }

    @Override
    public String apply() {
        Path path3 = this.config.getSettingValue(MinecraftDirectorySetting.INSTANCE).resolve("mods").resolve(this.version.mcVersion).resolve(this.version.name + "-" + this.version.version + "-" + this.version.mcVersion + ".jar");
        if (!Files.exists(path3.getParent(), new LinkOption[0])) {
            try {
                Files.createDirectories(path3.getParent(), new FileAttribute[0]);
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        Tracky.persist(this.config.getSettingValue(MinecraftDirectorySetting.INSTANCE));
        HashSet<Object> hashSet = new HashSet<Object>();
        try {
            JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(path3.toFile()));
            Throwable throwable = null;
            try {
                for (ILibrary iLibrary : this.version.resolveLibraries(this.config)) {
                    Object object;
                    Object object2 = Fetcher.fetchBytes(iLibrary.getURL());
                    if (((byte[])object2).length != iLibrary.getSize() || !Forge.sha1hex(object2).equals(iLibrary.getSHA1())) {
                        throw new RuntimeException(((byte[])object2).length + " " + iLibrary.getSize() + " " + Forge.sha1hex(object2) + " " + iLibrary.getSHA1());
                    }
                    object2 = new e().a(new ByteArrayInputStream((byte[])object2));
                    while ((object = object2.a()) != null) {
                        if (!object2.a((a)object)) continue;
                        if (((String)(object = object.getName())).equals("META-INF/MANIFEST.MF")) {
                            if (!iLibrary.getName().startsWith("com.github.ImpactDevelopment:Impact:")) continue;
                            jarOutputStream.putNextEntry(new JarEntry((String)object));
                            this.mutateManifest((InputStream)object2, jarOutputStream);
                            continue;
                        }
                        if (((String)object).startsWith("META-INF/MUMFREY") || ((String)object).equals("module-info.class")) continue;
                        if (hashSet.contains(object)) {
                            System.out.println("WARNING: discarding file since I've already included one with the same name: ".concat(String.valueOf(object)));
                            continue;
                        }
                        hashSet.add(object);
                        jarOutputStream.putNextEntry(new JarEntry((String)object));
                        b.a((InputStream)object2, jarOutputStream);
                    }
                }
            } catch (Throwable throwable2) {
                try {
                    Throwable throwable3 = throwable2;
                    throwable = throwable2;
                    throw throwable3;
                } catch (Throwable throwable4) {
                    if (throwable != null) {
                        try {
                            jarOutputStream.close();
                        } catch (Throwable throwable5) {
                            throwable.addSuppressed(throwable5);
                        }
                    } else {
                        jarOutputStream.close();
                    }
                    throw throwable4;
                }
            }
            jarOutputStream.close();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        try {
            Files.list(path3.getParent()).filter(path2 -> !path2.equals(path3)).filter(path -> path.getFileName().toString().startsWith("Impact-")).filter(path -> path.getFileName().toString().endsWith(".jar")).forEach(path -> {
                try {
                    JOptionPane.showMessageDialog(null, "Replacing ".concat(String.valueOf(path)), "\ud83d\ude0e", 1);
                    Files.delete(path);
                    return;
                } catch (IOException iOException) {
                    JOptionPane.showMessageDialog(null, "Failed to remove ".concat(String.valueOf(path)), "\ud83d\ude0e", 0);
                    iOException.printStackTrace();
                    return;
                }
            });
        } catch (IOException iOException) {
            JOptionPane.showMessageDialog(null, "Error while checking for older Impact Forge installations: " + iOException.getLocalizedMessage(), "\ud83d\ude0e", 0);
            iOException.printStackTrace();
        }
        return "Impact Forge has been successfully installed at ".concat(String.valueOf(path3));
    }

    private void mutateManifest(InputStream closeable, OutputStream outputStream) {
        String string;
        closeable = new BufferedReader(new InputStreamReader((InputStream)closeable, StandardCharsets.UTF_8));
        while (null != (string = ((BufferedReader)closeable).readLine())) {
            if (string.startsWith("TweakClass:")) {
                string = "TweakClass: org.spongepowered.asm.launch.MixinTweaker";
            }
            if (string.isEmpty()) continue;
            string = string + "\n";
            outputStream.write(string.getBytes(StandardCharsets.UTF_8));
        }
        outputStream.write("\n".getBytes(StandardCharsets.UTF_8));
    }

    public static String sha1hex(byte[] byArray) {
        try {
            byArray = MessageDigest.getInstance("SHA-1").digest(byArray);
            String string = "";
            for (byte by2 : byArray) {
                string = string + String.format("%02x", by2);
            }
            return string;
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
    }
}

