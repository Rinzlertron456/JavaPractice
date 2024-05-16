import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrwithSumK {
    public static void main(String[] args) {
        int[] A={10,5,2,7,1,9};
        int N=6, K=15;
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxlen=0, pointer=0, currsum=0;
        while(pointer<N){
            currsum+=A[pointer];
            if(!map.containsKey(currsum)) map.put(currsum,pointer);
            if(currsum==K) maxlen=Math.max(maxlen,pointer+1);
            else if(map.containsKey(currsum-K)) maxlen=Math.max(maxlen,pointer- map.get(currsum-K));
            pointer++;
        }
        //Alternate Approach
//        ArrayList<Integer> list=new ArrayList<>();
//        Arrays.sort(A);
//        int longsum=0;
//        for(int num:A){
//            longsum+=num;
//        }
//        if(longsum<K) System.out.println(0);
//        for (int i = 0; i < N; i++) {
//            list.add(A[i]);
//        }
//        System.out.println(list);
//        while(longsum!=K){
//            for(int num:list){
//                longsum+=num;
//            }
//            System.out.println(longsum);
////            if(longsum>K) {
////                list.removeLast();
////                longsum=0;
////            }
//        }
        System.out.println(maxlen);
    }
}
