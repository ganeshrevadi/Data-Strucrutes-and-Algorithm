import java.math.BigInteger;
import java.util.*;
public class AddOneNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        int[] arr = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        for (int ele : arr) {
            A.add(ele);
        }

        System.out.println(solve(A));
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        BigInteger num = new BigInteger("0");
        for (int i = 0; i < A.size(); i++) {
            num = num.multiply(BigInteger.TEN);  // Multiply num by 10
            num = num.add(BigInteger.valueOf(A.get(i)));
        }

        num = num.add(BigInteger.valueOf(1));
        ArrayList<Integer> arr = new ArrayList<>(A.size() + 1);
        while (num.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divRem = num.divideAndRemainder(BigInteger.TEN);
            int rem = divRem[1].intValue();
            arr.add(rem);
            num = num.divide(BigInteger.TEN);
        }

        Collections.reverse(arr);
        return arr;

    }


    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int carry=1;

        for(int i=A.size()-1;i>0;i--){

            int sum=A.get(i)+carry;
            if(sum==10){
                A.set(i,0);
                carry=1;
            }else{
                A.set(i,sum);
                carry=0;
            }
        }

        int sum1=A.get(0)+carry;
        if(sum1==10){
            A.set(0,0);
            A.add(0,1);
        }else{
            A.set(0,sum1);
            while(A.get(0)==0){
                A.remove(A.get(0));
            }

        }


        return A;
}
}
