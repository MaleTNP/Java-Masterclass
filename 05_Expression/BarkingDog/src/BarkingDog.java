public class BarkingDog {

    public static void main(String[] args) {

        boolean A = shouldWakeUp(true, 1);
        boolean B = shouldWakeUp(false, 2);
        boolean C = shouldWakeUp(true, 8);
        boolean D = shouldWakeUp(true, -1);
        System.out.println(A + ", " + B + ", " + C + ", " + D);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            if (barking) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

//        if (barking) {
//            if (hourOfDay > 23) {
//                return true;
//            } else if (hourOfDay > 22) {
//                return true;
//            } else if (hourOfDay >= 0 && hourOfDay < 8) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
    }
}
