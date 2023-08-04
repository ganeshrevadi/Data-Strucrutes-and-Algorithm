package Leet;


public class shipMinWeight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(arr,days));
        System.out.println(brute(arr,days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int low = 0,high = 0;
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(weights[i],low);
        }
        for (int i = 0; i < weights.length ; i++) {
            high += weights[i];
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            int day = possible(weights,mid);
            if(day <= days){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int brute(int[] weights , int days){
        int low = 0,high = 0;
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(weights[i],low);
        }
        for (int i = 0; i < weights.length ; i++) {
            high += weights[i];
        }

        for(int i = low ; i <= high;i++){
            int ref = possible(weights,i);
            if(ref == days){
                return i;
            }
        }
        return low;
    }

    static int possible(int[] arr , int mid){
        int day = 1,sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum + arr[i] > mid){
                day++;
                sum = arr[i];
            }
            else {
                sum += arr[i];
            }
        }
        return day;
    }
}
