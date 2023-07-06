public class MirrorDiamond {
    public static void main(String[] args){
        int n=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2*n;j>i*2;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            for(int j=2*(i-1)+1;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // GFG Solution
//        for(int i=1;i<=(n);i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int k=(n*2);k>(i*2);k--){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n-1;i++){
//            for(int j=(n-1);j>=i;j--){
//                System.out.print("*");
//            }
//            for(int k=1;k<=(i*2);k++){
//                System.out.print(" ");
//            }
//            for(int j=(n-1);j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
