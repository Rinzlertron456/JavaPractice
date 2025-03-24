import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 4,count = 1;
        int[][] mat = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1;
        while (left<=right&&top<=bottom){
            for (int i = left; i <= right; i++) {
                mat[left][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                mat[i][right]=count++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                mat[bottom][i]=count++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                mat[i][left]=count++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
