import java.util.ArrayList;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[accounts.length];
        for(int row=0; row<accounts.length; row++){
            list.add(wealthAcc(accounts[row]));
        }
        int richest=0;
        for(int n:list){
            richest=Math.max(richest,n);
        }
        System.out.println(richest);
    }

    public static int wealthAcc(int[] arr){
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        return sum;
    }
}
