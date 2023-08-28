public class Pow {
    public static void main(String[] args) {

        System.out.println(myPow(1.0000000000001,-2147483648));
        System.out.println(Math.pow(1.0000000000001,-2147483648));
    }
    public static double myPow(double x, long n) {
        if (x < -10000 || x > 10000) {
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if (n < 0){
            n  = (long)-n;
            x = 1/x;
        }
        if (n % 2 == 0){
            return myPow(x*x,n/2);
        }
        else{
            return x * myPow(x,n - 1);
        }

    }
}
