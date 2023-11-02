import java.util.ArrayList;

public class StrAlphaRevCharRetain {
    public static void main(String[] args){
        String sentence="H1i! Hello!! How are You?";
        String[] words=sentence.split(" ");
        for (String word:words) {
            System.out.println(word);
        }
        for(int i=0;i<words.length;i++) {
            String word=words[i],rev="";
            StringBuilder r=new StringBuilder();
            ArrayList<Character> chararr=new ArrayList<>();
            for (int j = word.length()-1; j >=0; j--) {
                char ch=word.charAt(j);
                if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) r.append(ch);
            }
            for (int j = 0; j < word.length(); j++) {
                char ch=word.charAt(j);
                if(!((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))) r.insert(j,ch);
            }
            words[i]=r.toString();
        }
        System.out.println("Reversed words");
        for (String word:words) {
            System.out.println(word);
        }
    }
}
