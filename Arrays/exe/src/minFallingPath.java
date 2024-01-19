public class minFallingPath {
    public static void main(String[] args) {

    }

    public static int minFallingPathSum(int[][] matrix) {
        int minFirst = Integer.MAX_VALUE;
        int indexFirst = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            if(minFirst > matrix[0][i]){
                minFirst = matrix[0][i];
                indexFirst = i;
            }
        }

        int minSec = 0;
        int sum = minFirst;
        int index = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                    if(minSec > matrix[i + 1][ indexFirst - 1]){
                        minSec = matrix[i + 1][indexFirst - 1];
                        index = indexFirst - 1;
                    }
                    else if(minSec > matrix[i  + 1][indexFirst]){
                        minSec = matrix[i + 1][indexFirst + 1];
                        index = indexFirst;
                    }
                    else if(minSec > matrix[i  + 1][indexFirst + 1]){
                        minSec = matrix[i + 1][indexFirst + 1];
                        index = indexFirst + 1;
                    }
                    indexFirst = index;
                    sum += minSec;
            }
        }

        return sum;
    }
}
