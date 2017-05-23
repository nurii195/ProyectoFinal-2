package comportamiento.logica;

import java.util.ArrayList;

import modelo.IObjeto;

public abstract class AbstractGestor implements IGestorABMC {

	protected ArrayList<Object> lista = new ArrayList<>();
	private final IObjeto gestor;
	protected int id = 0;
	
	public AbstractGestor(IObjeto gestorObject) {
		super();
		this.gestor = gestorObject;
		Object nextObject = gestor.getNextObject();
		if(nextObject != null && nextObject instanceof  ArrayList){
			lista = (ArrayList) nextObject;
		}
		id = ultimoId() + 1;			
	}

	
	@Override
	public boolean alta(Object object) {
			if (esValidoParaAlta(object)) {
				lista.add(object);
				boolean replaceObjects = gestor.replaceObjects(lista);

				if (replaceObjects) {
					id++;
					return true;
				} else {
					lista.remove(object);
					return false;
				}
			}
		return false;
	}

	@Override
	public Object consulta(String id) {
		try {
			for (Object obj : lista) {
				if (coincideBusqueda(obj, id)) {
					return obj;
				}
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	@Override
	public boolean modificacion(Object object) {
		int index = lista.indexOf(object);
		if(index != -1){
			Object viejo = lista.set(index, object);
			boolean replaceObjects = gestor.replaceObjects(lista);

			if (replaceObjects) {
				return true;
			} else {
				lista.set(index, viejo);
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean baja(Object object) {
		int index = lista.indexOf(object);
		if(index != -1){
			Object viejo = lista.remove(index);
			boolean replaceObjects = gestor.replaceObjects(lista);

			if (replaceObjects) {
				return true;
			} else {
				lista.add(index, viejo);
				return false;
			}
		}
		return false;
	}
	
	protected abstract int ultimoId();
	
	protected abstract boolean esValidoParaAlta(Object obj);

	protected abstract boolean coincideBusqueda(Object obj, String name);


	public ArrayList<Object> getLista() {
		return lista;
	}
	
	
}
