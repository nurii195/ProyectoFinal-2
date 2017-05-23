package control.comportamiento; 
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comportamiento.logica.AbstractGestor;
import comportamiento.logica.GestorArticulo;
import modelo.Articulo;
import vista.articulo.BajaArtiUI;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class ParaBajaArticuloUI extends BajaArtiUI {

	private final AbstractGestor gestor;
	public ParaBajaArticuloUI(GestorArticulo gArticulo) {
		super();
		this.gestor = gArticulo;
		llenarCombo();
		
		btnDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultComboBoxModel<Articulo> model = (DefaultComboBoxModel<Articulo>) comboBox.getModel();
				Object selectedItem = comboBox.getSelectedItem();
				if (selectedItem instanceof Articulo) {
					Articulo art = (Articulo) selectedItem;
					boolean baja = gArticulo.baja(art);
					if(baja){
						JOptionPane.showMessageDialog(ParaBajaArticuloUI.this, "Voló");
						model.removeElement(art);
					}
					else
						JOptionPane.showMessageDialog(ParaBajaArticuloUI.this, "No adagsgsadgsa");
				}
			}
		});
	}

	private void llenarCombo() {
		DefaultComboBoxModel<Articulo> model = (DefaultComboBoxModel<Articulo>) comboBox.getModel();
		ArrayList<Object> lista = gestor.getLista();
		for (Object object : lista) {
			if (object instanceof Articulo) {
				model.addElement((Articulo) object);
			}
		}
	}

}
