public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(-20));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(470));
        System.out.println(getDurationString(6894));
        System.out.println(getDurationString(-20, 40));
        System.out.println(getDurationString(0, 71));
        System.out.println(getDurationString(0, 51));
        System.out.println(getDurationString(50, 87));
        System.out.println(getDurationString(50, 60));
        System.out.println(getDurationString(3600, 23));
        System.out.println(getDurationString(234, 34));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds
                    + "), must be a positive integer value";
        }

        int secondsToMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(secondsToMinutes, remainingSeconds);
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes
                    + "), must me a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds
                    + "), must be between 0 and 59";
        }

        int minutesToHours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String result = minutesToHours + "h " + remainingMinutes + "m " + seconds + "s";

        return result;
    }
}
