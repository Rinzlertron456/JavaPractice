import java.util.ArrayList;
import java.util.Collections;

public class ClosestWords {
    public static void main(String[] args){
        ArrayList<String> s = new ArrayList<>();
        s.add("jd");
        s.add("lzt");
        s.add("kym");
        s.add("ky");
        s.add("gdf");
        s.add("gdf");
        s.add("jd");
        String word1 = "kym";
        String word2 = "gdf";
        ArrayList<Integer> index1=new ArrayList<>();
        ArrayList<Integer> index2=new ArrayList<>();
        ArrayList<Integer> diff=new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            if(s.get(i).equals(word1)){
                index1.add(i);
            }
            if(s.get(i).equals(word2)){
                index2.add(i);
            }
        }
        for (int i = 0; i < index1.size(); i++) {
            for (int j = 0; j < index2.size(); j++) {
                diff.add(Math.abs(index1.get(i)-index2.get(j)));
            }
        }
        for (int i = 0; i < index2.size(); i++) {
            for (int j = 0; j < index1.size(); j++) {
                diff.add(Math.abs(index2.get(i)-index1.get(j)));
            }
        }
        Collections.sort(diff);
        System.out.println(diff.get(0));
    }
}
