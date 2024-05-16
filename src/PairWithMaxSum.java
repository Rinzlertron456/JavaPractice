public class PairWithMaxSum {
    public static void main(String[] args) {
        long[] arr={5, 4, 3, 1, 6};
        long N=arr.length, sum=0, maxsum=0;
        int i=0, j=1;
        while(i<=N&&j<=N-1){
            sum=arr[i]+arr[j];
            maxsum=Math.max(maxsum, sum);
            i++;
            j++;
        }
        System.out.println(maxsum);
    }
}
