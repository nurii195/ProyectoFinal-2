package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

import modelo.Articulo;
import modelo.Pedido;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ModificarPedidoUI extends JPanel {
	protected JComboBox<Pedido> comboBoxModPedido = new JComboBox<>();
	protected JLabel lblModificarPedido;
	protected JComboBox<Articulo> comboBoxNombreArtModP= new JComboBox<>();
	protected JLabel lblNombreArticulo;
	protected JLabel lblRefArtModP;
	protected JLabel lblNombreArtModP;
	protected JLabel lblPrecioModP;
	protected JLabel lblCantidadModP;
	protected JButton btnLimpiarModP;
	protected JTextField textRefArtModP;
	protected JTextField textNombreArtModP;
	protected JTextField textPrecioModP;
	protected JTextField textCantidad;
	protected JButton btnAñadirModP;
	protected JScrollPane scrollPane;
	protected JTable table;
	protected JButton btnEliminarLineaModPedido;
	protected JPanel panel_1;
	protected JButton btnNewButton;
	protected JLabel lblNPedido;

	
	public ModificarPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblModificarPedido = new JLabel("MODIFICAR PEDIDO");
		GridBagConstraints gbc_lblModificarPedido = new GridBagConstraints();
		gbc_lblModificarPedido.gridwidth = 3;
		gbc_lblModificarPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblModificarPedido.gridx = 3;
		gbc_lblModificarPedido.gridy = 1;
		add(lblModificarPedido, gbc_lblModificarPedido);
		
		lblNPedido = new JLabel("N\u00BA Pedido");
		GridBagConstraints gbc_lblNPedido = new GridBagConstraints();
		gbc_lblNPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblNPedido.gridx = 1;
		gbc_lblNPedido.gridy = 3;
		add(lblNPedido, gbc_lblNPedido);
		
		comboBoxModPedido = new JComboBox<Pedido>();
		GridBagConstraints gbc_comboBoxModPedido = new GridBagConstraints();
		gbc_comboBoxModPedido.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxModPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxModPedido.gridx = 3;
		gbc_comboBoxModPedido.gridy = 3;
		add(comboBoxModPedido, gbc_comboBoxModPedido);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "A\u00F1adir otro articulo", TitledBorder.RIGHT, TitledBorder.TOP, null, Color.BLACK));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 5;
		gbc_panel.gridy = 3;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNombreArticulo = new JLabel("Nombre Articulo");
		GridBagConstraints gbc_lblNombreArticulo = new GridBagConstraints();
		gbc_lblNombreArticulo.fill = GridBagConstraints.BOTH;
		gbc_lblNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticulo.gridx = 1;
		gbc_lblNombreArticulo.gridy = 1;
		panel.add(lblNombreArticulo, gbc_lblNombreArticulo);
		
		comboBoxNombreArtModP = new JComboBox<Articulo>();
		GridBagConstraints gbc_comboBoxNombreArtModP = new GridBagConstraints();
		gbc_comboBoxNombreArtModP.gridwidth = 6;
		gbc_comboBoxNombreArtModP.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxNombreArtModP.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxNombreArtModP.gridx = 3;
		gbc_comboBoxNombreArtModP.gridy = 1;
		panel.add(comboBoxNombreArtModP, gbc_comboBoxNombreArtModP);
		//DefaultComboBoxModel<Articulo> modelUno = new DefaultComboBoxModel<>();
		//comboBoxNombreArtModP.setModel(modelUno);
		
		lblRefArtModP = new JLabel("Referencia Articulo");
		GridBagConstraints gbc_lblRefArtModP = new GridBagConstraints();
		gbc_lblRefArtModP.insets = new Insets(0, 0, 5, 5);
		gbc_lblRefArtModP.gridx = 1;
		gbc_lblRefArtModP.gridy = 3;
		panel.add(lblRefArtModP, gbc_lblRefArtModP);
		
		lblNombreArtModP = new JLabel("Nombre Articulo");
		GridBagConstraints gbc_lblNombreArtModP = new GridBagConstraints();
		gbc_lblNombreArtModP.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArtModP.gridx = 3;
		gbc_lblNombreArtModP.gridy = 3;
		panel.add(lblNombreArtModP, gbc_lblNombreArtModP);
		
		lblPrecioModP = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecioModP = new GridBagConstraints();
		gbc_lblPrecioModP.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioModP.gridx = 5;
		gbc_lblPrecioModP.gridy = 3;
		panel.add(lblPrecioModP, gbc_lblPrecioModP);
		
		lblCantidadModP = new JLabel("Cantidad");
		GridBagConstraints gbc_lblCantidadModP = new GridBagConstraints();
		gbc_lblCantidadModP.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidadModP.gridx = 7;
		gbc_lblCantidadModP.gridy = 3;
		panel.add(lblCantidadModP, gbc_lblCantidadModP);
		
		btnLimpiarModP = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiarModP = new GridBagConstraints();
		gbc_btnLimpiarModP.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiarModP.gridx = 9;
		gbc_btnLimpiarModP.gridy = 3;
		panel.add(btnLimpiarModP, gbc_btnLimpiarModP);
		
		textRefArtModP = new JTextField();
		GridBagConstraints gbc_textRefArtModP = new GridBagConstraints();
		gbc_textRefArtModP.insets = new Insets(0, 0, 5, 5);
		gbc_textRefArtModP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textRefArtModP.gridx = 1;
		gbc_textRefArtModP.gridy = 5;
		panel.add(textRefArtModP, gbc_textRefArtModP);
		textRefArtModP.setColumns(10);
		
		textNombreArtModP = new JTextField();
		GridBagConstraints gbc_textNombreArtModP = new GridBagConstraints();
		gbc_textNombreArtModP.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreArtModP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreArtModP.gridx = 3;
		gbc_textNombreArtModP.gridy = 5;
		panel.add(textNombreArtModP, gbc_textNombreArtModP);
		textNombreArtModP.setColumns(10);
		
		textPrecioModP = new JTextField();
		GridBagConstraints gbc_textPrecioModP = new GridBagConstraints();
		gbc_textPrecioModP.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecioModP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecioModP.gridx = 5;
		gbc_textPrecioModP.gridy = 5;
		panel.add(textPrecioModP, gbc_textPrecioModP);
		textPrecioModP.setColumns(10);
		
		textCantidad = new JTextField();
		GridBagConstraints gbc_textCantidad = new GridBagConstraints();
		gbc_textCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_textCantidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCantidad.gridx = 7;
		gbc_textCantidad.gridy = 5;
		panel.add(textCantidad, gbc_textCantidad);
		textCantidad.setColumns(10);
		
		btnAñadirModP = new JButton("A\u00F1adir");
		GridBagConstraints gbc_btnAñadirModP = new GridBagConstraints();
		gbc_btnAñadirModP.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAñadirModP.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadirModP.gridx = 9;
		gbc_btnAñadirModP.gridy = 5;
		panel.add(btnAñadirModP, gbc_btnAñadirModP);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		
		String[] columnas = {"Numero Linea", "Nombre del Articulo", "Cantidad"};
		table.setModel(new DefaultTableModel(columnas, 0){
			@Override
			public boolean isCellEditable(int row, int column) {
				return column == 2;
			}
		});			
		scrollPane.setViewportView(table);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.EAST;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 5;
		gbc_panel_1.gridy = 8;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		btnEliminarLineaModPedido = new JButton("Eliminar Linea");
		GridBagConstraints gbc_btnEliminarLineaModPedido = new GridBagConstraints();
		gbc_btnEliminarLineaModPedido.anchor = GridBagConstraints.EAST;
		gbc_btnEliminarLineaModPedido.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminarLineaModPedido.gridx = 1;
		gbc_btnEliminarLineaModPedido.gridy = 0;
		panel_1.add(btnEliminarLineaModPedido, gbc_btnEliminarLineaModPedido);
		
		btnNewButton = new JButton("Modificar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 0;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		
	}

}
