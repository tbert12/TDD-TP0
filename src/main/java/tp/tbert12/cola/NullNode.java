package tp.tbert12.cola;

class NullNode implements InterfaceNode {

    public int countNexts() {
        return 0;
    }

    public Object getContent() {
        throw new AssertionError();
    }

    @Override
    public InterfaceNode appendNext(Node node) {
        return node;
    }


    public Node getNextNode() {
        throw new AssertionError();
    }
}
