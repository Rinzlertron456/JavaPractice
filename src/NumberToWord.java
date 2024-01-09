import java.util.HashMap;

public class NumberToWord {
    public static void main(String[] args) {
        int num=104884157,len=0,temp=num,i=0;
        String res="";
        HashMap<Integer,String> numwords=new HashMap<>();
        numwords.put(1,"one");
        numwords.put(2,"two");
        numwords.put(3,"three");
        numwords.put(4,"four");
        numwords.put(5,"five");
        numwords.put(6,"six");
        numwords.put(7,"seven");
        numwords.put(8,"eight");
        numwords.put(9,"nine");
        numwords.put(10,"ten");
        numwords.put(11,"eleven");
        numwords.put(12,"twelve");
        numwords.put(13,"thirteen");
        numwords.put(14,"fourteen");
        numwords.put(15,"fifteen");
        numwords.put(16,"sixteen");
        numwords.put(17,"seventeen");
        numwords.put(18,"eighteen");
        numwords.put(19,"nineteen");
        numwords.put(20,"twenty");
        numwords.put(30,"thirty");
        numwords.put(40,"forty");
        numwords.put(50,"fifty");
        numwords.put(60,"sixty");
        numwords.put(70,"seventy");
        numwords.put(80,"eighty");
        numwords.put(90,"ninety");
        numwords.put(100,"hundred");
        numwords.put(1000,"thousand");
        numwords.put(100000,"lakh");
        numwords.put(10000000,"crore");
        while(temp>0){
            temp/=10;
            len++;
        }
        int[] arr=new int[len];
        while (num>0){
            arr[i]=num%10;
            num/=10;
            i++;
        }
        for (int j = 0; j < len; j++) {
            System.out.println(arr[j]);
        }
        for (int j = len-1; j >= 0; j--) {
            if(j>3&&(j==4||j==6||j==8)&&arr[j]!=0){
                if(arr[j]==0) res+="";
                else if(arr[j]!=0&&arr[j-1]==0){
                    System.out.println(numwords.get(arr[j]*(int)Math.pow(10,1))+" "+numwords.get((int)Math.pow(10,j-1)));
                    res+=numwords.get(arr[j]*(int)Math.pow(10,1))+" "+numwords.get((int)Math.pow(10,j-1))+" ";
                }
                else if(arr[j]==1){
                    System.out.println(numwords.get(Integer.parseInt(arr[j]+""+arr[j-1])));
                    res+=numwords.get(Integer.parseInt(arr[j]+""+arr[j-1]))+" "+numwords.get((int)Math.pow(10,j-1))+" ";
                    j-=1;
                }
                else{
                    System.out.println(numwords.get(arr[j]*(int)Math.pow(10,1)));
                    res+=numwords.get(arr[j]*(int)Math.pow(10,1))+" ";
                }
            }
            else if(j>=2){
                if(arr[j]==0) res+="";
                else{
                    System.out.println(numwords.get(arr[j])+" "+numwords.get((int)Math.pow(10,j)));
                    res+=numwords.get(arr[j])+" "+numwords.get((int)Math.pow(10,j))+" ";
                }
            }
            else if (j==1){
                if(arr[j]==0) res+=" ";
                else if(len==2){
                    res+=numwords.get(arr[j]*10)+" ";
                }
                else if(arr[j]==1){
                    res+="and "+numwords.get(Integer.parseInt(arr[j]+""+arr[j-1]));
                    break;
                }
                else{
                    System.out.println("and "+numwords.get(arr[j]*(int)Math.pow(10,j)));
                    res+="and "+numwords.get(arr[j]*(int)Math.pow(10,j))+" ";
                }
            }
            else{
                if(arr[j]==0) res+="";
                else if(arr[1]==0){
                    res+="and "+numwords.get(arr[j]*(int)Math.pow(10,j));
                }
                else{
                    System.out.println(numwords.get(arr[j]*(int)Math.pow(10,j)));
                    res+=numwords.get(arr[j]*(int)Math.pow(10,j));
                }
            }
        }
        System.out.println(res);
    }
}
