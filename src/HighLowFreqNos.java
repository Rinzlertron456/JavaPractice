import java.util.*;

public class HighLowFreqNos {
    public static void main(String[] args) {
        int n=13,min=Integer.MAX_VALUE,max=0;
        int[] v={6, 13, 18, 7, 17, 1, 17, 2, 5, 2, 18, 19, 11};
        int[] res=new int[2];
        ArrayList<Integer> minlist=new ArrayList<>();
        ArrayList<Integer> maxlist=new ArrayList<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:v){
            if(freq.containsKey(num)) freq.put(num,freq.get(num)+1);
            else freq.put(num,1);
        }
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if(entry.getValue()<min) min= entry.getValue();
            if (entry.getValue()>max) {
                max=entry.getValue();
            }
        }
        System.out.println(max+" "+min);
        System.out.println(freq);
        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            if(entry.getValue()==min) minlist.add(entry.getKey());
        }
        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            if(entry.getValue()==max) maxlist.add(entry.getKey());
        }
        System.out.println(minlist);
        System.out.println(maxlist);
        Collections.sort(minlist);
        Collections.sort(maxlist);
        System.out.println(minlist);
        System.out.println(maxlist);
        res[0]=maxlist.get(0);
        res[1]= minlist.get(0);
        if(min==max) res[0]= minlist.get(0);
        for (int i = 0; i < 2; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
