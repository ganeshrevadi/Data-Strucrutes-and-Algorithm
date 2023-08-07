public class lengthOfLastWord {
    public static void main(String[] args) {
        String str= "   fly me   to   the moon  ";
        String[] words = str.split(" ");
        System.out.println(words[words.length - 1].length());
    }
}