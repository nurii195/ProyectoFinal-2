package Modelo;

import java.io.Serializable;

public class LineaPedido implements Serializable{
	
	private int idLineaPedido;
	private Articulo articulo;
	private int cantidad;
	public LineaPedido() {
		super();
	}
	public int getIdLineaPedido() {
		return idLineaPedido;
	}
	public void setIdLineaPedido(int idLineaPedido) {
		this.idLineaPedido = idLineaPedido;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "LineaPedido [idLineaPedido=" + idLineaPedido + ", articulo=" + articulo + ", cantidad=" + cantidad
				+ "]";
	}
	
	

}
