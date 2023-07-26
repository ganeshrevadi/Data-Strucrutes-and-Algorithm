import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
    public static void main(String[] args) {
        List<String> output_arr = new ArrayList<>();
        int n = 3;
        back(output_arr,"",0,0,n);
        System.out.println(output_arr);
    }

    public static  void back(List<String> output_arr,String curr_str,int open,int closed,int max){
        if(curr_str.length() == 2 * max){
            output_arr.add(curr_str);
            return;
        }
        if(open < max) back(output_arr,curr_str + "(",open + 1,closed,max);
        if(closed < open) back(output_arr,curr_str +  ")",open,closed + 1,max);
    }
}
