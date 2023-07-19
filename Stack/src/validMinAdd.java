import java.util.Stack;

public class validMinAdd {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));
    }

    public static int  minAddToMakeValid(String s){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if( !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
            }
            else {
               stack.push(ch);
            }
        }
        return stack.size();
    }
}
