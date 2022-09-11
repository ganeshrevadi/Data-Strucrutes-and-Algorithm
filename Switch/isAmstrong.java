import java.util.Scanner;

public class isAmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //System.out.println("Enter a number to check if its a AMSTRONGS NUMBER!!");
        //int n = in.nextInt();
        //System.out.println(isAmstrong(n));
        for (int i=0;i<1000;i++){
            if (isAmstrong(i)) {
                System.out.print(i+" ");
            }
        }


    }
    static boolean isAmstrong(int n){
        int og = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            int cube =rem*rem*rem;
            sum += cube;
            n = n/10;
        }
        return sum == og;

    }
}
