public class DecimalComparator {
    public static void main(String[] args) {

        boolean A = areEqualByThreeDecimalPlacesSol(-3.1756, -3.175);
        boolean B = areEqualByThreeDecimalPlacesSol(3.175, 3.176);
        boolean C = areEqualByThreeDecimalPlacesSol(3.0, 3.0);
        boolean D = areEqualByThreeDecimalPlacesSol(-3.123, 3.123);
        System.out.println(" " + A + " " + B +" " + C +" " + D );
    }

    // Solution
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int firstInt = (int) (first * 1000);
        int secondInt = (int) (second * 1000);
        if (firstInt == secondInt) {
            return true;
        } else {
            return false;
        }
    }

    // Solution
    public static boolean areEqualByThreeDecimalPlacesSol(double first, double second) {
        long firstRounded = (int) (first * 1000);
        long secondRounded = (int) (second * 1000);
        return firstRounded == secondRounded;

    }
}
