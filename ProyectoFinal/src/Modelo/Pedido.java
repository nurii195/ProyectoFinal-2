package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido implements Serializable {
	
	private int idPedido;
	private String fecha;
	private Cliente cliente;
	private ArrayList<LineaPedido>lineasPedidos;

	public Pedido() {
		super();
		lineasPedidos=new ArrayList<>();
	}
	public int getIdPedido() {
		return idPedido;	
	}
	public ArrayList<LineaPedido> getLineasPedidos() {
		return lineasPedidos;
	}
	public void setLineasPedidos(ArrayList<LineaPedido> lineasPedidos) {
		this.lineasPedidos = lineasPedidos;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", cliente=" + cliente + ", lineasPedidos="
				+ lineasPedidos + "]";
	}

	
	
	

}
