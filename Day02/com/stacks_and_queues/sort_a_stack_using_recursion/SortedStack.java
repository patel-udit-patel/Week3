package Day02.com.stacks_and_queues.sort_a_stack_using_recursion;

import java.util.Stack;

public class SortedStack {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertSorted(stack, top);
        }
    }

    // Helper function to insert an element into the sorted stack
    private static void insertSorted(java.util.Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }


}
