package tp.tbert12.cola;


interface InterfaceNode {

    int countNexts();

    boolean isNull();

    Object getContent();

    InterfaceNode appendNext(Node node);

    InterfaceNode getNextNode();
}
