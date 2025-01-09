import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','a','b','b','a','a'};
        String s = chars[0]+"";
        boolean end = false;
        int count = 1;
        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i]==chars[i+1]) count++;
            else {
                if(count!=1) s=s+count+chars[i+1];
                else s=s+chars[i+1];
                count = 1;
            }
        }
        if(count>1) s=s+count;
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]+" ");
        }
        System.out.println(s);
    }
}
