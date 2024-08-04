import java.security.spec.ECField;


// Inheriting the interface we use the implements keyword
interface Fest{
    void caller();
}

// To inherit the abstract class we use the extends keyword
abstract class Inheri{
    public void tester(){
        System.out.println("Tester");
    }

    abstract public void solver();
}


public class Test implements Fest{
    public static void main(String[] args) {
        Test n = new Test();
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

    public void solver(){

    }
    public  void caller() {
        System.out.println("I'm the caller");
    }
}







