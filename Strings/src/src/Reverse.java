import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        solve("the sky is blue");
        System.out.println(solve("the sky is blue"));
    }

    public static String solve(String s) {
        String res = new String();
        int i = 0;
        int n  = s.length();
        while(i < n) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            if(i >= n) break;
            int j = i + 1;
            while(j < n && s.charAt(j) != ' ') j++;
            String sub  = s.substring(i,j);
            if(res.length() == 0){
                res = sub;
            }
            else{
                res = sub + " " + res;
            }
            i = j + 1;
        }
        return res;
    }
}
