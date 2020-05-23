package views;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import models.MenuBar;

public class ApplicationView {

	private JFrame frame;

	public ApplicationView() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 860, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new MenuBar(frame);
		frame.setJMenuBar(menuBar);
	}

	public void setVisible(boolean isVisible) {
		this.frame.setVisible(isVisible);
	}

}
