import java.security.spec.ECField;

public class Test {
    public static void main(String[] args) {
        try {
            int[] ar = new int[3];
            System.out.println(ar[4]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Im in finally");
        }

        System.out.println("I'm outside finally");
    }
}
