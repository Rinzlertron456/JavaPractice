import java.util.ArrayList;
import java.util.HashMap;

public class ReverseVowelString {
    public static void main(String[] args) {
        String s = "IceCreAm";
        char[] letters = s.toCharArray();
        ArrayList<Character> vowels= new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                    || letter == 'A' ||letter == 'E' ||letter == 'I' ||letter == 'O' ||letter == 'U') {
                vowels.add(letters[i]);
            }
        }
        int k = vowels.size()-1;
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                    || letter == 'A' ||letter == 'E' ||letter == 'I' ||letter == 'O' ||letter == 'U') {
                letters[i] = vowels.get(k);
                k--;
            }
        }

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}
