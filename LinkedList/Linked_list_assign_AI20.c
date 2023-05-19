/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include<math.h>

   struct node{
       int data;
       struct node *link;
   };
   
   struct node *start = NULL;
   struct node *tail = NULL;
      struct node *newnode;
         struct node *temp;

  
 void insert(int x){
     
   
     newnode = malloc(sizeof(struct node));
     
       
       if(start == NULL)
        {
        
        start = newnode;
        tail = newnode;
        newnode-> data = x;
        return;
         
        }
        
            tail->link = newnode;
            newnode->data = x;
            tail = newnode;
      
     
    }
    
    void insertfirst(int x){
       
        newnode = malloc(sizeof(struct node));
        
        if(start == NULL)
        {
        
        start = newnode;
        tail = newnode;
        newnode-> data = x;
        return;
         
        }
        else if(tail == NULL)
        {
        
        tail = start;
        
         
        }
        newnode -> link = start;
        newnode ->data = x;
        start = newnode;
        
    }

   
 
 
 void disp(){
     
    temp = start ;
    printf("The elements in Linked list:  ");
    while(temp != NULL)
    {
        printf("%d  ",temp->data);
        
     temp = temp->link ;
    }
    
    printf("\n\n");
 }
 
 void reverse(struct node *start)
{
    struct node *previous = NULL;
    struct node *next = NULL;
    while(start)
    {
        next = start->link;
        start->link = previous;
        previous = start;
        start = next;
        
    }
    start = previous;
     temp=start;
      printf("The revesed elements are: ");
    while(temp)
    {
    printf("%d  ",temp->data);
      temp=temp->link;
    }
}
 

  

int main()
{
   insert(1);
   insert(2);
   disp();
   insertfirst(6);
   insert(3);
   disp();
   insertfirst(4);
   disp();
   reverse(start);
  
    
    
    return 0;
}
