import java.util.Scanner;

//Problem 1:FizzBuzz Variation
//Description
//Write a Java program that prints the numbers from 1 to n. But for multiples of three print "Fizz"
//instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of
//both three and five print "FizzBuzz".
//Input
//• An integer n (1 ≤ n ≤ 1000)
//Output
//• Print the numbers from 1 to n with the following rules:
//o Print "Fizz" for numbers that are multiples of 3
//o Print "Buzz" for numbers that are multiples of 5
//o Print "FizzBuzz" for numbers that are multiples of both 3 and 5
//o Print the number itself if it is not a multiple of 3 or 5
//Example
//Input
//Enter n value:
//15
//Output
//1
//2
//Fizz
//4
//Buzz
//Fizz
//7
//8
//Fizz
//Buzz
//11
//Fizz
//13
//14
//FizzBuzz
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%3!=0&&i%5!=0) System.out.println(Integer.parseInt(fizzbuzz(i)));
            else System.out.println(fizzbuzz(i));
        }
    }

    public static String fizzbuzz(int n){
        return (n%3==0&&n%5==0)?"FizzBuzz":(n%3==0)?"Fizz":(n%5==0)?"Buzz":n+"";
    }
}
