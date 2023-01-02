public class LL {

    private Node head;
    private int size;
    private Node tail;
    public LL() {
        this.head = null;
        this.tail = null;

    }
    private class Node{
        int val;
        int index;
        LL.Node next;
        int prev;

        public Node(int val,int index,Node node) {
            this.val = val;
        }

    }

    //Insertion using recursion
    public void insertRec(int val,int index){
        head= insertRec(val,index,head);

    }
    private Node insretRec(int val , int index ,Node node){
        if(index==0){
            Node temp = new Node(val,0,null);
            size++;
            return temp;
        }

        node.next = insertRec(val,index-1,node.next);
        return node;
    }




    public void disp(){
        LL.Node node = head;
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

    public void insert (int val ){

        LL.Node node = new LL.Node(val,null);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next =  node;
        node.next = head;
        tail = node;

    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.insert(12);
        list.disp();
        list.insertRec(head, 56);
        list.disp();
    }

}
