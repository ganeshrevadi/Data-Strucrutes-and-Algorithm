import java.util.*;
public class SubStringCombi {
    public static void main(String[] args) {
        String nums = "aab";
        List<List<String>> res = new ArrayList<>();
        helper(nums, res, new ArrayList<>(), 0);
        System.out.println(res); // Output: [["a", "a", "b"], ["aa", "b"]]
    }

    public static void helper(String nums, List<List<String>> res, List<String> currentList, int start) {
        if (start == nums.length()) {
            if(!res.contains(currentList))
            res.add(new ArrayList<>(currentList));
           return;
        }

        for (int end = start + 1; end <= nums.length(); end++) {
            String substring = nums.substring(start, end);
            currentList.add(substring);
            helper(nums, res, currentList, end);
            currentList.remove(currentList.size() - 1);
        }
    }

//    public static void helper(String nums, List<List<String>> res, List<String> arr, int start) {
//        if (start == nums.length()) {
//            res.add(new ArrayList<>(arr));
//            return;
//        }
//
//        for (int j = start + 1; j <= nums.length(); j++) {
//            if (!arr.contains(nums.substring(start, j))) {
//                arr.add(nums.substring(start, j));
//                helper(nums, res, arr, j);
//                arr.remove(arr.size() - 1);
//            }
//        }
//    }
}
