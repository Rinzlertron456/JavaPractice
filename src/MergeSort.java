import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
         int N = 7;
         int[] arr = {2, 13, 4, 1, 3, 6, 28};
//         int low=0,high=N-1;
//         int mid=(low+high)/2;
        MergeSort.mergesort(arr,0,N-1);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void mergesort(int[] arr, int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low, right=mid+1;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i]=temp.get(i-low);
        }
    }
}
