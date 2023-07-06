import java.util.Arrays;
import java.util.Collections;


public class SumeetNumber {
    public static int FindSummetSum(int a,int b,int c)
    {
        String str1[] = Integer.toString(a).split("");
        String str2[] = Integer.toString(b).split("");
        String str3[] = Integer.toString(c).split("");
// for(int i=0;i< str1.length;i++)
// {
// System.out.println(str1[i]);
// }
        Arrays.sort(str1);
        Arrays.sort(str2);
        Arrays.sort(str3);
        StringBuilder s1 = new StringBuilder();
        s1.append(str1[0]);
        s1.append(str1[1]);
        s1.append(str1[2]);
        int a1 = Integer.parseInt(s1.toString());
        StringBuilder s2 = new StringBuilder();
        s2.append(str2[0]);
        s2.append(str2[1]);
        s2.append(str2[2]);
        int a2 = Integer.parseInt(s2.toString());
        StringBuilder s3 = new StringBuilder();
        s3.append(str3[0]);
        s3.append(str3[1]);
        s3.append(str3[2]);
        int a3 = Integer.parseInt(s3.toString());
        return a1+a2+a3;
    }
    public static void main(String[] args) {
        System.out.println(FindSummetSum(23792,37221,10270));
        System.out.println(FindSummetSum(26674,105,37943));
    }
//    public static void main(String[] args) {
//        int input1 = 23792, input2 = 37221, input3 = 10270;
//        int[] arr = {input1, input2, input3};
//        for(int)
////        String small="";
////        ArrayList<Integer> numarr=new ArrayList<Integer>();
////        while(input1>0){
////            numarr.add(input1%10);
////            input1/=10;
////        }
////        Collections.sort(numarr);
////        for(int i=0;i<3;i++){
////            small+=numarr.get(i);
////        }
////        System.out.println(small);
//    }
}
