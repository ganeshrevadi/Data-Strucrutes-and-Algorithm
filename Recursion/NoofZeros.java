public class NoofZeros {
    public static void main(String[] args) {
        System.out.println(zero(200101));

    }

    static int zero(int n){
         return helper(n,0);

    }
//Special patterns on how to pass a value on above calls
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,++c);
        }
        return helper(n/10,c);

    }
}
