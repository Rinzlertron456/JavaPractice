public class IsPalPossible {
    public static void main(String[] args){
        int input1=33322333;
        int temp=input1,count=0;
        int c2=0,c1=0;
        int[] freq=new int[10];
        while(temp>0){
            count++;
            freq[input1%10]++;
            temp/=10;
        }
        for(int i=0;i<freq.length;i++){
            if(count%2==0&&freq[i]%2!=0){
                   break;
            }
            if(i== freq.length-1) System.out.print(1);
            else System.out.print(2);
//            if(count%2!=0){
//                if()
//            }
        }
//        if(count%2==0){
//            if(c2==1&&c1==1) System.out.print(2);
//            else System.out.print(1);
//        }
//        else{
//            if(c2%2==0&&c1==1) System.out.print(2);
//            else System.out.print(1);
//        }
//        System.out.println(c2+" "+c1);
//        if(count%2!=0){
//            if(c2%2==0&&c1==1) System.out.println(2);
//            else System.out.print(1);
//        }
//        else{
//            if(c2%2==0&&c1==0) System.out.println(2);
//            else System.out.print(1);
//        }
        //Alternate Solution
//        int odd=0;
//        for(int i=0;i<freq.length;i++){
//            if(freq[i]==1) odd++;
//            if(odd>1) System.out.print(1);
//        }
//        System.out.print(2);
    }
}
