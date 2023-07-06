public class DeCodeEnCode {
    public static void main(String[] args) {
        String[] Romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
        String input1 = "CX";
        int res=0;
        if(input1.length()==2){
            char ten=input1.charAt(0);
            char unit=input1.charAt(1);
            if(ten=='C') res+=100;
            if(unit=='X') res+=10;
        }
        System.out.print(res);
    }
}
