public class subtractproduct {
    public static void main(String[] args) {
        int n = 4421;
        int sum =0;
        int product = 1;

        while(n>0){
            int rem = n%10;

            sum=sum+rem;
            product = product*rem;
            n = n/10;
        }
        int req = product - sum ;
        System.out.println(req);
    }
}
