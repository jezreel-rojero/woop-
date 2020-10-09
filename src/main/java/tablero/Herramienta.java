package tablero;

public class Herramienta {
	FlujoDeTrabajo flujo;

	public Herramienta(FlujoDeTrabajo flujo) {
		this.flujo = flujo;
	}

	public FlujoDeTrabajo getFlujo() {
		return flujo;
	}

	public void setFlujo(FlujoDeTrabajo flujo) {
		this.flujo = flujo;
	}

	public String toString() {
		return "Herramienta{" +
				"flujo=" + flujo +
				'}';
	}
}