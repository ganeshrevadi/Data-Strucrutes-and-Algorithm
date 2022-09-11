import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find factors");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
            else{
                continue;
            }
        }

    }
}
