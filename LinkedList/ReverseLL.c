/* https://leetcode.com/problems/reverse-linked-list/description/ */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* reverseList(struct ListNode* head){
   struct ListNode *current,*new,*prev,*front;
   new = NULL;
   current = head;

   while(current){
   front = current->next;
   current->next = new;
   new = current;
   current = front;
}
    
    

    return new;
}
