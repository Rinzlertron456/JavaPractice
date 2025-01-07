public class ReverseWordsInString {
    public static void main(String[] args) {
        //String Method
        String s = "a good   example";
//        String res = "";
//        s=s.trim();
//        String[] words = s.replaceAll("\\s+"," ").split(" ");
////        for(String word: words){
////            System.out.println(word+" ");
////        }
//        for (int i = words.length-1; i >= 0; i--) {
//            res+=words[i]+" ";
//        }
        //StringBuilder Method
        StringBuilder res = new StringBuilder();
        s=s.trim();
        String[] words = s.replaceAll("\\s+"," ").split(" ");
        for (int i = words.length-1; i >= 0; i--) {
            res.append(words[i]+" ");
        }
        System.out.println(res.toString().trim());
    }
}
