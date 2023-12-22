import java.util.ArrayList;

public class Deserialize {
    public static void main(String[] args) {
        System.out.println(deserialize("scaler6~academy7~"));
    }

    public static ArrayList<String> deserialize(String A) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if(Character.isDigit(A.charAt(i))){
                res.add(s.toString());
                s = new StringBuilder();
            }else if(Character.isAlphabetic(A.charAt(i))) {
                s.append(A.charAt(i));
            }
        }
        return res;
    }

}
