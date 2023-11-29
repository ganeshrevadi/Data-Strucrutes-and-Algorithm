import java.math.BigInteger;
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

    public static ArrayList<Integer> maxset(ArrayList<Integer> A){
        int start = -1;
        int end = -1;
        int sum = 0;
        int ansStart = -1;
        int maxi = Integer.MIN_VALUE;


        for (int i = 0; i < A.size(); i++) {
            if (sum == 0) start = i;

            if(sum >= maxi) {
                maxi = sum;
                ansStart = start;
                end = i;

            }

            if (sum < 0 ) sum = 0;
        }


        return new ArrayList<>(A.subList(ansStart , end + 1));
    }


//    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
//        long max = -1;
//        long sum = 0;
//        int s = -1;
//        int e = -1;
//        int len = 0;
//        int maxlen = 0;
//        for (int i = 0; i < A.size(); i++) {
//                if(A.get(i) >= 0){
//                    sum += A.get(i);
//                    len++;
//                }
//                else{
//                    len = 0;
//                    sum = 0;
//
//                }
//                if(sum > max ){
//                    max = sum;
//                    e = i;
//                    s = i - (int)len + 1;
//                }
//                if(sum == 0 && len > maxlen){
//                    max = sum;
//                    e = i;
//                    s = i - (int)len + 1;
//                    maxlen = len;
//                }
//        }
//        return new ArrayList<>(A.subList(s , e + 1));
//        }
    }
