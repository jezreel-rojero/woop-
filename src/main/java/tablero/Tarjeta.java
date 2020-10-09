package tablero;

public class Tarjeta {

	String tablero;
	String tarea;

	public Tarjeta(String task_board, String tablero) {
		this.tablero = tablero;
	}

	public Tarjeta(String  tarea) {
		this.tarea = tarea;
	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public String getTablero() {
		return tablero;
	}

	public void setTablero(String tablero) {
		this.tablero = tablero;
	}

	@Override
	public String toString() {
		return "Tarjeta{" +
				"tablero=" + tablero +
				", tarea=" + tarea +
				'}';
	}
}