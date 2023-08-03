public class EmpWhoMetTarget {
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,2};
        int target = 6;
        System.out.println(numberOfEmployeesWhoMetTarget(arr,target));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i<hours.length;i++){
            if(hours[i] >= target){
                count++;
            }
        }
        return count;
    }
}
