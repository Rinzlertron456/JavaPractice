import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ReverseVowelString {
    public static void main(String[] args) {
        String s="IceCreAm";
        String res = "";
        //Alternative Approach - 1
//        String vowels = "aeiouAEIOU";
//        char[] letters = s.toCharArray();
//        ArrayList<Character> vowelList = new ArrayList<>();
//        for (int i = 0; i < letters.length; i++) {
//            if(vowels.contains(letters[i]+"")) vowelList.add(letters[i]);
//        }
//        System.out.println(vowelList);
//        int k = vowelList.size()-1;
//        for (int i = 0; i < s.length(); i++) {
//            if(!vowels.contains(s.charAt(i)+"")) res=res+s.charAt(i);
//            else {
//                res = res+vowelList.get(k);
//                k--;
//            }
//        }
        //Alternative Approach - 2
        String vowels = "aeiouAEIOU";
        ArrayList<Character> vowelList = new ArrayList<>();
        int k = vowelList.size()-1;
        for (int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i)+"")) vowelList.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if(!vowels.contains(s.charAt(i)+"")) res=res+s.charAt(i);
            else {
                res = res+vowelList.get(k);
                k--;
            }
        }
        System.out.println(res);
//        for (int i = 0; i < letters.length; i++) {
//            System.out.println(letters[i]);
//        }
        //Conventional Approach
//        ArrayList<Character> vowels= new ArrayList<>();
//        char[] letters = s.toCharArray();
//        int left = 0, right = s.length()-1;
//        for (int i = 0; i < letters.length; i++) {
//            char letter = letters[i];
//            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
//                    || letter == 'A' ||letter == 'E' ||letter == 'I' ||letter == 'O' ||letter == 'U') {
//                vowels.add(letters[i]);
//            }
//        }
//        int k = vowels.size()-1;
//        for (int i = 0; i < letters.length; i++) {
//            char letter = letters[i];
//            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
//                    || letter == 'A' ||letter == 'E' ||letter == 'I' ||letter == 'O' ||letter == 'U') {
//                letters[i] = vowels.get(k);
//                k--;
//            }
//        }
//
//        for (int i = 0; i < letters.length; i++) {
//            System.out.println(letters[i]);
//        }
    }
}
