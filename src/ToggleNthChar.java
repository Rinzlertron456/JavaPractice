// PRP 2nd attempt Problem
//        Given a String input1 , perform the following operations on the String
//        [
//
//        N : denotes No. of words in the String.
//
//        L : denotes length of the each word in the String.
//
//        ]
//
//        Reverse the each word of String
//
//        Increment the value of character of each word present at each even index by the size of the word (ignore 0th index).
//
//
//        (If After increment, the character exceeds then ‘Z’ or ‘z’ then character must be. Considered as ‘Z’ and ‘z’ respectively)
//
//        Toggled the character of each word after Nth interval of index in word.
//
//
//
//
//        Test Case :
//
//
//        Input1 : Wipro Limited
//
//
//        N = 2
//
//
//        Operation 1 : Reverse : orpiW detimiL
//
//        —————————————————————————
//
//        —————————————————————————
//
//        Operation 2 : Increment Value
//
//
//        ——————————————————
//
//        orpiW -> size (L=5)
//
//
//        o -> 0th index (ignored)
//
//        r -> odd index
//
//        p -> even index —> p+L. = p+5. = u
//
//        i -> odd index
//
//        W -> even index -> W+5 = Z
//
//
//        (Resultant word -> oruiZ )
//
//        ——————————————————
//
//
//        detimiL -> size (L=7)
//
//
//        d -> 0th index
//
//        e -> odd index
//
//        t -> even index -> t+7 = z
//
//        i -> odd index
//
//        m -> even index. -> m+7 = t
//
//        i -> odd index
//
//        L -> even index -> L+7 = S
//
//
//        (Resultant word -> dezitiS)
//
//
//        ——————————————————————-
//
//        ———————————————————————
//
//
//        Resultant String = “oruiZ dezitiS”
//
//
//        —————————————————
//
//        ————————————————
//
//
//        Operation 3: Toggled character of each word by Nth interval
//
//        (Toggled meaning uppercase to lowercase and vice-versa)
//
//        oruiZ
//
//
//
//        (N=2)
//
//        1st word
//
//        0. -> o. N=1
//
//        1. -> r N=2. -> toggled -> r = R.
//
//        2 -> u N=1
//
//        3. -> i N=2. -> toggled -> i=I
//
//        4. -> Z. N=1
//
//
//        2nd word
//
//        0. -> d N=1
//
//        1. -> e N=2. -> toggled -> e=E
//
//        2. -> z N=1
//
//        3. -> i N=2-> toggled -> i=I
//
//        4. -> t N=1
//
//        5. -> i N=2-> toggled -> i=I
//
//        6. -> S N=1
//
//        Final ans : oRuIZ dEzItIS
public class ToggleNthChar {
    public static void main(String[] args){
        String input1="Hello World";
        int N=2;
        String res="";
        String[] words=input1.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }
            words[i]=rev;
        }
//        for(int i=0;i<words.length;i++){
//            System.out.print(words[i]+" ");
//        }
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String mod="";
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(j==0){
                    mod+=word.charAt(j);
//                    System.out.println("\n"+mod);
                }
                else if(j!=0&&j%2==0){
                    if(ch>='A'&&ch<='Z'){
                        if((char)(word.charAt(j)+word.length())>='Z') mod+='Z';
                        else mod+=(char)(word.charAt(j)+word.length());
//                        System.out.println(mod);
                    }
                    else if(ch>='a'&&ch<='z'){
                        if((char)(word.charAt(j)+word.length())>='z') mod+='z';
                        else mod+=(char)(word.charAt(j)+word.length());
//                        System.out.println(mod);
                    }
//                    System.out.println(mod);
                }
                else mod+=ch;
//                System.out.println(mod);
            }
            words[i]=mod;
        }
//        System.out.print("\n");
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+" ");
        }
        for(int i=0;i< words.length;i++){
            String word=words[i];
            String res1="";
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(j==0||j==N||j%N==0||j==word.length()-1) res1 += ch;
                else if(j%(N)!=0){
                    if(ch>='A'&&ch<='Z'){
                        res1+=(char)(ch+96);
                    }
                    if(ch>='a'&&ch<='z'){
                        res1+=(char)(ch-32);
                    }
//                    if(Character.isUpperCase(ch)){
//                        res1+=Character.toLowerCase(ch);
//                    }
//                    if(Character.isLowerCase(ch)){
//                        res1+=Character.toUpperCase(ch);
//                    }
                }
            }
            words[i]=res1;
        }
        System.out.print("\n");
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+" ");
        }
    }
}
