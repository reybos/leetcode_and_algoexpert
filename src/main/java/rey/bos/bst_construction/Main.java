package rey.bos.bst_construction;

public class Main {

    public static void main(String[] args) {
        Solution.BST bst = new Solution.BST(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(5);
        bst.insert(13);
        bst.insert(22);
        bst.insert(1);
        bst.insert(14);
        bst.insert(12);
        System.out.println(bst.contains(15));
        System.out.println(bst.contains(-1));
        System.out.println(bst);
        bst.remove(1);
        System.out.println(bst);
        bst.remove(5);
        System.out.println(bst);
        bst.remove(15);
        System.out.println(bst);
        bst.remove(10);
        System.out.println(bst);
        bst.remove(5);
        System.out.println(bst);
        bst.remove(13);
        System.out.println(bst);
        bst.remove(2);
        System.out.println(bst);
        bst.remove(12);
        System.out.println(bst);
        bst.remove(22);
        System.out.println(bst);
        bst.insert(22);
        System.out.println(bst);
        bst.remove(14);
        System.out.println(bst);
    }

}
