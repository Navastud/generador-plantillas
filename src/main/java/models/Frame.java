package models;

import javax.swing.JFrame;

public class Frame extends JFrame {

	private static final long serialVersionUID = -2234406768733542695L;

	private static JFrame frame = new Frame();

	public static JFrame getInstance() {
		return frame;
	}

}
