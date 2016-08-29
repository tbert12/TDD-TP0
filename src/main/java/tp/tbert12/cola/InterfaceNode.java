package tp.tbert12.cola;


interface InterfaceNode {

    int countNexts();

    Object getContent();

    InterfaceNode appendNext(Node node);

    InterfaceNode getNextNode();
}
