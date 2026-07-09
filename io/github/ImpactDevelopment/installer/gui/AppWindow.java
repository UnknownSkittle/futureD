/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.gui;

import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.gui.AppIcon;
import io.github.ImpactDevelopment.installer.gui.pages.MainPage;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.utils.OperatingSystem;
import io.github.ImpactDevelopment.installer.utils.Tracky;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class AppWindow
extends JFrame {
    public final InstallationConfig config;
    private final JPanel wrapper;

    public AppWindow(InstallationConfig installationConfig) {
        this.config = installationConfig;
        this.setTitle(Installer.getTitle());
        this.setDefaultCloseOperation(3);
        if (OperatingSystem.getOS() == OperatingSystem.OSX) {
            System.setProperty("com.apple.mrj.application.apple.menu.about.name", this.getTitle());
        }
        this.wrapper = new JPanel();
        this.wrapper.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.wrapper.setLayout(new BoxLayout(this.wrapper, 1));
        AppWindow appWindow = this;
        appWindow.setContentPane(appWindow.wrapper);
        this.setContent(AppWindow.loadingScreen());
        this.setSize(690, 420);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        AppIcon.setAppIcon(this);
        this.recreate();
        Tracky.event("installer", "display", null);
    }

    public void recreate() {
        SwingUtilities.invokeLater(() -> {
            try {
                this.setContent(new MainPage(this));
                this.validate();
                this.repaint();
                return;
            } catch (Throwable throwable) {
                this.exception(throwable);
                return;
            }
        });
    }

    public void exception(Throwable throwable) {
        throwable.printStackTrace();
        String string = throwable.getMessage() + "\n";
        if (throwable.getCause() != null) {
            string = string + throwable.getCause();
            if (throwable.getCause().getCause() != null) {
                string = string + "\n" + throwable.getCause().getCause();
            }
        }
        JOptionPane.showMessageDialog(this, string, "Error", 0);
    }

    private void setContent(JPanel jPanel) {
        this.wrapper.removeAll();
        this.wrapper.add(jPanel);
    }

    private static JPanel loadingScreen() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        jPanel.add(Box.createVerticalGlue());
        JComponent jComponent = new JLabel("Loading...");
        jComponent.setAlignmentX(0.5f);
        jPanel.add(jComponent);
        jComponent = new JProgressBar();
        ((JProgressBar)jComponent).setIndeterminate(true);
        jPanel.add(jComponent);
        jPanel.add(Box.createVerticalGlue());
        return jPanel;
    }
}

