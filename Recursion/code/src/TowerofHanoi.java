public class TowerofHanoi {
    public static void main(String[] args) {
        int n = 2;
        int s = 1;
        int h = 2;
        int d = 3;
        solve(n,s,d,h);
    }

    static void solve(int n , int source ,int destination , int helper){
        if( n == 1){
            System.out.println("Moving Plate " + n + " Form " + source +  " to " + destination);
            return;
        }

        solve(n - 1 , source, helper,destination);
        System.out.println("Moving Plate " + n + " Form " + source +  " to " + destination);
        solve(n - 1  , helper, destination, source);
        return;

    }
}
