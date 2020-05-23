package enums;

import java.util.Arrays;
import java.util.List;

public enum Menu {

	INICIO("Inicio", Arrays.asList(MenuItem.INICIO, MenuItem.SALIR)),
	GENERADOR("Generador", Arrays.asList(MenuItem.GEN_PLANTILLA_DESPACHO)),
	CONFIGURACION("Configuración", Arrays.asList(MenuItem.CONF_PLANTILLA_DESPACHO)),
	AYUDA("Ayuda", Arrays.asList(MenuItem.VERSION));

	public String name;

	public List<MenuItem> items;

	private Menu(String name, List<MenuItem> items) {
		this.name = name;
		this.items = items;
	}

}
