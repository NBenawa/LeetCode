import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
