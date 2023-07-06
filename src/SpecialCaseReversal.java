public class SpecialCaseReversal {
    public static void main(String[] args){
        String input1="I Am alWays 24#7 Busy.";
        int input2=1;
        String[] words=input1.split(" ");
        String res="";
        if(input2==0){
            for(int i=0;i<words.length;i++){
                String word=words[i];
                String rev="";
                for(int j=word.length()-1;j>=0;j--){
                    rev+=word.charAt(j);
                }
                res+=rev+" ";
            }
            res=res.substring(0,res.length()-1);
        }
        else if(input2==1){
            for(int i=0;i<words.length;i++){
                String word=words[i];
                String rev="",rev1="";
                for(int j=word.length()-1;j>=0;j--){
                    char ch=word.charAt(j);
                    rev+=ch;
                }
                for(int k=0;k<rev.length();k++){
                    char ch=rev.charAt(k);
                    if(Character.isUpperCase(word.charAt(k))){
//                            ch=Character.toUpperCase(ch);
//                            rev.replace(rev.charAt(k), ch);
                        rev1+=Character.toUpperCase(rev.charAt(k));
                    }
                    else if(Character.isLowerCase(word.charAt(k))){
                        rev1+=Character.toLowerCase(rev.charAt(k));

                    }
                    else rev1+=rev.charAt(k);
                }
                res+=rev1+" ";
            }
            res=res.substring(0,res.length()-1);
        }
        System.out.println(res);
    }
}
