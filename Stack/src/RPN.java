import java.util.Arrays;
import java.util.Stack;

public class RPN {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int n = 0;
        int left;
        int right;
        int res =0;

        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+")){
                right = st.pop();
                left = st.pop();
                res = left + right;
                st.push(res);
            }
            else if(tokens[i].equals("-")){
                right = st.pop();
                left = st.pop();
                res = left - right;
                st.push(res);

            }
            else if(tokens[i].equals("*")){
                right = st.pop();
                left = st.pop();
                res = left * right;
                st.push(res);

            }
            else if(tokens[i].equals("/")){
                right = st.pop();
                left = st.pop();
                res = left / right;
                st.push(res);

            }
            else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        System.out.println(res);
    }
}
