public class SortArrayByParityOddEvenIndex {
    public static void main(String[] args) {
        int[] nums = new int[] {4, 2, 5, 7};
        System.out.println(printArray(sortArrayByParity(nums)));
    }

    private static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int[] even = new int[nums.length/2];
        int[] odd = new int[nums.length/2];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even[evenIndex] = nums[i];
                evenIndex++;
            } else {
                odd[oddIndex] = nums[i];
                oddIndex++;
            }
        }
        int resultIndex = 0;
        for (int i = 0; i < evenIndex; i++) {
            result[resultIndex] = even[i];
            result[resultIndex + 1] = odd[i];
            resultIndex += 2;
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
