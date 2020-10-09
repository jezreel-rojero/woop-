package tablero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarjetaTest {

    private Tarjeta tarjeta = new Tarjeta("tarea1", "task board");



    @org.junit.jupiter.api.Test
    void getTarea() {
        assertEquals("Tarea1", tarjeta.getTarea());
    }

    @org.junit.jupiter.api.Test
    void getTablero() {
        assertEquals("task board", tarjeta.getTablero());
    }
    @org.junit.jupiter.api.Test
    void setTarea() {
        tarjeta.setTarea("tarea1");
        assertEquals("tarea1", tarjeta.getTablero());
    }
    @org.junit.jupiter.api.Test
    void setTablero() {
        tarjeta.setTablero("task board");
        assertEquals("task board", tarjeta.getTablero());
    }


    @org.junit.jupiter.api.Test
    void testToString() {
      assertEquals("Tarjeta{tablero=Tarea1, tarea=null}", tarjeta.toString());
    }
}