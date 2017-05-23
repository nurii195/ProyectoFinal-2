package test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import comportamiento.logica.GestorCliente;
import modelo.Cliente;
import modelo.GestorObjetos;
import rutas.RutasFicheros;

public class TestGestorCliente {
	
	
	@Before
	public void init(){
	File file = new File("archivoTestAltaCliente");
		if(file.exists())
			file.delete();
	}
	
	@Test
	public void testAlta() {
		GestorObjetos gestorArchivoCliente = new GestorObjetos("archivoTestAltaCliente");
		GestorCliente instancia = new GestorCliente(gestorArchivoCliente);
		
		Cliente cliente = new Cliente();
		cliente.setDni("012457896T");
		cliente.setNombre("Paco");
		cliente.setPrimerApellido("Lopez");
		cliente.setSegundoApellido("Gomez");
		cliente.setId(1);
		boolean alta = instancia.alta(cliente);
		assertTrue(alta);
		
		boolean alta2=instancia.alta(cliente);
		assertFalse(alta2);
		
		Cliente clienteDos = new Cliente();
		clienteDos.setDni(null);
		boolean alta3=instancia.alta(clienteDos);
		assertFalse(alta3);
		
		boolean alta4=instancia.alta(null);
		assertFalse(alta4);
		
		boolean alta5=instancia.alta("Mariflores");
		assertFalse(alta5);
		
		Cliente vacio= new Cliente();
		assertFalse(instancia.alta(vacio));
		
		
	}

	@Test
	public void testConsulta() {
		GestorObjetos gestorArchivoCliente = new GestorObjetos("archivoTestAltaCliente");
		GestorCliente instancia = new GestorCliente(gestorArchivoCliente);
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente1.setDni("02451247B");
		cliente1.setNombre("besis");
		cliente1.setPrimerApellido("para");
		cliente1.setSegundoApellido("ti");
		boolean alta = instancia.alta(cliente1);
		
		cliente2.setDni("14278549T");
		cliente2.setNombre("besis");
		cliente2.setPrimerApellido("para");
		cliente2.setSegundoApellido("ti");
		boolean alta2 = instancia.alta(cliente2);
		
		Object consulta = instancia.consulta(cliente1.getDni());
		Object consulta2 = instancia.consulta(cliente2.getDni());
		
		assertTrue(alta);
		assertTrue(alta2);
		
		assertNotNull(consulta);
		assertNotNull(consulta2);
		
		assertTrue(consulta instanceof Cliente);
		assertTrue(consulta2 instanceof Cliente);
		
		Cliente c1 = (Cliente)consulta;
		Cliente c2 = (Cliente)consulta2;
		
		assertTrue(cliente1.getDni().equals(c1.getDni()));
		assertTrue(cliente2.getDni().equals(c2.getDni()));
		
		Object consulta3 = instancia.consulta("00000000");
		
		assertNull(consulta3);
		
			
		
	}

}
