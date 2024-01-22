import java.util.Arrays;

public class maxCoins {
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));
    }

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int count = piles.length / 3;
        System.out.println(count);
        for (int i = piles.length - 1; i > 0 ; i--) {
            if(piles.length % 2 != 0){
                if(i % 2 != 0 && count > 0){
                    sum += piles[i];
                    count--;
                }
            }
            else {
                if(i % 2 == 0 && count > 0){
                    sum += piles[i];
                    count--;
                }
            }

        }
        System.out.println(Arrays.toString(piles));
        return sum;
    }
}
