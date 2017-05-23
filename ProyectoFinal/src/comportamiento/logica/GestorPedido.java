package comportamiento.logica;

import modelo.IObjeto;
import modelo.Pedido;

public class GestorPedido extends AbstractGestor {

	public GestorPedido(IObjeto gestorObject) {
		super(gestorObject);
	}
	
	@Override
	protected int ultimoId() {
		int i = 0;
		for (Object pedido : objects) {
			if (pedido instanceof Pedido) {
				Pedido p = (Pedido) pedido;
				if(p.getIdPedido() > id){
					i = p.getIdPedido();
				}
			}
		}
		return i;
	}

	@Override
	protected boolean esValidoParaAlta(Object object) {
		if (object instanceof Pedido) {
			Pedido pedido = (Pedido) object;
			if (pedido.getCliente() == null) {
				return false;
			}
			if (pedido.getLineasPedidos() == null) {
				return false;
			}
			if (pedido.getLineasPedidos().size() == 0) {
				return false;
			}
			Object consultaPedido = consulta(String.valueOf(pedido.getIdPedido()));
			pedido.setIdPedido(id);
			if(consultaPedido == null){
				return true;
			}
		}
		return false;
	}

	@Override
	protected boolean coincideBusqueda(Object obj, String name) {
		if (obj instanceof Pedido) {
			Pedido ped = (Pedido) obj;
			int id = Integer.valueOf(name);
			if (ped.getIdPedido() == id) {
				return true;
			}
		}
		return false;
	}
}
