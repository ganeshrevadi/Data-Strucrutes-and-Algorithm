import java.math.BigInteger;
public class PlusOne {
    public static void main(String[] args) {
        long num = 0;
        int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
        int rem = 0;
        for(int i = 0 ; i<digits.length;i++){
            rem = digits[i];
            num *= 10;
            num +=rem;
        }
        System.out.println(num);
        num++;
        String temp = Long.toString(num);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        for(int i = 0 ; i< newGuess.length;i++){
            System.out.println(newGuess[i]);
        }
    }
}
