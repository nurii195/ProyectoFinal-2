package Controlador;
import Modelo.Articulo;
import rutas.rutasFicheros;

public class GestorArticulo implements IGestorABMC {
	Articulo articulo = new Articulo();
	GuardarLista guardar;
	LeerArrayList leerLista;
	private int idArticulo = 1;

	@Override
	public boolean alta(Object object) {
		if (object instanceof Articulo) {

			Articulo articulo = (Articulo) object;
			leerLista = new LeerArrayList(articulo, rutasFicheros.rutaArticulo);
			Object consultArticulo = consulta(articulo.getNombreArticulo());
			if (consultArticulo == null) {
				articulo.setIdArticulo(idArticulo);
				idArticulo++;
				guardar = new GuardarLista((Articulo) object, rutasFicheros.rutaArticulo, leerLista.listaArticulo);

				return true;
			}
		}
		return false;
	}

	@Override
	public Object consulta(String nombre) {

		for (int i = 0; i < leerLista.listaArticulo.size(); i++) {
			if (articulo.getNombreArticulo().equals(nombre)) {
				return articulo;
			}
		}
		return null;
	}

	@Override
	public boolean modificacion(Object object) {
		if (object instanceof Articulo) {
			Articulo articulo = (Articulo) object;
			Object consultaArticulo = consulta(articulo.getNombreArticulo());
			if (consultaArticulo != null) {
				for (Articulo articulito : leerLista.listaArticulo) {
					if (articulito.equals(object)) {

						return true;
					}
				}

			}
		}
		return false;
	}

	@Override
	public boolean baja(Object object) {
		if (object instanceof Articulo) {
			Articulo articulo = (Articulo) object;
			Object consultaArticulo = consulta(articulo.getNombreArticulo());
			if (consultaArticulo != null) {
				leerLista.listaArticulo.remove(consultaArticulo);
				return true;
			}
		}

		return false;
	}

}
