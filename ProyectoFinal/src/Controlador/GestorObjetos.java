package Controlador;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GestorObjetos implements IObjeto {
	
	private final File archivo;
	private int index=0;
	
	public GestorObjetos(String ruta) {
		super();
		archivo=new File(ruta);
	}
	

	@Override
	public boolean replaceObjects(Object object) {
		
		

		ObjectOutputStream adaptador=null;
		try {
			FileOutputStream flujo = new FileOutputStream(archivo, false);
			BufferedOutputStream buffer = new BufferedOutputStream(flujo);		

			adaptador = new ObjectOutputStream(buffer);

			adaptador.writeObject(object);
			return true;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
			//Este es el final del archivo
		}catch (IOException e) {
		
			e.printStackTrace();
		} finally {
			try {
				if (adaptador!=null) {
					adaptador.close();
				}			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

	

	@Override
	public boolean addObjects(Object object) {
		
		boolean exists = archivo.exists();
		ObjectOutputStream adaptador=null;
		try {
			FileOutputStream flujo = new FileOutputStream(archivo, true);
			BufferedOutputStream buffer = new BufferedOutputStream(flujo);
			
			if(!exists){
				adaptador = new ObjectOutputStream(buffer);
			}else{
				adaptador = new MyObjectOutputStream(buffer);
			}
			
			
			adaptador.writeObject(object);
			return true;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
			//Este es el final del archivo
		}catch (IOException e) {
		
			e.printStackTrace();
		} finally {
			try {
				if (adaptador!=null) {
					adaptador.close();
				}			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

	@Override
	public Object getNextObject() {
		
		ObjectInputStream adaptador=null;
		try {
			FileInputStream flujo = new FileInputStream(archivo);
			BufferedInputStream buffer = new BufferedInputStream(flujo);
			
			adaptador = new ObjectInputStream(buffer);
			
			for (int i = 0; i < index; i++) {
				adaptador.readObject();
			}
			
			Object object = adaptador.readObject();
			index++;
			return object;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
			//Este es el final del archivo
		}catch (IOException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (adaptador!=null) {
					adaptador.close();
				}			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		
		
		
		return null;
	}

}
