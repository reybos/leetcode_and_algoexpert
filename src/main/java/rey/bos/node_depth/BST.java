package rey.bos.node_depth;

public class BST {

    public int value;
    public BST left;
    public BST right;

    public BST(int value, BST left, BST right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "BST{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
