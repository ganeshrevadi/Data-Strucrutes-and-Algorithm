/* https://leetcode.com/problems/palindrome-linked-list/description/ */

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

bool isPalindrome(struct ListNode* head){
    struct ListNode *current,*new,*prev,*front;
   new = NULL;
   if(head == NULL){
     return false;
 }
   current = head;

   while(current){
   front = current->next;
   current->next = new;
   new = current;
   current = front;
}
 
 
 while(head && new){
    
     if(head->val != new->val){
        
         return false;
     }
     
     else{
        head = head->next;
         new = new->next;
         }
    
}

return true;
} 
