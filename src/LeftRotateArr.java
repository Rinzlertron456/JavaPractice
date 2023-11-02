public class LeftRotateArr {
    public static void main(String[] args){
        int[] numbers={40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
        int rotate=69,count=0,temp=rotate,len=numbers.length,index=0;
        int[] res=new int[numbers.length];
        while(rotate>len){
            rotate-=len;
            temp=rotate;
        }
        for (int i=0;i<(len-rotate);i++){
            res[i]=numbers[temp];
            temp++;
            index=i;
        }
        for (int i = 0; i < rotate; i++) {
            res[index+1]=numbers[i];
            index++;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
