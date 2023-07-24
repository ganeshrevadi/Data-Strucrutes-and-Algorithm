import java.util.*;
import java.util.Queue;

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
    }

    public static void push(int x, Queue<Integer> q1, Queue<Integer> q2) {
        q1.add(x);
    }

    public static int pop(int x, Queue<Integer> q1, Queue<Integer> q2) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        return q2.remove();
    }

    public static int peek(int x, Queue<Integer> q1, Queue<Integer> q2) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        return q2.peek();
    }
}
