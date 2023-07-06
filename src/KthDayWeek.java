public class KthDayWeek {
    public static void main(String[] args){
        String S="Mon";
        int K=23,index=0;
        String[] days={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        for(int i=0;i<days.length;i++){
            if(days[i].equals(S))
            {
                System.out.println(days[(i+K)%7]);
            }

//                index=i;
//            else continue;
        }
//        System.out.println(Math.abs((index+K%7)-days.length));
//        if(index+K-days.length==index) System.out.println(days[index]);
//        else if(index+K<days.length) System.out.println(days[index+K]);
//        else System.out.println(days[Math.abs((index+K%7)-days.length)]);
    }
}
