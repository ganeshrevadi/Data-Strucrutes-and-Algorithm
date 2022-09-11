public class sumofnnaturalnumbers {
    public static void main(String[] args) {
     int n = 10;
        System.out.println(sum(n));
    }
    static int sum(int n){
        int ans = n*(n+1)/2;
        return ans;
    }
}
