package enums;

import java.util.Arrays;
import java.util.List;

public enum Menu {

	INICIO("Inicio", Arrays.asList(MenuItem.GENERADOR, MenuItem.SALIR)),
	CONFIGURACION("Configuración", Arrays.asList(MenuItem.CONF_GENERADOR)),
	AYUDA("Ayuda", Arrays.asList(MenuItem.VERSION));

	public String name;

	public List<MenuItem> items;

	private Menu(String name, List<MenuItem> items) {
		this.name = name;
		this.items = items;
	}

}
