package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import models.enums.TypeFile;

public class UploadFile extends JPanel {

	private static final long serialVersionUID = 4910590653886735454L;

	private File file;
	private JLabel lblResult;

	public UploadFile(TypeFile type) {
		super();

		UploadFileController controller = new UploadFileController(type, this);

		setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		setBackground(Color.WHITE);
		setSize(800, 220);
		setLayout(new BorderLayout(0, 0));

		Image image = new ImageIcon(getClass().getResource("/iconos/bandeja-de-salida.png")).getImage()
				.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		Icon icon = new ImageIcon(image);

		JButton btnUpload = new JButton(icon);
		btnUpload.addActionListener(controller);
		btnUpload.setBorder(new LineBorder(Color.LIGHT_GRAY));
		btnUpload.setContentAreaFilled(false);
		btnUpload.setOpaque(false);
		btnUpload.setBackground(Color.WHITE);
		add(btnUpload, BorderLayout.SOUTH);

		lblResult = new JLabel(type.description);
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblResult, BorderLayout.CENTER);
	}

	public File getFile() {
		return this.file;
	}

	public void setFile(String pathname) {
		this.file = new File(pathname);
		this.lblResult.setText(pathname);
	}

}
