package vista.articulo;

import javax.swing.JPanel;

import modelo.Articulo;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.DebugGraphics;

public class BajaArtiUI extends JPanel {
	protected JComboBox<Articulo> comboBox;
	protected JButton btnDarDeBaja;
	private JLabel lblSeleccionaElArtculo;

	public BajaArtiUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBajaDeArticulos = new JLabel("Baja de Articulos");
		lblBajaDeArticulos.setForeground(new Color(0, 206, 209));
		lblBajaDeArticulos.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblBajaDeArticulos = new GridBagConstraints();
		gbc_lblBajaDeArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_lblBajaDeArticulos.gridx = 3;
		gbc_lblBajaDeArticulos.gridy = 1;
		add(lblBajaDeArticulos, gbc_lblBajaDeArticulos);
		
		lblSeleccionaElArtculo = new JLabel("Selecciona el art\u00EDculo que desea eliminar");
		lblSeleccionaElArtculo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSeleccionaElArtculo = new GridBagConstraints();
		gbc_lblSeleccionaElArtculo.anchor = GridBagConstraints.WEST;
		gbc_lblSeleccionaElArtculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionaElArtculo.gridx = 3;
		gbc_lblSeleccionaElArtculo.gridy = 3;
		add(lblSeleccionaElArtculo, gbc_lblSeleccionaElArtculo);
		
		comboBox = new JComboBox<Articulo>();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.BOTH;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 5;
		add(comboBox, gbc_comboBox);
		
		DefaultComboBoxModel<Articulo> model = new DefaultComboBoxModel<>();
		comboBox.setModel(model);
		
		btnDarDeBaja = new JButton("Dar de baja");
		btnDarDeBaja.setForeground(new Color(0, 0, 0));
		btnDarDeBaja.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		btnDarDeBaja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnDarDeBaja = new GridBagConstraints();
		gbc_btnDarDeBaja.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeBaja.gridx = 3;
		gbc_btnDarDeBaja.gridy = 7;
		add(btnDarDeBaja, gbc_btnDarDeBaja);
		

	}

}
