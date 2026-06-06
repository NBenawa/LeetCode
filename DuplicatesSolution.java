import java.util.Arrays;
import java.util.HashMap;

public class DuplicatesSolution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 3};
        System.out.println(hasDuplicates(nums));
    }

    // private static boolean hasDuplicates(int[] nums) {
    //     Arrays.sort(nums);
    //     for (int i = 1; i < nums.length - 1; i++) {
    //         if (nums[i] == nums[i + 1]) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    
    private static boolean hasDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}