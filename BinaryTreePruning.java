public class BinaryTreePruning {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);

        TreeNode prunedRoot = pruneTree(root);
        printTree(prunedRoot); // Should print the pruned tree
    }
    private static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }
    public static TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }
        return root;
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