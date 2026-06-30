import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        List<Integer> occurings = new ArrayList<>();
        for (int i : nums) {
            if (occurings.contains(i)) {
                occurings.remove(Integer.valueOf(i));
            } else {
                occurings.add(i);
            }
        }
        return occurings.get(0);
    }
}
