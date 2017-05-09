package Modelo;

import java.io.Serializable;

public class Articulo implements Serializable {
	
	private int idArticulo;
	private String nombreArticulo;
	private float precio;
	private String descripcion;
	private boolean baja = false;
	
	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public Articulo() {
		super();
	}

	public Articulo(int idArticulo, String nombreArticulo, float precio) {
		super();
		this.idArticulo = idArticulo;
		this.nombreArticulo = nombreArticulo;
		this.precio = precio;
	}

	public int getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		
		return nombreArticulo + ":" + precio;
	}

	

}
