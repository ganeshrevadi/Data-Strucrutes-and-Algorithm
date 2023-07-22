package ganesh;

public class MergeList {

    public static class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) {
             this.val = val;
         }
        ListNode(int val, ListNode next){
             this.val = val; this.next = next;
        }
 }
    public static void main(String[] args) {
        //List1[1,2,4]
        //List2[1,3,4]

        String haystack = "hello";
        String needle = "ll";
        if(haystack.contains(needle)){
            System.out.println(haystack.indexOf(needle));
            System.out.println(true);
        }
    }

    public static ListNode Merge(ListNode list1 ,ListNode list2){
        ListNode res = new ListNode();
        ListNode temp = res;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ListNode node = new ListNode();
                node.val = list1.val;
                temp.next = node;
                temp = node;
                list1 = list1.next;
            }
            else{
                ListNode node = new ListNode();
                node.val = list2.val;
                temp.next = node;
                temp = node;
                list2 = list2.next;
            }
        }

        while(list1 != null){
            ListNode node = new ListNode();
            node.val = list1.val;
            temp.next = node;
            temp = node;
            list1 = list1.next;
        }

        while(list2 != null){
            ListNode node = new ListNode();
            node.val = list2.val;
            temp.next = node;
            temp = node;
            list2 = list2.next;
        }
        return res.next;
    }
}
