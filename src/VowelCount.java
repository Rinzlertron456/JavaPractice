public class VowelCount {
    public static void main(String[] args) {
        String str = "Coding Money",vowels = "aeiouAEIOU";
        System.out.println(str.chars().mapToObj(T->(char)T).filter(ch->vowels.contains(ch+"")).count());
    }

}
