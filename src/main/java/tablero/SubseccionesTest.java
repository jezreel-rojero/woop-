package tablero;

import static org.junit.jupiter.api.Assertions.*;

class SubseccionesTest {


    private Subsecciones subsecciones = new Subsecciones(  "tarea1", "task board");


    @org.junit.jupiter.api.Test
    void getTareas() {
        assertEquals( "tarea1", subsecciones.getTareas());
    }

    @org.junit.jupiter.api.Test
    void setTareas() {
        subsecciones.setTareas("tarea1");
        assertEquals("tarea1", subsecciones.getTareas());
    }

    @org.junit.jupiter.api.Test
    void getTablero() {
        assertEquals("task board", subsecciones.getTablero());
    }

    @org.junit.jupiter.api.Test
    void setTablero() {
        subsecciones.setTablero("task board");
        assertEquals("task board", subsecciones.getTablero());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Subsecciones{"+ "tablero=task board" + ", tareas=tarea1" + '}', subsecciones.toString());
    }
}