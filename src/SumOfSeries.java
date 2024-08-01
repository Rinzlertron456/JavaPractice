public class SumOfSeries {
    public static void main(String[] args) {
        int n=5;
        if(n==1) {
            System.out.println(1);
        }
        else{
            int res=0;
            for(int i=1;i<=n;i++){
                res+=i;
            }
            System.out.println(res);
        }
    }
}
