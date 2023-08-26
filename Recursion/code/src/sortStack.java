import java.util.ArrayList;
import java.util.Stack;
public class sortStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(0);
        st.push(5);
        st.push(2);
        sort(st);
        System.out.println(st);
    }
    static void sort(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp = st.peek();
        st.pop();
        sort(st);
        insert(st,temp);

    }

    static void insert(Stack<Integer> st, int temp){
        if(st.isEmpty() || st.peek() <= temp){
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
