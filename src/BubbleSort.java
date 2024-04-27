public class BubbleSort {
    public static void main(String[] args) {
        int N = 7;
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
