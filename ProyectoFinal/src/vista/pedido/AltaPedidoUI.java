package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import modelo.Articulo;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;


public class AltaPedidoUI extends JPanel {
	protected JTextField textDniClienteAP;
	protected JTextField textNombreClienteAP;
	protected JTextField textPrimerApeAP;
	protected JTextField textSegundoApeAP;
	protected JTextField textRefArticuloAP;
	protected JTextField textNombreArtAP;
	protected JTextField textPrecioAP;
	protected JTextField textCantidadAP;
	protected JTable table_1;
	protected JButton btnBuscarClienteAP;
	protected JLabel lblDniAC;
	protected JLabel lblNombreAP;
	protected JLabel lblPrimerApellidoAP;
	protected JLabel lblSegundoApellidoAP;
	protected JLabel lblNombreArticulo;
	protected JLabel lblCantidadAP;
	protected JLabel lblPrecioAP;
	protected JLabel lblNombreArticuloAP;
	protected JLabel lblRefArticuloPA;
	protected JButton btnAñadirAP;
	protected JScrollPane scrollPane;
	protected JButton btnEliminarLineaAP;
	protected JButton btnGuardarAP;
	protected JButton btnLimpiarAP;
	protected JPanel panel;
	protected JPanel panel_1;
	protected JComboBox<Articulo> comboBoxAltaPedido;
	protected JLabel lblIdAltaPedido;


	
	public AltaPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 0, 0, 60, 25, 0, 10};
		gridBagLayout.rowHeights = new int[]{10, 0, 35, 0, 40, 0, 40, 60, 40, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
			
		JLabel lblNewLabel = new JLabel("Alta Pedido");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Busqueda Cliente", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{25, 0, 0, 0, 0, 0, 25, 0};
		gbl_panel.rowHeights = new int[]{25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblDniAC = new JLabel("D.N.I Cliente");
		lblDniAC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDniAC = new GridBagConstraints();
		gbc_lblDniAC.anchor = GridBagConstraints.WEST;
		gbc_lblDniAC.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniAC.gridx = 1;
		gbc_lblDniAC.gridy = 1;
		panel.add(lblDniAC, gbc_lblDniAC);
		
		textDniClienteAP = new JTextField();
		GridBagConstraints gbc_textDniClienteAP = new GridBagConstraints();
		gbc_textDniClienteAP.gridwidth = 3;
		gbc_textDniClienteAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDniClienteAP.insets = new Insets(0, 0, 5, 5);
		gbc_textDniClienteAP.gridx = 3;
		gbc_textDniClienteAP.gridy = 1;
		panel.add(textDniClienteAP, gbc_textDniClienteAP);
		textDniClienteAP.setColumns(10);
		
		lblNombreAP = new JLabel("Nombre ");
		lblNombreAP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombreAP = new GridBagConstraints();
		gbc_lblNombreAP.anchor = GridBagConstraints.WEST;
		gbc_lblNombreAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreAP.gridx = 1;
		gbc_lblNombreAP.gridy = 3;
		panel.add(lblNombreAP, gbc_lblNombreAP);
		
		textNombreClienteAP = new JTextField();
		textNombreClienteAP.setEditable(false);
		GridBagConstraints gbc_textNombreClienteAP = new GridBagConstraints();
		gbc_textNombreClienteAP.gridwidth = 3;
		gbc_textNombreClienteAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreClienteAP.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreClienteAP.gridx = 3;
		gbc_textNombreClienteAP.gridy = 3;
		panel.add(textNombreClienteAP, gbc_textNombreClienteAP);
		textNombreClienteAP.setColumns(10);
		
		lblPrimerApellidoAP = new JLabel("Primer Apellido");
		lblPrimerApellidoAP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblPrimerApellidoAP = new GridBagConstraints();
		gbc_lblPrimerApellidoAP.anchor = GridBagConstraints.WEST;
		gbc_lblPrimerApellidoAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerApellidoAP.gridx = 1;
		gbc_lblPrimerApellidoAP.gridy = 5;
		panel.add(lblPrimerApellidoAP, gbc_lblPrimerApellidoAP);
		
		textPrimerApeAP = new JTextField();
		textPrimerApeAP.setEditable(false);
		GridBagConstraints gbc_textPrimerApeAP = new GridBagConstraints();
		gbc_textPrimerApeAP.gridwidth = 3;
		gbc_textPrimerApeAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrimerApeAP.insets = new Insets(0, 0, 5, 5);
		gbc_textPrimerApeAP.gridx = 3;
		gbc_textPrimerApeAP.gridy = 5;
		panel.add(textPrimerApeAP, gbc_textPrimerApeAP);
		textPrimerApeAP.setColumns(10);
		
		lblSegundoApellidoAP = new JLabel("Segundo Apellido");
		lblSegundoApellidoAP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblSegundoApellidoAP = new GridBagConstraints();
		gbc_lblSegundoApellidoAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundoApellidoAP.gridx = 1;
		gbc_lblSegundoApellidoAP.gridy = 7;
		panel.add(lblSegundoApellidoAP, gbc_lblSegundoApellidoAP);
		
		textSegundoApeAP = new JTextField();
		textSegundoApeAP.setEditable(false);
		GridBagConstraints gbc_textSegundoApeAP = new GridBagConstraints();
		gbc_textSegundoApeAP.gridwidth = 3;
		gbc_textSegundoApeAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSegundoApeAP.insets = new Insets(0, 0, 5, 5);
		gbc_textSegundoApeAP.gridx = 3;
		gbc_textSegundoApeAP.gridy = 7;
		panel.add(textSegundoApeAP, gbc_textSegundoApeAP);
		textSegundoApeAP.setColumns(10);
		
		btnBuscarClienteAP = new JButton("Buscar Cliente");
		GridBagConstraints gbc_btnBuscarClienteAP = new GridBagConstraints();
		gbc_btnBuscarClienteAP.anchor = GridBagConstraints.EAST;
		gbc_btnBuscarClienteAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarClienteAP.gridx = 5;
		gbc_btnBuscarClienteAP.gridy = 9;
		panel.add(btnBuscarClienteAP, gbc_btnBuscarClienteAP);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Busqueda Articulo", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 3;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 0};
		gbl_panel_1.rowHeights = new int[]{25, 0, 0, 0, 0, 0, 25, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblNombreArticulo = new JLabel("Nombre Articulo");
		lblNombreArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombreArticulo = new GridBagConstraints();
		gbc_lblNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticulo.gridx = 1;
		gbc_lblNombreArticulo.gridy = 1;
		panel_1.add(lblNombreArticulo, gbc_lblNombreArticulo);
		
		comboBoxAltaPedido = new JComboBox<Articulo>();
		GridBagConstraints gbc_comboBoxAltaPedido = new GridBagConstraints();
		gbc_comboBoxAltaPedido.gridwidth = 5;
		gbc_comboBoxAltaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxAltaPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxAltaPedido.gridx = 3;
		gbc_comboBoxAltaPedido.gridy = 1;
		panel_1.add(comboBoxAltaPedido, gbc_comboBoxAltaPedido);
		
		DefaultComboBoxModel<Articulo> model = new DefaultComboBoxModel<>();
		comboBoxAltaPedido.setModel(model);
		
		lblRefArticuloPA = new JLabel("Referencia Articulo");
		lblRefArticuloPA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblRefArticuloPA = new GridBagConstraints();
		gbc_lblRefArticuloPA.insets = new Insets(0, 0, 5, 5);
		gbc_lblRefArticuloPA.gridx = 1;
		gbc_lblRefArticuloPA.gridy = 3;
		panel_1.add(lblRefArticuloPA, gbc_lblRefArticuloPA);
		
		lblNombreArticuloAP = new JLabel("Nombre Articulo");
		lblNombreArticuloAP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombreArticuloAP = new GridBagConstraints();
		gbc_lblNombreArticuloAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticuloAP.gridx = 3;
		gbc_lblNombreArticuloAP.gridy = 3;
		panel_1.add(lblNombreArticuloAP, gbc_lblNombreArticuloAP);
		
		lblPrecioAP = new JLabel("Precio");
		lblPrecioAP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblPrecioAP = new GridBagConstraints();
		gbc_lblPrecioAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioAP.gridx = 5;
		gbc_lblPrecioAP.gridy = 3;
		panel_1.add(lblPrecioAP, gbc_lblPrecioAP);
		
		lblCantidadAP = new JLabel("Cantidad");
		lblCantidadAP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblCantidadAP = new GridBagConstraints();
		gbc_lblCantidadAP.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidadAP.gridx = 7;
		gbc_lblCantidadAP.gridy = 3;
		panel_1.add(lblCantidadAP, gbc_lblCantidadAP);
		lblCantidadAP.setHorizontalAlignment(SwingConstants.TRAILING);
		
		btnLimpiarAP = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiarAP = new GridBagConstraints();
		gbc_btnLimpiarAP.anchor = GridBagConstraints.EAST;
		gbc_btnLimpiarAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiarAP.gridx = 9;
		gbc_btnLimpiarAP.gridy = 3;
		panel_1.add(btnLimpiarAP, gbc_btnLimpiarAP);
		
		textRefArticuloAP = new JTextField();
		textRefArticuloAP.setEditable(false);
		GridBagConstraints gbc_textRefArticuloAP = new GridBagConstraints();
		gbc_textRefArticuloAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRefArticuloAP.insets = new Insets(0, 0, 5, 5);
		gbc_textRefArticuloAP.gridx = 1;
		gbc_textRefArticuloAP.gridy = 5;
		panel_1.add(textRefArticuloAP, gbc_textRefArticuloAP);
		textRefArticuloAP.setColumns(10);
		
		textNombreArtAP = new JTextField();
		textNombreArtAP.setEditable(false);
		GridBagConstraints gbc_textNombreArtAP = new GridBagConstraints();
		gbc_textNombreArtAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreArtAP.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreArtAP.gridx = 3;
		gbc_textNombreArtAP.gridy = 5;
		panel_1.add(textNombreArtAP, gbc_textNombreArtAP);
		textNombreArtAP.setColumns(10);
		
		textPrecioAP = new JTextField();
		textPrecioAP.setDisabledTextColor(Color.BLACK);
		textPrecioAP.setSelectionColor(Color.BLACK);
		textPrecioAP.setEditable(false);
		GridBagConstraints gbc_textPrecioAP = new GridBagConstraints();
		gbc_textPrecioAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecioAP.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecioAP.gridx = 5;
		gbc_textPrecioAP.gridy = 5;
		panel_1.add(textPrecioAP, gbc_textPrecioAP);
		textPrecioAP.setColumns(10);
		
		textCantidadAP = new JTextField();
		GridBagConstraints gbc_textCantidadAP = new GridBagConstraints();
		gbc_textCantidadAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCantidadAP.insets = new Insets(0, 0, 5, 5);
		gbc_textCantidadAP.gridx = 7;
		gbc_textCantidadAP.gridy = 5;
		panel_1.add(textCantidadAP, gbc_textCantidadAP);
		textCantidadAP.setColumns(10);
		
		btnAñadirAP = new JButton("A\u00F1adir");
		GridBagConstraints gbc_btnAñadirAP = new GridBagConstraints();
		gbc_btnAñadirAP.anchor = GridBagConstraints.EAST;
		gbc_btnAñadirAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadirAP.gridx = 9;
		gbc_btnAñadirAP.gridy = 5;
		panel_1.add(btnAñadirAP, gbc_btnAñadirAP);
		
		btnEliminarLineaAP = new JButton("Eliminar Linea");
		GridBagConstraints gbc_btnEliminarLineaAP = new GridBagConstraints();
		gbc_btnEliminarLineaAP.anchor = GridBagConstraints.EAST;
		gbc_btnEliminarLineaAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarLineaAP.gridx = 5;
		gbc_btnEliminarLineaAP.gridy = 5;
		add(btnEliminarLineaAP, gbc_btnEliminarLineaAP);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 7;
		add(scrollPane, gbc_scrollPane);
		
		table_1 = new JTable();
		String[] columnas = {"Numero Linea", "Nombre del Articulo", "Cantidad"};
		table_1.setModel(new DefaultTableModel(columnas, 0){
			@Override
			public boolean isCellEditable(int row, int column) {
				return column == 2;
			}
		});
		scrollPane.setViewportView(table_1);
		
		lblIdAltaPedido = new JLabel("");
		GridBagConstraints gbc_lblIdAltaPedido = new GridBagConstraints();
		gbc_lblIdAltaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdAltaPedido.gridx = 2;
		gbc_lblIdAltaPedido.gridy = 9;
		add(lblIdAltaPedido, gbc_lblIdAltaPedido);
		
		btnGuardarAP = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardarAP = new GridBagConstraints();
		gbc_btnGuardarAP.anchor = GridBagConstraints.EAST;
		gbc_btnGuardarAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarAP.gridx = 5;
		gbc_btnGuardarAP.gridy = 9;
		add(btnGuardarAP, gbc_btnGuardarAP);


	}

}
