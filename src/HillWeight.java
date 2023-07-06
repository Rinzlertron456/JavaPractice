public class HillWeight {
    public static void main(String[] args){
        int res=0;
        int input1=5,input2=10,input3=2;
        for(int i=1;i<=input1;i++){
            res+=input2*i;
            input2+=input3;
        }
        System.out.print(res);
    }
}
