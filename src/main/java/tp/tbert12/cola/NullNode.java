package tp.tbert12.cola;

class NullNode<T> implements InterfaceNode {

    @Override
    public int countNexts() {
        return 0;
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public T getContent() {
        throw new AssertionError();
    }

    @Override
    public InterfaceNode appendNext(Node node) {
        return node;
    }

    @Override
    public InterfaceNode getNextNode() {
        throw new AssertionError();
    }
}
