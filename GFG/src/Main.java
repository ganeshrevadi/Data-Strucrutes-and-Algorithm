//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Reading total number of testcases
        int t= sc.nextInt();

        while(t-- >0)
        {
            //reading the string
            String st = sc.next();

            //calling ispar method of Paranthesis class
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");

        }
    }
}
// } Driver Code Ends




class Solution {
    public class Stack1 {
        protected int[] data;

        private static final int DEFAULT_SIZE = 10;

        int ptr = -1;

        public Stack1() {
            this(DEFAULT_SIZE);
        }

        public Stack1(int size) {
            this.data = new int[size];
        }

        //Function to check if brackets are balanced or not.
         static boolean ispar(char[] x)  {
            Scanner exp = new Scanner(System.in);


            // add your code here
            for (int i = 0; i < x.length(); i++) {


                if (x[i] == '[' || x[i] == '{' || x[i] == '(') {
                    push(x[i]);
                }

                if (x[i] == ']' || x[i] == '}' || x[i] == ')') {
                    pop();
                }

                if (isEmpty()) {
                    return true;

                } else {
                    return false;
                }
            }


        }

        public boolean push(char item) {
            if (isFull()) {
                System.out.println("Stack is full!");
                return false;
            }
            ptr++;
            data[ptr] = item;

        }

        public int pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("Cannot pop from an empty stack");
            }
            return data[ptr--];
        }

        private boolean isFull() {
            return ptr == data.length - 1;
        }

        private boolean isEmpty() {
            return ptr == -1;
        }
    }
}