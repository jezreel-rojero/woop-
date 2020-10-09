package tablero;

import java.util.*;

public class Proceso {
	private final Collection<Fase> fases;
	Collection<Actividad> actividades;
	Collection<Fase> faces;

	public Proceso(Collection<Fase> fases, Collection<Actividad> actividades, Collection<Fase> faces) {
		this.fases = fases;
		this.actividades = actividades;
		this.faces = faces;
	}

	public Collection<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(Collection<Actividad> actividades) {
		this.actividades = actividades;
	}

	public Collection<Fase> getFaces() {
		return faces;
	}

	public void setFaces(Collection<Fase> faces) {
		this.faces = faces;
	}

	public String toString() {
		return "Proceso{" +
				"fases=" + fases +
				", actividades=" + actividades +
				", faces=" + faces +
				'}';
	}

	/**
	 * 
	 * @param fases
	 * @param actividades
	 * @param faces
	 */
	public Proceso(int fases, Collection actividades, Collection faces) {
		// TODO - implement Proceso.Proceso
		throw new UnsupportedOperationException();
	}
}