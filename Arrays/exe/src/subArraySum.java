public class subArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum = 0;
        int k = 3;
        int count = 0;


        for (int i = 0;i<arr.length;i++){
            sum = arr[i];
            if(sum == k){
                count ++;
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
