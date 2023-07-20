public class climbingStairs {
    public static void main(String[] args) {
        int n  = 3;
        System.out.println(rec(n));
    }

    public static int rec(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return rec(n-1) + rec(n-2);
    }
}

