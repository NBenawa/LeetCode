public class IsTreeUnivalued {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(43);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(0);
        root.right.left.left = new TreeNode(18);
        System.out.println(isTreeUnivalued(root));
    }

    private static boolean isTreeUnivalued(TreeNode root) {
        return true;
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