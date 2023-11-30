import  java.util.*;
public class MinLights {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 0 };
        ArrayList<Integer> A = new ArrayList<>();
        for(int ele : arr){
            A.add(ele);
        }

        System.out.println(solve(A, 4));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int min = 0;
        int start = -1;
        int end = -1;
        int intial = -1;
        int midEnd = -1;
        for(int i = 0 ; i < A.size() ; i++){
            if(A.get(i) == 1){
                start = i + 1 - B + 1;
                end = i + 1 + B - 1;
                if(intial== 1 && end >= A.size() - 1){
                    return  min;
                }
                min++;
                if(start <= 1){
                    intial = 1;
                    midEnd = end;
                }
                if(start <= midEnd){
                    midEnd  = end;
                }
                else{
                    return -1;
                }
            }
        }
        return -1;
    }
}
