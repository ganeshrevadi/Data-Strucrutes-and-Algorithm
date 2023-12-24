public class strstr {
    public static void main(String[] args) {
        System.out.println(strStr("bbbbbbbbab" , "baba"));
    }

    public static int strStr(final String A, final String B) {
        if(B.length() > A.length()){
            return -1;
        }

        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == B.charAt(0)){
                System.out.println("i " + i);
                for (int j = 0 , k  = i; j < B.length() && k < A.length(); j++ , k++) {
                    if(A.charAt(k) == B.charAt(j)){
                        count++;
                        System.out.println("count " + count);
                    }
                }
                System.out.println("Count outside " + count);

                if(count  == B.length()){
                    return i;
                }
                else {
                    count  = 0;
                }
            }
        }

        return -1;
    }

}
