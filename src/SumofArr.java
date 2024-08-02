import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class SumofArr{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(stream(arr).reduce(0,(c, e)->c+e));
    }
}
