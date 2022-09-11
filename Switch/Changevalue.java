import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int arr[]= {2, 4, 56, 7, 8};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void change(int[] num) {
         num [0]=99;
    }
}
