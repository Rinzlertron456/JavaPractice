import java.util.*;

public class FindTheUnion {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6}, b={2,3,5};
        ArrayList<Integer> list= new ArrayList<>();
        for (int index = 0; index < a.length; index++) {
            if(!list.contains(a[index])) list.add(a[index]);
        }
        for (int index = 0; index < b.length; index++) {
            if(!list.contains(b[index])) list.add(b[index]);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
