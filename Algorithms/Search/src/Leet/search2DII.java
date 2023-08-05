package Leet;

public class search2DII {
    public static void main(String[] args) {
        int[][] arr =  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 15;
        System.out.println(searchMatrix(arr,15));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)  return false;

        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m - 1;
        while(i < n && j >= 0){
            if(matrix[i][j] == target){
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
}
