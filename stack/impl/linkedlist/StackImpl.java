class StackImpl {
    private Node top;

    public StackImpl() {
    
    }

    public void push(int num) {
        Node node = new Node(num);
        node.next = top;
        top = node;
    }

    public int pop() {
        if(top == null) {
            throw new RuntimeException("Stack Underflow!");
        }
        int num = top.num;
        top = top.next;
        return num;

    }

    public int peek() {
        if(top == null) {
            throw new RuntimeException("Stack Underflow!");
        }
        int num = top.num;
        return num;
    }

    public void print() {
        Node temp = top;
        while(temp != null) {
            System.out.print(temp.num + " ");
            temp = temp.next;
        }
    }
}