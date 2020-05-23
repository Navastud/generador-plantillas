package enums;

import javax.swing.JFrame;

public enum MenuItem {

	INICIO("Inicio") {
		@Override
		public void generatePanel(JFrame frame) {
			// TODO Auto-generated method stub

		}
	},
	GENERADOR("Generador Plantilla") {
		@Override
		public void generatePanel(JFrame frame) {
			// TODO Auto-generated method stub

		}
	},
	CONFIGURACIÓN("Configuración") {
		@Override
		public void generatePanel(JFrame frame) {
			// TODO Auto-generated method stub

		}
	},
	SALIR("Salir") {
		@Override
		public void generatePanel(JFrame frame) {
			// TODO Auto-generated method stub

		}
	},
	VERSION("version") {
		@Override
		public void generatePanel(JFrame frame) {
			// TODO Auto-generated method stub

		}
	},
	CONF_GENERADOR("Configuración Generador") {
		@Override
		public void generatePanel(JFrame frame) {
			// TODO Auto-generated method stub

		}
	};

	public String name;

	private MenuItem(String name) {
		this.name = name;
	}

	public abstract void generatePanel(JFrame frame);

}
