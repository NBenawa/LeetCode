public class TreeFlatten {
    public static void main(String[] args) {
        FlattenTree root = new FlattenTree(1);
        root.left = new FlattenTree(2);
        root.right = new FlattenTree(3);

        root.left.left = new FlattenTree(4);
        root.left.right = new FlattenTree(5);

        root.right.left = new FlattenTree(6);
        root.right.right = new FlattenTree(7);

        flattenTree(root);
        System.out.println(root);
    }

    private static void flattenTree(FlattenTree root) {
        if (root == null) {
            return;
        }
        flattenTree(root.left);
        flattenTree(root.right);
        if (root.left != null) {
            FlattenTree temp = root.right;
            root.right = root.left;
            
            FlattenTree current = root.right;
            while(current.right != null) {
                current = current.right;
            }
            current.right = temp;
            root.left = null;
        } else if (root.left != null) {
            root.right = root.left;
        }
    }
}
class FlattenTree {
    int val;
    FlattenTree left;
    FlattenTree right;

    FlattenTree(int x) {
        val = x;
    }
}
