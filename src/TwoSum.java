public class TwoSum {
    public static void main(String[] args) {
        int[] nums={3,3};
        int target=6;
        int[] res=new int[2];
        int sum=0;
        for (int k = 0; k < nums.length; k++) {
            for (int l = k+1; l < nums.length; l++) {
                sum=nums[k]+nums[l];
                if(sum==target){
                    res[0]=k;
                    res[1]=l;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
