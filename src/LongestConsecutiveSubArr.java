import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveSubArr {
    public static void main(String[] args) {
        int[] nums={9,1,4,7,3,-1,0,5,8,-1,6};
        int longcon=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])&&(consecutive(Math.abs(nums[i]),nums.length))) list.add(nums[i]);
        }
        System.out.println(list);
        System.out.println(list.size());
    }

    public static boolean consecutive(int num, int length){
        boolean consecutive=false;
        for (int i = 0; i <= length; i++) {
            if(i==num) consecutive=true;
        }
        return consecutive;
    }
}
