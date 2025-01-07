import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        HashMap<Character,Integer> letters = new HashMap<>();
        String s = "";
        for (char letter: chars){
            if(letters.containsKey(letter)) letters.put(letter,letters.get(letter)+1);
            else letters.put(letter,1);
        }
        System.out.println(letters);
        for (Map.Entry<Character,Integer> entry:letters.entrySet()){
            if(entry.getValue()==1) s+=entry.getKey();
            else{
                s+=entry.getKey();
                s+=entry.getValue();
            }
        }
        char[] res = new char[s.length()];
        for (int i = 0; i < res.length; i++) {
            res[i]=s.charAt(i);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
