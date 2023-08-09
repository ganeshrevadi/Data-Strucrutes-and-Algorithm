public class rotateString {
    public static void main(String[] args) {
        System.out.println(rotate("abcde","cdeab"));
    }

    static boolean rotate(String s , String goal){
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if(goal.equals(str.toString())){
                return true;
            }
            char ch = str.charAt(0);
            str.deleteCharAt(0);
            str.append(ch);
        }

        return false;
    }
}
