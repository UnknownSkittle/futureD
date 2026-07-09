/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.gui;

import io.github.ImpactDevelopment.installer.gui.AppIcon$1;
import io.github.ImpactDevelopment.installer.utils.OperatingSystem;
import java.awt.Image;
import java.awt.Window;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import javax.swing.ImageIcon;

public class AppIcon {
    private static List<ImageIcon> icons;

    private AppIcon() {
    }

    public static List<ImageIcon> getIcons() {
        if (icons == null) {
            icons = AppIcon.loadIcons();
        }
        return icons;
    }

    public static List<Image> getImages() {
        return AppIcon.getIcons().stream().map(ImageIcon::getImage).collect(Collectors.toList());
    }

    public static ImageIcon getIcon(int n2) {
        return AppIcon.getIcons().stream().filter(imageIcon -> imageIcon.getIconHeight() == n2).findFirst().orElse(null);
    }

    public static Image getImage(int n2) {
        return Optional.ofNullable(AppIcon.getIcon(n2)).map(ImageIcon::getImage).orElse(null);
    }

    public static ImageIcon getLargestIcon() {
        List<ImageIcon> list = AppIcon.getIcons();
        if (list.isEmpty()) {
            return null;
        }
        List<ImageIcon> list2 = list;
        return list2.get(list2.size() - 1);
    }

    public static Image getLargestImage() {
        return Optional.ofNullable(AppIcon.getLargestIcon()).map(ImageIcon::getImage).orElse(null);
    }

    public static ImageIcon getSmallestIcon() {
        List<ImageIcon> list = AppIcon.getIcons();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Image getSmallestImage() {
        return Optional.ofNullable(AppIcon.getSmallestIcon()).map(ImageIcon::getImage).orElse(null);
    }

    public static ImageIcon getLargestIcon(int n2) {
        List<ImageIcon> list = AppIcon.getIcons();
        if (!list.isEmpty()) {
            int n3 = list.size();
            while (n3-- > 0) {
                ImageIcon imageIcon = list.get(n3);
                if (imageIcon.getIconHeight() > n2) continue;
                return imageIcon;
            }
        }
        return null;
    }

    public static Image getLargestImage(int n2) {
        return Optional.ofNullable(AppIcon.getLargestIcon(n2)).map(ImageIcon::getImage).orElse(null);
    }

    public static ImageIcon getSmallestIcon(int n2) {
        List<ImageIcon> list = AppIcon.getIcons();
        if (!list.isEmpty()) {
            for (ImageIcon imageIcon : list) {
                if (imageIcon.getIconHeight() < n2) continue;
                return imageIcon;
            }
        }
        return null;
    }

    public static Image getSmallestImage(int n2) {
        return Optional.ofNullable(AppIcon.getSmallestIcon(n2)).map(ImageIcon::getImage).orElse(null);
    }

    public static void setAppIcon(Window object) {
        ((Window)object).setIconImages(AppIcon.getImages());
        if (OperatingSystem.getOS() == OperatingSystem.OSX) {
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            object = AppIcon.getLargestImage(512);
            if (!AppIcon.reflect("java.awt.Taskbar", "getTaskbar", "setIconImage", (Image)object)) {
                AppIcon.reflect("com.apple.eawt.Application", "getApplication", "setDockIconImage", (Image)object);
            }
        }
    }

    private static boolean reflect(String object, String object2, String string, Image image) {
        try {
            object = Class.forName((String)object);
            object2 = ((Class)object).getMethod((String)object2, new Class[0]).invoke(object, new Object[0]);
            ((Class)object).getMethod(string, Image.class).invoke(object2, image);
        } catch (Throwable throwable) {
            return false;
        }
        return true;
    }

    private static List<ImageIcon> loadIcons() {
        try {
            Path path2;
            URI uRI = AppIcon.class.getResource("/icons").toURI();
            try {
                path2 = Paths.get(uRI);
            } catch (Throwable throwable) {
                FileSystems.newFileSystem(uRI, new AppIcon$1());
                path2 = Paths.get(uRI);
            }
            if (!Files.isDirectory(path2, new LinkOption[0])) {
                throw new RuntimeException("icons/ should be a directory");
            }
            return StreamSupport.stream(Files.newDirectoryStream(path2).spliterator(), true).map(path -> {
                try {
                    return new ImageIcon(Files.readAllBytes(path));
                } catch (IOException iOException) {
                    iOException.printStackTrace();
                    return null;
                }
            }).filter(Objects::nonNull).sorted(Comparator.comparingInt(ImageIcon::getIconHeight)).collect(Collectors.toList());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.exit(1);
            return null;
        }
    }
}

