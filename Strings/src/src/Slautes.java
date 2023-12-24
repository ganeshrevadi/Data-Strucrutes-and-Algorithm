public class Slautes {
    public static void main(String[] args) {
        System.out.println(countSalutes("<>"));
    }

    public static Long countSalutes(String A) {
        Long numRight =(long) 0;
        Long totalSalutes = (long) 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '>') {
                numRight++;
            } else if (A.charAt(i) == '<') {
                // For each '<', add the number of '>' encountered so far to the total salutes
                totalSalutes += numRight;
            }
        }

        return totalSalutes;
    }
}
