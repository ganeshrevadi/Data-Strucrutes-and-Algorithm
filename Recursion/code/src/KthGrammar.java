public class KthGrammar {
    public static void main(String[] args) {
        int n = 2;
        int k = 2;
        System.out.println(kthGrammar(n,k));
    }

    public static int kthGrammar(int n, int k) {
        if(n ==  1 ||  k == 1 ){
            return 0;
        }
        int mid = (int)Math.pow(2,n - 1) / 2;
        if(k <= mid){
            return kthGrammar(n - 1,k);
        }
        else{
           return kthGrammar(n - 1, k - mid) ^ 1;

        }
    }
}
