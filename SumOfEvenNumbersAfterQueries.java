public class SumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4};
        int[][] queries = new int[][] {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        System.out.println(printArray(sumEvenAfterQueries(nums, queries)));
    }

    private static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[queries.length];
        int sum = 0;

        // Calculate initial sum of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];

            // If the current number is even, subtract it from the sum
            if (nums[index] % 2 == 0) {
                if (val % 2 != 0) {
                    // If the value being added is odd, the number will become odd
                    sum -= nums[index];
                } else {
                    // If the value being added is even, the number will remain even
                    sum += val;
                }
            } else {
                // If the current number is odd and the value being added is even, it will become even
                if ((val + nums[index]) % 2 == 0) {
                    sum += (nums[index] + val);
                }
            }
            nums[index] += val;

            // Store the current sum of even numbers in the result array
            result[i] = sum;
        }

        return result;
    }
    private static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
