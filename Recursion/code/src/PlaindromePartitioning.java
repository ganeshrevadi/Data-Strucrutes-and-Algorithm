import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaindromePartitioning {
    public static void main(String[] args) {
        String arr = "bbbbbbbbbbbbbbbb";
        System.out.println(permute(arr));
    }

    public static List<List<String>> permute(String arr) {
        List<List<String>> res = new ArrayList<>();
        helper(arr, res, new ArrayList<>(),0);
        return res;
    }

    public static void helper(String nums, List<List<String>> res, List<String> currentList, int start) {
        if (start == nums.length()) {
            if(!res.contains(currentList) && help(currentList))
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
//
//        if (arr.size() == nums.length()) {
//            Collections.sort(arr);
//            if (help(arr)) {
//                res.add(new ArrayList<>(arr));
//            }
//            return;
//        }
//
//        for (int i = start + 1; i <= nums.length(); i++) {
//                if (!arr.contains(nums.substring(start, i))) {
//                    arr.add(nums.substring(start, i));
//                    helper(nums, res, arr,i);
//                    arr.remove(arr.size() - 1);
//                }
//        }
//    }

    public static boolean help(List<String> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if(!isPalindrome(nums.get(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}