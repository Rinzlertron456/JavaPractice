public class PowSum {
    public static void main(String[] args){
//        int[] digits={9,0,1,2,8,5};
        int input1=582109;
        int count=0,temp=input1,sum=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int[] digits=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=input1%10;
            input1/=10;
        }
        for(int i=digits.length-1;i>=0;i--){
            System.out.print(digits[i]+" ");
        }
        int j=digits.length-1;
        while(count>1){
            System.out.print("\n"+digits[j-1]+" ");
            sum+=Math.pow(digits[j],digits[j-1]);
            j--;
            count--;
        }
        System.out.println(sum+1);
    }
}
