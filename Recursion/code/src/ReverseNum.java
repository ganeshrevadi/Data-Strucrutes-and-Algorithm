public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(Rev(3524));
        System.out.println(rev2(3524));
        System.out.println(pal(12321));

    }
    static int sum=0;
    static int Rev(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        sum = sum*10 + rem;
        Rev(n/10);
        return sum;
    }
     static int rev2(int n){
        int digits =(int)(Math.log10(n))+1;
        return helper(n,digits);

     }
     static boolean pal(int n){
        return (n==rev2(n));
     }

     private static int helper(int n,int digits){
         if(n%10==n){
             return n;
         }
         int rem=n%10;
         return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
     }
}
