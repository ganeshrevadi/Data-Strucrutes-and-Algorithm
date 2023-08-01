package Leet;
import java.util.*;


public class Koko {

    static int findMax(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }

    public static int calculateTotalHrs(int[] v, int hourly){
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }

    static int minEatingSpeed(int[] v, int h) {
        int low = 1, high = findMax(v);
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHrs(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(arr,h));
    }


}
