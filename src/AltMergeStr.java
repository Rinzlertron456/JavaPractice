import Organization.Manager;

public class AltMergeStr {
    public static void main(String[] args) {
        //String Method
//        String word1 = "ab", word2 = "pqrs", res = "";
//        int len = word1.length() + word2.length(), k=0, l=0;
//        for (int i = 0; i < len; i++) {
//            System.out.println(i);
//            if(i%2==0) {
//                if(k<word1.length()) {
//                    res+= word1.charAt(k);
//                    k+=1;
//                }
//                else{
//                    res+=word2.charAt(l);
//                    l+=1;
//                }
//            }
//            else {
//                if(l<word2.length()){
//                    res+=word2.charAt(l);
//                    l+=1;
//                }
//                else{
//                    res+= word1.charAt(k);
//                    k+=1;
//                }
//            }
//        }
        //StringBuilder Method
        String word1 = "ab", word2 = "pqrs";
        int l1 = word1.length(), l2 = word2.length();
        int len = Math.max(l1,l2);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if(i<l1){
                res.append(word1.charAt(i));
            }
            if(i<l2){
                res.append(word2.charAt(i));
            }
//            for (int j = 0; j < l1; j++) {
//                if(i%2==0) res.append(word1.charAt(j));
//            }
//            for (int k = 0; k < l2; k++) {
//                if(i%2!=0) res.append(word2.charAt(k));
//            }
        }
        System.out.println(res);
    }
}
