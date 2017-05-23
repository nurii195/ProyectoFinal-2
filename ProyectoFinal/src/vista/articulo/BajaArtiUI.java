package vista.articulo;

import javax.swing.JPanel;

import modelo.Articulo;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Font;

public class BajaArtiUI extends JPanel {
	protected JComboBox<Articulo> comboBox;
	protected JButton btnDarDeBaja;

	public BajaArtiUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBajaDeArticulos = new JLabel("Baja de Articulos");
		lblBajaDeArticulos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblBajaDeArticulos = new GridBagConstraints();
		gbc_lblBajaDeArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_lblBajaDeArticulos.gridx = 3;
		gbc_lblBajaDeArticulos.gridy = 1;
		add(lblBajaDeArticulos, gbc_lblBajaDeArticulos);
		
		comboBox = new JComboBox<Articulo>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);
		
		btnDarDeBaja = new JButton("Dar de baja");
		GridBagConstraints gbc_btnDarDeBaja = new GridBagConstraints();
		gbc_btnDarDeBaja.insets = new Insets(0, 0, 0, 5);
		gbc_btnDarDeBaja.gridx = 3;
		gbc_btnDarDeBaja.gridy = 5;
		add(btnDarDeBaja, gbc_btnDarDeBaja);
		

	}

}
