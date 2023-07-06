public class SortSentence {
    public static void main(String[] args){
        String s = "is2 sentence4 This1 a3";
        String[] words=s.split(" ");
        String res="";
        String[] orderwords=new String[words.length];
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int index=word.charAt(word.length()-1)-'0'-1;
            orderwords[index]=word.substring(0,word.length()-1);
            System.out.println(orderwords[index]);
        }
        for(int i=0;i<orderwords.length;i++){
            res+=orderwords[i]+" ";
        }
        System.out.println(res.substring(0,res.length()-1));
    }
}
