import java.util.Arrays;

public class twpDsearchsorted {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(search(arr,69)));

    }

    static int[] binarysearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid + 1;

            }
            else{
                cEnd = mid -1;
            }

        }
        return new int[] {-1,-1};
    }

    static int[] search (int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows ==1 ){
            return binarysearch(matrix, 0,0,cols-1,target);
            }
        int rstart =0;
        int rEnd = rows -1;
        int cMid = cols /2;

        while(rstart < (rEnd -1 )){
            int mid = rstart + (rEnd-rstart)/2;
            if(matrix[mid][cMid]==target ){
                return new int []{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rstart = mid;
            }
            else{
                rEnd = mid;
            }
        }
        if(matrix[rstart][cMid]==target){
            return new int[]{rstart,cMid};
        }
        if(matrix[rstart+1][cMid]==target){
            return new int[]{rstart+1,cMid};
        }
        if(target <= matrix[rstart][cMid-1]){
            return binarysearch(matrix,rstart,0,cMid-1,target);
        }
        if(target >= matrix[rstart][cMid+1]&& target<=matrix[rstart][cols-1]){
            return binarysearch(matrix,rstart,cMid+1,cols-1,target);
        }
        if(target <= matrix[rstart+1][cMid-1]){
            return binarysearch(matrix,rstart+1,0,cMid-1,target);
        }
       else{
            return binarysearch(matrix,rstart+1,cMid+1,cols-1,target);
        }




    }
}
