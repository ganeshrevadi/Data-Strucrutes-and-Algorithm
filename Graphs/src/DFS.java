import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class DFS {
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        StringBuilder s = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        int[] help = new int[2];
        HashMap<Character, Integer> map = new HashMap<>();


        for(char c: word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : map.keySet()){
            if(map.get(c) > 9){
                s.append(9);
                s.append(c);
                map.put(c, map.get(c) - 9);
            }
            else {
                int freq = map.get(c);
                s.append(freq);
                s.append(c);
            }
        }

        char[] ch = s.toString().toCharArray();
        Arrays.sort(ch);
        ch.toString();
    }

    public static void Dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);


        for(int it : adj.get(node)){
            if(!vis[it]){
                Dfs(it, vis, adj, ls);
            }
        }
    }
}
