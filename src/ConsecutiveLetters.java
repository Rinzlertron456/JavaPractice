import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConsecutiveLetters {
    public static void main(String[] args) {
        String input1 = "xxxtxxx";//, res = "";
//        HashMap<Character,Integer> map=new HashMap<>();
//        for(int i=0;i<input1.length();i++){
//            char ch=input1.charAt(i);
//            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
//            else map.put(ch,1);
//        }
//        for(Map.Entry<Character,Integer> entry:map.entrySet()){
//            System.out.print(entry.getKey()+" "+entry.getValue());
//            System.out.print("\n");
//        }
//        for(int i=0;i<4;i++){
//            char ch=input1.charAt(i);
//            String res1="";
//
//        }
//        System.out.print(res);
        ArrayList<Character> al = new ArrayList<>();
        int[] arr = new int[26];
        for(int i=0;i<input1.length();i++)
        {
            al.add(input1.charAt(i));
            arr[input1.charAt(i)-'a']++;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]>=3) {
                char remove = (char) (i + 'a');
                al.remove(al.lastIndexOf(remove));
            }
        }
//        System.out.println(al);
        String result="";
        for(int i=0;i<al.size();i++)
        {
            result = result + al.get(i);
        }
        System.out.println(result);
    }
}
