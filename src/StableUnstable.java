import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StableUnstable {
    public static void main(String[] args){
        int input1=12,input2=1313,input3=122,input4=678,input5=898;
        int[] arr={input1,input2,input3,input4,input5};
        int stable=0,unstable=0;
        for(int i=0;i<arr.length;i++){
            int sum1=0;
            boolean check=false;
            int num=arr[i],temp=arr[i];
            int[] freq=new int[10];
            System.out.print("num: "+num);
            System.out.print("\n");
            while(temp>0){
                freq[temp%10]++;
                temp/=10;
            }
            System.out.print("num: "+num);
            System.out.print("\n");
            for(int k=0;k<freq.length;k++){
                System.out.print(freq[k]+" ");
            }
            Arrays.sort(freq);
            ArrayList<Integer> nonzeroes=new ArrayList<Integer>();
            for(int j=0;j<freq.length;j++){
                if(freq[j]>0) nonzeroes.add(freq[j]);
            }
            Collections.sort(nonzeroes);
            if(nonzeroes.get(0)==nonzeroes.get(nonzeroes.size()-1)){
                stable+=num;
            }
            else{
                unstable+=num;
            }
            System.out.print("sum1: "+sum1+" ");
            nonzeroes.clear();
        }

        System.out.print("res: "+(stable-unstable));
    }
}
