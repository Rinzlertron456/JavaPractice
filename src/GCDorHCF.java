import java.util.ArrayList;

public class GCDorHCF {
    public static void main(String[] args) {
        int n=63,m=45;
        int res=0;
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=2;i<1000;i++){
            if(n%i==0){
                list1.add(i);
            }
            if(m%i==0){
                list2.add(i);
            }
        }
        for( int num:list1){
            if(list2.contains(num)) res=num;
        }
        if(res==0) System.out.println(1);
        else System.out.println(res);
    }
}
