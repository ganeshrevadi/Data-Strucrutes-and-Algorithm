import java.util.Arrays;

public class searchin_twod {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,3},
                {132,31,32},
                {134,25,5,3}
        };
        int target = 5;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr , int target) {
        for (int row = 0; row<arr.length; row++) {
            for (int col = 0; col<arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};
    }
}
