package NewPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        maxCharIndex("aabbbcccc");
    }

    public static int maxCharIndex(String str) {
        if (str ==null || str.trim().isEmpty()) {
            return -1;
        }

        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) +1);
        }
    }
}
