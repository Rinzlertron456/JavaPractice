import java.util.ArrayList;

public class LeadersArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 0};
        int n = 6;
        ArrayList<Integer> list = new ArrayList<>();
        list=leaderlist(arr,list);
        System.out.println(list);
    }

    public static ArrayList<Integer> leaderlist(int[] arr, ArrayList<Integer> list){
        for (int i = 0; i < arr.length; i++) {
            boolean leader=leader(i,arr);
            if(leader) list.add(arr[i]);
        }
        return list;
    }

    public static boolean leader(int i, int[] arr){
        boolean leader = true;
        for (int j = i + 1; j < arr.length; ++j) {
            if (arr[i] < arr[j]) {
                leader = false;
            }
        }
        return leader;
    }
}
