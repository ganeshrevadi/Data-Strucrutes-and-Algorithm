public class NoofSteps {
    public static void main(String[] args) {
        System.out.println(noofsteps(15));

    }
    //no of steps to reduce the numebr to zero
    static int noofsteps(int n){
        return helper(n,0);
    }
    private static int helper(int n ,int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2,++steps);
        }
        return helper(n-1,++steps);
    }
}
