import java.util.Arrays;
import java.util.Scanner;

public class DetermineTriangle {
    public static void main(String[] args) {
        int[] sides=new int[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            sides[i]=sc.nextInt();
        }
        int side=sides[0];
        int[] res=Arrays.stream(sides).filter(c->c==side).toArray();
        String ans=(res.length==3)?"The triangle is equilateral":(res.length==2)?"The triangle is isosceles":"The triangle is scalene";
        System.out.println(ans);
    }
}
