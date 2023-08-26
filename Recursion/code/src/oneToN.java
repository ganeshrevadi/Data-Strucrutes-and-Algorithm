import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

public class oneToN {
    public static void main(String[] args) {
        solve(7);

    }

    static void solve(int n){
        if(n == 1){
            System.out.println("1");
            return;
        }

        solve(n - 1);
        System.out.println(n);
    }
}
