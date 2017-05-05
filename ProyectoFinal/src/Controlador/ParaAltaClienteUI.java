package Controlador;
import Vista.AltaClienteUI;
import java.awt.event.ActionListener;

import Modelo.Cliente;

import java.awt.event.ActionEvent;

public class ParaAltaClienteUI extends AltaClienteUI {
	
	private GestorCliente gCliente;

	public ParaAltaClienteUI(GestorCliente gestorCliente) {
		super();
		this.gCliente=gestorCliente;
		textNumeroClienteCA.setEditable(false);
		btnGuardarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombreCA.getText();
				String primerApellido = textPrimerACA.getText();
				String segundoApellido = textSegundoACA.getText();
				String dni = textDniCA.getText();
				Cliente cliente= new Cliente();
				cliente.setDni(nombre);
				cliente.setPrimerApellido(primerApellido);
				cliente.setSegundoApellido(segundoApellido);
				cliente.setDni(dni);
				gCliente.alta(cliente);
				textNumeroClienteCA.setText(String.valueOf(cliente.getId()));			
				
							
			}
		});
	}

}
