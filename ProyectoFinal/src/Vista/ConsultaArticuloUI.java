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
import javax.swing.JButton;
import java.awt.Font;

public class ConsultaArticuloUI extends JFrame {

	private JPanel contentPane;
	protected JTextField txtNombreArticuloConsulta;
	protected JButton btnConsultar;

	public ConsultaArticuloUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblConsultaDeArticulos = new JLabel("Consulta de Articulos");
		lblConsultaDeArticulos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblConsultaDeArticulos = new GridBagConstraints();
		gbc_lblConsultaDeArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultaDeArticulos.gridx = 3;
		gbc_lblConsultaDeArticulos.gridy = 0;
		contentPane.add(lblConsultaDeArticulos, gbc_lblConsultaDeArticulos);
		
		JLabel lblNombreArticuloConsulta = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreArticuloConsulta = new GridBagConstraints();
		gbc_lblNombreArticuloConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticuloConsulta.gridx = 1;
		gbc_lblNombreArticuloConsulta.gridy = 3;
		contentPane.add(lblNombreArticuloConsulta, gbc_lblNombreArticuloConsulta);
		
		txtNombreArticuloConsulta = new JTextField();
		GridBagConstraints gbc_txtNombreArticuloConsulta = new GridBagConstraints();
		gbc_txtNombreArticuloConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreArticuloConsulta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreArticuloConsulta.gridx = 3;
		gbc_txtNombreArticuloConsulta.gridy = 3;
		contentPane.add(txtNombreArticuloConsulta, gbc_txtNombreArticuloConsulta);
		txtNombreArticuloConsulta.setColumns(10);
		
		JTextField txtNombreConsultado = new JTextField();
		GridBagConstraints gbc_txtNombreConsultado = new GridBagConstraints();
		gbc_txtNombreConsultado.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreConsultado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreConsultado.gridx = 3;
		gbc_txtNombreConsultado.gridy = 5;
		contentPane.add(txtNombreConsultado, gbc_txtNombreConsultado);
		txtNombreConsultado.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
		gbc_btnConsultar.insets = new Insets(0, 0, 0, 5);
		gbc_btnConsultar.gridx = 3;
		gbc_btnConsultar.gridy = 8;
		contentPane.add(btnConsultar, gbc_btnConsultar);
	}

}
