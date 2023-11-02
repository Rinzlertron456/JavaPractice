public class DivBy7 {
    public static void main(String[] args){
        String num="8955795758";
        int unit = num.charAt(num.length()-1)-'0';
        int n=0;
        for(int i=0; i<num.length()-1; i++)
        {
            int dig = num.charAt(i)-'0';
            n = n*10+dig;
            n = n%7;
        }
        int diff = n-(2*unit);
        if(diff% 7 == 0) System.out.println(1);
        else System.out.println(0);;
    }
}
