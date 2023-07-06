public class qwerty {
    public static void main(String[] args) {
        String input1 = "KIng HiLLs";
        boolean lower=false,upper=false;
        char arr1[]={'q','q','q','w','e','r','t','y','u','i','o','p','[',']',']',']'};
        char arr2[]={'a','a','a','s','d','f','g','h','j','k','l',';',';',';',' '};
        char arr3[]={'z','z','z','x','c','v','b','n','m',',','.','/','/',' ',' '};
        char arr4[]={'Q','Q','Q','W','E','R','T','Y','U','I','O','P','[',']',']',']'};
        char arr5[]={'A','A','A','S','D','F','G','H','J','K','L',';',';',';',' '};
        char arr6[]={'Z','Z','Z','X','C','V','B','N','M',',','.','/','/',' ',' '};
        String output="";

        for(int i=0;i<input1.length();i++){
            char c=input1.charAt(i);
            if(c>='a'&&c<='z') lower=true;
            if(c>='A'&&c<='Z') upper=true;
            if(c=='l') output+="'";


            for(int j=2;j<arr1.length-3;j++){

                if(lower==true&&upper==false){
                    if(arr1[j]==c){
                        output+=arr1[j+2];
                    }
                    if(arr2[j]==c&&c!='l'){
                        output+=arr2[j+2];
                    }
                    if(arr3[j]==c){
                        output+=arr3[j+2];
                    }
                }
                if(lower==false&&upper==true){
                    if(arr4[j]==c){
                        output+=arr4[j-2];
                    }
                    if(arr5[j]==c){
                        output+=arr5[j-2];
                    }
                    if(arr6[j]==c){
                        output+=arr6[j-2];
                    }
                }
            }
            upper=false;lower=false;
            if(c==' ')  output+=" ";
        }
        System.out.println(output);
    }
}