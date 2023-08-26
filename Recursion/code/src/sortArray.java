import java.util.ArrayList;

public class sortArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(2);
        sort(list);
        System.out.println(list);
    }

    static void sort(ArrayList<Integer>  nums){
        if(nums.size() == 1){
            return;
        }
         int temp = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        sort(nums);
        insert(nums,temp);

    }

    static void insert(ArrayList<Integer> nums, int temp){
        if(nums.size() == 0 || nums.get(nums.size() - 1) <= temp){
            nums.add(temp);
            return;
        }
        int val = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        insert(nums,temp);
        nums.add(val);
        return;
    }
}
