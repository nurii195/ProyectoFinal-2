package Controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Cliente;

public class GestorCliente implements IGestorABMC {

	private ArrayList<Cliente> clientes = new ArrayList<>();
	private int id = 1;

	private final IObjeto gestorObjecto;

	public GestorCliente(IObjeto gestorObjecto) {
		super();
		this.gestorObjecto = gestorObjecto;
		Object nextObject = gestorObjecto.getNextObject();
		if (nextObject != null && nextObject instanceof ArrayList) {
			clientes = (ArrayList<Cliente>) nextObject;

			for (Cliente cliente : clientes) {
				if (cliente.getId() > id) {
					id = cliente.getId();
				}
			}
			id++;
		}
	}

	@Override
	public boolean alta(Object object) {
		if (object instanceof Cliente) {
			Cliente cliente = (Cliente) object;

			if (cliente.getDni() == null || cliente.getDni().isEmpty() ||
					
					cliente.getNombre()== null || cliente.getNombre().isEmpty()||
					cliente.getPrimerApellido()== null || cliente.getPrimerApellido().isEmpty()||
					cliente.getSegundoApellido()== null || cliente.getSegundoApellido().isEmpty()) {

				return false;

			}
			
	
				Object clienteAntiguo = consulta(cliente.getDni());

				if (clienteAntiguo == null) {
					cliente.setId(id);

					clientes.add(cliente);
					boolean replaceObjects = gestorObjecto.replaceObjects(clientes);

					if (replaceObjects) {
						id++;
						return true;
					} else {
						clientes.remove(cliente);
						return false;
					}

				}
			}
	
		return false;
	}

	@Override
	public Object consulta(String dni) {

		for (Cliente cliente : clientes) {
			if (cliente.getDni().equalsIgnoreCase(dni)) {
				return cliente;
			}
		}

		return null;
	}

	@Override
	public boolean modificacion(Object object) {
		//
		// if (object instanceof Cliente) {
		// Cliente cliente= (Cliente) object;
		// Object consultaCliente = consulta(cliente.getDni());
		// if (consultaCliente != null) {
		// for (Cliente clientito : clientes) {
		// if (clientito.equals(object)) {
		//
		// return true;
		// }
		// }
		//
		// }
		// }
		return false;
	}

	@Override
	public boolean baja(Object object) {

		// if (object instanceof Cliente) {
		// Cliente cliente= (Cliente) object;
		// Object consultaCliente = consulta(cliente.getDni());
		// if (consultaCliente != null) {
		// clientes.remove(consultaCliente);
		// return true;
		// }
		// }
		return false;
	}

}
