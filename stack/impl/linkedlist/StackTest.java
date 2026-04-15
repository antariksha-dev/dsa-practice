class StackTest {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.print();
    }
}