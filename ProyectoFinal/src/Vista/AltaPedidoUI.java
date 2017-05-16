package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AltaPedidoUI extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textRefArticuloAP;
	private JTextField textNombreArtAP;
	private JTextField textPrecioAP;
	private JTextField textCantidadAP;

	
	public AltaPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Alta Pedido");
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 13;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblDniAC = new JLabel("D.N.I Cliente");
		GridBagConstraints gbc_lblDniAC = new GridBagConstraints();
		gbc_lblDniAC.anchor = GridBagConstraints.WEST;
		gbc_lblDniAC.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniAC.gridx = 1;
		gbc_lblDniAC.gridy = 3;
		add(lblDniAC, gbc_lblDniAC);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 3;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnBuscarClienteAP = new JButton("Buscar Cliente");
		GridBagConstraints gbc_btnBuscarClienteAP = new GridBagConstraints();
		gbc_btnBuscarClienteAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarClienteAP.gridx = 5;
		gbc_btnBuscarClienteAP.gridy = 3;
		add(btnBuscarClienteAP, gbc_btnBuscarClienteAP);
		
		JLabel lblNombreAP = new JLabel("Nombre ");
		GridBagConstraints gbc_lblNombreAP = new GridBagConstraints();
		gbc_lblNombreAP.anchor = GridBagConstraints.WEST;
		gbc_lblNombreAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreAP.gridx = 1;
		gbc_lblNombreAP.gridy = 5;
		add(lblNombreAP, gbc_lblNombreAP);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 5;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrimerApellidoAP = new JLabel("Primer Apellido");
		GridBagConstraints gbc_lblPrimerApellidoAP = new GridBagConstraints();
		gbc_lblPrimerApellidoAP.anchor = GridBagConstraints.WEST;
		gbc_lblPrimerApellidoAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerApellidoAP.gridx = 1;
		gbc_lblPrimerApellidoAP.gridy = 7;
		add(lblPrimerApellidoAP, gbc_lblPrimerApellidoAP);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 7;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSegundoApellidoAP = new JLabel("Segundo Apellido");
		GridBagConstraints gbc_lblSegundoApellidoAP = new GridBagConstraints();
		gbc_lblSegundoApellidoAP.anchor = GridBagConstraints.WEST;
		gbc_lblSegundoApellidoAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundoApellidoAP.gridx = 1;
		gbc_lblSegundoApellidoAP.gridy = 9;
		add(lblSegundoApellidoAP, gbc_lblSegundoApellidoAP);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 9;
		add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNombreArticulo = new JLabel("Nombre Articulo");
		GridBagConstraints gbc_lblNombreArticulo = new GridBagConstraints();
		gbc_lblNombreArticulo.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
		gbc_lblNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticulo.gridx = 1;
		gbc_lblNombreArticulo.gridy = 11;
		add(lblNombreArticulo, gbc_lblNombreArticulo);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 11;
		add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar Articulo");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 11;
		add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblRefArticuloPA = new JLabel("Referencia Articulo");
		GridBagConstraints gbc_lblRefArticuloPA = new GridBagConstraints();
		gbc_lblRefArticuloPA.insets = new Insets(0, 0, 5, 5);
		gbc_lblRefArticuloPA.gridx = 1;
		gbc_lblRefArticuloPA.gridy = 13;
		add(lblRefArticuloPA, gbc_lblRefArticuloPA);
		
		JLabel lblNombreArticuloAP = new JLabel("Nombre Articulo");
		GridBagConstraints gbc_lblNombreArticuloAP = new GridBagConstraints();
		gbc_lblNombreArticuloAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticuloAP.gridx = 3;
		gbc_lblNombreArticuloAP.gridy = 13;
		add(lblNombreArticuloAP, gbc_lblNombreArticuloAP);
		
		JLabel lblPrecioAP = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecioAP = new GridBagConstraints();
		gbc_lblPrecioAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioAP.gridx = 5;
		gbc_lblPrecioAP.gridy = 13;
		add(lblPrecioAP, gbc_lblPrecioAP);
		
		JLabel lblCantidadAP = new JLabel("Cantidad");
		lblCantidadAP.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblCantidadAP = new GridBagConstraints();
		gbc_lblCantidadAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidadAP.gridx = 7;
		gbc_lblCantidadAP.gridy = 13;
		add(lblCantidadAP, gbc_lblCantidadAP);
		
		textRefArticuloAP = new JTextField();
		GridBagConstraints gbc_textRefArticuloAP = new GridBagConstraints();
		gbc_textRefArticuloAP.insets = new Insets(0, 0, 5, 5);
		gbc_textRefArticuloAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRefArticuloAP.gridx = 1;
		gbc_textRefArticuloAP.gridy = 15;
		add(textRefArticuloAP, gbc_textRefArticuloAP);
		textRefArticuloAP.setColumns(10);
		
		textNombreArtAP = new JTextField();
		GridBagConstraints gbc_textNombreArtAP = new GridBagConstraints();
		gbc_textNombreArtAP.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreArtAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreArtAP.gridx = 3;
		gbc_textNombreArtAP.gridy = 15;
		add(textNombreArtAP, gbc_textNombreArtAP);
		textNombreArtAP.setColumns(10);
		
		textPrecioAP = new JTextField();
		GridBagConstraints gbc_textPrecioAP = new GridBagConstraints();
		gbc_textPrecioAP.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecioAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecioAP.gridx = 5;
		gbc_textPrecioAP.gridy = 15;
		add(textPrecioAP, gbc_textPrecioAP);
		textPrecioAP.setColumns(10);
		
		textCantidadAP = new JTextField();
		GridBagConstraints gbc_textCantidadAP = new GridBagConstraints();
		gbc_textCantidadAP.insets = new Insets(0, 0, 5, 5);
		gbc_textCantidadAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCantidadAP.gridx = 7;
		gbc_textCantidadAP.gridy = 15;
		add(textCantidadAP, gbc_textCantidadAP);
		textCantidadAP.setColumns(10);
		
		JButton btnAñadirAP = new JButton("A\u00F1adir");
		GridBagConstraints gbc_btnAñadirAP = new GridBagConstraints();
		gbc_btnAñadirAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadirAP.gridx = 9;
		gbc_btnAñadirAP.gridy = 15;
		add(btnAñadirAP, gbc_btnAñadirAP);
		
		JButton btnLimpiarAP = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiarAP = new GridBagConstraints();
		gbc_btnLimpiarAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiarAP.gridx = 11;
		gbc_btnLimpiarAP.gridy = 15;
		add(btnLimpiarAP, gbc_btnLimpiarAP);

	}

}
