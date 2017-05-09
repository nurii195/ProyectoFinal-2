package Controlador;

public interface IGestorABMC {
	
	public boolean alta(Object object);
	public Object consulta(String nombre);
	public boolean modificacion(Object object);
	public boolean baja(Object object);

}
