package Controlador;

import java.io.*;

public class LeerArchivo {
	public void leerRuta(String ruta) {

		BufferedReader buffer = null;
		try {
			FileReader flujo = new FileReader(ruta);
			buffer = new BufferedReader(flujo);

			String line = buffer.readLine();
			while (line != null) {
				line = buffer.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (buffer != null) {
				try {
					buffer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	public Object leerObjeto(ObjectInputStream object){
		try {
			return object.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
