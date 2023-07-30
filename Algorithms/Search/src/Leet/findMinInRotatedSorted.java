package Leet;

public class findMinInRotatedSorted {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(pivot(nums));
        System.out.println(rotated(nums));
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

    static int rotated(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(start == mid){
                if(arr[start] < arr[end]){
                    return start + 1;
                }
                else{
                    return end + 1;
                }
            }
            else if(arr[start] < arr[mid] && arr[mid] < arr[end]){
                return start;
            }
            else if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            else if(arr[mid - 1] > arr[mid]){
                return mid;
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
