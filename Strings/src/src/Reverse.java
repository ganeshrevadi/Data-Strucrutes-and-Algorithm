import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        solve("the sky is blue");
        System.out.println(solve("the sky is blue"));
    }

    public static String solve(String A) {
        String[] wordsArr = A.split("");
        StringBuilder s = new StringBuilder();
        for (int i = wordsArr.length - 1; i > 0 ; i--) {
            s.append(wordsArr[i] + " ");

        }
        s.append(wordsArr[0]);
        return s.toString();
    }
}
