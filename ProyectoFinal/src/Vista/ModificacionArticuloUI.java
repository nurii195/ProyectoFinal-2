package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Articulo;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class ModificacionArticuloUI extends JFrame {

	private JPanel contentPane;
	protected JTextField txtNombreArticuloModif;
	protected JTextField txtPrecioArticuloModif;
	protected JTextField txtDescripcionArticuloModif;
	protected JButton btnModificarArticulo;
	protected JComboBox<Articulo> comboBox;

	public ModificacionArticuloUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblModificacionArticulo = new JLabel("Modificacion de Articulo");
		lblModificacionArticulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblModificacionArticulo = new GridBagConstraints();
		gbc_lblModificacionArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModificacionArticulo.gridx = 2;
		gbc_lblModificacionArticulo.gridy = 0;
		contentPane.add(lblModificacionArticulo, gbc_lblModificacionArticulo);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 2;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel lblNombreArticuloModif = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreArticuloModif = new GridBagConstraints();
		gbc_lblNombreArticuloModif.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticuloModif.gridx = 0;
		gbc_lblNombreArticuloModif.gridy = 4;
		contentPane.add(lblNombreArticuloModif, gbc_lblNombreArticuloModif);
		
		txtNombreArticuloModif = new JTextField();
		GridBagConstraints gbc_txtNombreArticuloModif = new GridBagConstraints();
		gbc_txtNombreArticuloModif.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreArticuloModif.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreArticuloModif.gridx = 2;
		gbc_txtNombreArticuloModif.gridy = 4;
		contentPane.add(txtNombreArticuloModif, gbc_txtNombreArticuloModif);
		txtNombreArticuloModif.setColumns(10);
		
		JLabel lblPrecioArticuloModif = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecioArticuloModif = new GridBagConstraints();
		gbc_lblPrecioArticuloModif.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioArticuloModif.gridx = 0;
		gbc_lblPrecioArticuloModif.gridy = 6;
		contentPane.add(lblPrecioArticuloModif, gbc_lblPrecioArticuloModif);
		
		txtPrecioArticuloModif = new JTextField();
		GridBagConstraints gbc_txtPrecioArticuloModif = new GridBagConstraints();
		gbc_txtPrecioArticuloModif.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioArticuloModif.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioArticuloModif.gridx = 2;
		gbc_txtPrecioArticuloModif.gridy = 6;
		contentPane.add(txtPrecioArticuloModif, gbc_txtPrecioArticuloModif);
		txtPrecioArticuloModif.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 0;
		gbc_lblDescripcion.gridy = 8;
		contentPane.add(lblDescripcion, gbc_lblDescripcion);
		
		txtDescripcionArticuloModif = new JTextField();
		GridBagConstraints gbc_txtDescripcionArticuloModif = new GridBagConstraints();
		gbc_txtDescripcionArticuloModif.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcionArticuloModif.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescripcionArticuloModif.gridx = 2;
		gbc_txtDescripcionArticuloModif.gridy = 8;
		contentPane.add(txtDescripcionArticuloModif, gbc_txtDescripcionArticuloModif);
		txtDescripcionArticuloModif.setColumns(10);
		
		btnModificarArticulo = new JButton("Modificar");
		GridBagConstraints gbc_btnModificarArticulo = new GridBagConstraints();
		gbc_btnModificarArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarArticulo.gridx = 2;
		gbc_btnModificarArticulo.gridy = 10;
		contentPane.add(btnModificarArticulo, gbc_btnModificarArticulo);
	}

}
