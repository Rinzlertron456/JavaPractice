public class STRINGDISTREPLACE {
    public static void main(String[] main){
        String input1="kangaroos";
        String res="";
        String[] words=input1.split(" ");
        for(String word:words){
            System.out.println(word);
        }
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=0;j<word.length()-1;j++){
                char ch=word.charAt(j);
                char ch1=word.charAt(j+1);
                if(ch>='a'&&ch<='z'&&ch1>='a'&&ch1<='z'){
                    int diff=word.charAt(j)-word.charAt(j+1);
                    res+=ch;
                    if(diff==0) res+=0;
                    else res+=(char)(Math.abs(diff)+'a'-1);
                }
                else res+=ch;
            }
            res+=word.charAt(word.length()-1)+" ";
        }
        System.out.print(res);
    }
}
