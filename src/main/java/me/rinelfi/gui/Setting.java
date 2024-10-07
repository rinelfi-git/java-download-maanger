package me.rinelfi.gui;

import javax.swing.*;

public class Setting extends JDialog {
	public Setting(JFrame parent) {
		super(parent);
		this.setSize(820, 500);
		this.setTitle("Settings");
		this.setResizable(false);
		this.setLocationRelativeTo(parent);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}
	public void open(int order) {
		if (order > 0)
			System.out.println("Open " + order);
		super.setVisible(true);
	}
}
