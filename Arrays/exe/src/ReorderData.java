import java.util.*;
 public class ReorderData {
    public static void main(String[] args) {
        ArrayList<String> S = new ArrayList<>();
        String[] str = {"dig1-8-1-5-1", "let1-art-can", "dig2-3-6", "let2-own-kit-dig", "let3-art-zero"};
        for(String  le : str){
            S.add(le);
        }
        System.out.println(reorderLogs(S));
    }

    public static ArrayList<String> reorderLogs(ArrayList<String> A) {

        ArrayList<String> ans = new ArrayList<>();
        for(String ele : A){
            if(Character.isAlphabetic(ele.charAt(5))){
                ans.add(ele);
            }
        }
        Collections.sort(ans.subList(5 , ans.size()));
        return ans;
    }
}
