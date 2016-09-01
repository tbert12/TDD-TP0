package tp.tbert12.cola;


interface InterfaceNode<T> {

    int countNexts();

    boolean isNull();

    T getContent();

    InterfaceNode<T> appendNext(InterfaceNode<T> node);

    InterfaceNode<T> getNextNode();
}
