package tablero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TareaTest {

    private Tarea tarea = new Tarea("tarjeta");


    @org.junit.jupiter.api.Test
    void getTarjeta() {
        assertEquals("tarjeta", tarea.getTarjeta());
    }

    @org.junit.jupiter.api.Test
    void setTarjeta(String tarjeta) {
      tarea.setTarjeta("tarjeta");
      assertEquals("tarjeta", tarea.getTarjeta());
    }



    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Tarea{tarjeta=tarjeta, subdireccion=null, flujoDeTrabajo=null}", tarea.toString());
    }
}