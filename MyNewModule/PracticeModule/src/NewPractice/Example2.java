package NewPractice;

import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        TreeSet<String> text = new TreeSet<String>();

        text.add(".part2");
        text.add(".part1");
        text.add(".part3");
        text.add(".part5");
        text.add(".part4");

        String s = text.first();

        System.out.println(s);
    }
}
