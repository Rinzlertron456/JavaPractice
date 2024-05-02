public class LinearSearch {
    public static void main(String[] args) {
        int n=5, num=4, index=0, key=0;
        int[] arr={6,7,8,4,1};
        for (int i = 0; i < n; i++) {
            if(arr[i]==num) System.out.println(i);
        }
        System.out.println(-1);
    }
}
