import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {

    }

    public static void Dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);


        for(int it : adj.get(node)){
            if(!vis[it]){
                 vis[it] = true;
                Dfs(it, vis, adj, ls);
            }
        }
    }
}
