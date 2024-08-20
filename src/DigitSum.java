//Question: Write a Java program that asks the user to enter an integer. The program should then calculate and print the sum of the digits of the entered number.
//Expected Output: If the user inputs "1234", the program should output: "The sum of the digits is 10."
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
