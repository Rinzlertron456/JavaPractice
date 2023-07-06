public class DecryptStringfromAlphabettoIntegerMapping {
    public static void main(String[] args){
        String s="10#11#12";
        int hash=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                hash++;
            }
        }
        char[] hashes=new char[hash];
        int k=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                hashes[k]=ch;
                k++;
            }
        }
        for(char ch:hashes){
            System.out.println(ch);
        }
        String[] numbers=new String[hash];
//        numbers[0]=s.substring(0,s.indexOf("#"));
//        System.out.println(numbers[0]);
        for(int i=0;i<hash-1;i++){
            if(i%2==0) numbers[i]=s.substring(i,s.indexOf(hashes[i]));
            else if(i%2!=0) numbers[i]=s.substring(s.indexOf(hashes[i])+1,s.lastIndexOf(hashes[i]));
        }
        for(String num:numbers){
            System.out.println(num);
        }
    }
}
