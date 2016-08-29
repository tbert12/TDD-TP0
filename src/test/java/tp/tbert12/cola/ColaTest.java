package tp.tbert12.cola;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColaTest {

    @Test
    public void crearColaVacia() {
        Cola laCola = new Cola();
        assertEquals(laCola.size(),0);
        assertTrue(laCola.isEmpty());
    }

    @Test
    public void colaConUnElemento() {
        Cola laCola = new Cola();
        laCola.add(1994);
        assertEquals(laCola.size(),1);
        assertEquals(laCola.top(),1994);
        assertFalse(laCola.isEmpty());
    }

    @Test
    public void colaAgregoYEliminoUnElemento() {
        Cola laCola = new Cola();
        laCola.add("Tomas");
        assertEquals("Tomas",laCola.top());

        laCola.remove();
        assertTrue(laCola.isEmpty());
        assertEquals(laCola.size(),0);
    }

    @Test
    public void pruebaDeVolumen() {
        Cola laCola = new Cola();

        for (Integer i = 0; i <= 167; i++) {
            laCola.add(i);
        }

        assertFalse(laCola.isEmpty());

        for (Integer i = 0; i <= 167; i++) {
            assertEquals(laCola.top(),i);
            assertEquals(168 - i,laCola.size());
            laCola.remove();
        }

        assertTrue(laCola.isEmpty());
    }
}
