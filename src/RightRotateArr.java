public class RightRotateArr {
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5};
        int rotate=2,count=0,temp=rotate,len=numbers.length;
        int[] res=new int[numbers.length];
        while(rotate>len){
            rotate-=len;
            temp=rotate;
        }
        while (count<rotate){
            res[count]=numbers[Math.abs(numbers.length-temp)];
            count++;
            temp--;
        }
        for (int i = 0; i < numbers.length-rotate; i++) {
            res[count]=numbers[i];
            count++;
        }
        for (int num: res) {
            System.out.print(num+" ");
        }
    }
}
