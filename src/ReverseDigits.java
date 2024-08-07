public class ReverseDigits {
    public static void main(String[] args) {
        int number=200, temp=number,len=0;
        String res="";
        while(temp!=0){
            res+=temp%10;
            temp/=10;
            len++;
        }
        int[] digits=new int[len];
    }
}
