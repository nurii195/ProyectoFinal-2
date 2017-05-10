package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.GestorArticulo;
import Modelo.Articulo;

public class GestorArticuloTest {

	@Test
	public void testAlta() {
		GestorArticulo instancia=new GestorArticulo();
		Articulo articulo=new Articulo();
		articulo.setIdArticulo(1);
		articulo.setNombreArticulo("martillo");
		articulo.setPrecio(10.50f);
		articulo.setDescripcion("utillage para golpear");
		articulo.setBaja(false);
		boolean alta = instancia.alta(articulo);
		assertTrue(alta);
		
		//---------------------------------------
		
		boolean alta3 = instancia.alta(articulo);
		assertFalse(alta3);
		
		//---------------------------------------
		
		Articulo articuloDos=new Articulo();
		articuloDos.setNombreArticulo(null);
		boolean alta2 = instancia.alta(articuloDos);
		assertFalse(alta2);
		
		//---------------------------------------
		
		boolean alta4 = instancia.alta(null);
		assertFalse(alta4);
		
		//-----------------------------------------
		
		boolean alta5 = instancia.alta("martillo");
		assertFalse(alta5);
	}

	@Test
	public void testConsulta() {
		
	}

	@Test
	public void testModificacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testBaja() {
		fail("Not yet implemented");
	}

}
