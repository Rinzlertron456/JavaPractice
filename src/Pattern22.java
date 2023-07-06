public class Pattern22 {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<2;i++){
            for(int j=1;j<=n;j++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        for(int i=3;i<7;i++){
            for(int j=1;j<=n;j++){
                if(i==3){
                    System.out.print(n-i+" ");
                }

            }
            System.out.println();
        }
    }
}
