public class Microsoft1 {
    public static void main(String[] args) {
    int[] A = {5,1,2,6,6,1,3,1,4,3,4,3,4,6,1,2,4,1,6,2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // Implement your solution here\
        int count1 = 0;
        int count2 = 0;
        int len = A.length;
        for(int i = 1 ; i < A.length ; i++){
            int ref = A[i];
            for(int j = i + 1 ; j < A.length - 1 ;j++){
                if(i % 2 != 0 && j % 2 == 0 && ref == A[j] ){
                    count1++;
                    ref = A[j + 1];
                }
                else if(i % 2 == 0 && j % 2 != 0 && ref == A[j]){
                    count2++;
                    ref = A[j - 1];
                }
            }
        }
        int min = count1 > count2 ? count2 : count1;
        len /= 2;
        return len - min - 1;
    }
}
