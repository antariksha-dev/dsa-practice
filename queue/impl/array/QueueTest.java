class QueueTest {
    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(5);

        queue.dequeue();

        System.out.println(queue);
    }
}