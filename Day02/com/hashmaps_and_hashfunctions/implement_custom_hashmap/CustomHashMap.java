package Day02.com.hashmaps_and_hashfunctions.implement_custom_hashmap;

public class CustomHashMap {
    public static void main(String[] args) {
        // Create a custom hash map
        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("grape", 30);
        map.put("orange", 40);

        // Retrieve a value
        System.out.println("Value of 'banana': " + map.get("banana")); // Output: 20

        // Remove a key
        map.remove("banana");
        System.out.println("Value of 'banana' after deletion: " + map.get("banana")); // Output: null

        // Check key existence
        System.out.println("Contains 'apple': " + map.containsKey("apple")); // Output: true
        System.out.println("Contains 'banana': " + map.containsKey("banana")); // Output: false

        // Display the hash map contents
        map.display();
    }
}
