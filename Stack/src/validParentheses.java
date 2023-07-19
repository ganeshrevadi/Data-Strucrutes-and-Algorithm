import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String s = "(])";
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0;i < ch.length;i++){
            if(ch[i] =='(' || ch[i] == '{' || ch[i] == '['){
                stack.push(ch[i]);
            }
            else if(ch[i] == ')' && stack.peek() == '(' ){
                stack.pop();
            }
            else if(ch[i] == '}' && stack.peek() == '{' ){
                stack.pop();
            }
            else if(ch[i] == ']'  && !stack.isEmpty()){
                char x = stack.pop();
                if(x != ch[i]){
                    System.out.println(false);
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
