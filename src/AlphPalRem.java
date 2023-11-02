public class AlphPalRem {
    public static void main(String[] args){
        String input="geeksforgeeks";
        int[] alpha=new int[26];
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            alpha[ch-'a']++;
        }
        for (int i=0;i< alpha.length;i++) {
            System.out.println((char)(i+'a')+" "+alpha[i]);
        }
        int count=0;
        if(input.length()%2!=0){
            for (int i=0;i< alpha.length;i++) {
                if(alpha[i]==1) count++;
            }
            if(count>1) count--;
        }
        System.out.println(count);
    }
}
