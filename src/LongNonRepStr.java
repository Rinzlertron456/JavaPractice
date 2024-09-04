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
import java.util.HashMap;

public class LongNonRepStr {
    public static void main(String[] args) {
        //Leetcode Solution
        //class Solution {
        //    public int lengthOfLongestSubstring(String s) {
        //        if(s.equals("")) return 0;
        //        if(s.length()==1) return 1;
        //        ArrayList<Integer> list=new ArrayList<>();
        //        String str="";
        //        for (int i = 0; i < s.length(); i++) {
        //            if(str.contains(s.charAt(s.length()-1)+"")) {
        //                list.add(str.length());
        //                break;
        //            }
        //            str+=s.charAt(i);
        //            for (int j = i+1; j < s.length(); j++) {
        //                if(!str.contains(s.charAt(j)+"")) {
        //                    str+=s.charAt(j);
        //                }
        //                else {
        //                    list.add(str.length());
        //                    str="";
        //                    break;
        //                }
        //            }
        //        }
        //        return Collections.max(list);
        //    }
        //}
        String s = "nhkyylsi";
        if (s.equals("")) System.out.println(0);
        if (s.contains(" ") || s.length() == 1) System.out.println(1);
        int longnonrep=0;
        for (int i = 0; i < s.length(); i++) {
            boolean[] visited=new boolean[256];
            for (int j = i; j < s.length(); j++) {
                if (!visited[s.charAt(j)]) {
                    visited[s.charAt(j)]=true;
                    longnonrep=Math.max(longnonrep,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        System.out.println(longnonrep);
    }
}