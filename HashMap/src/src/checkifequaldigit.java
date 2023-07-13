import java.util.HashMap;

public class checkifequaldigit {
    public static void main(String[] args) {
        String num = "1210";
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<num.length();i++){
            int ch=num.charAt(i)-'0';
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if(map.containsKey(i)){
                count = map.get(i);
            }
            else{
                count = 0;
            }
            int x  =num.charAt(i) - '0';
            if(x != count){
                System.out.println(false);
            }
        }

        System.out.println(true);




    }
}
