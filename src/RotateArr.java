import java.util.Scanner;

//Problem 4: Rotate Array
//Description
//Write a Java program to rotate an array to the right by k steps, where k is non-negative. The array
//should be rotated in-place.
//Input
//• An integer n (1 ≤ n ≤ 10^5), the size of the array.
//• An integer k (0 ≤ k ≤ 10^5), the number of steps to rotate the array.
//• An array arr of n integers.
//Output
//• Print the rotated array.
//Example
//Input
//Enter n value:
//7
//Enter k value:
//3
//1 2 3 4 5 6 7
//Output
//Copy code
//5 6 7 1 2 3 4
//Input
//diff
//Copy code
//4
//2
//-1 -100 3 99
//Output
//Copy code
//3 99 -1 -100
public class RotateArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        int[] res=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        int l=k+1;
        for (int i = 0; i < k; i++) {
            res[i]=nums[l];
            l++;
        }
        l=0;
        for (int i = k; i < n; i++) {
            res[i]=nums[l];
            l++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
