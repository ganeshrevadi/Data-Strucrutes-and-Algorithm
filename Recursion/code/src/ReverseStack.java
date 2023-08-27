import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(0);
        st.push(5);
        st.push(2);
        reverse(st);
        System.out.println(st);
        System.out.println(st.peek());
    }
    static void reverse(Stack<Integer> st){
        if(st.size() == 1){ // Base Condition
            return;
        }
        int temp = st.peek(); // Hypothesis
        st.pop();
        reverse(st);
        insert(st,temp); // induction
    }
    static void insert(Stack<Integer> st, int temp){
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        int val = st.peek();
        st.pop();
        insert(st,temp);
        st.push(val);
        return;
    }
}
