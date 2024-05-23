import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeadersArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 0};
        int n = 6;
        ArrayList<Integer> list = new ArrayList<>();
        if(n==0) System.out.println(list);
        else{
            int max=arr[arr.length-1];
            list.add(arr[arr.length-1]);
            for (int i = arr.length-2; i >= 0; i--) {
                if(arr[i]>=max) {
                    list.add(arr[i]);
                    max=arr[i];
                }
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
