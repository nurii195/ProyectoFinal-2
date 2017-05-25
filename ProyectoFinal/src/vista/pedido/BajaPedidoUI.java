package vista.pedido;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Articulo;
import modelo.Pedido;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class BajaPedidoUI extends JPanel {
	
	protected JComboBox<Pedido> comboBox;
	protected JButton btnDarDeBaja;
	
	public BajaPedidoUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 20, 0};
		gridBagLayout.rowHeights = new int[]{20, 0, 0, 0, 0, 20, 0, 0, 0, 20, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBajaPedido = new JLabel("Baja Pedido");
		lblBajaPedido.setForeground(new Color(255, 69, 0));
		lblBajaPedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblBajaPedido = new GridBagConstraints();
		gbc_lblBajaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblBajaPedido.gridx = 1;
		gbc_lblBajaPedido.gridy = 1;
		add(lblBajaPedido, gbc_lblBajaPedido);
		
		JLabel lblSeleccionaElNumero = new JLabel("Selecciona el numero de pedido a eliminar");
		lblSeleccionaElNumero.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblSeleccionaElNumero = new GridBagConstraints();
		gbc_lblSeleccionaElNumero.anchor = GridBagConstraints.WEST;
		gbc_lblSeleccionaElNumero.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionaElNumero.gridx = 1;
		gbc_lblSeleccionaElNumero.gridy = 4;
		add(lblSeleccionaElNumero, gbc_lblSeleccionaElNumero);
		
		comboBox = new JComboBox<Pedido>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 6;
		add(comboBox, gbc_comboBox);
		
		DefaultComboBoxModel<Pedido> model = new DefaultComboBoxModel<>();
		comboBox.setModel(model);
		
		btnDarDeBaja = new JButton("Dar de Baja");
		btnDarDeBaja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnDarDeBaja = new GridBagConstraints();
		gbc_btnDarDeBaja.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeBaja.gridx = 1;
		gbc_btnDarDeBaja.gridy = 8;
		add(btnDarDeBaja, gbc_btnDarDeBaja);
	

}
}