public class SelectionSort {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {8, 6, 2, 5, 1};
        for (int i = 0; i < N; i++) {
            int temp=0,minindex=i;
            for (int j = i; j < N; j++) {
                if(arr[minindex]>arr[j]) minindex=j;
            }
            temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
