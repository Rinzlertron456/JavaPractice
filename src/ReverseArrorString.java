public class ReverseArrorString {
    public static void main(String[] args){
        int arr[] = {4, 5, 1, 2};
        String str="ytfdagvhbusvcga",rev="";
        int[] res=new int[arr.length];
        int k=0;
        for (int i = arr.length-1; i >= 0; i--) {
            res[k]=arr[i];
            k++;
        }
        for (int i = 0; i < res.length; i++) {
            arr[i]=res[i];
        }
        for (int num:arr) {
            System.out.print(num+" ");
        }
        System.out.println();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch=str.charAt(i);
            rev+=ch;
        }
        str=rev;
        System.out.println(str);
    }
}
