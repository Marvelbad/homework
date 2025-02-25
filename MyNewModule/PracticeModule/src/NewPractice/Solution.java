package NewPractice;

public class Solution {
    public static void main(String[] args) throws Exception {

        System.out.println(getWordsReverseInColumn("Hello my nice world"));
    }

    public static String getWordsReverseInColumn(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Wrong string");
        }

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder builder = new StringBuilder(word);
            result.append(builder.reverse().toString()).append("\n");
        }
        return result.toString().trim();
    }

}
