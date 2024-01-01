public class RepeatedStr {
    public static void main(String[] args) {

    }

    public static int repeatedStringMatch(String a, String b) {
        int count = 0;
        StringBuilder s = new StringBuilder();
        while (s.length() < b.length()){
            s.append(a);
            count++;
        }

        if(s.toString().contains(b)) return count;
        if(s.append(a).toString().contains(b)) return ++count;
        return -1;
    }
}
