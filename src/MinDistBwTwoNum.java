import java.util.ArrayList;

public class MinDistBwTwoNum {
    public static void main(String[] args) {
        int[] a={1,2,3,2};
        int n=4,x=1,y=2,left=0,right=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }
        left=list.indexOf(x);
        right=list.indexOf(y);
        System.out.println(left+" "+right);
    }
}
