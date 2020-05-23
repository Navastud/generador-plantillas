package controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import enums.MenuItem;

public class MenuItemController extends AbstractAction {

	private static final long serialVersionUID = -49022680632934061L;

	private MenuItem item;

	private JFrame frame;

	public MenuItemController(MenuItem item, JFrame frame) {
		super(item.name);
		this.item = item;
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent evt) {

		frame.getContentPane().removeAll();
		item.generatePanel(frame);

	}
}
