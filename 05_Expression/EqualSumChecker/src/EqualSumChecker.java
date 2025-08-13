public class EqualSumChecker {
    public static void main(String[] args) {
        boolean A = hasEqualSumSol(1, 1,2);
        boolean B = hasEqualSumSol(2, 1,4);
        System.out.println(" " + A + " " + B);
    }

    public static boolean hasEqualSum(int first, int second, int sum) {
       if (first + second == sum) {
           return true;
       } else {
           return false;
       }
    }

    // Solution
    public static boolean hasEqualSumSol(int a, int b, int c) {
        return (a + b) == c;
    }
}
