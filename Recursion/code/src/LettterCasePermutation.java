import java.util.*;


public class LettterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println(letterCasePermutation(s));

    }

    public static List<String> letterCasePermutation(String s) {
        String ip = s;
        String op = "";
        ArrayList<String> res = new ArrayList<>();
        solve(ip,op,res);
        return res;
    }

    static void solve(String ip , String op , ArrayList<String> res){
        StringBuilder ip1 = new StringBuilder(ip);
        if(ip.isEmpty()){
                res.add(op);
                return;
            }

        if(Character.isAlphabetic(ip.charAt(0))){
            StringBuilder op1 = new StringBuilder(op);
            StringBuilder op2 = new StringBuilder(op);
            op1.append(ip.charAt(0));
            op2.append(Character.toUpperCase(ip.charAt(0)));
            ip1.deleteCharAt(0);
            solve(ip1.toString(), op1.toString(), res);
            solve(ip1.toString(),op2.toString(), res);
        }
        else{
            StringBuilder op1 = new StringBuilder(op);
            op1.append(ip.charAt(0));
            ip1.deleteCharAt(0);
            solve(ip1.toString(), op1.toString(), res);
        }
        return;
    }
}
