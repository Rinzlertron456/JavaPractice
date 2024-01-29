import java.util.ArrayList;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] words={"dmlrpjyatcoqotxzplqmlptaipczhlikztcofaoaedruyqundkzqatqkkvjrgucineyugnxmsohsgdfmngcpbvamqldyfhgvnfrv", "oioerglunzjvbzxwblooqnuytrnyijuxtibkoogdppzrqyptjeizrezmvnnfyherqidgyjkoyjfrhwkscsrvytivivbgcfxupab", "llclwjcdfpvijodijndriexnmwhbyiplvtxrcbwkqtsaixitn", "lvskkgjujheztaustxtqhklbkvyupnhajbmvhvprfusawmspjlhsvtthouddhlfsmsqwpfpubhuzvmrhaazx"};
        String comp="",prefix="";
        //Solution 1
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            min=Math.min(min,words[i].length());
        }
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()==min) comp=words[i];
        }
        boolean check=false;
//        ArrayList<String> compwords=new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            if(!(words[i].equals(prefix))) compwords.add(words[i]);
//        }
        while(!check){
            int k=0;
            for (String word:words) {
                for (int i=0;i<word.length();i++) {
                    if(!((word.charAt(i)+"")==(comp.charAt(k)+""))){
                        System.out.println("-1");
                        check=false;
                    }
                    else {
                            check=true;
                            prefix+=comp.charAt(k);
                        }
                    k++;
                }
            }
        }
        System.out.println(prefix);
    }
}