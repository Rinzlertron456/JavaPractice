public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1,c=0,n=5;
        int[] res=new int[n];
        res[0]=0;
        if(n==1) System.out.println(res[0]);
        res[1]=1;
        for (int i = 2; i < n; i++) {
            c=a+b;
            res[i]=a+b;
            a=b;
            b=c;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
