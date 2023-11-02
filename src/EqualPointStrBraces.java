import java.util.HashMap;
import java.util.Map;

public class EqualPointStrBraces {
    public static void main(String[] args){
        String str = "))";
        String part1="";
        String part2="";
        int mid=0;
        int open1=0,close1=0,open2=0,close2=0;
        part1=str.substring(0,mid);
        part2=str.substring(mid,str.length());
        for (int i = 0; i < part1.length(); i++) {
            char ch=part1.charAt(i);
            if(ch=='(') open1++;
            else if(ch==')') close1++;
        }
        for (int i = 0; i < part2.length(); i++) {
            char ch=part2.charAt(i);
            if(ch=='(') open2++;
            else if(ch==')') close2++;
        }
        if(open1==close2) System.out.println(mid);
        else{
            while(open1!=close2){
                mid++;
                open1=0;
                open2=0;
                close1=0;
                close2=0;
                part1=str.substring(0,mid);
                part2=str.substring(mid,str.length());
                for (int i = 0; i < part1.length(); i++) {
                    char ch=part1.charAt(i);
                    if(ch=='(') open1++;
                    else if(ch==')') close1++;
                }
                for (int i = 0; i < part2.length(); i++) {
                    char ch=part2.charAt(i);
                    if(ch=='(') open2++;
                    else if(ch==')') close2++;
                }
            }
            System.out.println(mid);
        }
    }
}
