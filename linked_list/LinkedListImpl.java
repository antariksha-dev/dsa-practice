class LinkedListImpl {

    private Node head;

    public Node insertAtEnd(int num) {
        Node node = new Node(num);
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return head;
    }

    public Node insertAtInitial(int num) {
        Node node = new Node(num);
        if(head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        return head;
    }

    public Node insertAtKth(int pos, int num) {
        int i = 0;
        Node temp = head;
        Node node = new Node(num);
        while(i < pos - 2) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        return head; 
    }

    public Node deleteAtEnd() {
        Node temp = head;
        if(temp.next == null) {
            temp = null;
            return head;
        }
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.num + " ");
            temp = temp.next;
        }
    }

    // public static Node deleteAtInitial(int pos, int num) {
        
    // }

    // public static Node DeleteFromEndKthPosition(int pos, int num) {
        
    // }

    public int findMiddleValue() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.num;
    }

    public Node reverse() {
        reverse(head);
    }

    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);

        head.next.next = head; 
        head.next = null;      

        return newHead;
    }
}