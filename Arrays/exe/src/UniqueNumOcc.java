import java.util.HashMap;

public class UniqueNumOcc {
    public static void main(String[] args) {

    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }

        for(int ele : map.keySet()){
            for (int ele2 : map.keySet()){
                if(ele != ele2 && map.get(ele) == map.get(ele2)){
                    return false;
                }
            }
        }

        return true;
    }
}
