import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Male's Algorithm
//        int[] input = { 1, 2, 3, 4, 5, 6 };
//        int[] reverseArray = reverse(input);
//        System.out.println(Arrays.toString(reverseArray));

        // Solution algorithm
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

//        reverseSolution(returnedArray);
//        System.out.println("Final: " + Arrays.toString(returnedArray));
        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("After reverse " + Arrays.toString(returnedArray));
        System.out.println("reverseCopy " + Arrays.toString(reversedCopy));
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");

        int[] values = new int[splits.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.valueOf(splits[i].trim());
        }

        return values;
    }

    // Male's Algorithm
    static int[] reverse(int[] array) {

        int temp = 0;
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
        return array;
    }

    // Solution
    private static void reverseSolution(int[] array) {

        int maxIndex = array.length - 1;
        int halfIndex = maxIndex / 2;

        for (int i = 0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("---> " + Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }

        return reversedArray;
    }
}
