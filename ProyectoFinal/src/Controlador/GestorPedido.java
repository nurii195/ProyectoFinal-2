package Controlador;

import java.util.ArrayList;
import Modelo.Pedido;

public class GestorPedido implements IGestorABMC {
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	private int idPedido = 1;
	private final IObjeto gestorObjecto;

	public GestorPedido(IObjeto gestorObject) {
		super();
		this.gestorObjecto = gestorObject;
		Object nextObject = gestorObjecto.getNextObject();
		if(nextObject != null && nextObject instanceof  ArrayList){
			pedidos = (ArrayList<Pedido>) nextObject;
			
			for (Pedido pedido : pedidos) {
				if(pedido.getIdPedido()> idPedido){
					idPedido = pedido.getIdPedido();
				}
			}
			idPedido++;
		}
	}

	@Override
	public boolean alta(Object object) {
		if (object instanceof Pedido) {
			Pedido pedido = (Pedido) object;
			if (pedido.getCliente()==null) {
				return false;
			}
			if (pedido.getLineasPedidos()==null) {
				return false;
			}
			if (pedido.getLineasPedidos().size()==0) {
				return false;
			}
			Object consultaPedido = consulta(String.valueOf(pedido.getIdPedido()));
			if (consultaPedido == null) {
				pedido.setIdPedido(idPedido);

				pedidos.add(pedido);
				boolean replaceObjects = gestorObjecto.replaceObjects(pedidos);

				if (replaceObjects) {
					idPedido++;
					return true;
				} else {
					pedidos.remove(pedido);
					return false;
				}

			}

		}

		return false;
	}

	@Override
	public Object consulta(String id) {
		try {
			int idPedido=Integer.valueOf(id);
			for (Pedido pedido : pedidos) {
				if (pedido.getIdPedido() == idPedido) {
					return pedido;
				}
			}
		} catch (NumberFormatException e) {
			return null;
		}
		return null;
	}

	@Override
	public boolean modificacion(Object object) {
		
		return false;
	}

	@Override
	public boolean baja(Object object) {
	
		return false;
	}

}
