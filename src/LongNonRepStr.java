import java.util.ArrayList;

public class LongNonRepStr {
    public static void main(String[] args) {
        String s = "aab";
        if(s.equals("")) System.out.println(0);
        if(s.contains(" ")||s.length()==1) System.out.println(1);
        ArrayList<Character> list=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(!list.contains(ch)) list.add(ch);
            else i=i+1;
            System.out.println(list);
            i++;
        }
        System.out.println(list.size());
    }
    }
