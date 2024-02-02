import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String S="gfg",nondup="";
        ArrayList<Character> chars=new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            char ch=S.charAt(i);
            if(!chars.contains(ch)) chars.add(ch);
        }
        for (char ch:chars) {
            nondup+=ch;
        }
        System.out.println(nondup);
    }
}
