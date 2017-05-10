package Vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultaClienteUI extends JPanel {
	protected JTextField textDniCC;
	protected JLabel lblConsultaCliente;
	protected JLabel lblDniCC;
	protected JButton btnConsultarCliente;
	protected JTextField textNombreCC;
	protected JLabel lblNombreCC;
	protected JTextField textPrimerApellidoCC;
	protected JTextField textSegundoApellidoCC;
	protected JLabel lblPrimerApellidoCC;
	protected JLabel lblSegundoApellido;
	protected JTextField textResultadoCC;
	
	public ConsultaClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 10, 0, 10, 0, 0, 0, 0, 0, 0, 0, 10, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblConsultaCliente = new JLabel("CONSULTA CLIENTE");
		GridBagConstraints gbc_lblConsultaCliente = new GridBagConstraints();
		gbc_lblConsultaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultaCliente.anchor = GridBagConstraints.BASELINE;
		gbc_lblConsultaCliente.gridx = 3;
		gbc_lblConsultaCliente.gridy = 1;
		add(lblConsultaCliente, gbc_lblConsultaCliente);
		
		lblDniCC = new JLabel("D.N.I.");
		GridBagConstraints gbc_lblDniCC = new GridBagConstraints();
		gbc_lblDniCC.anchor = GridBagConstraints.WEST;
		gbc_lblDniCC.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniCC.gridx = 1;
		gbc_lblDniCC.gridy = 3;
		add(lblDniCC, gbc_lblDniCC);
		
		textDniCC = new JTextField();
		GridBagConstraints gbc_textDniCC = new GridBagConstraints();
		gbc_textDniCC.insets = new Insets(0, 0, 5, 5);
		gbc_textDniCC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDniCC.gridx = 3;
		gbc_textDniCC.gridy = 3;
		add(textDniCC, gbc_textDniCC);
		textDniCC.setColumns(10);
		
		lblNombreCC = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreCC = new GridBagConstraints();
		gbc_lblNombreCC.anchor = GridBagConstraints.WEST;
		gbc_lblNombreCC.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCC.gridx = 1;
		gbc_lblNombreCC.gridy = 5;
		add(lblNombreCC, gbc_lblNombreCC);
		
		textNombreCC = new JTextField();
		GridBagConstraints gbc_textNombreCC = new GridBagConstraints();
		gbc_textNombreCC.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreCC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreCC.gridx = 3;
		gbc_textNombreCC.gridy = 5;
		add(textNombreCC, gbc_textNombreCC);
		textNombreCC.setColumns(10);
		
		lblPrimerApellidoCC = new JLabel("Primer Apellido");
		GridBagConstraints gbc_lblPrimerApellidoCC = new GridBagConstraints();
		gbc_lblPrimerApellidoCC.anchor = GridBagConstraints.WEST;
		gbc_lblPrimerApellidoCC.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerApellidoCC.gridx = 1;
		gbc_lblPrimerApellidoCC.gridy = 7;
		add(lblPrimerApellidoCC, gbc_lblPrimerApellidoCC);
		
		textPrimerApellidoCC = new JTextField();
		GridBagConstraints gbc_textPrimerApellidoCC = new GridBagConstraints();
		gbc_textPrimerApellidoCC.insets = new Insets(0, 0, 5, 5);
		gbc_textPrimerApellidoCC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrimerApellidoCC.gridx = 3;
		gbc_textPrimerApellidoCC.gridy = 7;
		add(textPrimerApellidoCC, gbc_textPrimerApellidoCC);
		textPrimerApellidoCC.setColumns(10);
		
		lblSegundoApellido = new JLabel("Segundo Apellido");
		GridBagConstraints gbc_lblSegundoApellido = new GridBagConstraints();
		gbc_lblSegundoApellido.anchor = GridBagConstraints.WEST;
		gbc_lblSegundoApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundoApellido.gridx = 1;
		gbc_lblSegundoApellido.gridy = 9;
		add(lblSegundoApellido, gbc_lblSegundoApellido);
		
		textSegundoApellidoCC = new JTextField();
		GridBagConstraints gbc_textSegundoApellidoCC = new GridBagConstraints();
		gbc_textSegundoApellidoCC.insets = new Insets(0, 0, 5, 5);
		gbc_textSegundoApellidoCC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSegundoApellidoCC.gridx = 3;
		gbc_textSegundoApellidoCC.gridy = 9;
		add(textSegundoApellidoCC, gbc_textSegundoApellidoCC);
		textSegundoApellidoCC.setColumns(10);
		
		textResultadoCC = new JTextField();
		GridBagConstraints gbc_textResultadoCC = new GridBagConstraints();
		gbc_textResultadoCC.insets = new Insets(0, 0, 5, 5);
		gbc_textResultadoCC.fill = GridBagConstraints.HORIZONTAL;
		gbc_textResultadoCC.gridx = 3;
		gbc_textResultadoCC.gridy = 11;
		add(textResultadoCC, gbc_textResultadoCC);
		textResultadoCC.setColumns(10);
		
		btnConsultarCliente = new JButton("CONSULTAR");
		GridBagConstraints gbc_btnConsultarCliente = new GridBagConstraints();
		gbc_btnConsultarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultarCliente.gridx = 5;
		gbc_btnConsultarCliente.gridy = 13;
		add(btnConsultarCliente, gbc_btnConsultarCliente);
	}

	
}
