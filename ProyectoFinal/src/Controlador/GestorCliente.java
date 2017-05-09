package Controlador;
import Modelo.Cliente;
import rutas.rutasFicheros;

public class GestorCliente implements IGestorABMC {
	Cliente cliente=new Cliente();
	GuardarLista guardar;
	LeerArrayList leerLista;
	private int id = 1;

	@Override
	public boolean alta(Object object) {
		if (object instanceof Cliente) {
			Cliente cliente= (Cliente) object;
			
			leerLista = new LeerArrayList(object, rutasFicheros.rutaCliente);
			Object clienteAntiguo = consulta(cliente.getDni());

			if (clienteAntiguo == null) {
				cliente.setId(id);
				id++;
				
				guardar = new GuardarLista(cliente, rutasFicheros.rutaCliente, leerLista.listaCliente);
				return true;
			} 
		}
		return false;
	}

	@Override
	public Object consulta(String dni) {
	
		for (Cliente cliente : leerLista.listaCliente) {
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
				for (Cliente clientito : leerLista.listaCliente) {
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
				leerLista.listaCliente.remove(consultaCliente);
				return true;
			}
		}
		return false;
	}

}
