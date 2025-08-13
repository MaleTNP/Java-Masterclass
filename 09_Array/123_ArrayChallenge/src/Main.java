import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(7);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] intArray = new int[len];
        for (int i = 0; i < len; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }

//    // Male's algorithm
//    static int[] sortedInteger(int[] data) {
//        int len = data.length;
//        Arrays.sort(data);
//        for (int i = 0; i < len/2; i++) {
//            int tem = data[i];
//            data[i] = data[len - i - 1];
//            data[len - i - 1] = tem;
//        }
//        return data;
//    }

    // Solution
    private static int[] sortIntegers(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----> " + Arrays.toString(sortedArray));
                }
            }
            System.out.println("--> " + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
