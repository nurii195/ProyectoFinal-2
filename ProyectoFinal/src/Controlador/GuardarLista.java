package Controlador;

import java.util.ArrayList;

import Modelo.Articulo;
import Modelo.Cliente;

public class GuardarLista {
	EscribirLista escribir;
	
	public GuardarLista(Articulo articulo, String ruta, ArrayList<Articulo> lista){
		escribir= new EscribirLista();
		lista.add(articulo);
		escribir.escribeLista(articulo, ruta);
	}
	
	public GuardarLista(Cliente cliente, String ruta, ArrayList<Cliente> lista){
		escribir= new EscribirLista();
		lista.add(cliente);
		escribir.escribeLista(cliente, ruta);
	}
	

}
