package Day05.com.binary_search;

public class FindRotationPoint {


    // Function to find the rotation point in a rotated sorted array
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element,
            // the smallest element is in the right half.
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // If mid element is smaller than or equal to the rightmost element,
                // the smallest element is in the left half (or it could be the mid element).
                right = mid;
            }
        }

        // When left equals right, we have found the rotation point
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 19, 20, 25, 2, 5, 6, 8, 10};
        int rotationPoint = findRotationPoint(arr);
        System.out.println("The rotation point is: " + rotationPoint);
    }
}

