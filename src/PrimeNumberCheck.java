//Question: Write a Java program that prompts the user to enter an integer. The program should then determine whether the number is prime and print the result. A prime number is a number that is greater than 1 and has no positive divisors other than 1 and itself.
//Expected Output: If the user inputs "7", the program should output: "7 is a prime number." If the user inputs "10", the program should output: "10 is not a prime number."
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n%2!=0?n+" is a prime number":n+" is not a prime number");
    }
}
