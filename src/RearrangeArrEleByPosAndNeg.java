import java.util.ArrayList;

public class RearrangeArrEleByPosAndNeg {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        int[] res=new int[nums.length];
        int k=0, l=1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) {
                res[k]=nums[i];
                k+=2;
            }
            else{
                res[l]=nums[i];
                l+=2;
            }
        }
        //Original Approach
//        ArrayList<Integer> positives=new ArrayList<>();
//        ArrayList<Integer> negatives=new ArrayList<>();
//        int[] res=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]>0) positives.add(nums[i]);
//            else if(nums[i]<0) negatives.add(nums[i]);
//        }
//        System.out.println(positives);
//        System.out.println(negatives);
//        int k=0, l=0;
//        for(int i=0;i<res.length;i++){
//            if(i%2==0) {
//                res[i]=positives.get(k);
//                k++;
//            }
//            else {
//                res[i]=negatives.get(l);
//                l++;
//            }
//        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
