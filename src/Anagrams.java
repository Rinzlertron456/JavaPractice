import java.util.*;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) {
        String stringA = "RAIL! SAFETY!", stringB = "fairy tales";
        //HashMap Method
//        HashMap<Character,Integer> freqA= new HashMap<>();
//        HashMap<Character,Integer> freqB= new HashMap<>();
//        for (char ch: stringA.toCharArray()){
//           if(ch != ' ') freqA.put(ch,freqA.getOrDefault(ch,0)+1);
//        }
//        for (char ch: stringB.toCharArray()){
//           if(ch != ' ') freqB.put(ch,freqB.getOrDefault(ch,0)+1);
//        }
//        boolean flag = true;
//        for (Map.Entry<Character,Integer> entry:freqA.entrySet()){
//            if(!freqB.containsKey(entry.getKey())|| !Objects.equals(entry.getValue(), freqB.get(entry.getKey()))) {
//                flag = false;
//                break;
//            }
//        }
        //Array Method
//        int[] freqA = new int[26];
//        int[] freqB = new int[26];
//        for (char ch: stringA.toLowerCase().toCharArray()){
//            if(ch>='a'&&ch<='z') freqA[ch-'a']++;
//        }
//        for (char ch: stringB.toLowerCase().toCharArray()){
//            if(ch>='a'&&ch<='z') freqB[ch-'a']++;
//        }
//        boolean flag = true;
//        System.out.println(Arrays.toString(freqA));
//        System.out.println(Arrays.toString(freqB));
//        for (int i = 0; i < 26; i++) {
//            if( !(freqA[i] == freqB[i]) ) {
//                flag = false;
//                break;
//            }
//        }
        //Stream Method - 1
//        Map<Character,Long> freqA = Arrays.stream(stringA.toLowerCase().split(" ")).flatMapToInt(E->E.chars()).mapToObj(T->(char)T).filter(ch->ch>='a'&&ch<='z').collect(Collectors.groupingBy(E->E,LinkedHashMap::new,Collectors.counting()));
//        Map<Character,Long> freqB = Arrays.stream(stringB.toLowerCase().split(" ")).flatMapToInt(E->E.chars()).mapToObj(T->(char)T).filter(ch->ch>='a'&&ch<='z').collect(Collectors.groupingBy(E->E,LinkedHashMap::new,Collectors.counting()));
//        boolean flag = true;
//        for (Map.Entry<Character,Long> entry:freqA.entrySet()){
//            if(!freqB.containsKey(entry.getKey())|| !Objects.equals(entry.getValue(), freqB.get(entry.getKey()))) {
//                flag = false;
//                break;
//            }
//        }
        String strA = stringA.toLowerCase().chars().filter(ch->ch>='a'&&ch<='z').mapToObj(T->(char)T+"").sorted().collect(Collectors.joining(""));
        String strB = stringB.toLowerCase().chars().filter(ch->ch>='a'&&ch<='z').mapToObj(T->(char)T+"").sorted().collect(Collectors.joining(""));
        System.out.println(strA);
        System.out.println(strB);
        System.out.println(strA.equals(strB));
//        System.out.println(freqA);
//        System.out.println(freqB);
//        System.out.println(flag);
    }
}
