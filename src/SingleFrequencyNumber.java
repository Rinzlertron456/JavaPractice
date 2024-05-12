import java.util.HashMap;
import java.util.Map;

public class SingleFrequencyNumber {
    public static void main(String[] args) {
        int[] nums={2,2,1};
        if(nums.length==1) System.out.println(nums[0]);
        else{
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
                else map.put(nums[i],1);
            }
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()==1) System.out.println(entry.getKey());
            }
        }
    }
}
