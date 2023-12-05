import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        int[] arr1 = { 2, 1, 8, 9, 5 };
        int[] arr2 = { 6, 7, 6, 7, 4, 1, 3, 0, 1, 8 };
        for(int ele : arr1){
            A.add(ele);
        }
        for(int ele : arr2){
            B.add(ele);
        }
        System.out.println(addArrays(A , B));
    }

    public static ArrayList<Integer> addArrays(ArrayList<Integer> A, ArrayList<Integer> B) {
        long a  = 0;
        long b = 0;
        for(int ele : A){
            a *= 10;
            a += ele;
        }

        for(int ele : B){
            b *= 10;
            b += ele;
        }

        long ans = a + b;
        ArrayList<Integer> S = new ArrayList<>();
        while(ans > 0){
            long rem = ans % 10;
            S.add((int)rem);
            ans /= 10;
        }
        Collections.reverse(S);
        return S;
    }
}
