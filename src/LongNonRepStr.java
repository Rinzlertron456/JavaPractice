//Problem 7: Longest Substring Without Repeating Characters
//Description
//Write a Java program to find the length of the longest substring without repeating characters.
//Input
//• A string s (1 ≤ length of s ≤ 10^5)
//Output
//• An integer representing the length of the longest substring without repeating characters.
//Example
//Input
//abcabcbb
//Output
//3
//Input
//bbbbb
//Output
//1
//Input
//pwwkew
//Output
//3
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class LongNonRepStr {
    public static void main(String[] args) {
        String s = "nhkyylsi";
        if (s.equals("")) System.out.println(0);
        if (s.contains(" ") || s.length() == 1) System.out.println(1);
        ArrayList<Integer> longnonrep = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            word.append(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (!word.toString().contains(s.charAt(j)+"")) {
                    word.append(s.charAt(j));
                }
                else{
                    longnonrep.add(word.toString().length());
                    break;
                }
            }
            longnonrep.add(word.toString().length());
            word.setLength(0);
        }
        System.out.println(longnonrep);
//        System.out.println(Collections.max(longnonrep));
    }
}