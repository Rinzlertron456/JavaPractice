public class KthCharDecryptStr {
    public static void main(String[] args) {
        String s="dajidas988ksajlkdn908",res="",alph="",num="";
        Long k=(long)9000;
        int m=Math.toIntExact(k);
        for (int i = 0; i < s.length()-1; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alph += ch;
            } else if (ch >= '0' && ch <= '9') {
                char nextCh = s.charAt(i + 1);
                if (!Character.isDigit(nextCh)) {
                    num += ch;
                    int n = Integer.parseInt(num);
                    res = AddAlph(n, res, alph);
                    alph = "";
                    num = "";
                }else num+=ch;
            }
        }
        System.out.println(res);
        System.out.println("alph: "+alph);
        if (s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9') {
            num += s.charAt(s.length() - 1);
            int n = Integer.parseInt(num);
            res = AddAlph(n, res, alph);
        }
//        while(n!=0){
//            res+=alph;
//            n--;
//        }
        System.out.println(res);
        System.out.println(res.charAt(m-1));
    }
    static String AddAlph(int n, String res, String alph){
        while(n!=0){
            res+=alph;
            n--;
        }
        return res;
    }
}
