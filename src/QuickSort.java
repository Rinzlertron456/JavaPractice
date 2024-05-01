public class QuickSort {
    public static void main(String[] args) {
        int[] input={4, 6, 2, 5, 7, 9, 1, 3};
        int n= input.length, startIndex=0, endIndex=n-1;
        quicksort(input,startIndex,endIndex);
        for (int j : input) {
            System.out.print(j + " ");
        }
    }

    public static void quicksort(int[] input, int low, int high){
        if(low<high){
            int pIndex=partition(input,low,high);
            quicksort(input, low, pIndex-1);
            quicksort(input, pIndex+1, high);
        }
    }

    public static int partition( int[] input, int low, int high){
        int pivot=input[low], i=low, j=high;
        while(i<j){
            while(input[i]<=pivot&&i<=high-1){
                i++;
            }
            while(input[j]>pivot&&j>=low+1){
                j--;
            }
            if(i<j){
                swap(input,i,j);
            }
        }
        swap(input,low,j);
        return j;
    }

    public static void swap(int[] input,int low, int high){
        int temp=input[low];
        input[low]=input[high];
        input[high]=temp;
    }
}
