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
