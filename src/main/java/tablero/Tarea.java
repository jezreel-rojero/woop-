package tablero;

public class Tarea {

	String tarjeta;
	Subsecciones subdireccion;
	FlujoDeTrabajo flujoDeTrabajo;

	public Tarea(String tarjeta) {
		this.tarjeta = tarjeta;
		this.subdireccion = subdireccion;

	}

	public Subsecciones getSubdireccion() {
		return subdireccion;
	}

	public void setSubdireccion(Subsecciones subdireccion) {
		this.subdireccion = subdireccion;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public FlujoDeTrabajo getFlujoDeTrabajo() {
		return flujoDeTrabajo;
	}

	public void setFlujoDeTrabajo(FlujoDeTrabajo flujoDeTrabajo) {
		this.flujoDeTrabajo = flujoDeTrabajo;
	}

	@Override
	public String toString() {
		return "Tarea{" +
				"tarjeta=" + tarjeta +
				", subdireccion=" + subdireccion +
				", flujoDeTrabajo=" + flujoDeTrabajo +
				'}';
	}
}