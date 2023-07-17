import java.util.Arrays;

public class heapSort {
    public static void main(String[] args) {
        int[] arr = {10,30,50,20,35,15};
        arr = heapify(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }

    static int[] heapify(int[] a,int n ,int i){
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;

        if(l <= n  && a[l]>a[largest]){
            largest = l;
        }
        if(r<= n && a[r] > a[largest]){
            largest = r;
        }

        if(largest != i){
            swap(a[largest],a[i]);
            heapify(a,n,largest);
        }
        return a;
    }

    static void swap(int b , int s){
        int temp = b;
        b = s;
        s = temp;

    }
}
