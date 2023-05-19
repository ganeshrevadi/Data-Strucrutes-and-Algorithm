package ganesh;

public class main {
    public static void main(String[] args) {
        LInkedList list = new LInkedList();
        list.insertfirst(4);
        list.insertfirst(6);
        list.insertfirst(8);

        list.insertfirst(10);

        list.insertEnd(20);
        list.insertMiddle(60,3);

        list.disp();


    }
}
