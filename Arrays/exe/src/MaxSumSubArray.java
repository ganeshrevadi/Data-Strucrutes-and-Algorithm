import java.util.*;
public class MaxSumSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(-7);
        arr.add(2);
        arr.add(5);
        System.out.println(maxset(arr));
    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int max = -1;
        int sum = 0;
        int s = -1;
        int e = -1;
        int i = 0;
        int len = 0;
        while (i < A.size()){
                if(A.get(i) >= 0){
                    sum += A.get(i);
                    i++;
                    len++;
                }
                else{
                    len = 0;
                    sum = 0;
                    i++;
                }
                if(sum > max ){
                    max = sum;
                    e = i;
                    s = i - len + 1;
                }

        }
        if (max < 0){
            return new ArrayList<>();
        }else{
            return new ArrayList<>(A.subList(s , e));
        }
    }
}
