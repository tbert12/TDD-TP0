package tp0.tbert12.cola;

import org.junit.Test;
import tp0.tbert12.cola.Node;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tomi on 26/08/2016.
 */
public class NodeTest {

    @Test
    public void crearNodoVacio(){
        Node elNodo = new Node(null);
        assertEquals(elNodo.content, null);
        assertEquals(elNodo.nextNode, null);
    }

    @Test
    public void pruebaAppendearAlNodoOtroNodo(){
        Node elNodo = new Node(3);
        elNodo.appendNext(new Node(4));

        Node siguienteNodo = elNodo.nextNode;
        assertEquals((int)siguienteNodo.content,4);
    }

    @Test
    public void pruebaAppendearProfundamenteHastaElUltimo(){
        Node elNodo = new Node(3);
        elNodo.appendNext(new Node(4));
        elNodo.appendNext(new Node(5));

        Node siguiente = elNodo.nextNode;
        assertEquals((int)siguiente.content,4);

        Node siguienteDelSiguiente = siguiente.nextNode;
        assertEquals((int)siguienteDelSiguiente.content,5);
    }

    @Test
    public void pruebaDeTamanoAppendearProfundamenteHastaElUltimo() {
        Node elNodo = new Node(0);
        for (int i = 1; i < 40; i++){
            elNodo.appendNext(new Node(i));
        }

        assertEquals((int)elNodo.content,0);
        Node nodoSiguiente = elNodo.nextNode;
        for (int i = 1; i < 40; i++){
            assertEquals((int)nodoSiguiente.content,i);
            nodoSiguiente = nodoSiguiente.nextNode;
        }

    }

    @Test
    public void pruebaContarSiguientes(){
        Node elNodo = new Node(0);
        for (int i = 1; i < 40; i++){
            elNodo.appendNext(new Node(i));
        }
        assertEquals(elNodo.countNexts(),40);
    }
}
