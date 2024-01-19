import java.util.ArrayList;
import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int ele = sc.nextInt();
            arr.add(ele);
        }
        int first = 0;
        int sec = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                for (int k = 0; k < arr.size(); k++) {
                    if(Math.abs(arr.get(i) - arr.get(k)) + Math.abs(arr.get(k) - arr.get(i)) == Math.abs(arr.get(i) - arr.get(j))){
                        first = i;
                        sec = j;
                        break;
                    }
                }
            }
        }

        System.out.println(first + " " + sec);

    }
}
