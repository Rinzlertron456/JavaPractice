import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubArrwithSumK {
    public static void main(String[] args) {
        int[] A={10,5,2,7,1,9};
        int N=6, K=15;
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(A);
        int longsum=0;
        for(int num:A){
            longsum+=num;
        }
        if(longsum<K) System.out.println(0);
        for (int i = 0; i < N; i++) {
            list.add(A[i]);
        }
        System.out.println(list);
        while(longsum!=K){
            for(int num:list){
                longsum+=num;
            }
            System.out.println(longsum);
//            if(longsum>K) {
//                list.removeLast();
//                longsum=0;
//            }
        }
        System.out.println(list.size());
    }
}
