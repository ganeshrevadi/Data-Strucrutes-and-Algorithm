import java.util.Arrays;

public class cyclucsort {
    public static void main(String[] args) {
        int[] arr={0,3,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missing(arr));

    }

    static void cyclicsort(int[] arr){
        int i=0 ;
        while(i<arr.length){

            int correct = arr[i];


            if(arr[i]!=i && arr[i]<arr.length){

                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }

    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;

    }
    static int missing(int[] arr){
        for(int index=0;index<arr.length;index++){
            if(arr[index]!= index){
                return index;
            }
        }
        return arr.length;

    }
}
