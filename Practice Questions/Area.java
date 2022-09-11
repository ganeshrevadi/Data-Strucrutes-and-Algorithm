import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle");
        Scanner input = new Scanner(System.in);
        float  rad = input.nextFloat();
        System.out.println("Area of circle is "+acircle(rad));


    }
    static double acircle(float rad){
        double area = 3.144*rad*rad;
        return area;
    }
}