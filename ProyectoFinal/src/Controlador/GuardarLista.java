package Controlador;

import java.util.ArrayList;

import Modelo.Articulo;

public class GuardarLista {
	EscribirLista escribir;
	
	public GuardarLista(Articulo articulo, String ruta, ArrayList<Articulo> lista){
		escribir= new EscribirLista();
		lista.add(articulo);
		escribir.escribeLista(articulo, ruta);
	}
	
	

}
