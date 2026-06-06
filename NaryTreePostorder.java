import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorder {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);
        Node child4 = new Node(5);
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        child1.children.add(child4);

        System.out.println(postorder(root));
    }

    private static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        for (Node child : root.children) {
            result.addAll(postorder(child));
        }
        result.add(root.val);
        return result;
    }

    static class Node {
        int val;
        List<Node> children;

        Node(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }
}