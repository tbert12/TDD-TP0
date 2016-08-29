package tp0.tbert12.cola;


public interface InterfaceNode<E> {

    public int countNexts();

    public Object getContent();

    public InterfaceNode appendNext(Node node);

    public InterfaceNode getNextNode();
}
