package tp.tbert12.cola;

class Cola<T> implements Queue<T> {
    private InterfaceNode<T> first = new NullNode<>();

    @Override
    public boolean isEmpty() {
        return first.isNull();
    }

    @Override
    public int size() {
        return first.countNexts();
    }

    @Override
    public void add(T item) {
        first = first.appendNext(new Node<>(item));
    }

    @Override
    public T top() {
        return first.getContent();
    }

    @Override
    public void remove() {
        first = first.getNextNode();
    }
}
