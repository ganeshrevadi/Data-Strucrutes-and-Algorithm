import java.util.Scanner;

public class ncr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();
        System.out.println("Enter the value of r");
        int r = input.nextInt();

        if(n<r){
            System.out.println("Enter valid inputs ");
        }
        else{
            System.out.println("ncr = "+findncr(n,r));
            System.out.println("npr = "+findnpr(n,r));


        }

        System.out.println();

    }
    static int findncr(int n,int r){
        int ncr = fact(n)/((fact(n-r))*fact(r));
        return ncr;
    }
    static int findnpr(int n,int r){
        int npr = fact(n)/(fact(n-r));
        return npr;
    }

    static int fact(int x){
        int fact=1;

        for(int i=1;i<=x;i++){

            fact = fact *i;

        }
        return fact;
    }
}
