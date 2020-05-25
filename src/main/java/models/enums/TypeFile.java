package models.enums;

import javax.swing.JFileChooser;

public enum TypeFile {

	FILE(JFileChooser.FILES_ONLY, "No se ha seleccionado un archivo origen!"),
	FOLDER(JFileChooser.DIRECTORIES_ONLY, "No se ha seleccionado una carpeta destino!");

	public int chooser;
	public String description;

	private TypeFile(int chooser, String description) {
		this.chooser = chooser;
		this.description = description;
	}

}
