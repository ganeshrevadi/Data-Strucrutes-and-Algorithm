import java.util.Scanner;

public class vjudge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int displayrating = input.nextInt();
        int innerrating = 0;

        int newdisplayrating=0;

        if(n>=10){
            innerrating = displayrating;

        }
        else{
            newdisplayrating = 100*(10-n);
        }
        innerrating= displayrating + newdisplayrating;
        System.out.println(innerrating);
    }
}
