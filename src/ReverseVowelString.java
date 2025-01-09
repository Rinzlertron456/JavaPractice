import java.util.ArrayList;
import java.util.HashMap;

public class ReverseVowelString {
    public static void main(String[] args) {
        String s="c#dc";
        //Optimised Approach
        String vowels = "aeiouAEIOU";
        boolean alpha = true;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))) alpha=false;
            else alpha=true;
        }
        if(alpha==false) System.out.println(s);
        char[] letters = s.toCharArray();
        int left = 0, right = s.length()-1;
        if(s.length()==2&&vowels.contains(letters[left]+"")&&vowels.contains(letters[right]+"")) {
            char temp = '\0';
            temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;
        }
        while(left<(s.length()-1)/2){
            while(!vowels.contains(letters[left]+"")) left++;
            while(!vowels.contains(letters[right]+"")) right--;
            if(vowels.contains(letters[left]+"")&&vowels.contains(letters[right]+"")){
                char temp = '\0';
                temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
            }
            System.out.println("left: "+left);
            System.out.println("right: "+right);
            System.out.println("Left element: "+letters[left]);
            System.out.println("Right Element: "+letters[right]);
            if(left<s.length()) left++;
            if(right<s.length())right--;
        }
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
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}
