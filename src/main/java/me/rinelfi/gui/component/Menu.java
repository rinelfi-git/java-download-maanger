package me.rinelfi.gui.component;

import me.rinelfi.gui.Setting;

import javax.swing.*;

public class Menu extends JMenuBar {
	private final JFrame _frame;
	
	public Menu(JFrame frame) {
		JMenu[] menus = this.build();
		
		int i = 0;
		while (i < menus.length)
			this.add(menus[i++]);
		this._frame = frame;
	}
	private JMenu[] build() {
		JMenu menu = new JMenu("Option");
		int i = 0;
		JMenuItem[] menus = new JMenuItem[] {
				new JMenuItem("Setting"),
				new JMenuItem("Browser monitoring"),
				new JMenuItem("Media grabber"),
				new JMenuItem("Removed finished download"),
				new JMenuItem("Export"),
				new JMenuItem("Import"),
				new JMenuItem("Language"),
				new JMenuItem("Check for update"),
				new JMenuItem("About JDM"),
				new JMenuItem("Exit"),
		};
		menus[0].addActionListener(e -> {
			Setting set = new Setting(this._frame);
			set.open(1);
		});
		menus[9].addActionListener(e -> this._frame.dispose());
		while (i < menus.length)
			menu.add(menus[i++]);
		return new JMenu[]{menu};
	}
}
