import java.util.*;

public class SecLargestandSecSmallest {
    public static void main(String[] args) {
        //Approach - 1
//        int n=4, min=Integer.MAX_VALUE, max=0;
//        int[] a={3,4,5,2};
//        int[] res=new int[2];
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if(min>a[i]) min=a[i];
//            if(max<a[i]) max=a[i];
//        }
//        for (int i = 0; i < n; i++) {
//            if(a[i]<max&&a[i]>min) list.add(a[i]);
//        }
//        Collections.sort(list);
//        res[0]=list.get(list.size()-1);
//        res[1]=list.get(0);
//        for (int i = 0; i < 2; i++) {
//            System.out.println(res[i]);
//        }
        //Approach - 2
        int n=5, min=Integer.MAX_VALUE, max=0;
        int[] a={4,5,3,6,7};
        int[] res=new int[2];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }
        int k=2;
        while (k!=0){
            for (int i = 0; i < list.size(); i++) {
                int num=list.get(i);
                if(min>num) min=num;
                if(max<num) max=num;
            }
            for (int i = 0; i < list.size(); i++) {
                int num=list.get(i);
                if(num==max) list.remove(i);
                if(num==min) list.remove(i);
            }
            k--;
        }
        res[0]= list.get(list.size()-1);
        res[1]= list.get(0);
        System.out.println(list);
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.println(res[i]);
        }
    }
}
