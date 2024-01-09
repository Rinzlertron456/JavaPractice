import java.util.ArrayList;
import java.util.Collections;

public class FindKthElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int[] a1={1,4,7,10};
        int[] a2={2,5,6};
        for (int i = 0; i < a1.length; i++) {
            arr1.add(a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            arr2.add(a2[i]);
        }
        int l1=arr1.size(),l2=arr2.size(),k=4;
        arr1.addAll(arr2);
        Collections.sort(arr1);
        System.out.println(arr1.get(k-1));
    }
}
