package Leet;

import java.util.Arrays;
import java.util.Collections;

public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(arr,k));
        System.out.println(brute(arr,k));
    }
    public static int splitArray(int[] weights, int days) {
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
