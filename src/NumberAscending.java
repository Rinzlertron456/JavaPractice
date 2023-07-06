import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberAscending {
    public static void main(String[] args){
        String s = "hello world 5 x 5";
        ArrayList<Integer> arr=new ArrayList<>();
        String[] words=s.split(" ");
        for(String word:words){
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                int num=0;
                if(ch>='0'&&ch<='9'){
                    num=Integer.parseInt(word);
                    arr.add(num);
                    break;
                }
            }
        }
        System.out.println(arr);
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)==arr.get(i+1)) System.out.println(false);
        }
        int[] comparr=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            comparr[i]=arr.get(i);
        }
        Arrays.sort(comparr);
        boolean check=true;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=comparr[i]){
                check=false;
            }
        }
        System.out.println(check);
    }
}
