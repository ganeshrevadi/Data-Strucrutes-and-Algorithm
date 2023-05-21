package ganesh;


public class sortList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode ptr = head;
        ListNode preptr = null;

        while(ptr != null && ptr.next != null){
            preptr = ptr;
            ptr = ptr.next;
            ListNode temp2 = ptr;
            while(temp2 != null){
                if(preptr.val > temp2.val){
                    int temp = temp2.val;
                    temp2.val = preptr.val;
                    preptr.val = temp;
                }
                temp2 = temp2.next;
            }
        }
        return head;
    }
}
