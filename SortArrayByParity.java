public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 1, 2, 4};
        printArray(sortArrayByParity(nums));
    }

    private static int[] sortArrayByParity(int[] array) {
        int[] sorted = new int[array.length];
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            for (int i : array) {
                if (i%2 == 0) {
                    sorted[start] = i;
                    start++;
                } else {
                    sorted[end] = i;
                    end--;
                }
            }
        }
        return sorted;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
