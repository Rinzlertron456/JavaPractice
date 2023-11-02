import java.util.*;
public class CharAlphaNumDetect {
    public static void main(String[] args){
        String word="sdguASGya86387@#$%^&";
        ArrayList<Character> spechararray=new ArrayList<>();
        ArrayList<Integer> numarray=new ArrayList<>();
        ArrayList<String> alphaarray=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='0'&&ch<='9') numarray.add(ch-'0');
            else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) alphaarray.add(ch+"");
            else spechararray.add(ch);
        }
        System.out.println(numarray);
        System.out.println(alphaarray);
        System.out.println(spechararray);
    }
}
