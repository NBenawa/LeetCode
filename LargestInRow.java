import java.util.ArrayList;
import java.util.HashMap;

public class LargestInRow {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        HashMap<Integer, Integer> largestValues = findLargestValues(root);
        for (int key : largestValues.keySet()) {
            System.out.println("Row: " + key + " Largest Value: " + largestValues.get(key) + " "); // Output: 1 3 6
        }
    }

    private static HashMap<Integer, Integer> findLargestValues(TreeNode root) {
        HashMap<Integer, Integer> largestValues = new HashMap<>();
        findLargestValuesHelper(root, 0, largestValues);
        return largestValues;
    }

    private static void findLargestValuesHelper(TreeNode node, int level, HashMap<Integer, Integer> largestValues) {
        if (node == null) {
            return;
        }
        largestValues.put(level, Math.max(largestValues.getOrDefault(level, Integer.MIN_VALUE), node.val));
        findLargestValuesHelper(node.left, level + 1, largestValues);
        findLargestValuesHelper(node.right, level + 1, largestValues);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
