//Write a Java program that prompts the user to enter their score (an integer between 0 and 100). The program should then print the corresponding grade based on the following criteria:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
//Expected Output: If the user inputs "85", the program should output: "Your grade is B."
public class GradeChecker {
    public static void main(String[] args) {
        int score=54;
        char Grade=(score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F';
        System.out.println("Grade:"+Grade);
    }
}
