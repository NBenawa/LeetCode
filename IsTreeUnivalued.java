public class IsTreeUnivalued {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(10);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(10);
        root.right.left.left = new TreeNode(10);
        System.out.println(isTreeUnivalued(root, root.val));
    }

    private static boolean isTreeUnivalued(TreeNode root, int rootValue) {
        if (root == null) {
            return true;
        }
        if (root.val != rootValue) {
            return false;
        }
        return isTreeUnivalued(root.left, rootValue) && isTreeUnivalued(root.right, rootValue);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}