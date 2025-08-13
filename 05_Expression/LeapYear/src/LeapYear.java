public class LeapYear {
    public static void main(String[] args) {
        boolean A = isLeapYear(-1600);
        boolean B = isLeapYear(1600);
        boolean C = isLeapYear(2017);
        boolean D = isLeapYear(2000);
        System.out.println("A" + A + B + C + D);
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;   // Cannot divisible by 400, it has 355 days
                    }
                } else {
                    return true;    // Year can divisible by 100 (It has 366 days)
                }
            } else {
                return false;   // Year is not divisible by 4, it has 355 days
            }
        } else {
            return false;       // Year is out of range 1 - 9999
        }
    }
}
