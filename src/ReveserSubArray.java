import java.util.ArrayList;

public class ReveserSubArray {
    public static void main(String[] args) {
        int m=3,N=9,sublen=N-m-1;
        int[] a={10, 4, 5, 2, 3, 6, 1, 3, 6};
        int[] subarr=new int[sublen];
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(a[i]);
        }
        int k=0;
        for (int i = m+1; i < N; i++) {
            subarr[k]=arr.get(i);
            k++;
        }
        for (int i = sublen-1; i >=0; i--) {
            System.out.println(subarr[i]);
            arr.set(m+1,subarr[i]);
            m++;
        }
        System.out.println(arr);
    }
}
