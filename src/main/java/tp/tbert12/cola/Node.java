package tp.tbert12.cola;


class Node<T> implements InterfaceNode<T> {
    private final T content;
    private InterfaceNode<T> nextNode = new NullNode<>();

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
    public InterfaceNode<T> appendNext(InterfaceNode<T> node) {
        nextNode = nextNode.appendNext(node);
        return this;
    }

    public InterfaceNode<T> getNextNode() {
        return nextNode;
    }
}
