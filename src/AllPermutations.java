import java.util.ArrayList;
import java.util.Arrays;
public class AllPermutations {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n=arr.length;
        ArrayList<int[]> list=permute(arr);
        for (int[] x:list){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

    private static ArrayList<int[]> permute(int[] arr) {
        ArrayList<int[]> list=new ArrayList<int[]>();
        int n=arr.length-1;
        permutations(arr,list,0,n);
        return list;
    }

    public static void permutations(int[] arr, ArrayList<int[]> list, int low, int high){
        if(low==high){
            list.add(Arrays.copyOf(arr,arr.length));
            return;
        }
        for(int i=low;i<=high;i++){
            swap(arr,low,i);
            permutations(arr,list,low+1,high);
            swap(arr,low,i);
        }
    }

    private static void swap(int[] arr, int low, int i) {
        int temp=arr[low];
        arr[low]=arr[i];
        arr[i]=temp;
    }
}
