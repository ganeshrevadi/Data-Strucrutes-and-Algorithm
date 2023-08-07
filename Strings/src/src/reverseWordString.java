import java.util.Collections;

public class reverseWordString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "a good   example";
        char[] ch = str.toCharArray();
        for (int i =ch.length - 1; i >= 0; i--){
            sb.insert(0,ch[i]);
        }
        System.out.println(sb);
    }
}
