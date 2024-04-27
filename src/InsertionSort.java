public class InsertionSort {
    public static void main(String[] args) {
        int N = 7;
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
