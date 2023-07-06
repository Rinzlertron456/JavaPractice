public class AsteriskCOunt {
    public static void main(String[] args){
        String s="|**|*|*|**||***||";
        int count=0,index1=0,index2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='|'){
                count++;
            }
            if(ch=='|'&&count==2) index1=i;
        }
        int count1=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='|'&&count1<count-1){
                count1++;
                index2=i;
            }
        }
        if(count==0) System.out.println(0);
        else s=s.substring(index1,index2);
        int ast=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*') ast++;
        }
        System.out.println(ast);
        System.out.print(s);
    }
}
