package NewPractice;

public class Test {
    public static void main(String[] args) {
        strLength("Hello World", 1, 4);
    }

    public static void strLength(String str, int start, int finish) {
        String subStr = str.substring(1, 5); // "ello"
        StringBuilder builder = new StringBuilder(subStr);
        String reversedStr = builder.reverse().toString();

        String h = str.substring(0, start); // "H"
        String lastPart = str.substring(finish + 1); // " World"

        String finalStr = h + reversedStr + lastPart;

        System.out.println(finalStr);
    }
}
