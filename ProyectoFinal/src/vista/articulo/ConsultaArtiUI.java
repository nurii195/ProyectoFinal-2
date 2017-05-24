package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class ConsultaArtiUI extends JPanel {
	protected JTextField textNombreConsultar;
	protected JButton btnConsultar;
	protected JLabel lblPrecio;
	protected JTextField textPrecioConsulta;
	protected JTextField textCampoRespuestaDescripcion;
	protected JLabel lblDescripcion;
	protected JTextField textRespuesta;
	protected JLabel lblIdarticulo;
	protected JTextField textIdArticulo;
	private JLabel lblunid;

	public ConsultaArtiUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, -20, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblConsultaArticulo = new JLabel("Consulta Articulos");
		lblConsultaArticulo.setForeground(new Color(0, 206, 209));
		lblConsultaArticulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblConsultaArticulo = new GridBagConstraints();
		gbc_lblConsultaArticulo.gridwidth = 11;
		gbc_lblConsultaArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblConsultaArticulo.gridx = 0;
		gbc_lblConsultaArticulo.gridy = 1;
		add(lblConsultaArticulo, gbc_lblConsultaArticulo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);
		
		textNombreConsultar = new JTextField();
		GridBagConstraints gbc_textNombreConsultar = new GridBagConstraints();
		gbc_textNombreConsultar.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreConsultar.gridwidth = 6;
		gbc_textNombreConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreConsultar.gridx = 4;
		gbc_textNombreConsultar.gridy = 3;
		add(textNombreConsultar, gbc_textNombreConsultar);
		textNombreConsultar.setColumns(10);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 2;
		gbc_lblPrecio.gridy = 4;
		add(lblPrecio, gbc_lblPrecio);
		
		textPrecioConsulta = new JTextField();
		textPrecioConsulta.setEditable(false);
		GridBagConstraints gbc_textPrecioConsulta = new GridBagConstraints();
		gbc_textPrecioConsulta.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecioConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecioConsulta.gridx = 4;
		gbc_textPrecioConsulta.gridy = 4;
		add(textPrecioConsulta, gbc_textPrecioConsulta);
		textPrecioConsulta.setColumns(10);
		
		lblunid = new JLabel("\u20AC/Unid");
		lblunid.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblunid = new GridBagConstraints();
		gbc_lblunid.anchor = GridBagConstraints.WEST;
		gbc_lblunid.insets = new Insets(0, 0, 5, 5);
		gbc_lblunid.gridx = 5;
		gbc_lblunid.gridy = 4;
		add(lblunid, gbc_lblunid);
		
		lblIdarticulo = new JLabel("IdArticulo");
		lblIdarticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIdarticulo = new GridBagConstraints();
		gbc_lblIdarticulo.anchor = GridBagConstraints.EAST;
		gbc_lblIdarticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdarticulo.gridx = 8;
		gbc_lblIdarticulo.gridy = 4;
		add(lblIdarticulo, gbc_lblIdarticulo);
		
		textIdArticulo = new JTextField();
		textIdArticulo.setEditable(false);
		GridBagConstraints gbc_textIdArticulo = new GridBagConstraints();
		gbc_textIdArticulo.anchor = GridBagConstraints.WEST;
		gbc_textIdArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textIdArticulo.gridx = 9;
		gbc_textIdArticulo.gridy = 4;
		add(textIdArticulo, gbc_textIdArticulo);
		textIdArticulo.setColumns(10);
		
		lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 2;
		gbc_lblDescripcion.gridy = 6;
		add(lblDescripcion, gbc_lblDescripcion);
		
		textCampoRespuestaDescripcion = new JTextField();
		textCampoRespuestaDescripcion.setEnabled(false);
		GridBagConstraints gbc_textCampoRespuestaDescripcion = new GridBagConstraints();
		gbc_textCampoRespuestaDescripcion.gridwidth = 6;
		gbc_textCampoRespuestaDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_textCampoRespuestaDescripcion.fill = GridBagConstraints.BOTH;
		gbc_textCampoRespuestaDescripcion.gridx = 4;
		gbc_textCampoRespuestaDescripcion.gridy = 6;
		add(textCampoRespuestaDescripcion, gbc_textCampoRespuestaDescripcion);
		textCampoRespuestaDescripcion.setColumns(10);
		
		textRespuesta = new JTextField();
		textRespuesta.setBackground(new Color(224, 255, 255));
		textRespuesta.setEditable(false);
		GridBagConstraints gbc_txtRespuesta = new GridBagConstraints();
		gbc_txtRespuesta.gridwidth = 6;
		gbc_txtRespuesta.insets = new Insets(0, 0, 5, 5);
		gbc_txtRespuesta.fill = GridBagConstraints.BOTH;
		gbc_txtRespuesta.gridx = 4;
		gbc_txtRespuesta.gridy = 8;
		add(textRespuesta, gbc_txtRespuesta);
		textRespuesta.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
		gbc_btnConsultar.anchor = GridBagConstraints.EAST;
		gbc_btnConsultar.gridwidth = 8;
		gbc_btnConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultar.gridx = 2;
		gbc_btnConsultar.gridy = 10;
		add(btnConsultar, gbc_btnConsultar);

	}

}
