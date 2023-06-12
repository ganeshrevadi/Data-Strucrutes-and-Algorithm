import java.util.ArrayList;

public class findAllindexRec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4};
        System.out.println(findAllindex(arr,4,0));
    }
    static ArrayList<Integer> findAllindex(int[] arr ,int target,int index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index == arr.length){
            return list;
        }

        if(target == arr[index]){
            list.add(index);
        }
        ArrayList<Integer> ans = findAllindex(arr,target,index + 1);
        list.addAll(ans);
        return list;
    }
}
