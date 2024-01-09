import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        int N=10,k=N-1;
        String line="11 4 37 80 3 32 24 1 23 81";
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=Integer.parseInt(line.split(" ")[i]);
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(k);
            k--;
        }
        System.out.println("\n");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
