import java.util.ArrayList;
import java.util.HashMap;

public class GoalParser {
    public static void main(String[] args){
        String S="G()(al)";
        for(int i=0;i<S.length();i++){
            if(S.contains("G")) S=S.replace('G','G');
            if(S.contains("()")) S=S.replace("()","o");
            if(S.contains("(al)")) S=S.replace("(al)","al");
        }
        System.out.println(S);
    }
}
