import java.util.Arrays;

public class searchInsert {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] res = searchRange(arr,8);
        System.out.println(Arrays.toString(res));
    }

    static int[] searchRange(int[] arr, int target) {
        int first = -1;
        int last =  -1;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] == target){
                if(first == -1) first = i;
                last = i;
            }
        }
        return new int[]{first,last};
    }
}
