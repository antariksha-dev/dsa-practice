class StackTest {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(11);
        stack.push(12);
      
        stack.print();

        System.out.println("pop() " + stack.pop());
        System.out.println("peek() " + stack.peek());

        stack.print();
    }
}