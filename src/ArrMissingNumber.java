import java.util.ArrayList;

public class ArrMissingNumber {
    public static void main(String[] args) {
        int n=5,output,arrsum=0,totalsum=0;
        int[] array={1,2,3,5};
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            arrsum+=array[i];
        }
        totalsum=n*(n+1)/2;
        output=totalsum-arrsum;
        System.out.println(output);
    }
}
