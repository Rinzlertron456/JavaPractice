import java.sql.Array;
import java.util.*;

public class ReplaceArrElementWithRank {
    public static void main(String[] args) {
        int N=5,k=1;
        int[] a={1, 2, 6, 9, 2};
        ArrayList<Integer> arr=new ArrayList<>();
        for (int num:a) {
            arr.add(num);
        }
        ArrayList<Integer> order=new ArrayList<>(arr);
        Collections.sort(order);
        HashMap<Integer,Integer> ranks=new HashMap<>();
        for (int i = 0; i < N; i++) {
            if(ranks.containsKey(order.get(i))) ranks.put(order.get(i), ranks.get(order.get(i)));
            else{
                ranks.put(order.get(i),k);
                k++;
            }
        }
        for (int i = 0; i < N; i++) {
            arr.set(i, ranks.get(arr.get(i)));
        }
        System.out.println(arr);
    }
}
