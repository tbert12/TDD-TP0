package tp.tbert12.cola;

class Cola implements Queue {
    private InterfaceNode first = new NullNode();

    @Override
    public boolean isEmpty() {
        return first.isNull();
    }

    @Override
    public int size() {
        return first.countNexts();
    }

    @Override
    public void add(Object item) {
        first = first.appendNext(new Node<>(item));
    }

    @Override
    public Object top() {
        return first.getContent();
    }

    @Override
    public void remove() {
        first = first.getNextNode();
    }
}
