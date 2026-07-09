/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.gui.pages;

import io.github.ImpactDevelopment.installer.gui.AppWindow;
import io.github.ImpactDevelopment.installer.setting.ChoiceSetting;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.setting.Setting;
import io.github.ImpactDevelopment.installer.setting.settings.ImpactVersionSetting;
import io.github.ImpactDevelopment.installer.setting.settings.InstallationModeSetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftDirectorySetting;
import io.github.ImpactDevelopment.installer.setting.settings.MinecraftVersionSetting;
import io.github.ImpactDevelopment.installer.setting.settings.OptiFineSetting;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MainPage
extends JPanel {
    public MainPage(AppWindow appWindow) {
        this.setLayout(new BoxLayout(this, 1));
        this.addPathSetting(MinecraftDirectorySetting.INSTANCE, "Minecraft directory", appWindow);
        this.addSetting(InstallationModeSetting.INSTANCE, "Install for", appWindow);
        this.addSetting(MinecraftVersionSetting.INSTANCE, "Minecraft version", appWindow);
        this.addSetting(ImpactVersionSetting.INSTANCE, "Impact version", appWindow);
        this.addSetting(OptiFineSetting.INSTANCE, "OptiFine version", appWindow);
        JButton jButton = new JButton("Install");
        jButton.addActionListener(object -> {
            try {
                object = appWindow.config.execute();
                JOptionPane.showMessageDialog(appWindow, object, "\ud83d\ude0e", 1);
                return;
            } catch (Throwable throwable) {
                appWindow.exception(throwable);
                return;
            }
        });
        this.add(jButton);
    }

    private <T> void addSetting(ChoiceSetting<T> choiceSetting, String jComboBox, AppWindow appWindow) {
        Object t2 = appWindow.config.getSettingValue(choiceSetting);
        if (t2 == null) {
            return;
        }
        InstallationConfig installationConfig = appWindow.config;
        JPanel jPanel = new JPanel(new FlowLayout());
        if (t2.equals("Missing")) {
            jPanel.add(new JLabel("No OptiFine installation is detected for Minecraft " + installationConfig.getSettingValue(MinecraftVersionSetting.INSTANCE)));
            jComboBox = new JButton();
            ((AbstractButton)((Object)jComboBox)).setText("<html>If you need OptiFine, install it separately beforehand. <font color=\"#0000CC\"><u>https://optifine.net/downloads</u></font></html>");
            jComboBox.setBackground(Color.WHITE);
            ((AbstractButton)((Object)jComboBox)).setBorderPainted(false);
            ((AbstractButton)((Object)jComboBox)).setHorizontalAlignment(2);
            jComboBox.setOpaque(false);
            ((AbstractButton)((Object)jComboBox)).addActionListener(actionEvent -> {
                try {
                    Desktop.getDesktop().browse(new URI("https://optifine.net/downloads"));
                    return;
                } catch (Exception exception) {
                    appWindow.exception(exception);
                    return;
                }
            });
            jPanel.add(jComboBox);
            this.add(jPanel);
            return;
        }
        jPanel.add(new JLabel((String)((Object)jComboBox) + ": "));
        jComboBox = new JComboBox(choiceSetting.getPossibleValues(installationConfig).stream().map(object -> choiceSetting.displayName(installationConfig, object)).toArray(String[]::new));
        jComboBox.setSelectedIndex(choiceSetting.getPossibleValues(installationConfig).indexOf(t2));
        jComboBox.addActionListener(actionEvent -> {
            try {
                ChoiceSetting choiceSetting2 = choiceSetting;
                installationConfig.setSettingValue(choiceSetting2, choiceSetting2.getPossibleValues(installationConfig).get(jComboBox.getSelectedIndex()));
            } catch (Throwable throwable) {
                appWindow.exception(throwable);
                installationConfig.setSettingValue(choiceSetting, t2);
            }
            appWindow.recreate();
        });
        jPanel.add(jComboBox);
        if (!t2.equals("None") && choiceSetting instanceof OptiFineSetting) {
            jPanel.add(new JLabel("OptiFine can sometimes cause visual glitches in Impact; only include it if you need it."));
        }
        this.add(jPanel);
    }

    private void addPathSetting(Setting<Path> setting, String string, AppWindow appWindow) {
        InstallationConfig installationConfig = appWindow.config;
        Object object = installationConfig.getSettingValue(setting);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        JTextField jTextField = new JTextField(object.toString());
        jTextField.setColumns(15);
        JButton jButton = new JButton("Browse");
        object = new JFileChooser(object.toFile());
        ((JFileChooser)object).setFileSelectionMode(1);
        JTextField jTextField2 = jTextField;
        jTextField2.addActionListener(actionEvent -> {
            jTextField2 = Paths.get(((JTextComponent)jTextField2).getText(), new String[0]);
            installationConfig.setSettingValue(setting, jTextField2);
            appWindow.recreate();
        });
        jButton.addActionListener(arg_0 -> MainPage.lambda$addPathSetting$6((JFileChooser)object, appWindow, installationConfig, setting, arg_0));
        jPanel.add(new JLabel(string + ": "));
        jPanel.add(jTextField);
        jPanel.add(jButton);
        this.add(jPanel);
    }

    private static /* synthetic */ void lambda$addPathSetting$6(JFileChooser object, AppWindow appWindow, InstallationConfig installationConfig, Setting setting, ActionEvent actionEvent) {
        if (((JFileChooser)object).showOpenDialog(appWindow) == 0) {
            object = ((JFileChooser)object).getSelectedFile().toPath();
            installationConfig.setSettingValue(setting, object);
            appWindow.recreate();
        }
    }
}

