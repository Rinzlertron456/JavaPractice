import java.util.ArrayList;

public class ArrinArr {
    public static void main(String[] args){
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};
        ArrayList<Integer> list=new ArrayList<>();
        for (int num:arr1) {
            list.add(num);
        }
        boolean check=false;
        for(int i=0;i<arr2.length;i++){
            if(list.contains(arr2[i])) check=true;
            else{
                check=false;
                break;
            }
        }
        System.out.println(check);
    }
}
