import java.util.ArrayList;
import java.util.List;

public class subSequence {
    public static void main(String[] args) {
        generateSub(0 , new ArrayList<>(),  new int[] {3 , 2, 1});
    }

    static void generateSub(int index , List<Integer> arr , int[] a){
        if(index >= a.length){
            System.out.println(arr);
            return;
        }
        arr.add(a[index]);
        generateSub(index + 1  , arr ,  a );
        arr.remove(arr.size() - 1);
        generateSub(index + 1  , arr , a );
    }

}
