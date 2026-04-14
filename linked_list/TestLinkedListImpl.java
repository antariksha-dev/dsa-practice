class TestLinkedListImpl {
    public static void main(String []args) {
        LinkedListImpl list = new LinkedListImpl();
        // insert at end
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        //insert at initial
        list.insertAtInitial(4);
        list.insertAtInitial(1);
        //insert at kth pos
        list.insertAtKth(2, 2);
        //delete at end
        list.deleteAtEnd();
        //find middle value
        System.out.printf("The middle value is %d\n", list.findMiddleValue());

        list.print();

    }
}