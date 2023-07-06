public class RemoveVowelString {
    public static void main(String[] args){
        String S="what is your name ?";
        String res="";
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) res+=ch;
            }
            else res+=ch;

        }
        System.out.print(res);
    }
}
