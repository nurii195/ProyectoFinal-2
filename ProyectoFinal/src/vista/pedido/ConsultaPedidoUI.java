package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;

public class ConsultaPedidoUI extends JPanel {
	protected JTextField textIdPedido;
	protected JTextField textClientePedido;
	protected JTextField textApellidosPedido;
	protected JTable table;
	protected JButton btnConsultarPedido;

	/**
	 * Create the panel.
	 */
	public ConsultaPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblConsultaDePedido = new JLabel("Consulta De Pedido");
		lblConsultaDePedido.setForeground(new Color(255, 69, 0));
		lblConsultaDePedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblConsultaDePedido = new GridBagConstraints();
		gbc_lblConsultaDePedido.gridwidth = 8;
		gbc_lblConsultaDePedido.insets = new Insets(0, 0, 5, 0);
		gbc_lblConsultaDePedido.gridx = 0;
		gbc_lblConsultaDePedido.gridy = 1;
		add(lblConsultaDePedido, gbc_lblConsultaDePedido);
		
		JLabel lblIdPedido = new JLabel("Id Pedido");
		GridBagConstraints gbc_lblIdPedido = new GridBagConstraints();
		gbc_lblIdPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdPedido.gridx = 2;
		gbc_lblIdPedido.gridy = 3;
		add(lblIdPedido, gbc_lblIdPedido);
		
		textIdPedido = new JTextField();
		GridBagConstraints gbc_textIdPedido = new GridBagConstraints();
		gbc_textIdPedido.anchor = GridBagConstraints.WEST;
		gbc_textIdPedido.insets = new Insets(0, 0, 5, 5);
		gbc_textIdPedido.gridx = 4;
		gbc_textIdPedido.gridy = 3;
		add(textIdPedido, gbc_textIdPedido);
		textIdPedido.setColumns(10);
		
		btnConsultarPedido = new JButton("Consultar Pedido");
		GridBagConstraints gbc_btnConsultarPedido = new GridBagConstraints();
		gbc_btnConsultarPedido.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultarPedido.gridx = 6;
		gbc_btnConsultarPedido.gridy = 3;
		add(btnConsultarPedido, gbc_btnConsultarPedido);
		
		JLabel lblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 2;
		gbc_lblCliente.gridy = 5;
		add(lblCliente, gbc_lblCliente);
		
		textClientePedido = new JTextField();
		textClientePedido.setEditable(false);
		textClientePedido.setEnabled(false);
		GridBagConstraints gbc_textClientePedido = new GridBagConstraints();
		gbc_textClientePedido.insets = new Insets(0, 0, 5, 5);
		gbc_textClientePedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_textClientePedido.gridx = 4;
		gbc_textClientePedido.gridy = 5;
		add(textClientePedido, gbc_textClientePedido);
		textClientePedido.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 2;
		gbc_lblApellidos.gridy = 7;
		add(lblApellidos, gbc_lblApellidos);
		
		textApellidosPedido = new JTextField();
		textApellidosPedido.setEditable(false);
		textApellidosPedido.setEnabled(false);
		GridBagConstraints gbc_textApellidosPedido = new GridBagConstraints();
		gbc_textApellidosPedido.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidosPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidosPedido.gridx = 4;
		gbc_textApellidosPedido.gridy = 7;
		add(textApellidosPedido, gbc_textApellidosPedido);
		textApellidosPedido.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 9;
		add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		String[] columnas={"Id Linea","Nombre Artículo","Cantidad"};
		table.setModel(new DefaultTableModel(columnas,0){
		@Override //esto sirve para que no sea editable
		public boolean isCellEditable(int row,int column){
			return false;
		}
	});
		scrollPane.setViewportView(table);

	}

}
