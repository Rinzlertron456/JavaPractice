import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,7,9,11,12,45};
        int mid=0,target=3,l=0,r=arr.length-1;
        if(target==-1){
            System.out.println(-1);
        }
        while(l<=r){
            mid=l+(r-1)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(l>r) System.out.println(-1);
    }
}
