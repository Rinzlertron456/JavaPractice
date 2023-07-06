import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostFreqOccuDigit {
    public static void main(String[] args){
        int[] input1={1237,262,666,140};
        int input2=4;
        int[] freq=new int[10];
        for(int i=0;i<input1.length;i++)
        {
            while(input1[i]>0){
                freq[input1[i]%10]++;
                input1[i]/=10;
                System.out.print("input1[i]= "+input1[i]+" ");
            }
            System.out.print("input1[i]= "+input1[i]+" ");
        }
        // Arrays.sort(freq);
        System.out.print("\n");
        for(int i=0;i<freq.length;i++){
            System.out.print(freq[i]+" ");
        }
        int max=0,res=0;
        for(int i=0;i< freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
                res=i;
            }
        }
        System.out.print("res: "+res);
//        int index=0,max=freq[0];
//        for(int i=0;i<freq.length;i++){
//            if(max<freq[i]){
//                max=freq[i];
//                index=i;
//            }
//        }
//        System.out.print("max: "+max+" ");
//        System.out.print(index);
    }
}
