package Day05.com.challenge_problem;
import java.util.Arrays;
public class TargetIndex {
    // Function to perform Binary Search
    public static int binarySearch(int[] nums, int target) {
        // Sort the array before applying Binary Search
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                // Return the index if the target is found
                return mid;
            } else if (nums[mid] < target) {
                // Search in the right half
                left = mid + 1;
            } else {
                // Search in the left half
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int target = 4;

        int targetIndex = binarySearch(nums, target);

        System.out.println("Index of target " + target + " (after sorting): " + targetIndex);
    }
}
