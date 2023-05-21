package ganesh;



class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = null;
        ListNode temp2 = null;
        int count;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        temp2 = head;
        for(int i =0 ;i<count ;i++){
            temp2 = temp2.next;
        }
        ListNode prev = null;
        ListNode current = temp2;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return false;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}