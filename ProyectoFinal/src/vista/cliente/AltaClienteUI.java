package vista.cliente;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AltaClienteUI extends JPanel {
	
	protected JTextField textNombreCA;
	protected JTextField textPrimerACA;
	protected JTextField textSegundoACA;
	protected JTextField textDniCA;
	protected JLabel lblAltaCliente;
	protected JLabel lblNombre;
	protected JLabel lblPrimerA;
	protected JLabel lblSegundoA;
	protected JLabel lblDniCA;
	protected JButton btnGuardarCliente;
	protected JLabel lblNumeroClienteCA;
	protected JTextField textNumeroClienteCA;
	
	public AltaClienteUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblAltaCliente = new JLabel("ALTA CLIENTE");
		GridBagConstraints gbc_lblAltaCliente = new GridBagConstraints();
		gbc_lblAltaCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblAltaCliente.gridx = 3;
		gbc_lblAltaCliente.gridy = 1;
		add(lblAltaCliente, gbc_lblAltaCliente);
		
		lblNombre = new JLabel("NOMBRE");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.BELOW_BASELINE_LEADING;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);
		
		textNombreCA = new JTextField();
		GridBagConstraints gbc_textNombreCA = new GridBagConstraints();
		gbc_textNombreCA.insets = new Insets(0, 0, 5, 5);
		gbc_textNombreCA.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombreCA.gridx = 3;
		gbc_textNombreCA.gridy = 3;
		add(textNombreCA, gbc_textNombreCA);
		textNombreCA.setColumns(10);
		
		lblPrimerA = new JLabel("PRIMER APELLIDO ");
		GridBagConstraints gbc_lblPrimerA = new GridBagConstraints();
		gbc_lblPrimerA.anchor = GridBagConstraints.WEST;
		gbc_lblPrimerA.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerA.gridx = 1;
		gbc_lblPrimerA.gridy = 5;
		add(lblPrimerA, gbc_lblPrimerA);
		
		textPrimerACA = new JTextField();
		GridBagConstraints gbc_textPrimerACA = new GridBagConstraints();
		gbc_textPrimerACA.insets = new Insets(0, 0, 5, 5);
		gbc_textPrimerACA.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrimerACA.gridx = 3;
		gbc_textPrimerACA.gridy = 5;
		add(textPrimerACA, gbc_textPrimerACA);
		textPrimerACA.setColumns(10);
		
		lblSegundoA = new JLabel("SEGUNDO APELLIDO");
		GridBagConstraints gbc_lblSegundoA = new GridBagConstraints();
		gbc_lblSegundoA.anchor = GridBagConstraints.WEST;
		gbc_lblSegundoA.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundoA.gridx = 1;
		gbc_lblSegundoA.gridy = 7;
		add(lblSegundoA, gbc_lblSegundoA);
		
		textSegundoACA = new JTextField();
		GridBagConstraints gbc_textSegundoACA = new GridBagConstraints();
		gbc_textSegundoACA.insets = new Insets(0, 0, 5, 5);
		gbc_textSegundoACA.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSegundoACA.gridx = 3;
		gbc_textSegundoACA.gridy = 7;
		add(textSegundoACA, gbc_textSegundoACA);
		textSegundoACA.setColumns(10);
		
		lblDniCA = new JLabel("D.N.I.");
		GridBagConstraints gbc_lblDniCA = new GridBagConstraints();
		gbc_lblDniCA.anchor = GridBagConstraints.WEST;
		gbc_lblDniCA.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniCA.gridx = 1;
		gbc_lblDniCA.gridy = 9;
		add(lblDniCA, gbc_lblDniCA);
		
		textDniCA = new JTextField();
		GridBagConstraints gbc_textDniCA = new GridBagConstraints();
		gbc_textDniCA.insets = new Insets(0, 0, 5, 5);
		gbc_textDniCA.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDniCA.gridx = 3;
		gbc_textDniCA.gridy = 9;
		add(textDniCA, gbc_textDniCA);
		textDniCA.setColumns(10);
		
		lblNumeroClienteCA = new JLabel("NUMERO CLIENTE");
		GridBagConstraints gbc_lblNumeroClienteCA = new GridBagConstraints();
		gbc_lblNumeroClienteCA.anchor = GridBagConstraints.WEST;
		gbc_lblNumeroClienteCA.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroClienteCA.gridx = 1;
		gbc_lblNumeroClienteCA.gridy = 11;
		add(lblNumeroClienteCA, gbc_lblNumeroClienteCA);
		
		textNumeroClienteCA = new JTextField();
		GridBagConstraints gbc_textNumeroClienteCA = new GridBagConstraints();
		gbc_textNumeroClienteCA.insets = new Insets(0, 0, 5, 5);
		gbc_textNumeroClienteCA.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNumeroClienteCA.gridx = 3;
		gbc_textNumeroClienteCA.gridy = 11;
		add(textNumeroClienteCA, gbc_textNumeroClienteCA);
		textNumeroClienteCA.setColumns(10);
		
		btnGuardarCliente = new JButton("GUARDAR");
		GridBagConstraints gbc_btnGuardarCliente = new GridBagConstraints();
		gbc_btnGuardarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarCliente.gridx = 5;
		gbc_btnGuardarCliente.gridy = 13;
		add(btnGuardarCliente, gbc_btnGuardarCliente);
	}


}
