package Controlador;

import javax.swing.JPanel;

import Vista.ConsultaClienteUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaConsultaClienteUI extends ConsultaClienteUI {

	private GestorCliente gCliente;

	public ParaConsultaClienteUI(GestorCliente gestorCliente) {
		super();
		this.gCliente = gestorCliente;
		textResultadoConsultaCliente.setEnabled(false);
		btnConsultarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = textDniCC.getText();
				Object cliente = gCliente.consulta(dni);
				if (cliente != null) {
					textResultadoConsultaCliente.setText("Cliente dado de alta");
				} else {
					textResultadoConsultaCliente.setText("Cliente no dado de alta");
				}

			}
		});

	}

}
