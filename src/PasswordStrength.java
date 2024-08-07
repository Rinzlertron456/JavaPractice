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
