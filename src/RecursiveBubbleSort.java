public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int N = 7;
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        bubblesort(arr,N-1);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubblesort(int[] arr, int n){
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
