import java.util.Stack;

public class MintoBalance {
    public static void main(String[] args) {
        System.out.println(minInsertions("))())("));
    }
    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        char prev  = '\0';
        for(int i = 0;i<s.length();i++){
          if(s.charAt(i) == ')'){
                if( i + 1 < s.length() && s.charAt(i+1) == ')'){
                    i++;
                }
                else count++;

                if(!stack.isEmpty()){
                    stack.pop();
                }
                else count++;

            }
            else {
                stack.push(s.charAt(i));
            }
        }
            count += 2 * stack.size();

        return count;
    }
}
