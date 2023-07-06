public class EvenOddZeroes {
    public static void main(String[] args){
        String sign="";
        int input1=16338;
        int temp=input1;
        if(input1<0){
            sign+="n";
            input1*=-1;
        }
        else if(input1==0) System.out.print("pz");
        else sign+="p";
        String r="",res="";
        while(input1>0){
            int rem=input1%10;
            if(rem==0) r+="z";
            else if(rem%2==0) r+="e";
            else r+="o";
            input1/=10;
        }
        for(int i=r.length()-1;i>=0;i--){
            res+=r.charAt(i);
        }
        System.out.print(sign+res);
    }
}
