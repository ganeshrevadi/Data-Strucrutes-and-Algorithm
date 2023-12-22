import java.util.Arrays;

public class selfPermutation {
    public static void main(String[] args) {
//        System.out.println(permuteStrings("bajd" , "abdj"));
    }

    public static int permuteStrings(String A, String B) {
        char[] str1 = A.toCharArray();
        char[] str2 = B.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        if(A == B){
            return 1;
        }
        return 0;
    }
}
