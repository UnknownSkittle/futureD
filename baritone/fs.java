/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  axn
 */
package baritone;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.io.IOException;
import org.apache.commons.lang3.SystemUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fs {
    private static TrayIcon a;
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public static void a(String string) {
        if (SystemUtils.IS_OS_WINDOWS) {
            fs.b(string);
            return;
        }
        if (SystemUtils.IS_OS_MAC_OSX) {
            fs.c(string);
            return;
        }
        if (SystemUtils.IS_OS_LINUX) {
            fs.d(string);
        }
    }

    private static void b(String string) {
        if (SystemTray.isSupported()) {
            try {
                if (a == null) {
                    SystemTray systemTray = SystemTray.getSystemTray();
                    Image image = Toolkit.getDefaultToolkit().createImage("");
                    a = new TrayIcon(image, "Baritone");
                    a.setImageAutoSize(true);
                    a.setToolTip("Baritone");
                    systemTray.add(a);
                }
                a.displayMessage("Baritone", string, TrayIcon.MessageType.ERROR);
                return;
            } catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        System.out.println("SystemTray is not supported");
    }

    private static void c(String string) {
        ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
        processBuilder.command("osascript", "-e", "display notification \"" + string + "\" with title \"Baritone\"");
        try {
            processBuilder.start();
            return;
        } catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    private static void d(String string) {
        ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
        processBuilder.command("notify-send", "-a", "Baritone", string);
        try {
            processBuilder.start();
            return;
        } catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public fs(axn axn2) {
        this.a = axn2.b();
        this.b = axn2.d();
        this.c = axn2.c();
        this.d = axn2.e();
    }

    public final boolean a(int n2, int n3) {
        return (double)(n2 + 1) > this.a && (double)n2 < this.b && (double)(n3 + 1) > this.c && (double)n3 < this.d;
    }

    public final boolean b(int n2, int n3) {
        return (double)n2 > this.a && (double)(n2 + 1) < this.b && (double)n3 > this.c && (double)(n3 + 1) < this.d;
    }
}

