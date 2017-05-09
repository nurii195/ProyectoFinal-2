package Controlador;

import java.io.*;

public class GestorFicheros {

	public void escribirObjetos(String ruta) {
		File archivo = new File(ruta);
		boolean exists = archivo.exists();
		ObjectOutputStream adaptador = null;
		try {
			FileOutputStream flujo = new FileOutputStream(archivo, true);
			BufferedOutputStream buffer = new BufferedOutputStream(flujo);

			if (!exists) {
				adaptador = new ObjectOutputStream(buffer);
			} else {
				adaptador = new MyObjectOutputStream(buffer);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (adaptador != null) {
				try {
					adaptador.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public void leerObjetos(String ruta) {

		ObjectInputStream adaptador = null;
		try {
			FileInputStream flujo = new FileInputStream(ruta);
			BufferedInputStream buffer = new BufferedInputStream(flujo);
			adaptador = new ObjectInputStream(buffer);

			while (true) {
				Object object = adaptador.readObject();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Fin archivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (adaptador != null) {
				try {
					adaptador.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public void escribirDatos(String ruta) {

		DataOutputStream adaptador = null;
		try {
			FileOutputStream flujo = new FileOutputStream(ruta, false);
			BufferedOutputStream buffer = new BufferedOutputStream(flujo);
			adaptador = new DataOutputStream(buffer);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (adaptador != null) {
					adaptador.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void leerDatos(String ruta) {

		FileInputStream flujo = null;
		BufferedInputStream buffer = null;
		DataInputStream adaptador = null;
		try {
			flujo = new FileInputStream(ruta);
			buffer = new BufferedInputStream(flujo);
			adaptador = new DataInputStream(buffer);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// lee hasta que te de esta excepcion el adaptador.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (adaptador != null) {
				try {
					adaptador.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	public void escribirTexto(String ruta) {
		File archivo = new File(ruta);
		boolean exists = archivo.exists();
		BufferedWriter buffer = null;
		try {
			FileWriter flujo = new FileWriter(archivo, true);

			buffer = new BufferedWriter(flujo);
			if (exists)
				buffer.newLine();
			buffer.write("hola que pasa");

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

	public void leerTexto(String ruta) {

		BufferedReader buffer = null;
		try {
			FileReader flujo = new FileReader(ruta);
			buffer = new BufferedReader(flujo);

			String line = buffer.readLine();
			while (line != null) {
				System.out.println(line);
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
}
