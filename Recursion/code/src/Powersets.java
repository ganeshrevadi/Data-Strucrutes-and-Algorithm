public class Powersets {
    public static void main(String[] args) {
        solve("abababab","");
    }

    static void solve(String ip , String op){
        StringBuilder ip1 = new StringBuilder(ip);
        if(ip1.length() == 0){
            System.out.println(op);
            return;
        }

        StringBuilder op1 = new StringBuilder(op);
        StringBuilder op2 = new StringBuilder(op);

        op2.append(ip1.charAt(0));
        ip1.deleteCharAt(0);
        solve(ip1.toString(), op1.toString());
        solve(ip1.toString(),op2.toString());
        return;
    }
}
