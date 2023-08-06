package Leet;

import java.util.Arrays;

public class peakElementII {
    public static void main(String[] args) {
        int mat[][] = {{1,4},{3,2}};
        System.out.println(Arrays.toString(findGrid(mat)));
    }

    static int[] findGrid(int[][] mat){
        int start = 0;
        int end = mat.length;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int maxIndex = max(mat[mid]);
            if(isPeak(mat,mid,maxIndex)){
                return new int[] {mid , maxIndex};
            } else if (isSmaller(mat,mid,maxIndex)) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return new int [] {-1, -1};
    }

    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    static boolean isPeak(int[][]mat,int mid,int index){
        int m = mat.length;
        int n = mat[0].length;
        int max = mat[mid][index];
        int top = mid == 0?-1 : mat[mid - 1][index];
        int bottom = mid == m -1 ?-1: mat[mid + 1][index];
        int left = index == 0?-1:mat[mid][index - 1];
        int right = index == n - 1 ? -1: mat[mid][index + 1];
        return (max > top && max > bottom && max > left && max > right);
    }

    public static boolean isSmaller(int[][] mat , int mid , int index){
        int m = mat.length;
        int max = mat[mid][index];
        int bottom = mid == m - 1 ?-1 : mat[m - 1][index];
        return (bottom > max);
    }
}
