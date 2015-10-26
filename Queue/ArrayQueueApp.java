public class ArrayQueueApp {
  public static void main(String[] args) {
    ArrayQueue aq = new ArrayQueue(10);
    System.out.println("Queue Size is " + aq.QSIZE);
     
    aq.enqueue(1);
    aq.enqueue(2);
    aq.enqueue(3);
    aq.enqueue(4);
    aq.enqueue(5);
    aq.enqueue(6);
    aq.enqueue(7);
    aq.enqueue(8);
    aq.enqueue(9);
    aq.enqueue(10);
    aq.enqueue(11); // error, QSIZE isFull
    System.out.println();
    System.out.println("------------------------");
    
    aq.showQueue();
    System.out.println();
    System.out.println("_________________________");
    System.out.println(aq.dequeue());
    System.out.println(aq.dequeue());
    System.out.println(aq.dequeue());
    System.out.println(aq.dequeue());
    System.out.println(aq.dequeue());

    aq.enqueue(11); // will be enqueued
    System.out.println();
    System.out.println("-------------------------");

    aq.showQueue();
    System.out.println();
    System.out.println("Queue Front is " + aq.peekFront());
    System.out.println("Queue Rear is " + aq.peekRear());
  }
}