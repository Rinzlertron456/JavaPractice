import java.util.ArrayList;

public class TSum {
    public static void main(String[] args){
        int t=0,count=0;
        int input1=1,input2=2,input3=1;
        if(isPrime(input2)){
            if(input2%2==0){
                t=input1*input1*(PrimSum(input2));
            }
            else{
                t=input2*input2*(PrimSum(input3));
            }
        }
        else{
            if(input2%2==0){
                t=input3*input3*(PrimSum(input2+input3));
            }
            else{
                t=PrimSum(input1+input2+input3);
            }
        }
        for(int i=1;i<=t;i++){
            if(t%i==0) count++;
        }
        if(count==2) System.out.println(t+input3);
        else System.out.println(t-input3);
//         ArrayList<Integer> alist = new ArrayList<>();int sum =0;

//         for(int i=0;i<1000;i++){
//             int flag =0;
//             for(int num=i;num>0;num--){
//                 if(i%num==0){
//                     flag++;
//                 }
//             }
//             if(flag==2)alist.add(i);
//         }
//         int kl=0;
// //    --------------------------------

//     if(alist.contains(input2) && input2%2==0){
//         int k = input1*input1;int m =0;
//         for(int i=0;i<input2;i++){
//             m+=alist.get(i);
//         }

//         return k*m;
//     }
//     if(alist.contains(input2) && input2%2!=0){
//         int k = input2*input2;int m =0;
//         for(int i=0;i<input3;i++){
//             m+=alist.get(i);
//         }
//          kl = k*m;
//         if(alist.contains(kl)) return kl+input3;
//         else return kl-input3;
//     }

//     if(!alist.contains(input2) && input2%2==0){
//         int k = input3*input3;int m =0;
//         kl = k*m;
//         for(int i=0;i<input2+input3;i++){
//             m+=alist.get(i);
//         }
//         kl = k*m;
//         if(alist.contains(kl)) return kl+input3;
//         else return kl-input3;
//     }
//     if(!alist.contains(input2) && input2%2!=0){
//         int m=0;
//         for(int i=0;i<input1+input2+input3;i++){
//             m+=alist.get(i);
//         }
//         kl=m;
//         if(alist.contains(kl)) return kl+input3;
//         else return kl-input3;
//     }






// return 0;
        // throw new UnsupportedOperationException("find_tvalue(int input1,int input2,int input3)");
    }
    public static boolean isPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2) return true;
        return false;
    }

    public static int PrimSum(int num){
        int sum=0,y=1;
        for(int i=1;y<=num;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(j%i==0) count++;
            }
            if(count==2){
                sum=i;
                y++;
            }
        }
        return sum;
    }
}
