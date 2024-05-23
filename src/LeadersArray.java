import java.util.ArrayList;

public class LeadersArray {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 0};
        int n = 6;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < A.length; ++i) {
            boolean leader = true;

            for (int j = i + 1; j < A.length; ++j) {
                if (A[i] < A[j]) {
                    leader = false;
                }
            }

            if (leader) {
                list.add(A[i]);
            }
        }
        System.out.println(list);
    }
}
