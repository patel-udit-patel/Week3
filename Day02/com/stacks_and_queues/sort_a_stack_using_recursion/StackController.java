package Day02.com.stacks_and_queues.sort_a_stack_using_recursion;

import java.util.Stack;

public class StackController {
    // Main Function to sort the stack
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        SortedStack sortedStack=new SortedStack();
        System.out.println("Original Stack: " + stack);

        sortedStack.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
