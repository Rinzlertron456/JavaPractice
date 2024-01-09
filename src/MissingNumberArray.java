import java.util.ArrayList;

public class MissingNumberArray {
    public static void main(String[] args) {
        int N=10,res=0;
        int[] A={6,1,2,8,3,4,7,10,5};
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < N-1; i++) {
            list.add(A[i]);
        }
        for (int i = 1; i <= N; i++) {
            if(!list.contains(i)) res=i;
        }
        System.out.println(res);
    }
}
