import java.util.*;

public class RomanToInteger {
    public static void main(String[] args){
        HashMap<Character,Integer> RomanValues=new HashMap<>();
        RomanValues.put('I',1);
        RomanValues.put('V',5);
        RomanValues.put('X',10);
        RomanValues.put('L',50);
        RomanValues.put('C',100);
        RomanValues.put('D',500);
        RomanValues.put('M',1000);
        String input="LVIII";
        char[] roman={'I','V','X','L','C','D','M'};
        int[] values={1,5,10,50,100,500,1000};
        char[] romans=input.toCharArray();
        int res=0, prev=0;
        for (int i = 0; i < romans.length; i++) {
            int curr=0;
            for (int j = 0; j < roman.length; j++) {
                if(romans[i]==roman[j]) {
                    curr=values[j];
                    break;
                }
            }
            if(curr>prev) res+=curr;
            else res-=curr;
            System.out.println(res);
            prev=curr;
        }

//        for(int i=0;i<input.length();i++){
//            if(i<input.length()-1 && RomanValues.get(input.charAt(i)) < RomanValues.get(input.charAt(i+1))){
//                res-=RomanValues.get(input.charAt(i));
//            }
//            else res+=RomanValues.get(input.charAt(i));
//        }
        //Alternate Approach
//        for(Map.Entry<String,Integer> entry:RomanValues.entrySet()){
//            if(input.equals(entry.getKey())){
//                System.out.print(entry.getValue());
//                break;
//            }
//        }
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int i = 0; i < input.length(); i++) {
//            char ch=input.charAt(i);
//            for(Map.Entry<String,Integer> entry:RomanValues.entrySet()){
//                if((ch+"").equals(entry.getKey())) list.add(entry.getValue());
//            }
//        }
//        System.out.println(list);
//        int prev=0;
//        for (int num:list) {
//            if(res<=num&&res==0){
//                res+=num;
//                prev=res;
//            }
//            else if(num<prev&&(num<100)){
//                res=res-num;
//                prev=num;
//            }
//            else if(num<prev&&(num>=100)){
//                res=res+num;
//                prev=num;
//            }
//            else if(num==prev){
//                res=res+num;
//                prev=num;
//            }
//            else if(num>prev&&(num<5)){
//                res=num-res;
//                prev=num;
//            }
//            else if(num>prev&&(num>=5)){
//                res=num+res;
//                prev=num;
//            }
//            System.out.println(res);
//        }
        System.out.println(Math.abs(res));
    }
}
