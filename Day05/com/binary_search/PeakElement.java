package Day05.com.binary_search;

public class PeakElement {

    // Function to find a peak element in the array
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            //Check if mid is a peak element
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return arr[mid];
            }
            //If the left neighbor is greater,search the left half
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // If the right neighbor is greater, search the right half
            else {
                left = mid + 1;
            }
        }
        // This line will never be reached if the array has at least one peak element
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakElement = findPeakElement(arr);
        System.out.println("A peak element is: " + peakElement);
    }
}

