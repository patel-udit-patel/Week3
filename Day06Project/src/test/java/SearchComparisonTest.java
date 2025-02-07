import org.example.search_a_target_in_a_large_dataset.BinarySearch;
import org.example.search_a_target_in_a_large_dataset.LinearSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SearchComparisonTest {

    @Test
    public void BinarySearchTest() {
        // Given a sorted array
        int[] sortedArray = {1, 2, 4, 5, 6, 7};

        // When searching for element 6
        int result = BinarySearch.binarySearch(sortedArray, 6);

        // Then it should return the correct index (expected: 4)
        Assertions.assertEquals(4, result, "Binary Search failed for target 6");
    }
    @Test
    public void LinearSearchTest() {
        // Given a sorted array
        int[] array = {1, 2, 4, 5, 6, 7, 10, 11};

        // When searching for element 6
        int result = LinearSearch.linearSearch(array, 6);

        // Then it should return the correct index (expected: 4)
        Assertions.assertEquals(4, result, "Linear Search failed for target 6");
    }
}
