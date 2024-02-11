import java.util.ArrayList;
import java.util.List;

public class subSequenceK {
    public static void main(String[] args) {
        generateSub(0 , new ArrayList<>(),  new int[] {3 , 2, 1} , 0);
        System.out.println("-----------------------------");
        generateSub2(0 , new ArrayList<>(),  new int[] {3 , 2, 1} , 0);
        System.out.println("-----------------------------");
        System.out.println(generateSub3(0 , new ArrayList<>(),  new int[] {3 , 2, 1} , 0));
    }


    // Generate subsequence which equals to target K (All solutions)
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



    // generate subSequence return after a solution is obtained (For a single solution)
    static boolean generateSub2(int index , List<Integer> arr , int[] a , int sum ){
        if(index >= a.length){
            if(sum == 3){
                System.out.println(arr);
                return true;
            }
            else return false;
        }
        arr.add(a[index]);
        sum += a[index];
        if(generateSub2(index + 1  , arr ,  a , sum)){
            return true;
        }
        arr.remove(arr.size() - 1);
        sum -= a[index];
        if(generateSub2(index + 1, arr, a, sum)){
            return true;
        }
        return false;
    }


    // Alternative way to do the above by using the left right approach(Number of cases)
    static int generateSub3(int index , List<Integer> arr , int[] a , int sum ){
        if(index >= a.length){
            if(sum == 3)
                return 1;
            else return 0;
        }
        arr.add(a[index]);
        sum += a[index];
        int l = generateSub3(index + 1  , arr ,  a , sum);
        arr.remove(arr.size() - 1);
        sum -= a[index];
        int r = generateSub3(index + 1  , arr ,  a , sum);
        return l + r;
    }
}
