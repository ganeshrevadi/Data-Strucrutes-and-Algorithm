public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addStrings("1010","1011"));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sumNum = (num1.charAt(i--) - '0') + (num2.charAt(j--) - '0');
            sumNum += carry;
            if(sumNum <= 1){
                sb.append(sumNum);
            }
            else{
                carry = 1;
                sb.append("0");

            }

        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
