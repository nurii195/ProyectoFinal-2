package Modelo;

public class Pedido {
	
	private int idPedido;
	private String fecha;
	private Cliente cliente;
	private LineaPedido lineaPedido;
	public Pedido() {
		super();
	}
	public int getIdPedido() {
		return idPedido;
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
	public LineaPedido getLineaPedido() {
		return lineaPedido;
	}
	public void setLineaPedido(LineaPedido lineaPedido) {
		this.lineaPedido = lineaPedido;
	}
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", cliente=" + cliente + ", lineaPedido="
				+ lineaPedido + "]";
	}
	
	

}
