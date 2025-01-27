import java.util.*;

public class LexiSmallSeq {
    public static void main(String[] args) {
        List<Integer> priority = new ArrayList<>();
        priority.add(2);
        priority.add(4);
        priority.add(6);
        priority.add(4);
        priority.add(3);
        priority.add(2);
        int[] arr = new int[priority.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = priority.get(i);
        }
        Collections.sort(priority);
        int first = priority.get(0), second = priority.get(1);
        if(first==second) {
            priority.remove(1);
            second = priority.get(1);
        }
        System.out.println("First: "+first+" Second: "+second);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length-1; j++) {
                int temp = arr[i];
                if(arr[i]>arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(arr[0]==first&&arr[1]==second) break;
            System.out.println("Iteration "+i);
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        System.out.println("Final Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
