package NewPractice;

public class Solution {
    public static void main(String[] args) throws Exception {

        stringArray("Hello World and Java");
    }

    public static void stringArray(String word) {
        if (word == null || word.isEmpty() || word.trim().isEmpty()) {
            System.out.println("Wrong string");
            return;
        }
        String[] arr = word.split(" ");
        for (String s : arr) {
            StringBuilder builder = new StringBuilder(s);
            String result = builder.reverse().toString();

            System.out.print(result + " ");
        }
    }
}