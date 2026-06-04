import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        printTriangle(generate(numRows));
    }

    private static void printTriangle(List<List<Integer>> triangle) {
        for (int i = 0; i < triangle.size(); i++) {
            for (int k = 0; k < triangle.size() - i - 1; k++) {
                System.out.print(" ");
            }
            for (Integer num : triangle.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == 1 || j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}