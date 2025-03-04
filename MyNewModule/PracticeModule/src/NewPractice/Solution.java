package NewPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        maxCharIndex("aabbbcccc");

    }

    public static int maxCharIndex(String str) {
        if (str == null || str.trim().isEmpty()) {
            return -1;
        }

        HashMap<Character, Integer> mapCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            mapCount.put(c, mapCount.getOrDefault(c, 0) +1);
        }

        int maxFreq = 0;

        for (Map.Entry<Character, Integer> entry : mapCount.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }

        for (int i =0; i < str.length(); i++) {
            if (mapCount.get(str.charAt(i)) == maxFreq) {
                return i;
            }
        }

        return maxFreq;
    }
}
