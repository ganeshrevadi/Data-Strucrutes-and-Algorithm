public class validPal {
    public static void main(String[] args) {
        boolean ans = isPal("gadag");
        System.out.println(ans);
    }

    public static boolean isPal(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").replaceAll(":", "").toLowerCase();
        String rev=reverseString(s);

//        for (int i = s.length() - 1; i >= 0; i--) {
//            rev += s.charAt(i);
//        }
        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
