package tablero;

public class Subsecciones {


	String tablero;
	String tareas;

	public Subsecciones(String tareas, String tablero) {
		this.tareas = tareas;
		this.tablero = tablero;
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	public String getTablero() {
		return tablero;
	}

	public void setTablero(String tablero) {
		this.tablero = tablero;
	}

	@Override
	public String toString() {
		return "Subsecciones{" +
				"tablero=" + tablero +
				", tareas=" + tareas +
				'}';
	}
}