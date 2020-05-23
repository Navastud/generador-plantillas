package enums;

import javax.swing.JFrame;
import javax.swing.JPanel;

public enum MenuItem {

	INICIO("Inicio") {
		@Override
		public JPanel getJPanel(JFrame frame) {
			// TODO Auto-generated method stub
			return null;
		}
	},
	SALIR("Salir") {
		@Override
		public JPanel getJPanel(JFrame frame) {
			// TODO Auto-generated method stub
			return null;
		}
	},
	VERSION("version") {
		@Override
		public JPanel getJPanel(JFrame frame) {
			// TODO Auto-generated method stub
			return null;
		}
	},
	GEN_PLANTILLA_DESPACHO("Plantilla Despacho") {
		@Override
		public JPanel getJPanel(JFrame frame) {
			// TODO Auto-generated method stub
			return null;
		}
	},
	CONF_PLANTILLA_DESPACHO("Plantilla Despacho") {
		@Override
		public JPanel getJPanel(JFrame frame) {
			// TODO Auto-generated method stub
			return null;
		}
	};

	public String name;

	private MenuItem(String name) {
		this.name = name;
	}

	public abstract JPanel getJPanel(JFrame frame);

}
