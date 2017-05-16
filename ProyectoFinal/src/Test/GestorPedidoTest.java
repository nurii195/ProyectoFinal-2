package Test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import Controlador.GestorObjetos;
import Controlador.GestorPedido;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.LineaPedido;
import Modelo.Pedido;

public class GestorPedidoTest {
	
	@Before
	public void init(){
	File file = new File("archivoTestAltaPedido");
		if(file.exists())
			file.delete();
	}
	

	@Test
	public void testAlta() {
	
	}

	@Test
	public void testConsulta() {
		GestorObjetos gestorArchivoPedido = new GestorObjetos("archivoTestAltaPedido");
		GestorPedido instancia = new GestorPedido(gestorArchivoPedido);
		
		Cliente cliente=new Cliente();
		cliente.setDni("44782083W");
		cliente.setNombre("Alicia");
		cliente.setPrimerApellido("Rivera");
		cliente.setSegundoApellido("Gonzalez");
		cliente.setId(1);
		
		Articulo articulo=new Articulo();
		articulo.setIdArticulo(1);
		articulo.setNombreArticulo("martillo");
		articulo.setDescripcion("articulo para golpear");
		articulo.setPrecio(10.20f);
		articulo.setBaja(false);
		
		LineaPedido lineaPedido=new LineaPedido();
		lineaPedido.setArticulo(articulo);
		lineaPedido.setCantidad(2);
		lineaPedido.setIdLineaPedido(1);
		
		Pedido pedidoUno=new Pedido();
	
		pedidoUno.setCliente(cliente);
		pedidoUno.setFecha("11/05/2017");
		pedidoUno.getLineasPedidos().add(lineaPedido);
		

		boolean alta = instancia.alta(pedidoUno);
		assertTrue(alta);
		
		Object consulta = instancia.consulta(String.valueOf(pedidoUno.getIdPedido()));
		assertNotNull(consulta);
		assertTrue(consulta instanceof Pedido);
	
		
		
	}

}
