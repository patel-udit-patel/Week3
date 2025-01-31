package Day02.com.stacks_and_queues.implement_queue_using_stack;

//Creating a Controller class for controlling operations over queue
public class QueueController {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        //inserting element in queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        //performing dequeue operation
        System.out.println(queue.dequeue());

        //printing peek element of queue
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());

        //Checking if queue is empty
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}
