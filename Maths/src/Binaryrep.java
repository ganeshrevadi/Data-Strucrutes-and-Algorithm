public class Binaryrep {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(findDigitsInBinary(10));
    }

    public static String findDigitsInBinary(int A) {
     StringBuilder s  = new StringBuilder();
     while(A > 0){
         int rem = A % 2;
         s.append(rem);
         A /= 2;
     }
     s.reverse();
     return s.toString();
    }

}