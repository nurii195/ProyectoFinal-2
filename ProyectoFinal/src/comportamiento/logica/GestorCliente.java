package comportamiento.logica;

import modelo.Cliente;
import modelo.IObjeto;

public class GestorCliente extends AbstractGestor {

	public GestorCliente(IObjeto gestorObjecto) {
		super(gestorObjecto);
	}

	@Override
	protected int ultimoId() {		
		int i = 0;
		for (Object pedido : objects) {
			if (pedido instanceof Cliente) {
				Cliente p = (Cliente) pedido;
				if(p.getId() > id){
					i = p.getId();
				}
			}
		}
		return i;
	}

	@Override
	protected boolean esValidoParaAlta(Object obj) {
		if (obj instanceof Cliente) {
			Cliente cliente = (Cliente) obj;
			if (cliente.getDni() == null || cliente.getDni().isEmpty() ||
					
					cliente.getNombre()== null || cliente.getNombre().isEmpty()||
					cliente.getPrimerApellido()== null || cliente.getPrimerApellido().isEmpty()||
					cliente.getSegundoApellido()== null || cliente.getSegundoApellido().isEmpty()) {
				return false;
			}
			
			if(!dniValido(cliente.getDni()))
				return false;
			
			cliente.setId(id);
			Object clienteAntiguo = consulta(cliente.getDni());
			if(clienteAntiguo == null){
				return true;
			}
		}
		return false;
	}

	private boolean dniValido(String dni) {
		try{
			String numeros = dni.substring(0, dni.length()-2);
			char letra = dni.charAt(dni.length()-1);
		
			Long.valueOf(numeros);
			if(Character.isLetter(letra) && dni.length() == 9)
				return true;
		} catch(Exception e){
			//no es valido
		}
		return false;
	}

	@Override
	protected boolean coincideBusqueda(Object obj, String dni) {
		if (obj instanceof Cliente) {
			Cliente cli = (Cliente) obj;			
			if (cli.getDni().equalsIgnoreCase(dni)) {
				return true;
			}
		}
		return false;
	}
}
