package me.rinelfi;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import me.rinelfi.gui.Window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightFlatIJTheme());
            SwingUtilities.invokeLater(() -> {
                Window win = new Window();
                win.build();
            });
        } catch (Exception ex) {
            System.out.println("Impossible de charger le thème : " + ex.getMessage());
        }
    }
}