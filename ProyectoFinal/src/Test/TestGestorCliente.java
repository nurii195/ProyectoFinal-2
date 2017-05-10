package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import Controlador.GestorCliente;
import Controlador.GestorObjetos;
import Modelo.Cliente;
import rutas.rutasFicheros;

public class TestGestorCliente {
	
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
		assertNull(alta3);
		
		boolean alta4=instancia.alta(null);
		assertFalse(alta4);
		
		boolean alta5=instancia.alta("Mariflores");
		assertFalse(alta5);
		
		
		
	}

	@Test
	public void testConsulta() {
		GestorObjetos gestorArchivoCliente = new GestorObjetos("archivoTestAltaCliente");
		GestorCliente instancia = new GestorCliente(gestorArchivoCliente);
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente1.setDni("02451247B");
		boolean alta = instancia.alta(cliente1);
		
		cliente2.setDni("14278549T");
		boolean alta2 = instancia.alta(cliente2);
		
		Object consulta = instancia.consulta(cliente1.getDni());
		Object consulta2 = instancia.consulta(cliente2.getDni());
		
		assertTrue(alta);
		assertTrue(alta2);
		
		assertNotNull(consulta);
		assertNotNull(consulta2);
		
		assertTrue(consulta instanceof Cliente);
		assertTrue(consulta2 instanceof Cliente);
		
		assertTrue(cliente1.getDni().equals(consulta));
		assertTrue(cliente2.getDni().equals(consulta2));
		
		Object consulta3 = instancia.consulta("00000000");
		
		assertNull(consulta3);
		
			
		
	}

}
