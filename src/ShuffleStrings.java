import java.util.HashMap;
import java.util.Map;

public class ShuffleStrings {
    public static void main(String[] args){
        String s="codeleet";
        String res="";
        int[] indices={4,5,6,7,0,2,1,3};
        char[] chars=new char[s.length()];
        for(int i=0;i<s.length();i++){
            chars[indices[i]]=s.charAt(i);
        }
        for(char ch:chars){
            res+=ch;
        }
        System.out.println(res);
    }
}
