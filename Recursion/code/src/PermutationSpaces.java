import java.util.ArrayList;
import java.util.HashSet;

public class PermutationSpaces {
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        solve("ABC","",map);
        System.out.println(map);

    }

    static void solve(String ip , String op, HashSet<String> map){
        StringBuilder ip1 = new StringBuilder(ip);
        if(ip1.length() == 0){
            map.add(op);
            return;
        }

        if(op.isEmpty()){
            op += ip1.charAt(0);
            ip1.deleteCharAt(0);
        }

        StringBuilder op1 = new StringBuilder(op);
        StringBuilder op2 = new StringBuilder(op);

        op1.append(ip1.charAt(0));
        op2.append(" " + ip1.charAt(0));
        ip1.deleteCharAt(0);
        solve(ip1.toString(), op1.toString(), map);
        solve(ip1.toString(),op2.toString(), map);
        return;
    }
}
