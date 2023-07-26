public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class Pal {
        public static void main(String[] args) {
            String str = "Gada";
            System.out.println(palcheck(str));

        }
        static boolean palcheck(String str ){
            str=str.toLowerCase();
            if(str==null||str.length()==0){
                return true;
            }
            for (int i = 0; i <str.length() ; i++) {
                char start = str.charAt(i);
                char end = str.charAt(str.length()-1-i);
                if(start!=end){
                    return false;
                }


            }
            return true;

        }
    }
}