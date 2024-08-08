//Question: Write a Java program that asks the user to enter an integer. The program should then reverse the digits of the number and print the reversed number.
//Expected Output: If the user inputs "1234", the program should output: "The reversed number is 4321."
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        //Brute Force Solution( least time complexity)
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0, rev=0;
         while(n!=0){
           rem=n%10;
           rev=rev*10+rem;
           n/=10;
         }

        //Enhanced Solution
//        int number=200, temp=number,len=0;
//        String res="";
//        while(temp!=0){
//            res+=temp%10;
//            temp/=10;
//            len++;
//        }
//        int ans=Integer.parseInt(res);
        System.out.println(rev);
    }
}
