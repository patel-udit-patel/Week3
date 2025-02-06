package Day05.com.LinearSearch;

public class SearchNegativeNumber {
    //method finds the index of first negative number in list
    public static int findFirstNegative(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    //main method
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, -2, 8, -6, 10};

        int index = findFirstNegative(numbers);

        //checking if method returned valid index
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found.");
        }
    }
}
