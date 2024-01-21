import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = { 1, 2};
        int[] s = {1, 2,3};
        System.out.println(findContentChildren(g , s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = g.length  - 1;
        int j = s.length - 1;
        while(i >= 0 && j >= 0){
            if(s[j] >= g[i]){
                count++;
                j--;
            }

            i--;
        }

        return count;
    }
}
