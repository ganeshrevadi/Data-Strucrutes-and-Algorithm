public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class fat {
        public static void main(String[] args) {

             int ans =fact(5);
            System.out.println(ans);

        }

        static int fact(int n){
            if(n<=1){
                return n;

            }
            return n * fact(n-1);
        }
    }
}