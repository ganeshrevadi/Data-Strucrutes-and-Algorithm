import java.util.Stack;

public class Minpar {
    public static void main(String[] args) {
        System.out.println(solve(")("));
    }

    public static int solve(String A) {
        int count1 =0; //For Opening Braces
        int count2 =0; //For Closing Braces
        for(int i =0; i<A.length();i++){
            if(A.charAt(i)=='('){
                count1++;
            }
            else if(count1>0){ // If closing brace occurred count1-- which removes '()'
                count1--;
            }
            else count2++;
        }
        return Math.abs(count1 + count2);
    }
}
