package control.comportamiento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comportamiento.logica.AbstractGestor;
import comportamiento.logica.GestorArticulo;
import modelo.Articulo;
import vista.articulo.ModificacionArtiUI;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class ParaModificacionArticuloUI extends ModificacionArtiUI {

	private final AbstractGestor gestor;
	private Articulo modificando = null;
	public ParaModificacionArticuloUI(GestorArticulo gArticulo) {
		super();
		this.gestor = gArticulo;
		llenarCombo();
		eventos();
	}

	private void eventos() {
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object selectedItem = comboBox.getSelectedItem();
				if (selectedItem instanceof Articulo) {
					modificando = (Articulo) selectedItem;
					textDescripcionModificar.setText(modificando.getDescripcion());
					textNombreModificar.setText(modificando.getNombreArticulo());
					textPrecioModificar.setText(String.valueOf(modificando.getPrecio()));
				}
			}
		});
		
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (modificando != null) {

					modificando.setNombreArticulo(textNombreModificar.getText());
					//ETC
					
					boolean baja = gestor.modificacion(modificando);
					if(baja){
						JOptionPane.showMessageDialog(ParaModificacionArticuloUI.this, "Voló");
					}
					else
						JOptionPane.showMessageDialog(ParaModificacionArticuloUI.this, "No adagsgsadgsa");
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
