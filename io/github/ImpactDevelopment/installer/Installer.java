/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer;

import com.a.a.k;
import com.a.a.r;
import com.beust.jcommander.JCommander;
import io.github.ImpactDevelopment.installer.Args;
import io.github.ImpactDevelopment.installer.gui.AppIcon;
import io.github.ImpactDevelopment.installer.gui.AppWindow;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.utils.OperatingSystem;
import io.github.ImpactDevelopment.installer.utils.Tracky;
import java.net.URL;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Installer {
    public static final String project = "Impact";
    public static final k gson = new r().a().b();
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
    public static final Args args = new Args();

    public static void main(String ... object) {
        object = JCommander.newBuilder().programName(Installer.getCommand()).addObject(args).args((String[])object).build();
        if (Installer.args.showUsage) {
            ((JCommander)object).usage();
            return;
        }
        if (Installer.args.showVersion) {
            System.out.println(Installer.getVersion());
            return;
        }
        object = new InstallationConfig();
        args.apply((InstallationConfig)object);
        if (Installer.args.noGUI) {
            object = ((InstallationConfig)object).execute();
            System.out.println("Message: ".concat(String.valueOf(object)));
            return;
        }
        Tracky.awtEnabled();
        Installer.setupGUI((InstallationConfig)object);
    }

    private static void setupGUI(InstallationConfig installationConfig) {
        if (OperatingSystem.getOS() != OperatingSystem.OSX) {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        if (OperatingSystem.getOS() == OperatingSystem.WINDOWS) {
            String[] stringArray = new String[]{"OptionPane.warningIcon", "OptionPane.questionIcon", "OptionPane.errorIcon", "OptionPane.informationIcon"};
            for (int i2 = 0; i2 < 4; ++i2) {
                UIManager.put(stringArray[i2], AppIcon.getLargestIcon(64));
            }
        }
        if (OperatingSystem.getOS() == OperatingSystem.OSX) {
            System.setProperty("apple.awt.fileDialogForDirectories", "true");
        }
        SwingUtilities.invokeLater(() -> new AppWindow(installationConfig));
    }

    private static String getCommand() {
        String string = Installer.getFilename();
        if (string.toLowerCase().endsWith(".jar")) {
            return String.format("java -jar %s", string);
        }
        return string;
    }

    private static String getFilename() {
        try {
            URL uRL = args.getClass().getProtectionDomain().getCodeSource().getLocation();
            try {
                return Paths.get(uRL.toURI()).getFileName().toString();
            } catch (Throwable throwable) {
                return uRL.getPath();
            }
        } catch (Throwable throwable) {
            return String.format("<%s>", Installer.getTitle());
        }
    }

    public static String getVersion() {
        return args.getClass().getPackage().getImplementationVersion();
    }

    public static String getTitle() {
        return "Impact Installer";
    }
}

