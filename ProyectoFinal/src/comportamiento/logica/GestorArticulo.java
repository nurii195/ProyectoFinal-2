package comportamiento.logica;

import modelo.Articulo;
import modelo.IObjeto;

public class GestorArticulo extends AbstractGestor {

	public GestorArticulo(IObjeto gestorObjecto) {
		super(gestorObjecto);
	}

	@Override
	protected int ultimoId() {
		int i = 0;
		for (Object pedido : objects) {
			if (pedido instanceof Articulo) {
				Articulo p = (Articulo) pedido;
				if(p.getIdArticulo() > id){
					i = p.getIdArticulo();
				}
			}
		}
		return i;
	}

	@Override
	protected boolean esValidoParaAlta(Object obj) {
		if (obj instanceof Articulo) {
			Articulo art = (Articulo) obj;
			if(art.getNombreArticulo() == null || art.getNombreArticulo().isEmpty())
				return false;
			Object articuloAntiguo = consulta(art.getNombreArticulo());
			art.setIdArticulo(id);
			if(articuloAntiguo == null){
				return true;
			}
		}
		return false;
	}

	@Override
	protected boolean coincideBusqueda(Object obj, String name) {
		if (obj instanceof Articulo) {
			Articulo art = (Articulo) obj;
			if (art.getNombreArticulo().equals(name)) {
				return true;
			}
		}
		return false;
	}

}
