import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubArr {
    public static void main(String[] args) {
        int[] nums={9,1,4,7,3,-1,0,5,8,-1,6};
        Set<Integer> list=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        int longcon=1;
        for (int num:list){
            if(!list.contains(num-1)){
                int x=num, count=1;
                while(list.contains(x+1)){
                    x+=1;
                    count+=1;
                }
                longcon=Math.max(longcon,count);
            }
        }
        System.out.println(longcon);
    }


// Brute Force
//    private static int longestconsecutivearr(int[] nums) {
//        int longcon=1;
//        for (int i = 0; i < nums.length; i++) {
//            int x=nums[i], count=1;
//            while(linearSearch(nums,x+1)==true){
//                x+=1;
//                count+=1;
//            }
//            longcon=Math.max(longcon,count);
//        }
//        return longcon;
//    }
//
//    private static boolean linearSearch(int[] nums, int num) {
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==num) return true;
//        }
//        return false;
//    }

    // Original Approach
//    public static void main(String[] args) {
//        int[] nums={9,1,4,7,3,-1,0,5,8,-1,6};
//        int longcon=0;
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(!list.contains(nums[i])&&(consecutive(Math.abs(nums[i]),nums.length))) list.add(nums[i]);
//        }
//        System.out.println(list);
//        System.out.println(list.size());
//    }
//
//    public static boolean consecutive(int num, int length){
//        boolean consecutive=false;
//        for (int i = 0; i <= length; i++) {
//            if(i==num) consecutive=true;
//        }
//        return consecutive;
//    }
}
