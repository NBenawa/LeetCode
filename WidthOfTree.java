import java.util.Collections;
import java.util.HashMap;

public class WidthOfTree {
    public static void main(String[] args) {
        TreeNodeWidth root = new TreeNodeWidth(1);
        root.left = new TreeNodeWidth(3);
        root.right = new TreeNodeWidth(2);
        root.left = new TreeNodeWidth(2);
        root.left.left = new TreeNodeWidth(5);
        root.left.right = new TreeNodeWidth(3);
        // root.right.right = new TreeNodeWidth(9);
        System.out.println(widthOfTree(new HashMap<>(), root, 0));
    }

    private static int widthOfTree(HashMap<Integer, Integer> map, TreeNodeWidth root, int level) {
        if (root == null) {
            return 0;
        }
        if (!map.containsKey(level)) {
            map.put(level, 1);
        } else {
            map.put(level, map.get(level) + 1);
        }
        widthOfTree(map, root.left, level + 1);
        widthOfTree(map, root.right, level + 1);
        int a = Collections.max(map.keySet());
        int b = (int) (Math.ceil(map.get(a) + 1) /2);
        int c = (int) Math.pow(2, b); 
        return c;
    }
}
class TreeNodeWidth {
    int val;
    TreeNodeWidth left;
    TreeNodeWidth right;

    TreeNodeWidth(int x) {
        val = x;
    }
}
