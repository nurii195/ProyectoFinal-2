package Controlador;

import java.io.ObjectInputStream;
import java.util.ArrayList;

import Modelo.Articulo;
import Modelo.Cliente;

public class LeerArrayList {
	ArrayList<Object> lista = new ArrayList<>();
	ArrayList<Cliente> listaCliente;
	ArrayList<Articulo> listaArticulo;
	LeerArchivo leer;

	public LeerArrayList(Object objeto, String ruta) {
		leer = new LeerArchivo();
		leer.leerRuta(ruta);
		averiguaLista(lista, objeto, ruta);
	}

	private void averiguaLista(ArrayList<Object> listita, Object objeto, String ruta) {
		if (objeto instanceof Articulo) {
			listaArticulo = (ArrayList<Articulo>) leer.leerObjeto((ObjectInputStream) objeto);
		}else {
			listaCliente = (ArrayList<Cliente>) leer.leerObjeto((ObjectInputStream) objeto);
		}

	}

}
