//Question: Write a Java program that prompts the user to enter a password. The program should then determine the strength of the password based on the following criteria:
//Strong: At least 8 characters, contains both uppercase and lowercase letters, and includes at least one digit and one special character.
//Medium: At least 6 characters, contains both uppercase and lowercase letters, and includes at least one digit.
//Weak: Does not meet the above criteria.
//Expected Output: If the user inputs "P@ssw0rd", the program should output: "Password strength: Strong." If the user inputs "Pass123", the program should output: "Password strength: Medium." If the user inputs "pass", the program should output: "Password strength: Weak."
import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password=sc.next();
        boolean uppercase=false, lowercase=false, spechar=false;
        int length=password.length(), digit=0;
        for (char ch: password.toCharArray()){
            if(Character.isDigit(ch)) digit++;
            if(Character.isLowerCase(ch)) {
                uppercase=true;
            }
            if(Character.isUpperCase(ch)){
                lowercase=true;
            }
            else spechar=true;
        }
        String res=(length>=8&&uppercase==true&&lowercase==true&&digit>=1)?"Password strength: Strong":(length>=6&&uppercase==true&&lowercase==true&&digit>=1)?"Password strength: Medium":"Password strength: Weak";
        System.out.println(res);
    }
}
