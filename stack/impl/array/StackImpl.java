class StackImpl {
    int capacity;
    int arr[];
    int top;

    public StackImpl() {
        capacity = 3;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int num) {
        if(top == capacity - 1) {
            throw new RuntimeException("Overflow");
        }
        arr[++top] = num;
    }

    public int pop() {
        if(top == -1) {
            throw new RuntimeException("Underflow");
        }
        int num = arr[top];
        top--;
        return num;
    }

    public int peek() {
        if(top != -1) {
            return arr[top];
        }
        throw new RuntimeException("Underflow");
    }

    public void print() {
        int temp = top;
        while(temp != -1) {
            System.out.println(arr[temp]);
            temp -= 1;
        }
    }
}