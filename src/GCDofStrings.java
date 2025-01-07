import java.util.HashMap;
import java.util.Map;

public class GCDofStrings {
    public static void main(String[] args) {
        String str1="ABCDEF", str2="ABC";
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for (char ch:str1.toCharArray()){
            if(map1.containsKey(ch)) map1.put(ch,map1.get(ch)+1);
            else map1.put(ch,1);
        }
        for (char ch:str2.toCharArray()){
            if(map2.containsKey(ch)) map2.put(ch,map2.get(ch)+1);
            else map2.put(ch,1);
        }
        for (Map.Entry<Character,Integer> entry: map1.entrySet()){
            if(map2.containsKey(entry.getKey()))  sb.append(entry.getKey());
            else sb.setLength(0);
        }
        if(sb.length()==1) System.out.println("");
        else System.out.println(sb.toString());
    }
}
