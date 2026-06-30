public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printSpiralMatrix(matrix);
    }

    private static void printSpiralMatrix(int[][] matrix) {
        boolean odd = true;
        for (int i=0; i<matrix.length; i++) {
            if (odd) {
                for (int j=0; j<matrix[i].length; j++) {
                    System.out.print(matrix[i][j]);
                    System.out.print(" ");
                }
            } else {
                for (int j=matrix[i].length-1; j>=0; j--) {
                    System.out.print(matrix[i][j]);
                    System.out.print(" ");
                }
            }
            odd = !odd;
        }
    }
}