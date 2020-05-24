package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class GenePlantillaDespachoView extends JPanel {

	private static final long serialVersionUID = 4045992971729968507L;

	public GenePlantillaDespachoView() {
		setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		setBackground(Color.WHITE);

		setBounds(100, 100, 860, 640);
		setLayout(null);

		JLabel lblTitulo = new JLabel("Generador Plantilla Despacho");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
		lblTitulo.setBounds(300, 35, 260, 33);
		add(lblTitulo);

		JSeparator sprTitulo = new JSeparator();
		sprTitulo.setBounds(12, 81, 836, 10);
		add(sprTitulo);

		JSeparator sprFormulario = new JSeparator();
		sprFormulario.setBounds(12, 353, 836, 10);
		add(sprFormulario);

		JLabel lblCarpetaDestino = new JLabel("Carpeta Destino:");
		lblCarpetaDestino.setFont(new Font("Arial", Font.BOLD, 18));
		lblCarpetaDestino.setBounds(22, 263, 175, 22);
		add(lblCarpetaDestino);

		JLabel lblArchivoDestino = new JLabel("Archivo Destino:");
		lblArchivoDestino.setFont(new Font("Arial", Font.BOLD, 18));
		lblArchivoDestino.setBounds(22, 228, 175, 22);
		add(lblArchivoDestino);

		Image image = new ImageIcon(getClass().getResource("/iconos/bandeja-de-salida.png")).getImage()
				.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		Icon icon = new ImageIcon(image);

		JPanel uploadFile = new JPanel();
		uploadFile.setBackground(Color.WHITE);
		uploadFile.setBounds(12, 128, 836, 67);
		add(uploadFile);
		uploadFile.setLayout(null);
		JButton btnUpload = new JButton(icon);
		btnUpload.setLocation(0, 0);
		btnUpload.setSize(836, 67);
		btnUpload.setOpaque(false);
		btnUpload.setContentAreaFilled(false);
		btnUpload.setBorderPainted(false);
		uploadFile.add(btnUpload);

		JLabel lblArchivoOrigen = new JLabel("Archivo Origen:");
		lblArchivoOrigen.setBounds(12, 93, 139, 22);
		add(lblArchivoOrigen);
		lblArchivoOrigen.setFont(new Font("Arial", Font.BOLD, 18));
	}
}
