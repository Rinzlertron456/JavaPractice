// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class JumbleWords {
    public static void main(String[] args) {
        String input1 = "PROJECT BASED LEARNING";
        int input2 = 2;
        String res="";
        String[] words=input1.split(" ");
        switch(input2){
            case 1:
                for(int i=0;i<words.length;i++){
                    String even="",odd="";
                    String word=words[i];
                    for(int j=0;j<word.length();j++){
                        if(j%2==0) even+=word.charAt(j);
                    }
                    for(int j=word.length()-1;j>=0;j--){
                        if(j%2!=0) odd+=word.charAt(j);
                    }
                    res+=even+odd+" ";
                }
                break;
            case 2:
                for(int i=0;i<words.length;i++) {
                    String even = "", odd = "";
                    String word = words[i];
                    for (int j = 0; j < word.length(); j++) {
                        if (j % 2 == 0) even += word.charAt(j);
                        else odd += word.charAt(j);
                    }
                    res += even + odd + " ";
                }
                break;
        }
        System.out.println(res.substring(0,res.length()-1));
    }
}