public class PathSumBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        int targetSum = 22;
        System.out.println(hasPathSum(root, targetSum, 0));
    }
    private static boolean hasPathSum(TreeNode root, int targetSum, int total) {
        if (root == null) {
            if (total == targetSum) {
                return true;
            }
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == total + root.val;
        }
        return hasPathSum(root.left, targetSum, total + root.val) || hasPathSum(root.right, targetSum, total + root.val);
    }
    
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}