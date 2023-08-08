public class LargestOddNumber {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }

    public static String largestOddNumber(String num) {
        if(Integer.valueOf(num) % 2 != 0){
            return num;
        }

        String res = new String();
        int max = 0;
        for (int i = 0; i < num.length(); i++) {
            int od  = num.charAt(i) - '0';
            if(od % 2 != 0 && od > max){
                max = od;
            }
        }
        if(max == 0) return "";

        return String.valueOf(max);
    }
}
