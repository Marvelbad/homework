package NewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        maxCharIndex("aabbbcccc");
    }

    public static int maxCharIndex(String str) {
        if (str == null || str.trim().isEmpty()) {
            return -1;
        }

        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long maxFrequency = charCount.values().stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0L);

        return IntStream.range(0, str.length())
                .filter(i -> charCount.get(str.charAt(i)) == maxFrequency)
                        .findFirst()
                        .orElse(-1);
    }
}
