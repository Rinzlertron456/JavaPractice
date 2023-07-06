public class SumofPrimeDigits
{
 public static void main(String[] args) {
String s="1234561179",num="",res="";
 int sum=0;
 for(int i=0;i<s.length();i++){
int n=s.charAt(i)-'0';
int count=0;
for(int j=1;j<=n;j++){
if(n%j==0){
count++;
}
}
if(count==2){
num+=n;
sum+=n;
}
}
res=num+":"+sum;
System.out.println(res);
}
}
