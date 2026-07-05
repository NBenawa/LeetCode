public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 5;
        boolean result = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found in matrix: " + result);
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = (left + right + 1) / 2;
            int midValue = matrix[mid / cols][mid % cols];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > target) {
                    break; // No need to check further in this row
                }
                rows
                if (num == target) {
                    return true;
                }
            }
        }
        return false;
    }
}