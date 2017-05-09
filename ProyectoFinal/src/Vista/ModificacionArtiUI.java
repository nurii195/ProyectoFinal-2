package Vista;



import javax.swing.JPanel;

import Modelo.Articulo;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class ModificacionArtiUI extends JPanel {
	protected JTextField textNombreModificar;
	protected JTextField textPrecioModificar;
	protected JTextField textDescripcionModificar;
	protected JComboBox<Articulo> comboBox;
	protected JButton btnModificar;

	/**
	 * Create the panel.
	 */
	public ModificacionArtiUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblModificacion = new JLabel("Modificacion De Articulo");
		lblModificacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblModificacion = new GridBagConstraints();
		gbc_lblModificacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblModificacion.gridx = 4;
		gbc_lblModificacion.gridy = 1;
		add(lblModificacion, gbc_lblModificacion);
		
		comboBox = new JComboBox<Articulo>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 3;
		add(comboBox, gbc_comboBox);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 5;
		add(lblNombre, gbc_lblNombre);
		
		textNombreModificar = new JTextField();
		GridBagConstraints gbc_textNombreModificar = new GridBagConstraints();
		gbc_textNombreModificar.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreModificar.gridx = 4;
		gbc_textNombreModificar.gridy = 5;
		add(textNombreModificar, gbc_textNombreModificar);
		textNombreModificar.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 2;
		gbc_lblPrecio.gridy = 7;
		add(lblPrecio, gbc_lblPrecio);
		
		textPrecioModificar = new JTextField();
		GridBagConstraints gbc_textPrecioModificar = new GridBagConstraints();
		gbc_textPrecioModificar.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecioModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecioModificar.gridx = 4;
		gbc_textPrecioModificar.gridy = 7;
		add(textPrecioModificar, gbc_textPrecioModificar);
		textPrecioModificar.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 2;
		gbc_lblDescripcion.gridy = 9;
		add(lblDescripcion, gbc_lblDescripcion);
		
		textDescripcionModificar = new JTextField();
		GridBagConstraints gbc_textDescripcionModificar = new GridBagConstraints();
		gbc_textDescripcionModificar.insets = new Insets(0, 0, 5, 5);
		gbc_textDescripcionModificar.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDescripcionModificar.gridx = 4;
		gbc_textDescripcionModificar.gridy = 9;
		add(textDescripcionModificar, gbc_textDescripcionModificar);
		textDescripcionModificar.setColumns(10);
		
		btnModificar = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 4;
		gbc_btnModificar.gridy = 11;
		add(btnModificar, gbc_btnModificar);
	

	}

}
