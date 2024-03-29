import java.util.List;

public class climbingStairs {
    public static void main(String[] args) {
        int n  = 36;
        System.out.println(rec(n));
    }

    public static int rec(int n){
        int[] count = new int[n+1];
        count[0] = 1; count[1] = 1;
        for(int i = 2; i<= n; i++) {
            count[i] = count[i-1] + count[i-2];
        }
        return count[n];
    }
}

