public class QuickSort {
    public static void main(String[] args) {
        int[] input={4, 6, 2, 5, 7, 9, 1, 3};
        int n= input.length, startIndex=0, endIndex=n-1;
        quicksort(input,startIndex,endIndex);
    }

    public static void quicksort(int[] input, int startIndex, int endIndex){
        if(startIndex<endIndex){
            int pIndex = partition(input, startIndex, endIndex);
            quicksort(input, startIndex,pIndex-1);
            quicksort(input, pIndex+1,endIndex);
        }
    }

    static int partition(int[] input, int startIndex, int endIndex){
        int pivot=input[startIndex], i=startIndex, j=endIndex;
        while(i<j){
            while ()
        }
    }
}
