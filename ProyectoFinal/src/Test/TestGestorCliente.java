package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Controlador.GestorCliente;
import Modelo.Cliente;

public class TestGestorCliente extends GestorCliente {


	
	@Test
	public void testAlta() {
		
		
		
	}

	@Test
	public void testConsulta() {
		GestorCliente instancia = new GestorCliente();
		
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
