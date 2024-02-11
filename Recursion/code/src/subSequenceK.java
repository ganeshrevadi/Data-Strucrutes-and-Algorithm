import java.util.List;

public class subSequenceK {
    public static void main(String[] args) {

    }

    static void generateSub(int index , List<Integer> arr , int[] a , int sum ){
        if(index >= a.length){
            System.out.println(arr);
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
