public class OrderedWordsCount {
    public static void main(String[] args) {
        String input1 = "World";
        String[] words = input1.split(" ");
        int count = 0;
        boolean check = true;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length()-1; j++) {
//                System.out.print(word.charAt(j - 1) + "\n");
//                System.out.print(word.charAt(j) + "\n");
//                System.out.print(check + "\n");
                if(word.charAt(j)>word.charAt(j+1)) {
                    check = false;
                    break;
                }
            }
            if (check == true) count++;
        }
        System.out.print(count);
    }
//        String s[] = input1.split(" ");
//        int count = 0;
//        for (int i = 0; i < s.length; i++) {
//            for (int j = 0; j < s[i].length() - 1; j++) {
//                if (s[i].charAt(j) > s[i].charAt(j + 1)) {
//                    break;
//                }
//                if (j == s[i].length() - 2) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
    }