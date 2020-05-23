package models;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controllers.MenuItemController;
import enums.Menu;
import enums.MenuItem;

public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = 7734133357089257477L;

	private JFrame frame;

	public MenuBar(JFrame frame) {
		this.frame = frame;
		initialize();
	}

	private void initialize() {

		for (Menu menu : Menu.values()) {

			JMenu jMenu = new JMenu(menu.name);

			for (MenuItem item : menu.items) {
				jMenu.add(new JMenuItem(new MenuItemController(item, frame)));
			}

			add(jMenu);

		}
	}

}
