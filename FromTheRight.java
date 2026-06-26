public class FromTheRight {
    public static void main(String[] args) {
        TreeNodeRight root = new TreeNodeRight(1);
        root.left = new TreeNodeRight(2);
        root.right = new TreeNodeRight(3);

        // root.left.left = new TreeNodeRight(4);
        root.left.right = new TreeNodeRight(5);

        // root.right.left = new TreeNodeRight(6);
        root.right.right = new TreeNodeRight(4);

        fromTheRight(root);
        System.out.println(root);
    }
    private static void fromTheRight(TreeNodeRight root) {
        if (root == null) {
            return;
        }
        root.left = null;
        fromTheRight(root.right);
    }
}
class TreeNodeRight {
    int val;
    TreeNodeRight left;
    TreeNodeRight right;

    TreeNodeRight(int x) {
        val = x;
    }
}
