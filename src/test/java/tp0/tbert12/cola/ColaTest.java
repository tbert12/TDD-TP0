package tp0.tbert12.cola;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColaTest {

    @Test
    public void crearColaVacia(){
        Queue<Integer> laCola = new Cola();
        assertEquals(laCola.size(),0);
        assertTrue(laCola.isEmpty());
    }

    @Test
    public void colaConUnElemento(){
        Queue<Integer> laCola = new Cola();
        laCola.add(1994);
        assertEquals(laCola.size(),1);
        assertEquals(laCola.top(),(Integer) 1994);
        assertFalse(laCola.isEmpty());
    }

    @Test
    public void colaAgregoYEliminoUnElemento(){
        Queue<String> laCola = new Cola();
        laCola.add("Tomas");
        assertEquals("Tomas",laCola.top());

        laCola.remove();
        assertTrue(laCola.isEmpty());
        assertEquals(laCola.size(),0);
    }

    @Test
    public void pruebaDeVolumen(){
        Queue<Integer> laCola = new Cola();
        for (Integer i = 0; i <= 167; i++){
            laCola.add(i);
        }

        assertFalse(laCola.isEmpty());

        for (Integer i = 0; i <= 167; i++){
            assertEquals(laCola.top(),i);
            assertEquals(168 - i,laCola.size());
            laCola.remove();
        }

        assertTrue(laCola.isEmpty());
    }
}
