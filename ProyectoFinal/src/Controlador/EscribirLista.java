package Controlador;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirLista {
	
public boolean escribeLista(Object objeto,String ruta){
	
	File archivo = new File(ruta);
	boolean exists = archivo.exists();
	ObjectOutputStream adaptador = null;
	try {
		FileOutputStream flujo = new FileOutputStream(archivo, true);
		BufferedOutputStream buffer = new BufferedOutputStream(flujo);
		
		if(!exists){
			adaptador = new ObjectOutputStream(buffer);
		}else{
			adaptador = new MyObjectOutputStream(buffer);
		}
		
		adaptador.writeObject(objeto);
		
	} catch (FileNotFoundException e) {
		System.out.println("No se ha encontrado el archivo");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}finally {
		if (adaptador != null) {
			try {
				adaptador.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	return true;
	
}

}

