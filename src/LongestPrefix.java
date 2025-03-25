import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPrefix {
    public static void main(String[] args) {
        // Temporary jugaad
//        String[] words={"dmlrpjyatcoqotxzplqmlptaipczhlikztcofaoaedruyqundkzqatqkkvjrgucineyugnxmsohsgdfmngcpbvamqldyfhgvnfrv", "oioerglunzjvbzxwblooqnuytrnyijuxtibkoogdppzrqyptjeizrezmvnnfyherqidgyjkoyjfrhwkscsrvytivivbgcfxupab", "llclwjcdfpvijodijndriexnmwhbyiplvtxrcbwkqtsaixitn", "lvskkgjujheztaustxtqhklbkvyupnhajbmvhvprfusawmspjlhsvtthouddhlfsmsqwpfpubhuzvmrhaazx"};
//        String comp="",prefix="";
//        //Solution 1
//        int min=Integer.MAX_VALUE;
//        for (int i = 0; i < words.length; i++) {
//            min=Math.min(min,words[i].length());
//        }
//        for (int i = 0; i < words.length; i++) {
//            if(words[i].length()==min) comp=words[i];
//        }
//        boolean check=false;
////        ArrayList<String> compwords=new ArrayList<>();
////        for (int i = 0; i < words.length; i++) {
////            if(!(words[i].equals(prefix))) compwords.add(words[i]);
////        }
//        while(!check){
//            int k=0;
//            for (String word:words) {
//                for (int i=0;i<word.length();i++) {
//                    if(!((word.charAt(i)+"")==(comp.charAt(k)+""))){
//                        System.out.println("-1");
//                        check=false;
//                    }
//                    else {
//                            check=true;
//                            prefix+=comp.charAt(k);
//                        }
//                    k++;
//                }
//            }
//        }
//        System.out.println(prefix);
        String[] strs = {"flower", "flow", "flight"};
        String str = "Hello World";
        // Bruteforce Solution
        Arrays.sort(strs);
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)) prefix = prefix + strs[0].charAt(i);
            else break;
        }
        //Optimised solution (In Progress )
//        String prefix = "";
//        Arrays.stream(strs).sorted();
        System.out.println(prefix);
    }
}