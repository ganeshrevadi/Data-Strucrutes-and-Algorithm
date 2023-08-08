public class LargestOddNumber {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("10133890"));
    }

    public static String largestOddNumber(String num) {
        if(Long.valueOf(num) % 2 != 0){
            return num;
        }

        String res = new String();
        int max = 0;
        int flag = 0;
        for (int i = 0; i < num.length(); i++) {
            int od  = num.charAt(i) - '0';
            if(od % 2 != 0){
                flag = 1;
                max = i;
            }
        }
        if(flag == 0) return "";

        return num.substring(0,max + 1);
    }
}
