import java.util.ArrayList;

public class FloodFill {

    public void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int[] delRow, int[] delCol, int inColor){
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;

        for(int i = 0; i < 4; i++){
            int newRow = row + delRow[i];
            int newCol = col + delCol[i];

            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && image[newRow][newCol] == inColor && ans[newRow][newCol] != newColor){
                dfs(newRow, newCol, ans, image, newColor, delRow, delCol, inColor);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;

        int inColor = image[sr][sc];
        int[][] ans = image;

        int delRow[] = {-1, 0, 1, 0};
        int delCol[] = {0, 1, 0, -1};

        dfs(sr, sc, ans, image, color, delRow, delCol, inColor);
        return ans;

    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hey");
        sb.insert(0, "Bro");
        sb.deleteCharAt(0);
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            ls.add(i);
        }
        ls.remove(0);

        int idx = 0;
        System.out.println(ls.get(0));
    }
}
