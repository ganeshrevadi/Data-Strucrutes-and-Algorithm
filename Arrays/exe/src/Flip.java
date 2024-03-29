import java.util.*;
public class Flip {
    public static void main(String[] args) {
        System.out.println(flip("010"));
    }

    public static ArrayList<Integer> flip(String a) {
        int n = a.length(), flipCount = 0, ansFlipCount = 0;
        int start = 0, end = -1;

        for (int tempStart = 0, tempEnd = 0; tempEnd < n; tempEnd++) {
            if (a.charAt(tempEnd) == '1') flipCount--;
            else flipCount++;

            if (flipCount < 0) {
                flipCount = 0;
                tempStart = tempEnd + 1;
            }

            if (flipCount > ansFlipCount) {
                start = tempStart;
                end = tempEnd;
                ansFlipCount = flipCount;
            }
        }

        if (end == -1) return new ArrayList<Integer>();
        return new ArrayList<Integer>(Arrays.asList(start + 1, end + 1));
    }
}
