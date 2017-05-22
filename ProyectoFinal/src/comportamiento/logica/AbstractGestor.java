package comportamiento.logica;

import java.util.ArrayList;

import Modelo.IObjeto;

public abstract class AbstractGestor implements IGestorABMC {

	protected ArrayList<Object> objects = new ArrayList<>();
	private final IObjeto gestor;
	protected int id = 0;
	
	public AbstractGestor(IObjeto gestorObject) {
		super();
		this.gestor = gestorObject;
		Object nextObject = gestor.getNextObject();
		if(nextObject != null && nextObject instanceof  ArrayList){
			objects = (ArrayList) nextObject;
			id = ultimoId() + 1;			
		}
	}

	
	@Override
	public boolean alta(Object object) {
			if (esValidoParaAlta(object)) {
				objects.add(object);
				boolean replaceObjects = gestor.replaceObjects(object);

				if (replaceObjects) {
					id++;
					return true;
				} else {
					objects.remove(object);
					return false;
				}
			}
		return false;
	}

	@Override
	public Object consulta(String id) {
		try {
			for (Object obj : objects) {
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
		return false;
	}

	@Override
	public boolean baja(Object object) {
		return false;
	}
	
	protected abstract int ultimoId();
	
	protected abstract boolean esValidoParaAlta(Object obj);

	protected abstract boolean coincideBusqueda(Object obj, String name);
}
