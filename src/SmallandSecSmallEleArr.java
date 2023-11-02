import java.util.ArrayList;
import java.util.Arrays;

public class SmallandSecSmallEleArr {
    public static void main(String[] args){
        int count=0;
        int  arr[] = {1,2,1,3,6,7};
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])) list.add(arr[i]);
        }
        System.out.println(list);
        System.out.print(list.get(0)+" "+list.get(1));
    }
}
