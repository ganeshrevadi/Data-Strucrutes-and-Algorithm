import java.util.Stack;

public class RPN {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        String[] tokens = {"2","1","+","3","*"};
        int n = 0;

        while(n != tokens.length){
            if(tokens[n] != "+" || tokens[n] != "-" || tokens[n] != "*" || tokens[n] != "/"){
                st.push(tokens[n]);
            }
            else{
                String right = st.pop();
                String left = st.pop();
            }
        }
    }
}
