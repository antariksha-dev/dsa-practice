public class DequeImpl {
    private Node front;
    private Node end;

    public DequeImpl() {
        
    }

    public void enqueueRear(int num) {
        Node node = new Node(num);
        if(front == null) {
            front = end = node;
        } else {
            node.prev = end;
            end.next = node;
            end = node;
        }
    }

     public void enqueueFront(int num) {
        Node node = new Node(num);
        if(front == null) {
            front = end = node;
        } else {
            node.next = front;
            front.prev = node;
            front = node;
        }
    }


    public void dequeueFront() {
        if(front != null) {
            
        } 
    }

    public String toString() {
        String str = "";
        Node temp = front;
        while(temp != null) {
            str += temp.num + " ";
            temp = temp.next;
        }
        return str;
    }
}