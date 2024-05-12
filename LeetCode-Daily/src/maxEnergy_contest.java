public class maxEnergy_contest {
    public static void main(String[] args) {
        int[] arr = {5,-10,4,3,5,-9,9,-7};
        System.out.println(maximumEnergy(arr, 2));

    }

    public static int maximumEnergy(int[] energy, int k) {
        int max = Integer.MIN_VALUE;
        int n = energy.length;
        for(int i = n - 1; i >= n - k; --i){
            int sum = 0;
            for(int j = i; j >= 0 ; j -= k){
               sum += energy[j];
                max  = Math.max(sum , max);

            }
        }

        return max;
    }
}
