public class StringEndNum {
    public static void main(String[] args){
        String str="geek5";
        int len=str.charAt(str.length()-1)-'0';
        str=str.substring(0,str.length()-1);
        if(str.length()==len) System.out.println(1);
        else System.out.println(0);
    }
}
