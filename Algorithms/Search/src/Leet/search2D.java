package Leet;

public class search2D {
    public static void main(String[] args) {
       int[][] arr =  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       int target = 15;
        System.out.println("Done!");
        System.out.println(searchMatrix(arr,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)  return false;

        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n * m - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(matrix[mid/m][mid%m] == target){
                return true;
            } else if (matrix[mid/m][mid%m] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}
