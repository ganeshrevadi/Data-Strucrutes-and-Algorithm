public class lC_400 {
    public static void main(String[] args) {

    }

    public String clearStars(String s) {
        int ind = -1;
        StringBuilder str = new StringBuilder(s);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++){
            if(str.charAt(i) == '*'){
                for(int j = i ; j >= 0; j--){
                    int m = s.charAt(i) - 'a';
                    if(m < min) {
                        min = m;
                        ind = j;
                    }
                }

                str.deleteCharAt(i);

            }
        }


        str.deleteCharAt(ind);

        return str.toString();
    }
}
