import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortPeople {
    public static void main(String[] args){
        String[] names = {"Alice","Bob","Bob"};
        String[] res=new String[names.length];
        int[] heights = {155,185,150};
        int[] heights1=heights.clone();
        Arrays.sort(heights1);
        int k=0;
        for(int i=heights1.length-1;i>=0;i--){
            for(int j=0;j< heights.length;j++){
                if(heights1[i]==heights[j]){
                    res[k]=names[j];
                    k++;
                }
            }
        }
        for(String name:res){
            System.out.println(name);
        }
    }
}
