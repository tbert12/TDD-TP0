package tp.tbert12.cola;

class NullNode<T> implements InterfaceNode<T> {

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
    public InterfaceNode<T> appendNext(InterfaceNode<T> node) {
        return node;
    }

    @Override
    public InterfaceNode<T> getNextNode() {
        throw new AssertionError();
    }
}
