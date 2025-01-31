package Day02.com.stacks_and_queues.sliding_window_maximum;

import java.util.Arrays;
public class SlidingWindowController {

    public static void main(String[] args) {
        SlidingWindowMaximum swm=new SlidingWindowMaximum();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = swm.maxSlidingWindow(nums, k);

        // Print results
        System.out.println(Arrays.toString(result));
    }
}
