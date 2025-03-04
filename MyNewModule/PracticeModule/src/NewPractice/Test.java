package NewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        maxCharIndex("aabbbcccc");
    }

    public static int maxCharIndex(String str) {
        if (str == null || str.trim().isEmpty()) {
            return -1;
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) +1);
        }

        int maxFreq = 0;
        for (int freq : freqMap.values())
            if (freq > maxFreq) {
                maxFreq = freq;
            }

        for (int i =0; i < )

        return -1;
    }
}
