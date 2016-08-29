package tp0.tbert12.cola;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NodeTest {

    @Test(expected = AssertionError.class)
    public void crearNodoVacio(){
        Node elNodo = new Node(null);
        elNodo.getContent();
        elNodo.getNextNode().getContent();
    }

    @Test
    public void pruebaAppendearAlNodoOtroNodo(){
        Node elNodo = new Node(3);
        elNodo.appendNext(new Node(4));

        Node siguienteNodo = (Node)elNodo.getNextNode();
        assertEquals((int)siguienteNodo.getContent(),4);
    }

    @Test
    public void pruebaAppendearProfundamenteHastaElUltimo(){
        Node elNodo = new Node(3);
        elNodo.appendNext(new Node(4));
        elNodo.appendNext(new Node(5));

        Node siguiente = (Node)elNodo.getNextNode();
        assertEquals((int)siguiente.getContent(),4);

        Node siguienteDelSiguiente = (Node)siguiente.getNextNode();
        assertEquals((int)siguienteDelSiguiente.getContent(),5);
    }

    @Test
    public void pruebaDeTamanoAppendearProfundamenteHastaElUltimo() {
        Node elNodo = new Node(0);
        for (int i = 1; i < 40; i++){
            elNodo.appendNext(new Node(i));
        }

        assertEquals((int)elNodo.getContent(),0);
        InterfaceNode nodoSiguiente = elNodo.getNextNode();
        for (int i = 1; i < 40; i++){
            assertEquals((int)nodoSiguiente.getContent(),i);
            nodoSiguiente = nodoSiguiente.getNextNode();
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
