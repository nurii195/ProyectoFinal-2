package comportamiento.cliente;

import comportamiento.articulo.ParaBajaArticuloUI;
import comportamiento.logica.AbstractGestor;
import comportamiento.logica.GestorCliente;
import modelo.Articulo;
import modelo.Cliente;
import vista.cliente.BajaClienteUI;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;

public class ParaBajaClienteUI extends BajaClienteUI {

	private final AbstractGestor gestor;

	public ParaBajaClienteUI(GestorCliente gCliente) {
		super();
		this.gestor = gCliente;
		llenarCombo();
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel<Cliente> model = (DefaultComboBoxModel<Cliente>) comboBoxBajaCliente.getModel();
				Object selectedItem = comboBoxBajaCliente.getSelectedItem();
				if (selectedItem instanceof Cliente) {
					Cliente cliente = (Cliente) selectedItem;
					boolean baja = gCliente.baja(cliente);
					if (baja) {
						JOptionPane.showMessageDialog(ParaBajaClienteUI.this, "El cliente ha sido eliminado");
						model.removeElement(cliente);
					} else
						JOptionPane.showMessageDialog(ParaBajaClienteUI.this,
								"Algo ha fallado, el cliente no ha sido eliminado");
				}

			}
		});
	}

	private void llenarCombo() {
		DefaultComboBoxModel<Cliente> model = (DefaultComboBoxModel<Cliente>) comboBoxBajaCliente.getModel();
		ArrayList<Object> lista = gestor.getLista();
		for (Object object : lista) {
			if (object instanceof Cliente) {
				model.addElement((Cliente) object);
			}
		}
	}

}
