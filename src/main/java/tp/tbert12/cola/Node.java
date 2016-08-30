package tp.tbert12.cola;


class Node<T> implements InterfaceNode {
    private final T content;
    private InterfaceNode nextNode = new NullNode();

    Node(T theContent) {
        content = theContent;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public int countNexts() {
        return 1 + nextNode.countNexts();
    }

    @Override
    public T getContent() {
        return content;
    }

    @Override
    public InterfaceNode appendNext(Node node) {
        nextNode = nextNode.appendNext(node);
        return this;
    }

    public InterfaceNode getNextNode() {
        return nextNode;
    }
}
