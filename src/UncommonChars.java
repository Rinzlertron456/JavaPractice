import java.util.ArrayList;

public class UncommonChars {
    public static void main(String[] args){
        char[] input1={'A','B','C'};
        char[] input2={'B','C'};
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<input1.length;i++){
            for(int j=0;j<input2.length;j++){
                if(input1[i]==input2[j]){
//                    System.out.print(input1[i]+" "+input2[j]+" "+true+"\n");
                    if(list.contains(input1[i])) continue;
                    else list.add(input1[i]);
                }
//                else System.out.print(input1[i]+" "+input2[j]+" "+false+"\n");
            }
        }
        for(int i=0;i<input2.length;i++){
            for(int j=0;j<input1.length;j++){
                if(input2[i]==input1[j]){
//                    System.out.print(input2[i]+" "+input1[j]+" "+true+"\n");
                    if (list.contains(input2[i])) continue;
                    else list.add(input2[i]);
                }
//                else System.out.print(input2[i]+" "+input1[j]+" "+false+"\n");
            }
        }
//        for(char ch:list){
//            System.out.println(ch+" ");
//        }
        int sum=0;
        for(int i=0;i<input1.length;i++){
            if(!list.contains(input1[i])) sum+=input1[i];
        }
        for(int i=0;i<input2.length;i++){
            if(!list.contains(input2[i])) sum+=input2[i];
        }
        while(sum>9){
            int sum1=0;
            while(sum>0){
                sum1+=sum%10;
                sum/=10;
            }
            sum=sum1;
        }
        System.out.println(sum);
//        System.out.println(input1[2]==input2[1]?true:false);
    }
}
