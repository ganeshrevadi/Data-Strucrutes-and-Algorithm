import java.util.ArrayList;
import java.util.List;

public class subSequenceK {
    public static void main(String[] args) {
        generateSub(0 , new ArrayList<>(),  new int[] {3 , 2, 1} , 0);
    }

    static void generateSub(int index , List<Integer> arr , int[] a , int sum ){
        if(index >= a.length){
            if(sum == 3){
                System.out.println(arr);
            }
            return;
        }
        arr.add(a[index]);
        sum += a[index];
        generateSub(index + 1  , arr ,  a , sum);
        arr.remove(arr.size() - 1);
        sum -= a[index];
        generateSub(index + 1  , arr , a  , sum);
    }
}
