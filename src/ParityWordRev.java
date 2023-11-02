public class ParityWordRev {
    public static void main(String[] args){
        String line="H4i He3llo, How are you?";
        String[] words=line.split(" ");
        for (int i=0;i<words.length;i++) {
            String word=words[i];
            String rev="";
            for (int j = 0; j < word.length(); j++) {
                char ch=word.charAt(j);
                if(word.length()%2!=0){
                    if(j%2!=0){
                        if((ch>='a'&&ch<='z')){
                            if(ch+word.length()>='z') rev+='z';
                            else rev+=(char)(ch+word.length());
                        }
                        else if((ch>='A'&&ch<='Z')){
                            if(ch+word.length()>='Z') rev+='Z';
                            else rev+=(char)(ch+word.length());
                        }
                        else rev+=ch;
                    }
                    else rev+=ch;
                }
                else if(word.length()%2==0){
                    if(j%2==0){
                        if((ch>='a'&&ch<='z')){
                            if(ch+word.length()>='z') rev+='z';
                            else rev+=(char)(ch+word.length());
                        }
                        else if((ch>='A'&&ch<='Z')){
                            if(ch+word.length()>='Z') rev+='Z';
                            else rev+=(char)(ch+word.length());
                        }
                        else rev+=ch;
                    }
                    else rev+=ch;
                }
            }
            StringBuilder r=new StringBuilder();
            for (int j = rev.length()-1; j >= 0; j--) {
                char ch=rev.charAt(j);
                if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) r.append(ch);
            }
            for (int j = 0; j < word.length(); j++) {
                char ch=word.charAt(j);
                if(!((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))) r.insert(j,ch);
            }
//            String rev1="";
//            for (int j = rev.length()-1; j >= 0; j--) {
//                char ch=rev.charAt(j);
//                rev1+=ch;
//            }
            words[i]=r.toString();
        }
        for (String word:words) {
            System.out.print(word+" ");
        }
    }
}
