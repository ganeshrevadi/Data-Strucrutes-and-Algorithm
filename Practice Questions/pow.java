import java.util.Scanner;

import static java.lang.Math.abs;

public class pow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number whose cube root u wanna find:");
        Double number = input.nextDouble();
        Double epsilon = 0.0001;
        Double ans = number/2.00;
        while (abs((abs(number) - abs(Math.pow(ans,3))))>epsilon){
            System.out.println("in loop");
            ans = ans - ((Math.pow(ans,3) - number)/(3*Math.pow(ans,2)));
            System.out.println(ans);
            if ((number - ans)<=epsilon){
                System.out.println(ans);
            }
        }

        System.out.println(Math.pow(2,2));
    }
}
