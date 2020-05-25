package views;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import models.enums.TypeFile;

public class UploadFileController extends AbstractAction {

	private static final long serialVersionUID = -2011717556878818638L;

	private TypeFile type;
	private UploadFile uploadFile;

	public UploadFileController(TypeFile type, UploadFile uploadFile) {
		super();
		this.type = type;
		this.uploadFile = uploadFile;
	}

	public void actionPerformed(ActionEvent e) {

		JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		fileChooser.setFileSelectionMode(type.chooser);
		int showOpenDialog = fileChooser.showOpenDialog(null);

		if (showOpenDialog == JFileChooser.APPROVE_OPTION) {
			this.uploadFile.setFile(fileChooser.getSelectedFile().getAbsolutePath());
		} else {
			this.uploadFile.setFile(type.description);
		}
	}

}
