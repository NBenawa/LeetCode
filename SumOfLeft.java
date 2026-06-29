public class SumOfLeft {
    public static void main(String[] args) {
        LeftBST root = new LeftBST(3);
        root.left = new LeftBST(9);
        root.right = new LeftBST(20);
        root.right.left = new LeftBST(15);
        root.right.right = new LeftBST(7);

        System.out.println(sumOfLeft(root));
    }

    private static int sumOfLeft(LeftBST root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (root.left != null) {
            sum += root.left.val;
        }
        sum += sumOfLeft(root.left);
        sum += sumOfLeft(root.right);
        return sum;
    }
}
class LeftBST {
    int val;
    LeftBST right;
    LeftBST left;

    LeftBST(int x) {
        val = x;
    }
}