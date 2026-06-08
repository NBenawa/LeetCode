public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, nums.length/2, target, 0, nums.length - 1)); // Output: 4
    }
    private static int search(int[] nums, int mid, int target, int left, int right) {
        while(left <= right) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                mid = (mid + 1 + right) / 2;
                return search(nums, mid, target, left, right);
            } else {
                right = mid - 1;
                mid = (left + mid - 1) / 2;
                return search(nums, mid, target, left, right);
            }
        }
        return -1; // Target not found
    }
    
}
