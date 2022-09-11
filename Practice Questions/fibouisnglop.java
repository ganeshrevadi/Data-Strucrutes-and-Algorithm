import java.util.Scanner;

public class fibouisnglop {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1=0,num2 = 1,num3,i,n;
        System.out.println("Enter the number of elements");
         n = input.nextInt();
         for(i=2;i<n;i++){
             System.out.println(num1+" ");
             num3= num1+num2;
             num1= num2;
             num2=num3;
         }

    }
}
