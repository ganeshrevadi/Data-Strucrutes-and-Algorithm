package Leet;

public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(BruteF(arr,k));
        System.out.println(missingK(arr,arr.length,k));
    }

    static int BruteF(int[] arr,int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= k){
                k++;
            }
            else {
                break;
            }
        }
        return k;
    }

    public static int missingK(int[] vec, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
}
