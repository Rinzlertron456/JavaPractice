public class DigPalRem {
    public static void main(String[] args){
        int input1=981894;
        int temp=input1,sum=0;
        int[] freq=new int[10];
        while(input1!=0){
            int rem=input1%10;
            freq[rem]++;
            sum=(sum%10)+rem;
            input1/=10;
        }
        if(sum==temp) System.out.print(-1);
        int index=-1;
        for(int i=0;i<10;i++){
            if(freq[i]==1) index=i;
        }
        System.out.print(index);
    }
}
