package Vista;
import javax.swing.JPanel;
import Modelo.Cliente;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class BajaClienteUI extends JPanel {
	protected JLabel lblBajaCliente;
	protected JComboBox<Cliente> comboBoxBajaCliente;
	protected JButton btnGuardar;
	
	public BajaClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 10, 0, 10, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblBajaCliente = new JLabel("BAJA CLIENTE");
		GridBagConstraints gbc_lblBajaCliente = new GridBagConstraints();
		gbc_lblBajaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblBajaCliente.gridx = 1;
		gbc_lblBajaCliente.gridy = 1;
		add(lblBajaCliente, gbc_lblBajaCliente);
		
		comboBoxBajaCliente = new JComboBox<Cliente>();
		GridBagConstraints gbc_comboBoxBajaCliente = new GridBagConstraints();
		gbc_comboBoxBajaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxBajaCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxBajaCliente.gridx = 1;
		gbc_comboBoxBajaCliente.gridy = 3;
		add(comboBoxBajaCliente, gbc_comboBoxBajaCliente);
		
		btnGuardar = new JButton("GUARDAR");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 5;
		add(btnGuardar, gbc_btnGuardar);
	}

}
