package Day04.com.reverse_a_string;

public class ReverseString {
    //method converts string into string builder and convert into reverse
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    //main method
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }
}
