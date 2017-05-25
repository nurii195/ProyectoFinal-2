package comportamiento.pedido;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comportamiento.articulo.ParaBajaArticuloUI;
import comportamiento.logica.AbstractGestor;
import comportamiento.logica.GestorArticulo;
import comportamiento.logica.GestorPedido;
import modelo.Articulo;
import modelo.Pedido;
import vista.pedido.BajaPedidoUI;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ParaBajaPedidoUI extends BajaPedidoUI {

	private final AbstractGestor gestor;
	public ParaBajaPedidoUI(GestorPedido gPedido) {
		super();
		this.gestor = gPedido;
		llenarCombo();
		
		btnDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultComboBoxModel<Pedido> model = (DefaultComboBoxModel<Pedido>) comboBox.getModel();
				Object selectedItem = comboBox.getSelectedItem();
				if (selectedItem instanceof Pedido) {
					Pedido ped = (Pedido) selectedItem;
					boolean baja = gPedido.baja(ped);
					if(baja){
						JOptionPane.showMessageDialog(ParaBajaPedidoUI.this, "El pedido ha sido eliminado");
						model.removeElement(ped);
					}
					else
						JOptionPane.showMessageDialog(ParaBajaPedidoUI.this, "Algo ha fallado, el pedido no ha sido eliminado");
				}
			}
		});
		
	}
	private void llenarCombo() {
		DefaultComboBoxModel<Pedido> model = (DefaultComboBoxModel<Pedido>) comboBox.getModel();
		ArrayList<Object> lista = gestor.getLista();
		for (Object object : lista) {
			if (object instanceof Pedido) {
				model.addElement((Pedido) object);
			}
		}
	}

}
