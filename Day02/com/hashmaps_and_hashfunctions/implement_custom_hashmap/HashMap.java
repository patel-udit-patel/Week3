package Day02.com.hashmaps_and_hashfunctions.implement_custom_hashmap;

import java.util.LinkedList;

public class HashMap<K, V> {
        //default size of the array
        private static final int DEFAULT_CAPACITY = 16;
        //Array of linked lists for separate chaining
        private LinkedList<Entry<K, V>>[] table;

        //Constructor to initialize the hash table
        public HashMap() {
            table = new LinkedList[DEFAULT_CAPACITY];
        }

        //Entry class to store key-value pairs
        private static class Entry<K, V> {
            K key;
            V value;

            Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        //Hash function to compute index
        private int getIndex(K key) {
            return Math.abs(key.hashCode() % table.length);
        }

        //Method to insert a key-value pair into the hash map
        public void put(K key, V value) {
            int index = getIndex(key); // Get index for the key

            //if the linked list at index is null, initialize it
            if (table[index] == null) {
                table[index] = new LinkedList<>();
            }

            //Check if key already exists update its value
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    entry.value = value; // Update existing key with new value
                    return;
                }
            }

            //If key is new add it to the linked list
            table[index].add(new Entry<>(key, value));
        }

        //method to get the value associated with a key
        public V get(K key) {
            int index = getIndex(key); // Get index for the key

            //if the linked list at index is null key doesn't exist
            if (table[index] == null) return null;

            // Search for the key in the linked list
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    // Return value if key is found
                    return entry.value;
                }
            }

            // Key not found
            return null;
        }

        // Method to remove a key-value pair from the hash map
        public void remove(K key) {
            int index = getIndex(key); // Get index for the key

            // If the linked list at index is null, key doesn't exist
            if (table[index] == null) return;

            // Remove the entry if the key matches
            table[index].removeIf(entry -> entry.key.equals(key));
        }

        //Method  checks if a key exists in the hash map
        public boolean containsKey(K key) {
            return get(key) != null;
        }

        //Method displays the hash map contents
        public void display() {
            for (int i = 0; i < table.length; i++) {
                if (table[i] != null) {
                    System.out.print("Index " + i + ": ");
                    for (Entry<K, V> entry : table[i]) {
                        System.out.print("(" + entry.key + " -> " + entry.value + ") ");
                    }
                    System.out.println();
                }
            }
        }

    }
