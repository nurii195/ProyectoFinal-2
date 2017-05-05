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
	protected JTextField textResultadoConsultaCliente;
	
	public ConsultaClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
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
		
		textResultadoConsultaCliente = new JTextField();
		GridBagConstraints gbc_textResultadoConsultaCliente = new GridBagConstraints();
		gbc_textResultadoConsultaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_textResultadoConsultaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_textResultadoConsultaCliente.gridx = 3;
		gbc_textResultadoConsultaCliente.gridy = 5;
		add(textResultadoConsultaCliente, gbc_textResultadoConsultaCliente);
		textResultadoConsultaCliente.setColumns(10);
		
		btnConsultarCliente = new JButton("CONSULTAR");
		GridBagConstraints gbc_btnConsultarCliente = new GridBagConstraints();
		gbc_btnConsultarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultarCliente.gridx = 5;
		gbc_btnConsultarCliente.gridy = 7;
		add(btnConsultarCliente, gbc_btnConsultarCliente);
	}

	
}
