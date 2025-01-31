package Day02.com.stacks_and_queues.implement_queue_using_stack;

import java.util.Stack;

//Creating class for implementing Queue using stack
class QueueUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    //constructor for initialise queue
    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //Enqueue operation
    public void enqueue(int x) {
        stack1.push(x);
    }

    //Dequeue operation
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
            }
            // Transferring elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    //Peek operation
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
//                    throw new RuntimeException("Queue is empty");
                System.out.println("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    //Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}

