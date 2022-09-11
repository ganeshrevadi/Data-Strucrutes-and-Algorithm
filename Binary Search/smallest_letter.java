public class smallest_letter {
    public static void main(String[] args) {
        char[] letters ={'c','i','j'};
        char target = 'k';
        char ans  = nextGreatestletter(letters,target);
        System.out.println(ans);

    }

    static char nextGreatestletter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while(start<=end){

            int mid = (start+end)/2;
            if(letters[mid]>target){
                end = mid -1;

            }
            else if(letters[mid]<target){
                start=mid +1;

            }

        }
        return letters[start % letters.length];
    }
}
