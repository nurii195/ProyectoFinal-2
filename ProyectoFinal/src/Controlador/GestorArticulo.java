package Controlador;

import java.util.ArrayList;
import Modelo.Articulo;


public class GestorArticulo implements IGestorABMC {
	
	private ArrayList<Articulo>articulos=new ArrayList<>();
	private int idArticulo = 1;

	@Override
	public boolean alta(Object object) {
		if (object instanceof Articulo) {

			Articulo articulo = (Articulo) object;
		
			Object consultArticulo = consulta(articulo.getNombreArticulo());
			if (consultArticulo == null) {
				articulo.setIdArticulo(idArticulo);
				idArticulo++;
				articulos.add(articulo);
				return true;
				}
			}
		return false;
	}

	@Override
	public Object consulta(String nombre) {

		for (Articulo articulo: articulos) {
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
				for (Articulo articulito : articulos) {
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
				articulos.remove(consultaArticulo);
				return true;
			}
		}

		return false;
	}

}
