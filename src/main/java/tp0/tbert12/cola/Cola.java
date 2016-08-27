package tp0.tbert12.cola;

public class Cola implements Queue {
    private Node first;

    public Cola(){
        first = null;
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public int size() {
        return (first != null) ? first.countNexts() : 0;
    }

    @Override
    public void add(Object item) {
        if (isEmpty()) {
            first = new Node(item);
        } else {
            first.appendNext(new Node(item));
        }
    }

    @Override
    public Object top() {
        return first.content;
    }

    @Override
    public void remove() {
        if (isEmpty()){
            throw new AssertionError();
        }
        first = first.nextNode;
    }
}
