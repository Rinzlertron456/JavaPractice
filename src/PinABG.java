import java.util.Arrays;

public class PinABG {
    public static void main(String[] args){
        StringBuilder res=new StringBuilder();
        int input1=190,input2=267,input3=853,k=0;
        int[] nums={input1,input2,input3};
        int[] digits=new int[9];
        int[] unit=new int[3];
        int[] ten=new int[3];
        int[] hundred=new int[3];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(num>0){
                digits[k]=num%10;
                num/=10;
                k++;
            }
        }
        for(int i=0;i<digits.length;i++){
            System.out.print(digits[i]+" ");
        }
        int l=0;
        for(int i=0;i<unit.length;i++){
            unit[i]=digits[l];
            l+=3;
        }
        l=1;
        for(int i=0;i<ten.length;i++){
            ten[i]=digits[l];
            l+=3;
        }
        l=2;
        for(int i=0;i<hundred.length;i++){
            hundred[i]=digits[l];
            l+=3;
        }
        Arrays.sort(digits);
        res.append(digits[digits.length-1]);
        Arrays.sort(hundred);
        res.append(hundred[0]);
        Arrays.sort(ten);
        res.append(ten[0]);
        Arrays.sort(unit);
        res.append(unit[0]);
        System.out.print("\n"+Integer.parseInt(res.toString()));
    }
}
