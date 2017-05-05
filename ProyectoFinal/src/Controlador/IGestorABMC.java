package Controlador;

public interface IGestorABMC {
	
	public void alta(Object object);
	public Object consulta(String nombre);
	public Object modificacion(Object object);
	public void baja(Object object);

}
