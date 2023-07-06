public class CocaCola {
    public static void main(String[] args){
        int input1=5,input3=4;
        int[] input2={3,10,8,6,11};
        int[] input4={1,10,3,11};
        int[] res=new int[input3];
        int n[]=new int[input3];
        int k=0;
        for(int i=0;i<input3;i++){
            int count=0;
            for(int j=0;j<input1;j++){
                if(input4[i]>=input2[j]) count++;
            }
            n[k]=count;
            k++;
        }
        for(int i=0;i<res.length;i++){
            System.out.println(n[i]+" ");
        }
    }
}
