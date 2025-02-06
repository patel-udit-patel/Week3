package Day05.com.binary_search;

public class MatrixSearch {

    // Function to search for a target value in a 2D sorted matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert the 1D mid index to 2D row and column indices
            int row = mid / cols;
            int col = mid % cols;

            // Compare the middle element with the target
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        // Target not found
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        int target = 5;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + found);
    }
}

