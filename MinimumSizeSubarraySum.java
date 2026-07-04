import java.util.Arrays;
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
        int target = 213;
        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum size subarray length: " + result);
    }

    private static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
