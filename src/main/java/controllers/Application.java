package controllers;
import java.awt.EventQueue;

import views.ApplicationView;

public class Application {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationView view = new ApplicationView();
					view.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
