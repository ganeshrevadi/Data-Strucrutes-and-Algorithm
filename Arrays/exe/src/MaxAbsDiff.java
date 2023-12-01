import  java.util.*;
public class MaxAbsDiff {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        int[] arr = {1, 3, -1};
        for(int ele : arr){
            A.add(ele);
        }

        System.out.println(solve(A));
    }

//    public static int maxArr(ArrayList<Integer> A) {
//        long f = 0;
//        long max = Long.MIN_VALUE;
//        for(int i = 0 ; i< A.size() ; i++){
//            for (int j = i; j < A.size(); j++) {
//                f = Math.abs(A.get(i) - A.get(j)) + Math.abs((i+ 1) - (j + 1));
//                if(f > max){
//                    max = f;
//                }
//            }
//        }
//        return (int)max;
//    }

    public static int solve(ArrayList<Integer> A){
        int n = A.size();

        if (n <= 1) {
            return 0;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int max4 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max1 = Math.max(max1, A.get(i) + i);
            max2 = Math.max(max2, -A.get(i) + i);
            max3 = Math.max(max3, A.get(i) - i);
            max4 = Math.max(max4, -A.get(i) - i);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, max1 - A.get(i) - i);
            result = Math.max(result, max2 + A.get(i) - i);
            result = Math.max(result, max3 - A.get(i) + i);
            result = Math.max(result, max4 + A.get(i) + i);
        }

        return result;
    }
}

