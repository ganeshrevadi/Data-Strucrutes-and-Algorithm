package Leet;

public class findMinInRotatedSorted {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(pivot(nums));
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(start == mid){
                if(arr[start] < arr[end]){
                    return arr[start];
                }
                else{
                    return arr[end];
                }
            }
            else if(arr[start] < arr[mid] && arr[mid] < arr[end]){
                return arr[start];
            }
            else if (arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            else if(arr[mid - 1] > arr[mid]){
                return arr[mid];
            }  else if (arr[start] > arr[mid]){
                end = mid - 1;
            }
            else {
                if(arr[start] < arr[end]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
