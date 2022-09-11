public class pythtriplet {
    public static void main(String[] args) {
        int a  = 5;
        int b = 6;
        int c= 3;
        checkpyth(a,b,c);

    }
    static void checkpyth(int a,int b ,int c){
      int p= c*c;
      int q=a*a;
      int r=b*b;
      if(p==q+r || r==p+q || q==r+p){
          System.out.println("This is a pythagorean triplet");
      }

      else{
          System.out.println("Not a pyta triplet");
      }
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
