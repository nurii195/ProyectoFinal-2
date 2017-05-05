package Controlador;

import java.util.ArrayList;
import Modelo.Cliente;

public class GestorCliente implements IGestorABMC {
	ArrayList<Cliente> clientes = new ArrayList<>();
	private int id = 1;

	@Override
	public void alta(Object object) {
		if (object instanceof Cliente) {

			Object cliente = consulta(((Cliente) object).getDni());

			if (cliente == null) {
				Cliente clienteNuevo = new Cliente();
				clienteNuevo.setDni(((Cliente) cliente).getDni());
				clienteNuevo.setNombre(((Cliente) cliente).getNombre());
				clienteNuevo.setPrimerApellido(((Cliente) cliente).getPrimerApellido());
				clienteNuevo.setSegundoApellido(((Cliente) cliente).getSegundoApellido());
				clienteNuevo.setId(id);
				id++;
				clientes.add(clienteNuevo);
				System.out.println("Cliente se ha creado con exito");
			} else {
				System.out.println("El cliente ya esta creado");
			}

		}
	}

	@Override
	public Object consulta(String dni) {

		for (Cliente cliente : clientes) {
			if (cliente.getDni().equals(dni)) {
				return cliente;
			}
		}

		return null;
	}

	@Override
	public Object modificacion(Object object) {

		if (object instanceof Cliente) {

			Object consultaCliente = consulta(((Cliente) object).getDni());
			if (consultaCliente != null) {
				for (Cliente cliente : clientes) {
					if (cliente.equals(object)) {
						cliente.setDni(((Cliente) object).getDni());
						cliente.setPrimerApellido(((Cliente) cliente).getPrimerApellido());
						cliente.setSegundoApellido(((Cliente) cliente).getSegundoApellido());
						return cliente;
					}
				}

			}
		}
		return null;
	}

	@Override
	public void baja(Object object) {

		Object consultaCliente = consulta(((Cliente) object).getDni());
		if (consultaCliente != null) {
			clientes.remove(consultaCliente);
			System.out.println("El cliente se ha dado de baja correctamente");
		}
	}

}
