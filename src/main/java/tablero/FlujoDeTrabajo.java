package tablero;

public class FlujoDeTrabajo {
	Tarea tarea;

	public FlujoDeTrabajo(Tarea tarea) {
		this.tarea = tarea;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	public String toString() {
		return "FlujoDeTrabajo{" +
				"tarea=" + tarea +
				'}';
	}
}