import java.util.*;

public class RomanToInteger {
    public static void main(String[] args){
        HashMap<String,Integer> RomanValues=new HashMap<>();
        RomanValues.put("I",1);
        RomanValues.put("II",2);
        RomanValues.put("III",3);
        RomanValues.put("IV",4);
        RomanValues.put("V",5);
        RomanValues.put("VI",6);
        RomanValues.put("VII",7);
        RomanValues.put("VIII",8);
        RomanValues.put("IX",9);
        RomanValues.put("X",10);
        RomanValues.put("L",50);
        RomanValues.put("C",100);
        RomanValues.put("D",500);
        RomanValues.put("M",1000);
        String input="XVIII";
        int res=0;
        for(Map.Entry<String,Integer> entry:RomanValues.entrySet()){
            if(input.equals(entry.getKey())){
                System.out.print(entry.getValue());
                break;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            for(Map.Entry<String,Integer> entry:RomanValues.entrySet()){
                if((ch+"").equals(entry.getKey())) list.add(entry.getValue());
            }
        }
        System.out.println(list);
        int prev=0;
        for (int num:list) {
            if(res<=num&&res==0){
                res+=num;
                prev=res;
            }
            else if(num<prev&&(num<100)){
                res=res-num;
                prev=num;
            }
            else if(num<prev&&(num>=100)){
                res=res+num;
                prev=num;
            }
            else if(num==prev){
                res=res+num;
                prev=num;
            }
            else if(num>prev&&(num<5)){
                res=num-res;
                prev=num;
            }
            else if(num>prev&&(num>=5)){
                res=num+res;
                prev=num;
            }
            System.out.println(res);
        }
        System.out.println(res);
    }
}
