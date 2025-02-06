package Day05.com.challenge_problem;
import java.util.HashSet;

public class FirstMissingPositiveInteger {
    // Function to find the first missing positive integer
    public static int findFirstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Add all numbers to the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int i = 1;
        while (set.contains(i)) {
            i++;
        }

        return i;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1};

        int firstMissing = findFirstMissingPositive(nums);

        System.out.println("First missing integer " + firstMissing);
    }
}

