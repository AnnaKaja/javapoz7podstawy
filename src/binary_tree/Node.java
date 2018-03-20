package binary_tree;

public class Node<T> {
    private Node parent;
    private Node left;
    private Node right;
    private T data;
    private int index;

    public Node(T data) {
        this.data = data;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void addLeftChild(Node node) {
        node.setParent(this);
        left = node;
    }

    public void addRightChild(Node node) {
        node.setParent(this);
        right = node;
    }

    public T getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}