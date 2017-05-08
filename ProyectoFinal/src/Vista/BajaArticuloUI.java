package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Font;

public class BajaArticuloUI extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBoxBajaArticulo;
	private JButton btnGuardarBajaArticulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BajaArticuloUI frame = new BajaArticuloUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BajaArticuloUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblBajaArticulo = new JLabel("Baja de Articulos");
		lblBajaArticulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblBajaArticulo = new GridBagConstraints();
		gbc_lblBajaArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblBajaArticulo.gridx = 1;
		gbc_lblBajaArticulo.gridy = 0;
		contentPane.add(lblBajaArticulo, gbc_lblBajaArticulo);
		
		comboBoxBajaArticulo = new JComboBox();
		GridBagConstraints gbc_comboBoxBajaArticulo = new GridBagConstraints();
		gbc_comboBoxBajaArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxBajaArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxBajaArticulo.gridx = 1;
		gbc_comboBoxBajaArticulo.gridy = 4;
		contentPane.add(comboBoxBajaArticulo, gbc_comboBoxBajaArticulo);
		
		btnGuardarBajaArticulo = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardarBajaArticulo = new GridBagConstraints();
		gbc_btnGuardarBajaArticulo.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardarBajaArticulo.gridx = 1;
		gbc_btnGuardarBajaArticulo.gridy = 7;
		contentPane.add(btnGuardarBajaArticulo, gbc_btnGuardarBajaArticulo);
	}

}
