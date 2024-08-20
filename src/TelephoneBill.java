import java.util.Scanner;

//Problem 5:Telephone Bill
//Description
//Jon is a businessman and remains very busy on calls and has to spend a large amount of time taking
//calls from international and local clients. He has a fixed amount of money this month that he can
//spend on the calls and he has to make Local, STD and ISD calls, all of which charge differently.
//Local calls cost 0.25$ per minute, STD calls cost 1$ per minute and 10$ per minute for ISD calls.
//Now, given the number of minutes of the call he made to each type and the amount of money he has
//this month, find whether he spent more than his quota of money and by how much and if he did not
//spend more than the quota of money, return the money he spent.
//Input Specification:
//input1: The array representing the minutes of calls made of each type where A[0] represents the
//number of local calls made, A[1] represents the number of STD calls made and A[2] represents the
//number of ISD calls made.
//input2: The amount of money he can spend this month.
//Output Specification:
//An array with first element specifying whether he spent more money than his quota and if he has,
//then the element is 1 and otherwise, 0. The second element being the amount he spent or exceeded
//the quota by.
//Note: The money spent or exceeded has to be an integer.
//Example 1:
//input1: {100,100,100}
//input2: 1200
//Output: {0,1125}
//Explanation:
//He spent (100*10)+(100*0.25)+(100*1) = 1125 on the calls and his budget was 1200, so he spent in
//his limit and therefore the output is {0,1125}.
//Example 2:
//input1: {100,100,200}
//input2: 1200
//Output: {1,925}
//Explanation: He spent (100*0.25)+(100*1)+(200*10) = 2125 and his budget was 1200, so he
//spent 925$ more than his fixed budget and therefore the output is {1,925}.
public class TelephoneBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] A = {100,100,200};
        int bill=1200, cost=(int)(A[0]*0.25+A[1]*1+A[2]*10);
        int[] res={0,0};
        res[0]=(cost>bill)?1:0;
        res[1]=(res[0]==0)?cost:(cost-bill);
        System.out.println(res[0]+" "+res[1]);
    }
}
