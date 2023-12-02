import java.util.*;
public class Move {
    public static void main(String[] args) {
        ArrayList<Integer> A  = new ArrayList<>();
        int[] arr = {0, 0, 9, 4, 0, 10, 3, 8, 6, 2, 6};
        for(int ele : arr){
            A.add(ele);
        }

        System.out.println(solve(A));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
//        int n = A.size();
//        for (int i = 0 ; i < A.size() ; i++) {
//            if (A.get(i) == 0) {
//                A.remove(i);
//                i = -1;
//            }
//        }
//
//        for(int i = A.size(); i < n ; i++){
//            A.set(i , 0);
//        }
//

        int i = 0;
        for(int num : A){
            if(num != 0){
                A.set(i , num);
                i++;
            }
        }
        while(i < A.size()){
            A.set( i , 0);
            i++;
        }
        return A;
    }
}