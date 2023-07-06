public class repldigwithchar {
    public static void main(String[] args){
        String s="n9b6j9v3h8",res="";
        char prev='\0';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z') {
                res += ch;
                prev=(char)ch;
            }
            if(ch>='0'&&ch<='9'){
                res+=(char)(ch-'0'+prev);
            }
        }
        System.out.println(res);
    }
}
