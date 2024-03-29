package ganesh;

public class LInkedList {

    private Node head;
    private Node tail;
    private int size;
    public LInkedList(){
        this.size = 0;
    }

    public void insertfirst(int val){
        Node node = new Node(val);
        node.value = val;
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void disp(){
        Node temp;
        temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public void insertEnd(int val){
        Node node = new Node(val);
        node.value = val;
        node.next = null;
        tail.next = node;
        tail = node;

        if(head == null){
            head = node;
        }
    }
    public void insertMiddle(int val , int pos){
        Node node = new Node(val);
        Node ptr = head;
        for (int i = 1; i <= pos; i++) {
            ptr = ptr.next;
        }
        node.next = ptr.next;
        ptr.next = node;

    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
