import java.util.ArrayList;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] words = {"apple", "ape", "april" };
        String prefix="";
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            min=Math.min(min,words[i].length());
        }
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()==min) prefix=words[i];
        }
        boolean check=false;
        ArrayList<String> compwords=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(!(words[i].equals(prefix))) compwords.add(words[i]);
        }
        while(!check){
            for (String word:compwords) {
                if(!(word.contains(prefix))) prefix=prefix.substring(0,prefix.length()-1);
                else check=true;
            }
        }
        System.out.println(prefix);
    }
}
