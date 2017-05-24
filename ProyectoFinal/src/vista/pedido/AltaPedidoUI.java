package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
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
	protected JTextField textNombreArticuloAP;
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
	protected JButton btnBuscarArticuloAP;
	protected JLabel lblCantidadAP;
	protected JLabel lblPrecioAP;
	protected JLabel lblNombreArticuloAP;
	protected JLabel lblRefArticuloPA;
	protected JButton btnAñadirAP;
	protected JScrollPane scrollPane;
	protected JButton btnEliminarLineaAP;
	protected JButton btnGuardarAP;
	protected JButton btnLimpiarAP;
	private JPanel panel;
	private JPanel panel_1;


	
	public AltaPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10};
		gridBagLayout.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 60, 0, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
			
		JLabel lblNewLabel = new JLabel("Alta Pedido");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 16;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Busqueda Cliente", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
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
		gbc_btnBuscarClienteAP.insets = new Insets(0, 0, 0, 5);
		gbc_btnBuscarClienteAP.gridx = 5;
		gbc_btnBuscarClienteAP.gridy = 9;
		panel.add(btnBuscarClienteAP, gbc_btnBuscarClienteAP);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Busqueda Articulo", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 5;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 11;
		gbc_panel_1.gridy = 2;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblNombreArticulo = new JLabel("Nombre Articulo");
		lblNombreArticulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombreArticulo = new GridBagConstraints();
		gbc_lblNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticulo.gridx = 1;
		gbc_lblNombreArticulo.gridy = 1;
		panel_1.add(lblNombreArticulo, gbc_lblNombreArticulo);
		
		textNombreArticuloAP = new JTextField();
		GridBagConstraints gbc_textNombreArticuloAP = new GridBagConstraints();
		gbc_textNombreArticuloAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreArticuloAP.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreArticuloAP.gridx = 3;
		gbc_textNombreArticuloAP.gridy = 1;
		panel_1.add(textNombreArticuloAP, gbc_textNombreArticuloAP);
		textNombreArticuloAP.setColumns(10);
		
		btnBuscarArticuloAP = new JButton("Buscar Articulo");
		GridBagConstraints gbc_btnBuscarArticuloAP = new GridBagConstraints();
		gbc_btnBuscarArticuloAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarArticuloAP.gridx = 5;
		gbc_btnBuscarArticuloAP.gridy = 1;
		panel_1.add(btnBuscarArticuloAP, gbc_btnBuscarArticuloAP);
		
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
		gbc_btnLimpiarAP.insets = new Insets(0, 0, 5, 0);
		gbc_btnLimpiarAP.gridx = 9;
		gbc_btnLimpiarAP.gridy = 3;
		panel_1.add(btnLimpiarAP, gbc_btnLimpiarAP);
		
		textRefArticuloAP = new JTextField();
		GridBagConstraints gbc_textRefArticuloAP = new GridBagConstraints();
		gbc_textRefArticuloAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRefArticuloAP.insets = new Insets(0, 0, 5, 5);
		gbc_textRefArticuloAP.gridx = 1;
		gbc_textRefArticuloAP.gridy = 5;
		panel_1.add(textRefArticuloAP, gbc_textRefArticuloAP);
		textRefArticuloAP.setColumns(10);
		
		textNombreArtAP = new JTextField();
		GridBagConstraints gbc_textNombreArtAP = new GridBagConstraints();
		gbc_textNombreArtAP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreArtAP.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreArtAP.gridx = 3;
		gbc_textNombreArtAP.gridy = 5;
		panel_1.add(textNombreArtAP, gbc_textNombreArtAP);
		textNombreArtAP.setColumns(10);
		
		textPrecioAP = new JTextField();
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
		gbc_btnAñadirAP.insets = new Insets(0, 0, 5, 0);
		gbc_btnAñadirAP.gridx = 9;
		gbc_btnAñadirAP.gridy = 5;
		panel_1.add(btnAñadirAP, gbc_btnAñadirAP);
		
		btnEliminarLineaAP = new JButton("Eliminar Linea");
		GridBagConstraints gbc_btnEliminarLineaAP = new GridBagConstraints();
		gbc_btnEliminarLineaAP.anchor = GridBagConstraints.EAST;
		gbc_btnEliminarLineaAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminarLineaAP.gridx = 15;
		gbc_btnEliminarLineaAP.gridy = 4;
		add(btnEliminarLineaAP, gbc_btnEliminarLineaAP);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 15;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 6;
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
		
		btnGuardarAP = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardarAP = new GridBagConstraints();
		gbc_btnGuardarAP.anchor = GridBagConstraints.EAST;
		gbc_btnGuardarAP.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarAP.gridx = 15;
		gbc_btnGuardarAP.gridy = 8;
		add(btnGuardarAP, gbc_btnGuardarAP);


	}

}
