public class isprime {
    public static void main(String[] args) {
        checkprime(5,10);
    }
    static void checkprime(int start ,int end){
        for (int i = start; i <=end ; i++) {

            for (int j = 2;j<i/2; j++) {
                if(i%j==0){
                    break;
                }
                else{
                    System.out.print(i+" ");
                    break;
                }

            }

        }

    }
}
