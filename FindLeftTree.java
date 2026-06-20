public class FindLeftTree {
    static int level = -1;
    static int result = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.left.left = new TreeNode(9);
        findLeftTree(0, root);
        System.out.println(result);
    }

    private static void findLeftTree(int currLevel, TreeNode root) {
        if (root == null) {
            return;
        }
        if (currLevel > level) {
            level = currLevel;
            result = root.val;
        }
        findLeftTree(currLevel+1, root.left);
        findLeftTree(currLevel+1, root.right);
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
