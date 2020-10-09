package tablero;

import static org.junit.jupiter.api.Assertions.*;

class TableroTest {

    private Tablero tablero = new Tablero("task board");

    @org.junit.jupiter.api.Test
    void getNombre() {
        assertEquals("task board", tablero.getNombre());
    }

    @org.junit.jupiter.api.Test
    void setNombre() {
        tablero.setNombre("task board");
        assertEquals("task board", tablero.getNombre());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Tablero{nombre='task board', columnas=[], filas=[], tarjetas=[], subdirecciones=[]}", tablero.toString());
    }
}