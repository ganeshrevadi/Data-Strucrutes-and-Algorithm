import java.util.*;
public class Array_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0 ,new ArrayList<>());
        A.add(1,new ArrayList<>());
        A.add(2 , new ArrayList<>());
        A.get(0).add(1);
        A.get(0).add(2);
        A.get(0).add(3);
        A.get(0).add(4);
        A.get(1).add(5);
        A.get(1).add(6);
        A.get(1).add(7);
        A.get(1).add(8);
        A.get(2).add(9);
        A.get(2).add(10);
        A.get(2).add(11);
        A.get(2).add(12);
        System.out.println(2 % 4);
        System.out.println(10 % 4);
        System.out.println(5 % 4);

        ArrayList<Integer> A1 = new ArrayList<>();
        A1.add(5);
        A1.add(10);
        A1.add(2);
        A1.add(1);
        ArrayList<Integer> B = performOps(A1);
        for (int i = 0; i < B.size(); i++) {
            System.out.print(B.get(i) + " ");
        }

    }

    static ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
    }
}