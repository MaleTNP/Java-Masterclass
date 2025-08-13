public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean A = hasTeen(9, 99, 19);
        boolean B = hasTeen(23, 15, 42);
        boolean C = hasTeen(22, 23, 34);
        System.out.println(A + " " + B + " " + C);
    }
    public static boolean hasTeen(int first, int second, int third) {
        return (first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
