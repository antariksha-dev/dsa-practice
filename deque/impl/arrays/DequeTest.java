class DequeTest {
    public static void main(String[] args) {
        DequeImpl d = new DequeImpl();
        d.enqueueRear(5);
        d.enqueueRear(6);
        d.enqueueRear(5);
        d.enqueueRear(6);
        d.enqueueFront(2);

        System.out.println(d);
    }
}