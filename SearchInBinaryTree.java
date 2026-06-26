public class SearchInBinaryTree {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(4);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(7);
        root.left.left = new BinaryTree(1);
        root.left.right = new BinaryTree(3);

        searchBST(root, 5);
    }

    private static void searchBST(BinaryTree root, int value) {
        if (root == null) {
            System.out.println("Not Found!");
            return;
        }
        if (root.val == value) {
            System.out.println("Found!");
        }
        if (root.val > value) {
            searchBST(root.left, value);
        }
        if (root.val < value) {
            searchBST(root.right, value);
        }
    }
}
class BinaryTree {
    int val;
    BinaryTree right = null;
    BinaryTree left = null;
    BinaryTree(int x) {
        this.val = x;
    }
}