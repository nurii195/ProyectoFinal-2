package Controlador;

import java.util.Iterator;

import javax.swing.JOptionPane;

import Modelo.Articulo;
import rutas.rutasFicheros;

public class GestorArticulo implements IGestorABMC {
	Articulo articulo = new Articulo();
	GuardarLista guardar;
	LeerArrayList leerLista;
	private int id=0;


	@Override
	public void alta(Object object) {
		leerLista = new LeerArrayList(articulo, rutasFicheros.rutaArticulo);
		articulo = (Articulo) consulta(articulo.getNombreArticulo());
		if (articulo == null) {
			guardar = new GuardarLista((Articulo) object, rutasFicheros.rutaArticulo, leerLista.listaArticulo);
			articulo.setIdArticulo(id++);
			JOptionPane.showMessageDialog(null, "EL articulo ha sido añadido correctamente");
		}else {
			JOptionPane.showMessageDialog(null, "EL articulo no ha sido añadido correctamente");
		}

	}

	@Override
	public Object consulta(String nombre) {
		for (int i = 0; i < leerLista.listaArticulo.size(); i++) {
			if (articulo.getNombreArticulo().equals(nombre)) {
				return articulo;
			}else {
				JOptionPane.showMessageDialog(null, "EL articulo no se encuentra");
			}
			
		}
		return null;
	}

	@Override
	public Object modificacion(Object object) {
		if (object instanceof Articulo) {
			leerLista = new LeerArrayList(articulo, rutasFicheros.rutaArticulo);
			articulo = (Articulo) consulta(articulo.getNombreArticulo());
			
		}
		return null;
	}

	@Override
	public void baja(Object object) {
		articulo= (Articulo) consulta(articulo.getNombreArticulo());
		if (articulo.equals(object)) {
			leerLista.lista.remove(object);
			articulo.setBaja(true);
			guardar= new GuardarLista((Articulo) object, rutasFicheros.rutaArticulo, leerLista.listaArticulo);
			JOptionPane.showMessageDialog(null, "Articulo dado de baja");
		}else {
			JOptionPane.showMessageDialog(null, "EL articulo no se encuentra");
		}

	}

}
