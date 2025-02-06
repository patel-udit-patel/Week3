package Day04.com.remove_duplicates;
import java.util.HashSet;

public class RemoveDuplicates {
    //method removes duplicate character from string
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }
        return sb.toString();
    }
    //main method
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("String without duplicates: " + result);
    }
}
