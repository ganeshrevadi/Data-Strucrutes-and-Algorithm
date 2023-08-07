public class longestPrefix {
    public static void main(String[] args) {
        String[] str = {"aaa","aa","aaa"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs[0].charAt(0) != strs[1].charAt(0)){
            return new String("");
        }
        String ref = strs[0];
        for(int i = 1 ; i < strs.length;i++){
            for(int j= 0; j<strs[i].length();j++){
                if(strs[i].charAt(j) != ref.charAt(j)){
                    break;
                }
                else {
                    sb.append(strs[i].charAt(j));
                }
            }
            ref = sb.toString();
            sb.delete(0,sb.length());
        }
        return ref;
    }
}
