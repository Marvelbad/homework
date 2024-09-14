import java.util.Arrays;

public class Main {
    private static final String HEX = "0123456789ABCDEF";
    private static final String[] BINARY = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
    };
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9D0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    //Преобразование из 2го в 16ое
     public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        }

        if (!binaryNumber.matches("[01]+")) { // проверка на несоответствие через отрицание (регулярка)
            return "";
        }

        StringBuilder hexResult = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String fourBits = binaryNumber.substring(i, i + 4);
            int index = Arrays.binarySearch(BINARY, fourBits);
            hexResult.append(HEX.charAt(index));
        }
        return hexResult.toString();
    }
    //Преобразование из 16го в 2ое
    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        }

        if (!hexNumber.matches("[0-9A-Fa-f]+")) {
            return "";
        }

        StringBuilder binartResult = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            char hexChar = hexNumber.charAt(i);
            int index = HEX.indexOf(Character.toUpperCase(hexChar));
            binartResult.append(BINARY[index]);
        }
        return binartResult.toString();
    }
}