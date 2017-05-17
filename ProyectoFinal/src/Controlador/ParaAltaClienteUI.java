package Controlador;

import Vista.AltaClienteUI;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Cliente;
import java.awt.event.ActionEvent;

public class ParaAltaClienteUI extends AltaClienteUI {

	private GestorCliente gCliente;

	public ParaAltaClienteUI(GestorCliente gestorCliente) {
		super();
		this.gCliente = gestorCliente;
		textNumeroClienteCA.setEditable(false);
		btnGuardarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombreCA.getText();
				String primerApellido = textPrimerACA.getText();
				String segundoApellido = textSegundoACA.getText();
				String dni = textDniCA.getText();
				Cliente cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setPrimerApellido(primerApellido);
				cliente.setSegundoApellido(segundoApellido);
				cliente.setDni(dni);
				boolean alta = gCliente.alta(cliente);
				if (alta) {
					textNumeroClienteCA.setText(String.valueOf(cliente.getId()));
					JOptionPane.showMessageDialog(null, "Cliente dado de alta correctamente");
				} else {
					JOptionPane.showMessageDialog(null, "Revise los campos, no se ha dado de alta correctamente");
				}

			}
		});
	}

}
