package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class AltaArticuloUI extends JFrame {

	private JPanel contentPane;
	private JTextField textNombreArticulo;
	private JTextField txtPrecioarticulo;
	private JTextField txtDescripcionArticulo;
	private JTextField textField;
	private JButton btnGuardarAltaArticulo;

	public AltaArticuloUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblAltaDeArticulos = new JLabel("Alta de Articulos");
		lblAltaDeArticulos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblAltaDeArticulos = new GridBagConstraints();
		gbc_lblAltaDeArticulos.gridwidth = 3;
		gbc_lblAltaDeArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltaDeArticulos.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_lblAltaDeArticulos.gridx = 3;
		gbc_lblAltaDeArticulos.gridy = 0;
		contentPane.add(lblAltaDeArticulos, gbc_lblAltaDeArticulos);
		
		JLabel lblIdArticulo = new JLabel("Id Articulo");
		GridBagConstraints gbc_lblIdArticulo = new GridBagConstraints();
		gbc_lblIdArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblIdArticulo.gridx = 6;
		gbc_lblIdArticulo.gridy = 1;
		contentPane.add(lblIdArticulo, gbc_lblIdArticulo);
		
		JLabel lblNombreArticulo = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreArticulo = new GridBagConstraints();
		gbc_lblNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticulo.gridx = 1;
		gbc_lblNombreArticulo.gridy = 2;
		contentPane.add(lblNombreArticulo, gbc_lblNombreArticulo);
		
		textNombreArticulo = new JTextField();
		GridBagConstraints gbc_textNombreArticulo = new GridBagConstraints();
		gbc_textNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreArticulo.gridx = 3;
		gbc_textNombreArticulo.gridy = 2;
		contentPane.add(textNombreArticulo, gbc_textNombreArticulo);
		textNombreArticulo.setColumns(10);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 6;
		gbc_textField.gridy = 2;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblPrecioArticulo = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecioArticulo = new GridBagConstraints();
		gbc_lblPrecioArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioArticulo.gridx = 1;
		gbc_lblPrecioArticulo.gridy = 4;
		contentPane.add(lblPrecioArticulo, gbc_lblPrecioArticulo);
		
		txtPrecioarticulo = new JTextField();
		GridBagConstraints gbc_txtPrecioarticulo = new GridBagConstraints();
		gbc_txtPrecioarticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioarticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioarticulo.gridx = 3;
		gbc_txtPrecioarticulo.gridy = 4;
		contentPane.add(txtPrecioarticulo, gbc_txtPrecioarticulo);
		txtPrecioarticulo.setColumns(10);
		
		JLabel lblDescripcionArticulo = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcionArticulo = new GridBagConstraints();
		gbc_lblDescripcionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcionArticulo.gridx = 1;
		gbc_lblDescripcionArticulo.gridy = 6;
		contentPane.add(lblDescripcionArticulo, gbc_lblDescripcionArticulo);
		
		txtDescripcionArticulo = new JTextField();
		GridBagConstraints gbc_txtDescripcionArticulo = new GridBagConstraints();
		gbc_txtDescripcionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcionArticulo.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcionArticulo.gridx = 3;
		gbc_txtDescripcionArticulo.gridy = 6;
		contentPane.add(txtDescripcionArticulo, gbc_txtDescripcionArticulo);
		txtDescripcionArticulo.setColumns(10);
		
		btnGuardarAltaArticulo = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardarAltaArticulo = new GridBagConstraints();
		gbc_btnGuardarAltaArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_btnGuardarAltaArticulo.gridx = 6;
		gbc_btnGuardarAltaArticulo.gridy = 6;
		contentPane.add(btnGuardarAltaArticulo, gbc_btnGuardarAltaArticulo);
	}

}
