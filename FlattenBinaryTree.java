public class FlattenBinaryTree {
    public static void main(String[] args) {
        TreeNodeFlatten root = new TreeNodeFlatten(1);
        root.left = new TreeNodeFlatten(2);
        root.right = new TreeNodeFlatten(3);

        root.left.left = new TreeNodeFlatten(4);
        root.left.right = new TreeNodeFlatten(5);

        root.right.left = new TreeNodeFlatten(6);
        root.right.right = new TreeNodeFlatten(7);

        flattenTree(root);
        System.out.println(root);
    }

    private static void flattenTree(TreeNodeFlatten root) {
        if (root == null) {
            return;
        }
        flattenTree(root.left);
        flattenTree(root.right);
        if (root.left != null) {
            TreeNodeFlatten temp = root.right;
            root.right = root.left;
            
            TreeNodeFlatten current = root.right;
            while(current.right != null) {
                current = current.right;
            }
            current.right = temp;
            root.left = null;
        } else if (root.left != null) {
            root.right = root.left;
        }
    }
}
class TreeNodeFlatten {
    int val;
    TreeNodeFlatten left;
    TreeNodeFlatten right;

    TreeNodeFlatten(int x) {
        val = x;
    }
}
