import java.util.ArrayList;

public class serializedString {
    public static void main(String[] args) {

    }

    public static String serialize(ArrayList<String> A) {
        StringBuilder s = new StringBuilder();
        for(String str : A){
            s.append(str);
            s.append(str.length());
            s.append("~");
        }

        return s.toString();
    }
}
