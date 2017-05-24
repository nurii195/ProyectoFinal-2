package vista.articulo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class AltaArtiUI extends JPanel {
	protected JTextField textIdArticulo;
	protected JTextField textPrecioArticulo;
	protected JTextField txtNombreArticulo;
	protected JTextField textDescripcionArticulo;
	protected JButton btnGuardar;
	private JPanel panel;
	private JLabel lblunid;

	/**
	 * Create the panel.
	 */
	public AltaArtiUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 206, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblAltaArticulo = new JLabel("Alta Articulo");
		lblAltaArticulo.setForeground(new Color(32, 178, 170));
		lblAltaArticulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblAltaArticulo = new GridBagConstraints();
		gbc_lblAltaArticulo.gridwidth = 4;
		gbc_lblAltaArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltaArticulo.gridx = 1;
		gbc_lblAltaArticulo.gridy = 1;
		add(lblAltaArticulo, gbc_lblAltaArticulo);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 84, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblIdarticulo = new JLabel("Id Articulo");
		lblIdarticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIdarticulo = new GridBagConstraints();
		gbc_lblIdarticulo.anchor = GridBagConstraints.WEST;
		gbc_lblIdarticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdarticulo.gridx = 1;
		gbc_lblIdarticulo.gridy = 1;
		panel.add(lblIdarticulo, gbc_lblIdarticulo);
		
		textIdArticulo = new JTextField();
		GridBagConstraints gbc_textIdArticulo = new GridBagConstraints();
		gbc_textIdArticulo.anchor = GridBagConstraints.WEST;
		gbc_textIdArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textIdArticulo.gridx = 3;
		gbc_textIdArticulo.gridy = 1;
		panel.add(textIdArticulo, gbc_textIdArticulo);
		textIdArticulo.setEditable(false);
		textIdArticulo.setColumns(10);
		
		JLabel lblNombreArt = new JLabel("Nombre");
		lblNombreArt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombreArt = new GridBagConstraints();
		gbc_lblNombreArt.anchor = GridBagConstraints.WEST;
		gbc_lblNombreArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArt.gridx = 1;
		gbc_lblNombreArt.gridy = 3;
		panel.add(lblNombreArt, gbc_lblNombreArt);
		
		txtNombreArticulo = new JTextField();
		GridBagConstraints gbc_txtNombreArticulo = new GridBagConstraints();
		gbc_txtNombreArticulo.gridwidth = 4;
		gbc_txtNombreArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreArticulo.gridx = 3;
		gbc_txtNombreArticulo.gridy = 3;
		panel.add(txtNombreArticulo, gbc_txtNombreArticulo);
		txtNombreArticulo.setColumns(10);
		
		JLabel lblPrecioArti = new JLabel("Precio");
		lblPrecioArti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblPrecioArti = new GridBagConstraints();
		gbc_lblPrecioArti.anchor = GridBagConstraints.WEST;
		gbc_lblPrecioArti.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioArti.gridx = 1;
		gbc_lblPrecioArti.gridy = 5;
		panel.add(lblPrecioArti, gbc_lblPrecioArti);
		
		textPrecioArticulo = new JTextField();
		GridBagConstraints gbc_textPrecioArticulo = new GridBagConstraints();
		gbc_textPrecioArticulo.anchor = GridBagConstraints.WEST;
		gbc_textPrecioArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecioArticulo.gridx = 3;
		gbc_textPrecioArticulo.gridy = 5;
		panel.add(textPrecioArticulo, gbc_textPrecioArticulo);
		textPrecioArticulo.setColumns(10);
		
		lblunid = new JLabel("\u20AC/Unid");
		lblunid.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblunid = new GridBagConstraints();
		gbc_lblunid.anchor = GridBagConstraints.WEST;
		gbc_lblunid.insets = new Insets(0, 0, 5, 5);
		gbc_lblunid.gridx = 4;
		gbc_lblunid.gridy = 5;
		panel.add(lblunid, gbc_lblunid);
		
		JLabel lblDescripcionArt = new JLabel("Descripcion");
		lblDescripcionArt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDescripcionArt = new GridBagConstraints();
		gbc_lblDescripcionArt.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcionArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcionArt.gridx = 1;
		gbc_lblDescripcionArt.gridy = 7;
		panel.add(lblDescripcionArt, gbc_lblDescripcionArt);
		
		textDescripcionArticulo = new JTextField();
		GridBagConstraints gbc_textDescripcionArticulo = new GridBagConstraints();
		gbc_textDescripcionArticulo.fill = GridBagConstraints.BOTH;
		gbc_textDescripcionArticulo.gridwidth = 4;
		gbc_textDescripcionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textDescripcionArticulo.gridx = 3;
		gbc_textDescripcionArticulo.gridy = 7;
		panel.add(textDescripcionArticulo, gbc_textDescripcionArticulo);
		textDescripcionArticulo.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.gridwidth = 4;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 3;
		add(btnGuardar, gbc_btnGuardar);

	}

}
