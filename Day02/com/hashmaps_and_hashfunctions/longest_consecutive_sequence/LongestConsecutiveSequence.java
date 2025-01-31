package Day02.com.hashmaps_and_hashfunctions.longest_consecutive_sequence;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int longestStreak = 0;

        for (int num : nums) {
            if (!map.containsKey(num)) {  // Ignore duplicates
                int leftLen = map.getOrDefault(num - 1, 0);
                int rightLen = map.getOrDefault(num + 1, 0);
                int totalLen = leftLen + rightLen + 1;

                // Store the sequence length in both boundaries
                map.put(num, totalLen);
                map.put(num - leftLen, totalLen);
                map.put(num + rightLen, totalLen);

                longestStreak = Math.max(longestStreak, totalLen);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums)); // Output: 4
    }
}

