import java.util.ArrayList;

public class StepNum {
    public static void main(String[] args){
        int input1=1234347,temp=input1;
        if(input1<10) {
            System.out.print(input1 + "-false");
        }
        else{
            int diff=input1%10,d=0;
            input1/=10;
            while(input1>0){
                System.out.print("input1= "+input1+"\n");
                int rem=input1%10;
                d=rem-diff;
                System.out.print("d= "+d+"\n");
                if(d==1||d==-1){
                    diff=rem;
                    input1/=10;
                }
                else break;
            }
            if(d==1||d==-1) System.out.print(temp+"-true");
            else System.out.print(temp+"-false");
        }
//        int diff=input1%10,d=0;
//        String res="-true";
//        if(input1<9){
//            System.out.print("false"+"\n");
//        }
//        input1/=10;
//        System.out.print(input1+"\n");
//        while(input1>0){
//            int rem=input1%10;
//            System.out.print("rem= "+rem+"\n");
//            System.out.print("diff= "+diff+"\n");
//            d=rem-diff;
//            System.out.print("d= "+d+"\n");
//            if(d!=1||d!=-1){
//                break;
//            }
//            diff=rem;
//            input1/=10;
//        }
//        System.out.print(temp+res);
//        int input1=67898,diff=0,temp=input1;
//        int count=0;
//        while(temp>0){
//            count++;
//            input1/=10;
//        }
//        int[] digits=new int[count];
//        if(input1<10) System.out.print(false);
//        for(int i=0;i<count;i++){
//            digits[i]=input1%10;
//            input1/=10;
//        }
//        boolean check=false;
//        for(int i=0;i<digits.length-1;i++){
//            if(digits[i]-digits[i+1]==1||digits[i]-digits[i+1]==-1){
//                check=true;
//            }
//        }
//        if(digits[digits.length-1]-digits[digits.length-2]==1||digits[digits.length-1]-digits[digits.length-2]==-1){
//            check=true;
//        }
//        if(check==true) System.out.print(input1+"-"+check);
//        else System.out.print(input1+"-"+check);
//        System.out.print("hi");
//        String s=""+input1;
//        for(int i=0;i<s.length()-1;i++){
//            if(Character.getNumericValue(s.charAt(i))-Character.getNumericValue(s.charAt(i+1))!=1&&Character.getNumericValue(s.charAt(i))-Character.getNumericValue(s.charAt(i+1))!=-1){
//                break;
//            }
//            if(i==s.length()-2){
//                res=1;
//            }
//        }
//        if(res==1){
//            System.out.print(input1+":is a step number");
//        }
//        else{
//            System.out.print(input1+":is not a step number");
//        }
        //System.out.print(input1%100/10);
//
//        int input1=67898,temp=input1/10,count=0;
//        if(input1<9){
//            System.out.print("false");
//        }
//        int res=input1;
//        int diff=0,d=0;
//        int rem=input1%10;
//        d=rem-diff;
//        diff=rem;
//        input1/=10;
//        while(temp>0){
//            count++;
//            temp/=10;
//        }
//        System.out.print("count= "+count+"\n");
//        System.out.print("input1= "+input1+"\n");
//        while(input1>0){
//            System.out.print("input1= "+input1+"\n");
//            System.out.print("diff= "+diff+"\n");
//            System.out.print("d= "+d+"\n");
//            rem=input1%10;
//            d=rem-diff;
//            System.out.print("diff= "+diff+"\n");
//            System.out.print("rem= "+rem+"\n");
//            System.out.print("d= "+d+"\n");
//            if(d!=1||d!=-1){
////                System.out.print(input1+"-false"+"\n");
//                break;
//            }
//            else{
//                input1/=10;
//                diff=rem;
//                count--;
//                System.out.print("diff: "+diff+"\n");
//                System.out.print("d= "+d+"\n");
//            }
//        }
//        System.out.print("Final Diff: "+diff+"\n");
//        System.out.print("d= "+d+"\n");
//        if(d==1||d==-1) System.out.print(res+"-true"+"\n");
//        else System.out.print(input1+"-false"+"\n");


//        int n = 45689,count=0,l=0,c1=0;
//        int arr[] = new int[String.valueOf(n).length()];
//        for(int i=0;i<arr.length;i++)
//        {
//            arr[l] = n%10;
//            System.out.print(arr[l]+" ");
//            n=n/10;
//            l++;
//            c1++;
//
//        }
//        if(n>10) {
//
//
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] - arr[j + 1] == 1 || arr[j] - arr[j + 1] == -1) {
//                    System.out.print(arr[j]);
//                    count++;
//                }
//                if (j == arr.length - 2) {
//
//                    if (arr[arr.length - 1] - arr[arr.length - 2] == 1 || arr[arr.length - 1] - arr[arr.length - 2] == -1) {
//                        count++;
//                    }
//                }
//            }
//            System.out.println();
//            System.out.print(count);
//            if (count == c1) {
//                System.out.print("step number");
//            } else {
//                System.out.print("not step number");
//            }
//        }
//        else {
//            System.out.print("not step number");
//        }
    }
}
