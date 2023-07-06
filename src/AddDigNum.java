public class AddDigNum {
    public static void main(String[] args){
        int input1=123,input2=456,input3=789,input4=2;
        int[] arr={input1,input2,input3};
        int[] unit=new int[3];
        int[] ten=new int[3];
        int[] hundred=new int[3];
        int sum=0;
        for(int i=0;i<unit.length;i++){
            unit[i]=arr[i]%10;
//            System.out.println(unit[i]);
            arr[i]/=10;
        }
        for(int i=0;i<unit.length;i++){
            System.out.print(unit[i]+" ");
        }
        System.out.println("\n"+arr[0]);
        for(int i=0;i<ten.length;i++){
            if(arr[i]<10&&arr[i]==0){
                ten[i]=1;
            }
            else{
                ten[i]=arr[i]%10;
//                System.out.println(ten[i]);
                arr[i]/=10;
            }
        }
        for(int i=0;i<ten.length;i++){
            System.out.print(ten[i]+" ");
        }
        System.out.println("\n"+arr[0]);
        System.out.println("\n"+arr[2]);
        for(int i=0;i<hundred.length;i++){
            if(arr[i]<100&&arr[i]==0){
                hundred[i]=2;
            }
            else{
                hundred[i]=arr[i]%10;
//                System.out.println(hundred[i]);
                arr[i]/=10;
            }
        }
        for(int i=0;i<hundred.length;i++){
            System.out.print("\n"+hundred[i]+" ");
        }
        if(input4==0){
            for(int i=0;i<hundred.length;i++){
                sum+=hundred[i];
            }
//            System.out.println(sum);
        }
        else if(input4==1){
            for(int i=0;i<ten.length;i++){
                sum+=ten[i];
            }
//            System.out.println(sum);
        }
        else if(input4==2){
            for(int i=0;i<unit.length;i++){
                sum+=unit[i];
            }
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
