#include<stdio.h>
#include<stdlib.h>

int main(){
    int n ,n2,n3;
    printf("Enter the number of elements");
    scanf("%d",&n);

    ptr = (int*) malloc(n*sizeof(n));

    for(int i =0 ;i<n;i++){
        scanf("%d", ptr+i);
    }

    printf("Odd numbers are \n");
    for(int j =0 ;j<n/2;j++){
        if(*(ptr+j)%2 != 0){
            ptr2=(int*) realloc(ptr,n2*sizeof(n/2));
        }
    }

     printf("Even numbers are \n");
    for(int m =0 ;m<n/2;m++){
        if(*(ptr+m)%2 == 0){
            ptr3=(int*) realloc(ptr,n3*sizeof(n/2));
        }
    }


    

    return 0;


}