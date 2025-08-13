public class MegaByteConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2047);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long megaBytes = Math.round(kiloBytes / 1024);
        int remainingKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = "
                + megaBytes + " MB and "
                + remainingKiloBytes + " KB");

    }
}
