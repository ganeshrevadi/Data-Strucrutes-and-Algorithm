public class greatest {
    public static void main(String[] args) {
        int a= 5;
        int b=2;
        int  c = 9;

        System.out.println( great(a,b,c));

    }
    static int great(int a, int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else {
            if (b>c) {
                return b;
            }
            else{
                return c;
            }
        }

    }
}