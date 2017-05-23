package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class AltaArtiUI extends JPanel {
	protected JTextField textIdArticulo;
	protected JTextField textPrecioArticulo;
	protected JTextField txtNombreArticulo;
	protected JTextField textDescripcionArticulo;
	protected JButton btnGuardar;

	/**
	 * Create the panel.
	 */
	public AltaArtiUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 206, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblAltaArticulo = new JLabel("Alta Articulo");
		lblAltaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblAltaArticulo = new GridBagConstraints();
		gbc_lblAltaArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltaArticulo.gridx = 4;
		gbc_lblAltaArticulo.gridy = 1;
		add(lblAltaArticulo, gbc_lblAltaArticulo);
		
		JLabel lblIdarticulo = new JLabel("Id Articulo");
		GridBagConstraints gbc_lblIdarticulo = new GridBagConstraints();
		gbc_lblIdarticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdarticulo.gridx = 2;
		gbc_lblIdarticulo.gridy = 3;
		add(lblIdarticulo, gbc_lblIdarticulo);
		
		textIdArticulo = new JTextField();
		textIdArticulo.setEditable(false);
		GridBagConstraints gbc_textIdArticulo = new GridBagConstraints();
		gbc_textIdArticulo.anchor = GridBagConstraints.WEST;
		gbc_textIdArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textIdArticulo.gridx = 4;
		gbc_textIdArticulo.gridy = 3;
		add(textIdArticulo, gbc_textIdArticulo);
		textIdArticulo.setColumns(10);
		
		JLabel lblNombreArt = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreArt = new GridBagConstraints();
		gbc_lblNombreArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArt.gridx = 2;
		gbc_lblNombreArt.gridy = 5;
		add(lblNombreArt, gbc_lblNombreArt);
		
		txtNombreArticulo = new JTextField();
		GridBagConstraints gbc_txtNombreArticulo = new GridBagConstraints();
		gbc_txtNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreArticulo.gridx = 4;
		gbc_txtNombreArticulo.gridy = 5;
		add(txtNombreArticulo, gbc_txtNombreArticulo);
		txtNombreArticulo.setColumns(10);
		
		JLabel lblPrecioArti = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecioArti = new GridBagConstraints();
		gbc_lblPrecioArti.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioArti.gridx = 2;
		gbc_lblPrecioArti.gridy = 7;
		add(lblPrecioArti, gbc_lblPrecioArti);
		
		textPrecioArticulo = new JTextField();
		GridBagConstraints gbc_textPrecioArticulo = new GridBagConstraints();
		gbc_textPrecioArticulo.anchor = GridBagConstraints.WEST;
		gbc_textPrecioArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecioArticulo.gridx = 4;
		gbc_textPrecioArticulo.gridy = 7;
		add(textPrecioArticulo, gbc_textPrecioArticulo);
		textPrecioArticulo.setColumns(10);
		
		JLabel lblDescripcionArt = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcionArt = new GridBagConstraints();
		gbc_lblDescripcionArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcionArt.gridx = 2;
		gbc_lblDescripcionArt.gridy = 9;
		add(lblDescripcionArt, gbc_lblDescripcionArt);
		
		textDescripcionArticulo = new JTextField();
		GridBagConstraints gbc_textDescripcionArticulo = new GridBagConstraints();
		gbc_textDescripcionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textDescripcionArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDescripcionArticulo.gridx = 4;
		gbc_textDescripcionArticulo.gridy = 9;
		add(textDescripcionArticulo, gbc_textDescripcionArticulo);
		textDescripcionArticulo.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 4;
		gbc_btnGuardar.gridy = 11;
		add(btnGuardar, gbc_btnGuardar);

	}

}
