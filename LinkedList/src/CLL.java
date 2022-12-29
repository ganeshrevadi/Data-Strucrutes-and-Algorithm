
public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    private class Node{
        int val;
        Node next;
        int prev;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insert (int val ){

        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next =  node;
        node.next = head;
        tail = node;

    }
    public void disp(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + "->");
                if (node.next != null) {
                    node = node.next;
                }

            }while (node != head);

        }
        System.out.println("Head");
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.insert(12);
        list.disp();
    }




}