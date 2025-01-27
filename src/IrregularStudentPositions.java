import java.util.*;

public class IrregularStudentPositions {
    public static void main(String[] args) {
        List<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(5);
        height.add(3);
        height.add(2);
        height.add(1);
        int[] arr = new int[height.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = height.get(i);
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(height.get(i)!=arr[i]) count++;
        }
        System.out.println(count);
    }
}
