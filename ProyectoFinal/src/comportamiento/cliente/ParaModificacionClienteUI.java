package comportamiento.cliente;

import comportamiento.articulo.ParaModificacionArticuloUI;
import comportamiento.logica.AbstractGestor;
import comportamiento.logica.GestorCliente;
import modelo.Articulo;
import modelo.Cliente;
import vista.cliente.ModificacionClienteUI;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;

public class ParaModificacionClienteUI extends ModificacionClienteUI {
	
	private final AbstractGestor gestor;
	private Cliente modificando = null;

	public ParaModificacionClienteUI(GestorCliente gestorCliente) {
		super();
	
		this.gestor = gestorCliente;
		llenarCombo();
		eventos();
	}
	public void eventos(){
		
		comboBoxModCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object selectedItem = comboBoxModCliente.getSelectedItem();
				if (selectedItem instanceof Cliente) {
					modificando = (Cliente) selectedItem;
					textNombreCM.setText(modificando.getNombre());
					textPrimerACM.setText(modificando.getPrimerApellido());
					textSegundoACM.setText(modificando.getSegundoApellido());
					textDNI_CM.setText(modificando.getDni());
				}		
			}
		});
		
		btnGuardarModCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (modificando != null) {

					textNombreCM.setText(modificando.getNombre());
					textPrimerACM.setText(modificando.getPrimerApellido());
					textSegundoACM.setText(modificando.getSegundoApellido());
					textDNI_CM.setText(modificando.getDni());
					
					boolean modificacion = gestor.modificacion(modificando);
					if(modificacion){
						JOptionPane.showMessageDialog(ParaModificacionClienteUI.this, "El cliente ha sido modificado");
					}
					else
						JOptionPane.showMessageDialog(ParaModificacionClienteUI.this, "Algo ha fallado, el cliente no ha sido modificado");
				}
				
				
			}
		});
	
	}
	private void llenarCombo() {
		DefaultComboBoxModel<Cliente> model = (DefaultComboBoxModel<Cliente>) comboBoxModCliente.getModel();
		ArrayList<Object> lista = gestor.getLista();
		for (Object object : lista) {
			if (object instanceof Cliente) {
				model.addElement((Cliente) object);
			}
		}
	}
}
