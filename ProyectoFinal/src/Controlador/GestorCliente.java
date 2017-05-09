package Controlador;
import java.util.ArrayList;

import Modelo.Cliente;


public class GestorCliente implements IGestorABMC {

	private ArrayList<Cliente>clientes=new ArrayList<>();
	private int id = 1;

	@Override
	public boolean alta(Object object) {
		if (object instanceof Cliente) {
			Cliente cliente= (Cliente) object;
			
		
			Object clienteAntiguo = consulta(cliente.getDni());

			if (clienteAntiguo == null) {
				cliente.setId(id);
				id++;
				
				clientes.add(cliente);
				return true;
			} 
		}
		return false;
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
	public boolean modificacion(Object object) {

		if (object instanceof Cliente) {
			Cliente cliente= (Cliente) object;
			Object consultaCliente = consulta(cliente.getDni());
			if (consultaCliente != null) {
				for (Cliente clientito : clientes) {
					if (clientito.equals(object)) {

						return true;
					}
				}

			}
		}
		return false;
	}

	@Override
	public boolean baja(Object object) {
		
		if (object instanceof Cliente) {			
			Cliente cliente= (Cliente) object;
			Object consultaCliente = consulta(cliente.getDni());
			if (consultaCliente != null) {
				clientes.remove(consultaCliente);
				return true;
			}
		}
		return false;
	}

}
