package tp0.tbert12.cola;


public class Node {
    public Object content;
    public Node nextNode;

    public Node(Object theContent) {
        nextNode = null;
        content = theContent;
    }

    public int countNexts() {
        return (nextNode != null) ? 1 + nextNode.countNexts() : 1;
    }

    public void appendNext(Node node){
        if (nextNode == null) {
            nextNode = node;
        } else {
            nextNode.appendNext(node);
        }
    }
}
