import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(35);
        stack.push(36);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack<Character> stack2 = new Stack<>();

        //System.out.println(stack.pop());
    }
}