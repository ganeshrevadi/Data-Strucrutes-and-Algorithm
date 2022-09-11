import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(Arrays.toString( arr(3524)));

    }

    static void palin(int p ,int q){


        arr(q);
        int h=0;



    }
    static int[] arr(int x){
        int i=0;
        int[] a={};
        while(x>0){
            int rem = x%10;
             a[i]= rem;
            i++;
            x= x/10;
        }
        return   a ;
    }
}
