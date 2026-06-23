public class SumOfBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(43);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(0);
        root.right.left.left = new TreeNode(18);
        sumOfBST(root, 7, 15);
        System.out.println(sumOfBST(root, 7, 15));
    }

    private static int sumOfBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        sum += sumOfBST(root.left, low, high);
        sum += sumOfBST(root.right, low, high);
        return sum;
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