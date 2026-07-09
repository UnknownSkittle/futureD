/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.target.targets;

import com.a.a.y;
import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.setting.InstallationConfig;
import io.github.ImpactDevelopment.installer.target.InstallationMode;
import io.github.ImpactDevelopment.installer.target.targets.Vanilla;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class MultiMC
implements InstallationMode {
    private final InstallationConfig config;

    public MultiMC(InstallationConfig installationConfig) {
        this.config = installationConfig;
    }

    @Override
    public String apply() {
        y y2 = new Vanilla(this.config).generateMultiMCJsonVersion();
        String string = Installer.gson.a(y2);
        if (Installer.args.noGUI) {
            return string;
        }
        SwingUtilities.invokeLater(() -> {
            y2 = new JFrame(((y)y2).b("version").b());
            JTextArea jTextArea = new JTextArea();
            jTextArea.setEditable(true);
            jTextArea.append(string);
            jTextArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            ((JFrame)((Object)y2)).getContentPane().add(new JScrollPane(jTextArea));
            ((Window)((Object)y2)).setSize(690, 420);
            ((Window)((Object)y2)).setVisible(true);
        });
        return "Here is the JSON for MultiMC " + y2.b("version");
    }
}

