import java.util.ArrayList;
import java.util.List;

public class CountItemByRule {
    public static void main(String[] args){
        List<List<String>> items = new ArrayList<>();
        ArrayList<List> products=new ArrayList<>();
        List<String> inner1=new ArrayList<>();
        inner1.add("phone");
        inner1.add("blue");
        inner1.add("pixel");
        items.add(inner1);
        List<String> inner2=new ArrayList<>();
        inner2.add("computer");
        inner2.add("silver");
        inner2.add("phone");
        items.add(inner2);
        List<String> inner3=new ArrayList<>();
        inner3.add("phone");
        inner3.add("gold");
        inner3.add("iphone");
        items.add(inner3);
        String ruleKey = "name";
        String ruleValue = "pixel";
//        System.out.println(items);
        for(int i=0;i<items.size();i++){
            if(ruleKey.equals("type")){
                if((items.get(i).get(0)).equals(ruleValue)){
                    System.out.println(items.get(i));
                }
            }
            if(ruleKey.equals("color")){
                if((items.get(i).get(1)).equals(ruleValue)){
                    System.out.println(items.get(i));
                }
            }
            if(ruleKey.equals("name")){
                if((items.get(i).get(2)).equals(ruleValue)){
                    System.out.println(items.get(i));
                }
            }
        }
    }
}
