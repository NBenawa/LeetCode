import java.util.HashMap;

public class FindLeftTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(findLeftTree(new HashMap(), root));
    }

    private static TreeNode findLeftTree(HashMap hashMap, TreeNode root) {
        if (root.left != null) {
            findLeftTree(hashMap, root.left);
        } else {
            return root;
        }
        return null;
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
