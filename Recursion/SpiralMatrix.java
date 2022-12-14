public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] spiral = new int[3][3];
        int i =0;

        for (int j = 0; j <3 ; j++) {
            i++;
            spiral[0][j] = i;

        }

        for (int k = 0; k < 3; k++) {
            spiral[k][2]=i;
            i++;

        }

        for (int l = 1; l>=0; l--) {
            spiral[2][l]=i;
            i++;
        }

        for (int m = 0; m <2 ; m++) {
            spiral[1][m]=i;
            i++;
        }

        for (int a = 0; a <3 ; a++) {
            for (int b = 0; b <3 ; b++) {
                System.out.print(spiral[a][b]);

            }
            System.out.println();


        }
    }

}
