public class NthRoot {
    public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = root(n, m);
        System.out.println("The answer is: " + ans);
    }

    static int root(int m,int n){
        int low = 1;
        int high = m;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int midN = func(mid,n,m);
            if(mid == 1){
                return mid;
            }
            else if(mid == 0){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
}
