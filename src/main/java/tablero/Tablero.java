package tablero;

import java.util.*;

public class Tablero{

	private String nombre;
	private Collection<Columna> columnas = new ArrayList<Columna>();
	private Collection<Fila> filas = new ArrayList <Fila>();
	private Collection<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
	private Collection<Subsecciones> subdirecciones = new ArrayList<Subsecciones>();


	public Tablero(String nombre) {
		this.nombre  = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Collection<Columna> getColumnas() {
		return columnas;
	}

	public void setColumnas(Collection<Columna> columnas) {
		this.columnas = columnas;
	}
	public Collection<Fila> getFilas() {
		return filas;
	}

	public void setFilas(Collection<Fila> filas) {
		this.filas = filas;
	}
	public Collection<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(Collection<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	public Collection<Subsecciones> getSubdirecciones() {
		return subdirecciones;
	}

	public void setSubdirecciones(Collection<Subsecciones> subdirecciones) {
		this.subdirecciones = subdirecciones;
	}

	@Override
	public String toString() {
		return "Tablero{" +
				"nombre='" + nombre + '\'' +
				", columnas=" + columnas +
				", filas=" + filas +
				", tarjetas=" + tarjetas +
				", subdirecciones=" + subdirecciones +
				'}';
	}
}