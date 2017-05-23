package control.comportamiento;

import comportamiento.logica.GestorCliente;
import modelo.Cliente;
import vista.cliente.ConsultaClienteUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaConsultaClienteUI extends ConsultaClienteUI {

	private GestorCliente gCliente;

	public ParaConsultaClienteUI(GestorCliente gestorCliente) {
		super();
		this.gCliente = gestorCliente;
		textNombreCC.setEnabled(false);
		textPrimerApellidoCC.setEnabled(false);
		textSegundoApellidoCC.setEnabled(false);
		textResultadoCC.setEditable(false);
		btnConsultarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = textDniCC.getText();
				Object cliente = gCliente.consulta(dni);
				Cliente clientito = (Cliente) cliente;
				if (clientito != null) {

					textNombreCC.setText(clientito.getNombre());
					textPrimerApellidoCC.setText(clientito.getPrimerApellido());
					textSegundoApellidoCC.setText(clientito.getSegundoApellido());
					textResultadoCC.setText("Cliente encontrado");
				} else {
					textResultadoCC.setText("Cliente no encontrado");
				}

			}
		});

	}
}
