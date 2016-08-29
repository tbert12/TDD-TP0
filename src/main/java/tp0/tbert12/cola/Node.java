package tp0.tbert12.cola;


public class Node<E> implements InterfaceNode {
    private final Object content;
    private InterfaceNode nextNode = new NullNode();

    public Node(Object theContent) {
        content = theContent;
    }

    public int countNexts() {
        return 1 + nextNode.countNexts();
    }

    public Object getContent(){
        return content;
    }

    public InterfaceNode appendNext(Node node){
        nextNode = nextNode.appendNext(node);
        return this;
    }

    public InterfaceNode getNextNode(){
        return nextNode;
    }
}
