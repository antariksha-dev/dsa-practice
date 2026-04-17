class QueueImpl {
    private int N;
    private int arr[];
    private int front;
    private int rear;

    public QueueImpl() {
        this.N = 3;
        this.arr = new int[N];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(int num) {
        if((rear + 1) % N == front) {
            System.err.println("Its full");
            return;
        }
        if(front == -1) {
            front++;
            rear++;
        } else{
            rear = (rear + 1) % N;
        } 
        arr[rear] = num;
    }

    public int dequeue() {
        if(front == -1 && rear == -1) {
            System.err.println("Its empty");
            return -999;
        } else if(front == rear) {
            return arr[front];
            front = -1;
            rear = -1;
        } 
        return arr[front];
    }

    public String toString() {
        String str = "";
        for(int i=front; i<=rear; i++) {
           str += arr[i] + " ";
        }
        return str;
    }
}