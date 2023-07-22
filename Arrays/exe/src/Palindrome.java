public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) {
        int z = x;
        long num = 0;
        int rem;
        while(x > 0){
            rem = x % 10;
            x /= 10;
            num += (long)rem;
            num *= 10;
        }
        num /= 10;
        if(z == num){
            return true;
        }
        return false;
    }
}
