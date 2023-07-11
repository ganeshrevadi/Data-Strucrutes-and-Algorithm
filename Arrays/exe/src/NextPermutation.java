import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] array) {
        int n = array.length;

        // Step 1: Find the largest index i such that array[i] < array[i+1]
        int i = n - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }

        // Step 2: Find the largest index j such that array[j] > array[i]
        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && array[j] <= array[i]) {
                j--;
            }

            // Step 3: Swap elements at indices i and j
            swap(array, i, j);
        }

        // Step 4: Reverse the elements after index i
        reverse(array, i + 1);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverse(int[] array, int start) {
        int i = start;
        int j = array.length - 1;

        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2};

        System.out.println("Original array: " + Arrays.toString(array));
        nextPermutation(array);
        System.out.println("Next permutation: " + Arrays.toString(array));
    }
}
