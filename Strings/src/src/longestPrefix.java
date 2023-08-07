public class longestPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i < strs.length;i++){
            for(int j= 0; j<strs[i].length();j++){
                if(strs[i - 1].charAt(i) != strs[i].charAt(i)){
                    break;
                }
                else {
                    sb.append(strs[i].charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
