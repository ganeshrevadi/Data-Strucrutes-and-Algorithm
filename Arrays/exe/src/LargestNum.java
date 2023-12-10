import java.util.Arrays;

public class LargestNum {
    public static void main(String[] args) {
        int[] a = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(a));
    }

    public static  String largestNumber(final int[] A) {
        int[] array = separateDigits(A);
        String[] sarr = new String[array.length];
        // convent the array to a String array
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = Integer.toString (array[i]);
        }
        // sort the String array (descending lexicographical order)
        Arrays.sort (sarr);
        // assign the sorted String array back to the input int array in reverse order
        for (int i = 0; i < sarr.length; i++) {
            array[i] = Integer.parseInt (sarr[sarr.length-1-i]);
        }

        String s = new String();
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        return s;
    }

    private static int[] separateDigits(int[] originalArray) {
        // Calculate the total number of digits in the original array
        int totalDigits = 0;
        for (int num : originalArray) {
            totalDigits += String.valueOf(Math.abs(num)).length();
        }

        // Create a new array to store individual digits
        int[] singleDigitArray = new int[totalDigits];

        // Index to keep track of the current position in the new array
        int currentIndex = 0;

        // Separate digits and populate the new array
        for (int num : originalArray) {
            int absNum = Math.abs(num);

            while (absNum > 0) {
                // Separate the last digit and add it to the new array
                singleDigitArray[currentIndex] = absNum % 10;
                absNum /= 10;

                // Move to the next position in the new array
                currentIndex++;
            }
        }

        return singleDigitArray;
    }
//    private static int[] convertToSingleDigit(int[] originalArray) {
//        int[] singleDigitArray = new int[originalArray.length];
//
//        for (int i = 0; i < originalArray.length; i++) {
//            // Convert each element to a single digit
//            singleDigitArray[i] = sumOfDigits(originalArray[i]);
//        }
//
//        return singleDigitArray;
//    }
//
//    private static int sumOfDigits(int number) {
//        int sum = 0;
//
//        // Calculate the sum of digits
//        while (number != 0) {
//            sum += number % 10; // Add the last digit to the sum
//            number /= 10;       // Move to the next digit
//        }
//
//        // Ensure the result is a single digit
//        while (sum >= 10) {
//            sum = sumOfDigits(sum);
//        }
//
//        return sum;
//    }
}
