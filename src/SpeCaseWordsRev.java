public class SpeCaseWordsRev {
    public static void main(String[] args){
        String line="Wipro Technologies, Bangalore";
        int option=1;
        String[] words=line.split(" ");
        for (int i=0;i<words.length;i++) {
            String rev="";
            String word=words[i];
            int k=0;
            for (int j = word.length()-1; j >=0; j--) {
                char ch=word.charAt(j);
                if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                    if(option==0){
                        rev+=ch;
                    }
                    if(option==1){
                        if(Character.isUpperCase(word.charAt(k))) rev+=Character.toUpperCase(ch);
                        if(Character.isLowerCase(word.charAt(k))) rev+=Character.toLowerCase(ch);
                        else rev+=ch;
                    }
                }
                else rev+=ch;
                k++;
//                if(j%2!=0){
//                    if(ch>='a'&&ch<='z'){
//                        if(ch+2>='z') rev+='z';
//                        else rev+=(char)(ch+2);
//                    }
//                    else if(ch>='A'&&ch<='Z'){
//                        if(ch+2>='Z') rev+='Z';
//                        else rev+=(char)(ch+2);
//                    }
//                }
            }
            words[i]=rev;
        }
        for (String word:words) {
            System.out.print(word+" ");
        }
    }
}
