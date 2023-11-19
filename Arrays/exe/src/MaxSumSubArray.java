import java.util.*;
public class MaxSumSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(-1);
        arr.add(0);
//        arr.add(2);
//        arr.add(5);
        System.out.println(maxset(arr));
    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int max = -1;
        int sum = 0;
        int s = 0;
        int e = 0;
        for (int i = 0; i < A.size() - 3; i++) {
            for(int j = i ; j <  i + 4 ; j++){
                sum += A.get(j);
                if ( sum >= max){
                    max = sum ;
                    e = j;
                    s = i;
                }
            }
        }
        if (max < 0){
            return new ArrayList<>();
        }else{
            return new ArrayList<>(A.subList(s , e + 1));
        }
    }
}
