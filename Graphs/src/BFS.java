import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
public class BFS {
    public static void main(String[] args) {


    }


    public ArrayList<Integer> Bfs(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();

        boolean[] vis = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it:  adj.get(node)){
                if(!vis[it]){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }

        return bfs;
    }


    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < edges.length; i++){
            res.add(i, new ArrayList<Integer>());
        }

        for(int i = 0; i < edges.length; i++){
            for(int j = 0; j < edges[i].length; j++){
                if(edges[i][j] == 1  && i != j){
                    res.get(i).add(j);
                }
            }
        }

        return res;
    }
}