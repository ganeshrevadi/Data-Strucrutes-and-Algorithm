import java.util.Arrays;

public class lengthLast {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" hello world "));
    }

    public static int lengthOfLastWord(final String A) {
        String[] wordsArr = A.split("\\s");
        return (wordsArr.length > 0) ? wordsArr[wordsArr.length-1].length() : 0;
    }
}
