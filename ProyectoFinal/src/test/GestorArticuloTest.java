package test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import comportamiento.logica.GestorArticulo;
import modelo.Articulo;
import modelo.GestorObjetos;


public class GestorArticuloTest {
	
	@Before
	public void init(){
	File file = new File("archivoTestArticulo");
		if(file.exists())
			file.delete();
	}

	@Test
	public void testAlta() {

		GestorObjetos gestorArchivoArticulo = new GestorObjetos("archivoTestArticulo");		
		GestorArticulo instancia=new GestorArticulo(gestorArchivoArticulo);

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

		
		GestorObjetos gestorArchivoArticulo = new GestorObjetos("archivoTestArticulo");		
		GestorArticulo instancia=new GestorArticulo(gestorArchivoArticulo);

		Articulo articuloUno=new Articulo();
		Articulo articuloDos=new Articulo();
		

		articuloUno.setNombreArticulo("martillo");
		boolean alta = instancia.alta(articuloUno);
		
		articuloDos.setNombreArticulo("sierra");
		boolean alta2 = instancia.alta(articuloDos);
		
		Object consulta = instancia.consulta(articuloUno.getNombreArticulo());
		Object consulta2 = instancia.consulta(articuloDos.getNombreArticulo());
		
		assertTrue(alta);
		assertTrue(alta2);
		
		assertNotNull(consulta);
		assertNotNull(consulta2);
		
		assertTrue(consulta instanceof Articulo);
		assertTrue(consulta2 instanceof Articulo);
		
		Articulo a1 = (Articulo) consulta;
		Articulo a2 = (Articulo) consulta2;
		
		assertTrue(articuloUno.getNombreArticulo().equals(a1.getNombreArticulo()));
		assertTrue(articuloDos.getNombreArticulo().equals(a2.getNombreArticulo()));
		
		Object consulta3 = instancia.consulta("00000000");
		
		assertNull(consulta3);
		
	}

	@Test
	public void testModificacion() {
		//fail("Not yet implemented");
	}

	@Test
	public void testBaja() {
		//fail("Not yet implemented");
	}

}
