import java.util.ArrayList;
import java.util.Scanner;

//Problem 3: Collatz Sequence
//Description
//Write a Java program to generate the Collatz sequence for a given number n. The sequence starts
//with n and is generated as follows:
//• If n is even, the next number is n / 2
//• If n is odd, the next number is 3 * n + 1
//• The sequence ends when it reaches 1
//Input
//• An integer n (1 ≤ n ≤ 10^6)
//Output
//• Print the Collatz sequence for the given number n.
//Example
//Input
//Enter n value:
//6
//Output
//6
//3
//10
//5
//16
//8
//4
//2
//1
public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> collatz=new ArrayList<>();
        collatz.add(n);
        while(n>1){
            if(n%2==0) n/=2;
            else n=3*n+1;
            collatz.add(n);
        }
        System.out.println(collatz);
    }
}
