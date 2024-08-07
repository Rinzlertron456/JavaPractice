import java.util.Arrays;
import java.util.Scanner;

public class GreatestNumberOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[3];
        for(int i=0; i<3; i++){
            nums[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        System.out.println("The largest number is "+ Arrays.stream(nums).reduce(0,(x,y)->Math.max(x,y)));
    }
}
