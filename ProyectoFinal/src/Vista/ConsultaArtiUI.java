package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class ConsultaArtiUI extends JPanel {
	protected JTextField textNombreConsultar;
	protected JTextField textCampoRespuesta;
	protected JButton btnConsultar;

	public ConsultaArtiUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblConsultaArticulo = new JLabel("Consulta Articulo");
		lblConsultaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblConsultaArticulo = new GridBagConstraints();
		gbc_lblConsultaArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultaArticulo.gridx = 4;
		gbc_lblConsultaArticulo.gridy = 1;
		add(lblConsultaArticulo, gbc_lblConsultaArticulo);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);
		
		textNombreConsultar = new JTextField();
		GridBagConstraints gbc_textNombreConsultar = new GridBagConstraints();
		gbc_textNombreConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreConsultar.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreConsultar.gridx = 4;
		gbc_textNombreConsultar.gridy = 3;
		add(textNombreConsultar, gbc_textNombreConsultar);
		textNombreConsultar.setColumns(10);
		
		textCampoRespuesta = new JTextField();
		GridBagConstraints gbc_textCampoRespuesta = new GridBagConstraints();
		gbc_textCampoRespuesta.insets = new Insets(0, 0, 5, 5);
		gbc_textCampoRespuesta.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCampoRespuesta.gridx = 4;
		gbc_textCampoRespuesta.gridy = 5;
		add(textCampoRespuesta, gbc_textCampoRespuesta);
		textCampoRespuesta.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
		gbc_btnConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultar.gridx = 4;
		gbc_btnConsultar.gridy = 6;
		add(btnConsultar, gbc_btnConsultar);

	}

}
