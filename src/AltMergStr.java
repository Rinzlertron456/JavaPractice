public class AltMergStr {
    public static void main(String[] args){
        String res="";
        String word1 = "dfe", word2 = "beebda";
        int k=0,l=0;
        for(int i=0;i<(word1.length()+word2.length());i++){
            if(i%2==0&&k<word1.length()){
                res+=word1.charAt(k);
                k++;
            }
            else if(i%2!=0&&l<word2.length()){
                res+=word2.charAt(l);
                l++;
            }
        }
        while(l<word2.length()){
            res+=word2.charAt(l);
            l++;
        }
        while(k<word1.length()){
            res+=word1.charAt(k);
            k++;
        }
        System.out.println(k+" "+l);
        System.out.println(res);
    }
}
