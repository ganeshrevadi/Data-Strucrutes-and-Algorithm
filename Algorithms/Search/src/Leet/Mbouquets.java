package Leet;

public class Mbouquets {
    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        System.out.println(BS(arr,m,k));
        System.out.println(Brute(arr,m,k));
    }

    public static boolean possible(int[] arr,int day,int m ,int k){
        int count = 0;
        int num = 0;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i] <= day){
                count++;
            }
            else{
                num += (count / k);
                count = 0;
            }
        }
        num += (count / k);
        return num >= m;
    }
    static int BS(int[] arr, int m, int k){
        long val = (long) m * k;
        int n = arr.length;
        if (val > n) return -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }
        while(low <= high){
         int mid = low + (high - low) / 2;
         if(possible(arr,mid,m,k)){
             high = mid - 1;
         }
         else{
             low = mid + 1;
            }
        }
        return low;
    }

    static int Brute(int[] arr ,int m , int k){
        long val = (long) m * k;
        int n = arr.length;
        if (val > n) return -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }

        for (int i = low; i < high; i++) {
            if(possible(arr,i,m,k)){
                return i;
            }
        }
        return -1;
    }

}
