public class celling {
    public static void main(String[] args) {
        int[] arr ={2,5,9,14,16,18};
        int target = 15;
        int ans  = celing(arr,target);
        System.out.println(ans);


    }


    static int celing(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            if(target>arr[arr.length-1]){

                return -1;
            }
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid -1;
                mid = (start+end)/2;
            }
            else if(arr[mid]<target){
                start=mid +1;
                mid = (start+end)/2;
            }
            else{
                return mid;
            }
        }
        return arr[start];
    }
}