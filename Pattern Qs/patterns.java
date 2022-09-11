public class patterns{
    public static void main(String[] args) {
        pat28(5);

    }
    static void pat5(int n){
        for(int row = 0; row <2*n; row++){
            int totalcols= row>n?2*n-row:row;
            for (int cols = 0; cols < totalcols ; cols++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    static void pat28(int n){
        for(int row = 0; row <2*n; row++){

            int totalcols= row>n?2*n-row:row;
            int noofspaces=n-totalcols;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < totalcols ; cols++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    static void pat1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");

            }
            System.out.println();


        }
    }
    static void pat2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    static void pat3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row +1; col++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
    static void pat4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }
}
