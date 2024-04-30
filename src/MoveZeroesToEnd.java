import java.util.ArrayList;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int n=6;
        int[] a={1,2,0,0,2,3};
        int[] res=new int[n];
        int k=0;
        for (int i = 0; i < n; i++) {
            if(a[i]!=0) {
                res[k]=a[i];
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
